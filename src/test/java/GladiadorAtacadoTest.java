import org.example.*;
import org.example.ConcecuenciaDeCasilleros.Concecuencia;
import org.example.ConcecuenciaDeCasilleros.FieraSalvaje;
import org.example.Equipamiento.Armadura;
import org.example.Equipamiento.Casco;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GladiadorAtacadoTest {

    @Test
    public void FieraAtacaGladiadorConCasco() {

        Gladiador espartaco = new Gladiador();
        espartaco.setEquipo(new Casco());
        assertEquals(espartaco.getSalud(), 20);

        // la concecuencia es una fiera y hago que afecte al gladiador
        Concecuencia concecuencia = new FieraSalvaje();
        concecuencia.afectarGladiador(espartaco);

        assertEquals(espartaco.getSalud(), 5);
    }

    @Test
    public void FieraAtacaGladiadorConArmadura() {

        Gladiador espartaco = new Gladiador();
        espartaco.setEquipo(new Armadura());
        assertEquals(espartaco.getSalud(), 20);

        // la concecuencia es una fiera y hago que afecte al gladiador
        Concecuencia concecuencia = new FieraSalvaje();
        concecuencia.afectarGladiador(espartaco);

        assertEquals(espartaco.getSalud(), 10);
    }
}
