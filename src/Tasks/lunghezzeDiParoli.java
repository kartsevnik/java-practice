
// * Scrivere un programma Lunghezze che chiede all’utente di inserire una
// sequenza di stringhe e conclusa dalla stringa vuota, e poi stampa la somma
// delle lunghezze delle stringhe che iniziano con una lettera maiuscola. Per
// esempio, se si immettono le stringhe "Albero", "foglia", "Radici", "Ramo", "fiore"
// (e poi""per finire),il programma stampa 16.

package Tasks;

import java.util.Scanner;

public class lunghezzeDiParoli {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        int sumLengths = 0;

        System.out.println("Enter the sequence of lines.To complete, enter an empty line.");

        do {
            System.out.print("Enter the string: ");
            input = scanner.nextLine();

            // Проверяем, не является ли строка пустой перед вычислением длины и проверкой
            // заглавной буквы.
            if (!input.isEmpty() && Character.isUpperCase(input.charAt(0))) {
                sumLengths += input.length();
            }
        } while (!input.isEmpty());

        scanner.close();

        System.out.println("The sum of the lengths of lines starting with the title letter: " + sumLengths);
    }
}
