package org.example.ConcecuenciaDeCasilleros.Fieras;

import org.example.ConcecuenciaDeCasilleros.Concecuencia;
import org.example.Equipamiento.Armadura;
import org.example.Equipamiento.Casco;
import org.example.Equipamiento.EscudoYEspada;

public class FieraSalvaje extends Animal implements Concecuencia {

    @Override
    public int atacarATravesDeEquipamiento(Casco equipamiento) {
        return 15;
    }

    @Override
    public int atacarATravesDeEquipamiento(Armadura armadura) {
        return 10;
    }

    @Override
    public int atacarATravesDeEquipamiento(EscudoYEspada escudoYEspada) {
        return 2;
    }
}
