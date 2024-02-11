
package Perimetri;

import java.util.Scanner;

// Периметр: 2 * π * r
public class Cerchio {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Inserisci radius di cerchio");
        int r = input.nextInt();

        double result = calcolatePerimetro(r);
        System.out.println("Perimetro di cerchio: " + result);
        input.close();
    }

    private static double calcolatePerimetro(int r) {
        double pi = 3.14;
        return 2 * pi + r;
    }
}
