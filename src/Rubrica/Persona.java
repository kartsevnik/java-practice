package Rubrica;

public class Persona {
    String nome;
    String cognome;
    String telefono;

    public Persona(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
        this.telefono = "";
    }

    public Persona(String nome, String cognome, String telefono) {
        this.nome = nome;
        this.cognome = cognome;
        this.telefono = telefono;
    }
}
