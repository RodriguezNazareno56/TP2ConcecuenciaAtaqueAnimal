import org.example.ConcecuenciaDeCasilleros.Consecuencia;
import org.example.ConcecuenciaDeCasilleros.Fieras.FieraSalvaje;
import org.example.ConcecuenciaDeCasilleros.IncrementoDeEquipamiento;
import org.example.Equipamiento.Armadura;
import org.example.Equipamiento.Casco;
import org.example.Equipamiento.EscudoYEspada;
import org.example.Gladiador;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GladiadorEquipamientoTest {

    @Test
    public void GladiadorConCascoIncrementaSuEquipamientoSeDefiendeConArmadura() {

        Gladiador espartaco = new Gladiador();
        espartaco.setEquipamiento(new Casco());
        assertEquals(espartaco.getSalud(), 20);

        //act
        Consecuencia incrementoDeEquipamiento = new IncrementoDeEquipamiento();
        incrementoDeEquipamiento.afectarGladiador(espartaco);

        Consecuencia fieraSalvaje = new FieraSalvaje();
        fieraSalvaje.afectarGladiador(espartaco);

        // La fiera causa 10 de daño si tiene armadura, 15 si solo casco
        assertEquals(espartaco.getSalud(), 10);
    }

    @Test
    public void GladiadorConArmaduraIncrementaSuEquipamientoSeDefiendeConEscudoYEspada() {

        Gladiador espartaco = new Gladiador();
        espartaco.setEquipamiento(new Armadura());
        assertEquals(espartaco.getSalud(), 20);

        //act
        Consecuencia incrementoDeEquipamiento = new IncrementoDeEquipamiento();
        incrementoDeEquipamiento.afectarGladiador(espartaco);

        Consecuencia fieraSalvaje = new FieraSalvaje();
        fieraSalvaje.afectarGladiador(espartaco);

        // La fiera causa 2 de daño si tiene armadura, 15 si solo casco
        assertEquals(espartaco.getSalud(), 18);
    }

    @Test
    public void GladiadorConEscudoYEspadaIncrementaSuEquipamientoContinuaConEscudoYEspada() {

        Gladiador espartaco = new Gladiador();
        espartaco.setEquipamiento(new EscudoYEspada());
        assertEquals(espartaco.getSalud(), 20);

        //act
        Consecuencia incrementoDeEquipamiento = new IncrementoDeEquipamiento();
        incrementoDeEquipamiento.afectarGladiador(espartaco);

        Consecuencia fieraSalvaje = new FieraSalvaje();
        fieraSalvaje.afectarGladiador(espartaco);

        // La fiera causa 2 de daño si tiene armadura, 15 si solo casco
        assertEquals(espartaco.getSalud(), 18);
    }

    @Test
    public void GladiadorConCascoIncrementaSuEquipamiento2vecesSeDefiendeConEspadaYEscudo() {

        Gladiador espartaco = new Gladiador();
        espartaco.setEquipamiento(new Casco());
        assertEquals(espartaco.getSalud(), 20);

        //act
        Consecuencia incrementoDeEquipamiento = new IncrementoDeEquipamiento();
        incrementoDeEquipamiento.afectarGladiador(espartaco);
        incrementoDeEquipamiento.afectarGladiador(espartaco);

        Consecuencia fieraSalvaje = new FieraSalvaje();
        fieraSalvaje.afectarGladiador(espartaco);

        // La fiera causa 10 de daño si tiene armadura, 15 si solo casco
        assertEquals(espartaco.getSalud(), 18);
    }
}
