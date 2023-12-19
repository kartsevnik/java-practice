package Rubrica;

public class App {
    public static void main(String[] args) throws Exception {
        Persona p1 = new Persona("Niccolo", "Paganini");
        Persona p2 = new Persona("Jiuseppe", "Verdi", "335355345");

        Rubrica rubrica = new Rubrica();

        rubrica.addContatto(p1);
        rubrica.addContatto(p2);

        Persona personaCercata = rubrica.cercaContattoPerCognome("Paganini");
        if (personaCercata != null) {
            System.out.println("Nome: " + personaCercata.nome);
            System.out.println("Cognome: " + personaCercata.cognome);
            System.out.println("Telefono: " + personaCercata.telefono);
        } else
            System.out.println("Non c`e");

    }

}
