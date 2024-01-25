package TempoInGiorno;

import java.util.Scanner;

// * Scrivere un programma che, dato un certo tempo in giorni, ore, minuti e secondi, restituisca il numero totale di
// secondi. NB un giorno ha 86400 secondi, un’ora ha 3600 secondi e un minuto 60 secondi

// * Напишите программу, которая, задав определенное время в днях, часах, минутах и секундах, 
// возвращает общее количество  секунд. NB день состоит из 86400 секунд, час - из 3600 секунд, а минута - из 60 секунд.

public class TempoInGiorni {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter quantity of days");
        int days = input.nextInt();

        System.out.println("Enter quantity of hours");
        int hours = input.nextInt();

        System.out.println("Enter quantity of minutes");
        int minutes = input.nextInt();

        System.out.println("Enter quantity of seconds");
        int seconds = input.nextInt();

        int result = calcolateResult(days, hours, minutes, seconds);
        System.out.println("The number of days and time indicated by you contains: " + result + " seconds.");
        input.close();
    }

    private static int calcolateResult(int days, int hours, int minutes, int seconds) {
        days *= 86400;
        hours *= 3600;
        minutes *= 60;
        int result = days + hours + minutes + seconds;
        return result;
    }
}
