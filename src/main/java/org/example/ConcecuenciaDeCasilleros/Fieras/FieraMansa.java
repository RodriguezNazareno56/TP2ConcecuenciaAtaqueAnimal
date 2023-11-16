package org.example.ConcecuenciaDeCasilleros.Fieras;

import org.example.Equipamiento.Equipamiento;

public class FieraMansa extends Animal {

    @Override
    public int atacarATravesDelEquipamiento(Equipamiento equipamiento) {
        return equipamiento.mitigarAtaque(this);
    }

    @Override
    public int atacarCasco() {
        return 1;
    }

    @Override
    public int atacarArmadura() {
        return 0;
    }

    @Override
    public int atacarEscudoYEspada() {
        return 0;
    }
}
