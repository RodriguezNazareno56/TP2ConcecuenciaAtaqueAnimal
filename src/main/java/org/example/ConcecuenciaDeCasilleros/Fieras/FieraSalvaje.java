package org.example.ConcecuenciaDeCasilleros.Fieras;

import org.example.Equipamiento.Equipamiento;

public class FieraSalvaje extends Animal {

    @Override
    public int atacarATravesDelEquipamiento(Equipamiento equipamiento) {
        return equipamiento.mitigarAtaque(this);
    }

    @Override
    public int atacarCasco() {
        return 15;
    }

    @Override
    public int atacarArmadura() {
        return 10;
    }

    @Override
    public int atacarEscudoYEspada() {
        return 2;
    }
}
