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

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Persona) {
            Persona p = (Persona) obj;
            return this.nome.equalsIgnoreCase(p.nome) && this.cognome.equalsIgnoreCase(p.cognome);
        }
        return false;
    }
}
