package org.example.ConcecuenciaDeCasilleros.Fieras;

import org.example.Equipamiento.Armadura;
import org.example.Equipamiento.Casco;
import org.example.Equipamiento.EscudoYEspada;
import org.example.Gladiadores.Retiarius;
import org.example.Gladiadores.Thraex;

public interface Afectable {

    int atacarATravesDeEquipamiento(Retiarius retiarius, Casco casco);
    int atacarATravesDeEquipamiento(Retiarius retiarius, Armadura armadura);
    int atacarATravesDeEquipamiento(Retiarius retiarius, EscudoYEspada escudoYEspada);
    int atacarATravesDeEquipamiento(Thraex thraex, Casco casco);
    int atacarATravesDeEquipamiento(Thraex thraex, Armadura armadura);
    int atacarATravesDeEquipamiento(Thraex thraex, EscudoYEspada escudoYEspada);
}
