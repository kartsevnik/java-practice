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

    public Persona cercaContattoPerNome(String nome) {
        return null;
    }

    public Persona[] cercaContattiPerCognome(String cognome) {
        return null;
    }

    public Persona[] cercaContattiPerNome(String nome) {
        int contattiTrovati = 0;
        Persona[] contattiCorrispondenti = null;
        for (int i = 0; i < elenco.length; i++) {
            if (elenco[i] != null && elenco[i].nome.equalsIgnoreCase(nome)) {
                contattiTrovati += 1;
            }
        }

        if (contattiTrovati > 0) {
            contattiCorrispondenti = new Persona[contattiTrovati];
            int j = 0;
            for (int i = 0; i < elenco.length; i++) {
                if (elenco[i] != null && elenco[i].nome.equalsIgnoreCase(nome)) {
                    contattiCorrispondenti[j] = elenco[i];
                }
            }
        }

        return contattiCorrispondenti;
    }

    // ... a seguire e il nome o il cognome del contatto deve iniziare
    // con il carattere ricevuto da parametro
    public Persona[] cercaContattiPerIniziale(char iniziale) {
        iniziale = Character.toLowerCase(iniziale);
        int contattiTrovati = 0;

        for (int i = 0; i < elenco.length; i++) {
            if (elenco[i] != null && elenco[i].nome.toLowerCase().charAt(0) == iniziale
                    || elenco[i].cognome.toLowerCase().charAt(0) == iniziale) {
                contattiTrovati += 1;
            }
        }

        Persona[] contattiCorrispondenti = null;
        if (contattiTrovati > 0) {
            contattiCorrispondenti = new Persona[contattiTrovati];
            int j = 0;
            for (int i = 0; i < elenco.length; i++) {
                if (elenco[i] != null &&
                        elenco[i].nome.toLowerCase().charAt(0) == iniziale ||
                        elenco[i].cognome.toLowerCase().charAt(0) == iniziale) {
                    contattiCorrispondenti[j] = elenco[i];
                }
            }
        }
        return contattiCorrispondenti;
    }
    // ... a seguire e il nome o il cognome del contatto deve contenere
    // la stringa ricevuta da parametro (pattern dev`essere lunga almeno 3
    // carratteri)
    // altrimenti non faccio la ricerca e ritorno null

    // public Persona[] cercaContattiPerPattern(String pattern) {
    // int contattiTrovati = 0;

    // for (int i = 0; i < elenco.length; i++) {
    // if (elenco[i] != null && elenco[i].nome.charAt(0) == pattern) {
    // contattiTrovati += 1;
    // }
    // }

    // Persona[] contattiCorrispondenti = null;
    // if (contattiTrovati > 0) {
    // contattiCorrispondenti = new Persona[contattiTrovati];
    // int j = 0;
    // for (int i = 0; i < elenco.length; i++) {
    // if (elenco[i] != null && elenco[i].nome.charAt(0) == pattern) {
    // contattiCorrispondenti[j] = elenco[i];
    // }
    // }
    // }
    // return contattiCorrispondenti;
    // }

}
