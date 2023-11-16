package org.example.ConcecuenciaDeCasilleros.Fieras;

import org.example.Equipamiento.Equipamiento;

public class FieraMansa extends Animal {

    @Override
    public int atacarATravesDeEquipamiento(Equipamiento equipamiento) {
        return equipamiento.mitigarAtaque(this);
    }
}
