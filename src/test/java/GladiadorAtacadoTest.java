import org.example.ConcecuenciaDeCasilleros.Consecuencia;
import org.example.ConcecuenciaDeCasilleros.Fieras.FieraMansa;
import org.example.ConcecuenciaDeCasilleros.Fieras.FieraSalvaje;
import org.example.Equipamiento.Armadura;
import org.example.Equipamiento.Casco;
import org.example.Equipamiento.EscudoYEspada;
import org.example.Gladiador;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GladiadorAtacadoTest {

    @Test
    public void FieraSalvajeAtacaGladiadorConCasco() {

        Gladiador espartaco = new Gladiador();
        espartaco.setEquipamiento(new Casco());
        assertEquals(espartaco.getSalud(), 20);

        // la concecuencia es una fiera y hago que afecte al gladiador
        Consecuencia consecuencia = new FieraSalvaje();
        consecuencia.afectarGladiador(espartaco);

        // La fiera causa 15 de daño
        assertEquals(espartaco.getSalud(), 5);
    }

    @Test
    public void FieraSalvajeAtacaGladiadorConArmadura() {

        Gladiador espartaco = new Gladiador();
        espartaco.setEquipamiento(new Armadura());
        assertEquals(espartaco.getSalud(), 20);

        // la concecuencia es una fiera y hago que afecte al gladiador
        Consecuencia consecuencia = new FieraSalvaje();
        consecuencia.afectarGladiador(espartaco);

        // La fiera causa 10 de daño
        assertEquals(espartaco.getSalud(), 10);
    }

    // añadir una nueva armadura, solo requiere crear la clase que extienda de equipamiento, añadir el metodo
    // int atacarATravesDeEquipamiento(EscudoYEspada escudoYEspada); a Afectable e implementar el daño que causa el
    // animal a traves de este equipo
    @Test
    public void FieraSalvajeAtacaGladiadorConEscudoYEspada() {

        Gladiador espartaco = new Gladiador();
        espartaco.setEquipamiento(new EscudoYEspada());
        assertEquals(espartaco.getSalud(), 20);

        // la concecuencia es una fiera y hago que afecte al gladiador
        Consecuencia consecuencia = new FieraSalvaje();
        consecuencia.afectarGladiador(espartaco);

        // La fiera causa 2 de daño
        assertEquals(espartaco.getSalud(), 18);
    }

    @Test
    public void FieraMansaAtacaGladiadorConArmadura() {

        Gladiador espartaco = new Gladiador();
        espartaco.setEquipamiento(new Armadura());
        assertEquals(espartaco.getSalud(), 20);

        // la concecuencia es una fiera y hago que afecte al gladiador
        Consecuencia consecuencia = new FieraMansa();
        consecuencia.afectarGladiador(espartaco);

        // La fiera causa 10 de daño
        assertEquals(espartaco.getSalud(), 20);
    }
}
