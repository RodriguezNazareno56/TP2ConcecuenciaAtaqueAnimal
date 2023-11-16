package org.example.Equipamiento;

import org.example.ConcecuenciaDeCasilleros.Fieras.FieraMansa;
import org.example.ConcecuenciaDeCasilleros.Fieras.FieraSalvaje;

public class Armadura extends Equipamiento{

    @Override
    public int mitigarAtaque(FieraSalvaje fieraSalvaje) {
        return 10;
    }

    @Override
    public int mitigarAtaque(FieraMansa fieraMansa) {
        return 0;
    }
}
