package Tasks;

import java.util.Scanner;

public class OperazioniMatematiche {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci primo numero: ");
        int numberFirst = scanner.nextInt();

        System.out.println("Inserisci secondo numero: ");
        int numberSecond = scanner.nextInt();

        int sum = sum(numberFirst, numberSecond);
        System.out.println("Sum: " + sum);

        int sottrazione = sottrazione(numberFirst, numberSecond);
        System.out.println("Sottrazione: " + sottrazione);

        int quoziente = quoziente(numberFirst, numberSecond);
        System.out.println("Quoziente : " + quoziente + "%");

        int modulo = quoziente(numberFirst, numberSecond);
        System.out.println("Modulo : " + modulo);

        scanner.close();
    }

    public static int sum(int firstNum, int secondNum) {
        int result = firstNum + secondNum;
        return result;
    }

    public static int sottrazione(int firstNum, int secondNum) {
        int result = firstNum - secondNum;
        return result;
    }

    public static int quoziente(int firstNum, int secondNum) {
        int result = (firstNum / secondNum) * 100;
        return result;
    }

    public static int modulo(int firstNum, int secondNum) {
        int result = Math.abs(firstNum - secondNum);
        return result;
    }

}
