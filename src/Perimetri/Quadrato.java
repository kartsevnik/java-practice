package Perimetri;

import java.util.Scanner;

public class Quadrato extends Rettangolo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Inserisci larghezza");
        int larghezza = input.nextInt();
        System.out.println("Inserisci altezza");
        int altezza = input.nextInt();

        int result = Rettangolo.calcolatePerimetro(larghezza, altezza);
        System.out.println("Perimetro di Quadrato: " + result);
        input.close();
    }
}
