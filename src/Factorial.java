import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result;
        System.out.println("Iserisci uno factoriale:");
        var value = scanner.nextLine();

        try {
            result = calcolateFactorial(value);
            System.out.println(result);

        } catch (NumberFormatException e) {
            System.out.println("La stringa inserita non è number.");
        }
        scanner.close();
    }

    public static int calcolateFactorial(String value) {
        int valueInt = Integer.parseInt(value);
        int result = Integer.parseInt(value);
        System.out.println(result);

        result = 1;
        for (int currentValue = 1; currentValue <= valueInt; currentValue++) {
            result *= currentValue;
        }
        return result;
    }
}
