package Tasks;

import java.util.Scanner;

public class FillArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = createArray(scanner);
        int[] fillArr = fillArray(arr, scanner);

        System.out.print("Result: ");
        for (int i : fillArr) {
            System.out.print(i + " ");
        }
        scanner.close();
    }

    public static int[] createArray(Scanner scanner) {
        System.out.print("Insert your size of array: ");
        int sizeOfArray = scanner.nextInt();
        int[] arr = new int[sizeOfArray];
        // System.out.println("Size of arr: " + arr.length);

        return arr;
    }

    public static int[] fillArray(int[] arr, Scanner scanner) {

        System.out.print("Insert your number for divisione: ");
        int divisioneNum = scanner.nextInt();
        int currentIndex = 0;
        for (int currentNumber = 1; currentIndex < arr.length; currentNumber++) {
            if (currentNumber % divisioneNum == 0) {
                arr[currentIndex] = currentNumber;
                currentIndex++;
            }
        }
        return arr;
    }

}
