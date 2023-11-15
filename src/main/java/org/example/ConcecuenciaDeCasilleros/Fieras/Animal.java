package org.example.ConcecuenciaDeCasilleros.Fieras;

import org.example.Gladiador;

public abstract class Animal implements Afectable{

    public void afectarGladiador(Gladiador gladiador) {
        // Una fiera aspira a causar 20 de daño, la evasion (la defensa) depende del gladiador
        gladiador.recibirAtaque(this);
    }
}
