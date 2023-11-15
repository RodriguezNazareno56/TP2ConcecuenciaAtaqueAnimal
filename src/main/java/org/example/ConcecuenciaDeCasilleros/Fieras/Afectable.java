package org.example.ConcecuenciaDeCasilleros.Fieras;

import org.example.Equipamiento.Armadura;
import org.example.Equipamiento.Casco;
import org.example.Equipamiento.EscudoYEspada;

public interface Afectable {

    int atacarATravesDeEquipamiento(Casco casco);
    int atacarATravesDeEquipamiento(Armadura armadura);
    int atacarATravesDeEquipamiento(EscudoYEspada escudoYEspada);
}
