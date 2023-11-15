package org.example.ConcecuenciaDeCasilleros;

import org.example.ConcecuenciaDeCasilleros.Concecuencia;
import org.example.Equipamiento.Armadura;
import org.example.Equipamiento.Casco;
import org.example.Gladiador;

public class FieraSalvaje implements Concecuencia {
    @Override
    public void afectarGladiador(Gladiador gladiador) {
        // Una fiera aspira a causar 20 de daño, la evasion (la defensa) depende del gladiador
        gladiador.recibirAtaque(this);
    }

    public void lograrDanioATravesDeEquipamiento(Armadura armadura) {
    }

    public void lograrDanioATravesDeEquipamiento(Casco armadura) {
    }
}
