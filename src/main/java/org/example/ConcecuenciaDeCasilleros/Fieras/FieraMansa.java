package org.example.ConcecuenciaDeCasilleros.Fieras;

import org.example.Equipamiento.Armadura;
import org.example.Equipamiento.Casco;
import org.example.Equipamiento.EscudoYEspada;

public class FieraMansa extends Animal {

    @Override
    public int atacarATravesDeEquipamiento(Casco equipamiento) {
        return 1;
    }

    @Override
    public int atacarATravesDeEquipamiento(Armadura armadura) {
        return 0;
    }

    @Override
    public int atacarATravesDeEquipamiento(EscudoYEspada escudoYEspada) {
        return 0;
    }
}
