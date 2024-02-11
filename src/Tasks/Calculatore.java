package Tasks;

import java.util.Scanner;

public class Calculatore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number");
        int num1 = input.nextInt();

        System.out.println("Enter second number");
        int num2 = input.nextInt();

        System.out.println("Enter the command:");
        System.out.println("1 - Addition");
        System.out.println("2 - Subtraction");
        System.out.println("3 - Division");
        System.out.println("4 - Multiplication");
        System.out.println("0 - Exit");
        int command = input.nextInt();

        while (command > 4 || command < 0) {
            System.out.println("You introduced the wrong command. Try again.");
            command = input.nextInt();
        }

        double result = 0;
        switch (command) {
            case 1:
                result = addition(num1, num2);
                break;
            case 2:
                result = subtraction(num1, num2);
                break;
            case 3:
                result = division(num1, num2);
                break;
            case 4:
                result = multiplication(num1, num2);
                break;
            default:
                System.out.println("Exit");
                break;
        }

        System.out.println("Result of calcultaing: " + result);
        input.close();
    }

    private static int multiplication(int num1, int num2) {
        return num1 * num2;
    }

    private static double division(int num1, int num2) {
        return (double) num1 / num2;
    }

    private static int subtraction(int num1, int num2) {
        return num1 - num2;
    }

    private static int addition(int num1, int num2) {
        return num1 + num2;
    }
}
