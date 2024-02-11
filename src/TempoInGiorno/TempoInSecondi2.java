package TempoInGiorno;

import java.util.Scanner;

// Scrivere un programma che, dato un certo tempo in secondi (es: 84932) restituisca il
// numero di giorni, ore, minuti e secondi (senza usare condizioni). Si prega di osservare che un
// giorno ha 86400 secondi, un’ora ha 3600 secondi e un minuto 60 secondi.

// Напишите программу,которая,задав определенное время в секундах(например,84932),
// возвращает количество дней,часов,минут и секунд(без использования условий).
// Обратите внимание, что день состоит из 86400 секунд, час - из 3600 секунд, а минута - из 60 секунд.

public class TempoInSecondi2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter quantity of seconds");
        int insertSeconds = input.nextInt();

        int secondsInDay = 86400;
        int secondsInHour = 3600;
        int secondsInMinute = 60;

        int days = insertSeconds / secondsInDay;
        insertSeconds = insertSeconds % secondsInDay;

        int hours = insertSeconds / secondsInHour;
        insertSeconds = insertSeconds % secondsInHour;

        int minutes = insertSeconds / secondsInMinute;
        int seconds = insertSeconds % secondsInMinute;

        System.out.println("In " + insertSeconds + " seconds " + "contained:");
        System.out.println(
                days + " days, " + hours + " hours, " + minutes + " minutes, " + seconds + " seconds.");
        input.close();

    }

}
