import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci una stringa decimale:");
        String decimalString = scanner.nextLine();
        int binaryValue = convert(decimalString);
        System.out.println("Valore binare: " + binaryValue);

        scanner.close();
    }

    public static int convert(String decimalString) {
        int binaryValue = 0;

        try {
            // 1 version
            // int decimalValue = Integer.parseInt(decimalString, 10);
            // String binaryNumber = Integer.toBinaryString(decimalValue);
            // binaryValue = Integer.parseInt(binaryNumber, 10);

            // 2 version (optimizated)
            int decimalValue = Integer.parseInt(decimalString, 10);
            binaryValue = Integer.parseInt(Integer.toBinaryString(decimalValue));

        } catch (NumberFormatException e) {
            System.out.println("La stringa inserita non è decimal.");
        }

        return binaryValue;
    }
}
