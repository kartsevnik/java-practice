import java.util.Scanner;

public class DisplayTheFibonacciNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert your number for calcolate all numbers Fibonacci:");
        long value = scanner.nextInt();
        calcolate(value);
        scanner.close();
    }

    public static void calcolate(long value) {
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
}
