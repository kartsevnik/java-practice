package Tasks;
// creare un programma in grado di calcolare la somma di un array di interi inseriti da un utente.

// Passi:
// - creare il progetto e inizializzare il repo git;
// - chiedere e leggere quanti numeri verranno inseriti dall`utente;
// - in base a quanto inserito precedentemente creare un array delle dimensioni corrette;
// - calcolare e visualizzare in output la somma ottenuta
// - fare commit e fare push su un repo remoto;

// Создайте программу,которая может вычислять сумму массива целых чисел, введенных пользователем.
// Шаги:
// - создайте проект и инициализируйте git-репозиторий;
// - запросите и прочитайте, сколько чисел будет введено пользователем;
// - на основе предыдущих записей создайте массив нужного размера;
// - вычислить и вывести полученную сумму
// - зафиксировать и выложить в удаленное репозиторий;
import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci dimensione di array:");
        int sizeOfArray = scanner.nextInt();
        int[] newArray = createArray(sizeOfArray);
        System.out.println("\nSize of array: " + sizeOfArray + "\n");

        for (int i = 0; i < newArray.length; i++) {
            System.out.println("index " + i + " - " + newArray[i]);
        }

        int sumOfArray = getSumOfArray(newArray);
        System.out.println("\nSum of array: " + sumOfArray);

        scanner.close();
    }

    public static int[] createArray(Integer sizeOfArray) {
        int result[] = new int[sizeOfArray];
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= sizeOfArray; i++) {
            System.out.println("Insert your " + i + " number:");
            int number = scanner.nextInt();
            result[i - 1] = number;
        }
        scanner.close();
        return result;
    }

    public static int getSumOfArray(int[] array) {
        int result = 0;

        for (int i : array) {
            result += i;
        }
        return result;
    }
}
