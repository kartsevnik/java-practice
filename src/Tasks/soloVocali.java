// * Scrivere un programma SoloVocali che chiede all’utente di inserire una
// stringa e ne stampa le sole vocali, definendo il metodo estraiVocali. Per
// esempio, se si immette la stringa "Viva Java", il programma stampa "iaaa".

// *Напишите программу SoloVocali, которая просит пользователя ввести строку и строку и выводит только гласные,
// определяя метод extractVowels. Для например, если ввести строку 'Viva Java', программа выведет 'iaaa'.

package Tasks;

import java.util.Scanner;

public class soloVocali {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your text:");
        String enteredWord = input.nextLine();
        if (enteredWord != null || enteredWord != "" || enteredWord != " ") {
            extractVowels1(enteredWord);
            extractVowels2(enteredWord);
        }
        input.close();

    }

    private static void extractVowels1(String enteredWord) {
        String result = "";
        String enteredWordLC = enteredWord.toLowerCase();
        for (int i = 0; i < enteredWord.length(); i++) {
            char c = enteredWordLC.charAt(i);
            if (c == 'a' ||
                    c == 'e' ||
                    c == 'i' ||
                    c == 'o' ||
                    c == 'u') {
                result += enteredWord.charAt(i);
            }
        }
        System.out.println("extractVowels1: " + result);
    }

    private static void extractVowels2(String enteredWord) {
        System.out.print("extractVowels2: ");
        String enteredWordLC = enteredWord.toLowerCase();

        for (int i = 0; i < enteredWord.length(); i++) {
            char currentChar = enteredWordLC.charAt(i);
            if (isVowel(currentChar)) {
                System.out.print(enteredWord.charAt(i));
            }
        }
    }

    private static boolean isVowel(char currentChar) {
        if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i'
                || currentChar == 'o' || currentChar == 'u') {
            return true;
        }
        return false;
    }
}