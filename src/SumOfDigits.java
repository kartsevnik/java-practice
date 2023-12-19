import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci un numero N: ");
        int number = scanner.nextInt();
        // int number = 111111;
        int sum = sumOfDigits(number);
        System.out.println("The sum of the numbers of the number " + number + " equal: " + sum);
        scanner.close();
    }

    // Method for calculating the amount of numbers of the number
    // Метод для вычисления суммы цифр числа
    public static int sumOfDigits(int num) {
        int sum = 0;

        if (num < 0) {
            num *= -1;
        }

        // pass for each number of numbers
        // Проходим по каждой цифре числа
        while (num != 0) {
            sum += num % 10; // Получаем последнюю цифру числа и добавляем к сумме
            num /= 10; // Убираем последнюю цифру числа
        }

        return sum;

    }
}
