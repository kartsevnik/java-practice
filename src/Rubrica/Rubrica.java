package Rubrica;

public class Rubrica {
    Persona[] elenco;

    int ultimoContattoInserito = 0;

    public Rubrica(int maxContatti) {
        elenco = new Persona[maxContatti];
    }

    public Rubrica() {
        elenco = new Persona[50];
    }

    public void addContatto(Persona contatto) {
        elenco[ultimoContattoInserito] = contatto;
        ultimoContattoInserito = ultimoContattoInserito + 1;
    }

    public Persona cercaContattoPerCognome(String cognome) {
        for (int i = 0; i < elenco.length; i++) {
            if (elenco[i] != null && elenco[i].cognome.equalsIgnoreCase(cognome)) {
                return elenco[i];
            }
        }
        return null;
    }
}
