package org.example.ConcecuenciaDeCasilleros.Fieras;

import org.example.Equipamiento.Armadura;
import org.example.Equipamiento.Casco;
import org.example.Equipamiento.EscudoYEspada;
import org.example.Gladiadores.Retiarius;
import org.example.Gladiadores.Thraex;

public class Tiburon extends Animal {

    @Override
    public int atacarATravesDeEquipamiento(Retiarius retiarius, Casco casco) {
        return 0;
    }

    @Override
    public int atacarATravesDeEquipamiento(Retiarius retiarius, Armadura armadura) {
        return 0;
    }

    @Override
    public int atacarATravesDeEquipamiento(Retiarius retiarius, EscudoYEspada escudoYEspada) {
        return 0;
    }

    @Override
    public int atacarATravesDeEquipamiento(Thraex thraex, Casco casco) {
        return 10;
    }

    @Override
    public int atacarATravesDeEquipamiento(Thraex thraex, Armadura armadura) {
        return 4;
    }

    @Override
    public int atacarATravesDeEquipamiento(Thraex thraex, EscudoYEspada escudoYEspada) {
        return 1;
    }
}
