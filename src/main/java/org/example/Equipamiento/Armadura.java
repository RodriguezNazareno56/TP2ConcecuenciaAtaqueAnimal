package org.example.Equipamiento;

import org.example.ConcecuenciaDeCasilleros.FieraSalvaje;

public class Armadura implements Equipamiento{
    @Override
    public int repelerAtaqueDeFiera(FieraSalvaje fieraSalvaje) {
        return 10;
    }
}
