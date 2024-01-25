package TempoInGiorno;

import java.util.Scanner;

// Scrivere un programma che, dato un certo tempo in secondi (es: 84932) restituisca il
// numero di giorni, ore, minuti e secondi (senza usare condizioni). Si prega di osservare che un
// giorno ha 86400 secondi, un’ora ha 3600 secondi e un minuto 60 secondi.

// Напишите программу,которая,задав определенное время в секундах(например,84932),
// возвращает количество дней,часов,минут и секунд(без использования условий).
// Обратите внимание, что день состоит из 86400 секунд, час - из 3600 секунд, а минута - из 60 секунд.

public class TempoInSecondi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter quantity of seconds");
        int seconds = input.nextInt();

        int[] result = calcolateResult(seconds);
        System.out.println("In " + seconds + " seconds " + "contained:");
        System.out.println(
                result[0] + " days, " + result[1] + " hours, " + result[2] + " minutes, " + result[3] + " seconds.");
        input.close();
    }

    private static int[] calcolateResult(int insertSeconds) {
        int secondsInDay = 86400;
        int secondsInHour = 3600;
        int secondsInMinute = 60;

        int[] result = new int[4];
        result[0] = insertSeconds / secondsInDay;
        insertSeconds -= (result[0] * secondsInDay);

        result[1] = insertSeconds / secondsInHour;
        insertSeconds -= (result[1] * secondsInHour);

        result[2] = insertSeconds / secondsInMinute;
        insertSeconds -= (result[2] * secondsInMinute);
        return result;
    }
}
