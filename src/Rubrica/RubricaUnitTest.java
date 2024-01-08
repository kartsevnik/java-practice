package Rubrica;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class RubricaUnitTest {

    Rubrica rubrica;

    @Before

    public void caricaRubrica() {
        rubrica = new Rubrica();

        Persona p1 = new Persona("Niccolo", "Paganini");
        Persona p2 = new Persona("Jiuseppe", "Verdi", "335355345");

        rubrica.addContatto(p1);
        rubrica.addContatto(p2);
    }

    @Test
    public void cercaContattoPerCognomeTest() {
        Persona personaCercata = rubrica.cercaContattoPerCognome("Paganini");

        assertEquals("Paganini", personaCercata.cognome);
    }

    @Test
    public void cercaContattiPerNomeTest() {
        Persona[] contattiTrovati = rubrica.cercaContattiPerNome("Niccolo");
        Persona[] contattiAttesi = new Persona[1];
        contattiAttesi[0] = new Persona("Niccolo", "Paganini");
        assertArrayEquals(contattiAttesi, contattiTrovati);
    }

    @Test
    public void cercaContattiPerInizialeTest() {
        Persona[] contattiTrovati = rubrica.cercaContattiPerIniziale('N');
        Persona[] contattiAttesi = new Persona[1];
        contattiAttesi[0] = new Persona("Niccolo", "Paganini");
        assertArrayEquals(contattiTrovati, contattiAttesi);
    }

    @Test
    public void cercaContattiPerPatternTest() {
        Persona[] contattiTrovati = rubrica.cercaContattiPerPattern("icco");
        Persona[] contattiAttesi = new Persona[1];
        contattiAttesi[0] = new Persona("Niccolo", "Paganini");
        assertArrayEquals(contattiAttesi, contattiTrovati);
    }
}
