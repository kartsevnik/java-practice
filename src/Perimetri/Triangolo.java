package Perimetri;

import java.util.Scanner;

// Треугольник:
// Периметр: a + b + c
public class Triangolo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Inserisci lato a");
        int a = input.nextInt();
        System.out.println("Inserisci lato b");
        int b = input.nextInt();
        System.out.println("Inserisci lato c");
        int c = input.nextInt();

        int result = calcolatePerimetro(a, b, c);
        System.out.println("Perimetro di Triangolo: " + result);
        input.close();
    }

    private static int calcolatePerimetro(int a, int b, int c) {
        return a + b + c;
    }
}
