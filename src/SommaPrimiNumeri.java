import java.util.Scanner;

public class SommaPrimiNumeri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci un numero N: ");
        int numeroN = scanner.nextInt();
        int somma = 0;

        // ciclo

        for (int i = 1; i < numeroN; i++) {
            somma += i;
        }

        System.out.println("La somma dei primi numeri " + numeroN + " e uguale a " + somma);
        scanner.close();
    }
}
