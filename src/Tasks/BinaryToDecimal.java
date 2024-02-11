package Tasks;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci una stringa binaria:");

        String binaryString = scanner.nextLine();
        int decimalValue = convert(binaryString);
        System.out.println("Valore decimale: " + decimalValue);

        scanner.close();
    }

    public static int convert(String binaryString) {
        int decimalValue = 0;

        try {
            decimalValue = Integer.parseInt(binaryString, 2);
        } catch (NumberFormatException e) {
            System.out.println("La stringa inserita non è binaria.");
        }

        return decimalValue;
    }

}
