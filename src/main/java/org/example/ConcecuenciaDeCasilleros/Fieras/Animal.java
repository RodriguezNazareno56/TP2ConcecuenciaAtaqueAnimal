package org.example.ConcecuenciaDeCasilleros.Fieras;

import org.example.ConcecuenciaDeCasilleros.Consecuencia;
import org.example.Equipamiento.Equipamiento;
import org.example.Gladiador;

public abstract class Animal extends Consecuencia {

    public void afectarGladiador(Gladiador gladiador) {
        // Una fiera aspira a causar 20 de daño, la evasion (la defensa) depende del gladiador
        gladiador.recibirAtaque(this);
    }

    public abstract int atacarATravesDelEquipamiento(Equipamiento equipamiento);

    public abstract int atacarCasco();
    public abstract int atacarArmadura();
    public abstract int atacarEscudoYEspada();
}
