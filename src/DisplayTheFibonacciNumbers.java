import java.util.Scanner;

public class DisplayTheFibonacciNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert your number for calcolate all numbers Fibonacci:");
        long value = scanner.nextInt();
        // printFibonacci(value);

        printFibonacciRecursion(value);
        scanner.close();
    }

    public static void printFibonacci(long value) {
        long F0 = 0;
        long F1 = 1;
        long F2 = 0;

        System.out.println("Fibonacci numbers to the number you specified:");
        for (; F2 <= value;) {
            F2 = F1 + F0;
            F0 = F1;
            F1 = F2;
            System.out.println(F0);
        }
    }

    public static void printFibonacciRecursion(long value) {
        long first = 0;
        long second = 1;
        fibonacci(first, second, value);
    }

    public static void fibonacci(long first, long second, long value) {
        if (second < value) {
            System.out.println(second);
            fibonacci(second, first + second, value);
        }
    }
}