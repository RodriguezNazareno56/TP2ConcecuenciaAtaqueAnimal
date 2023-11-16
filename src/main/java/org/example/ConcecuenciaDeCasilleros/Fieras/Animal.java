package org.example.ConcecuenciaDeCasilleros.Fieras;

import org.example.ConcecuenciaDeCasilleros.Consecuencia;
import org.example.Gladiadores.Gladiador;

public abstract class Animal extends Consecuencia implements Afectable {

    public void afectarGladiador(Gladiador gladiador) {
        // Una fiera aspira a causar 20 de daño, la evasion (la defensa) depende del gladiador
        gladiador.recibirAtaque(this);
    }
}
