package Tasks;

import java.util.Scanner;

public class FactorialInRecurison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci num of factorial:");
        int value = scanner.nextInt();
        long result = factorial(value);
        scanner.close();
        System.out.println("Factorial of " + value + " => " + result);
    }

    public static int factorial(int value) {
        if (value == 1) {
            return 1;
        }
        // 5 * (4 * (3 * (2*1) ) )
        return value * factorial(value - 1);
    }
}
