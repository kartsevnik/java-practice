package Perimetri;

import java.util.Scanner;

// Прямоугольник:
// Периметр: 2 * (larghezza + altezza)
// Площадь: larghezza * altezza

public class Rettangolo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Inserisci larghezza");
        int larghezza = input.nextInt();
        System.out.println("Inserisci altezza");
        int altezza = input.nextInt();

        int result = calcolatePerimetro(larghezza, altezza);
        System.out.println("Perimetro di Rettangolo: " + result);
        input.close();
    }

    public static int calcolatePerimetro(int larghezza, int altezza) {
        return 2 * (larghezza + altezza);
    }
}
