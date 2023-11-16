package org.example.ConcecuenciaDeCasilleros.Fieras;

import org.example.Equipamiento.Armadura;
import org.example.Equipamiento.Casco;
import org.example.Equipamiento.EscudoYEspada;

public class Tiburon extends Animal {
    @Override
    public int atacarATravesDeEquipamiento(Casco casco) {
        return 10;
    }

    @Override
    public int atacarATravesDeEquipamiento(Armadura armadura) {
        return 4;
    }

    @Override
    public int atacarATravesDeEquipamiento(EscudoYEspada escudoYEspada) {
        return 1;
    }
}
