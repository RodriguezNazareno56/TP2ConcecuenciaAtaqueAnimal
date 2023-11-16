package org.example.Equipamiento;

import org.example.ConcecuenciaDeCasilleros.Fieras.FieraMansa;
import org.example.ConcecuenciaDeCasilleros.Fieras.FieraSalvaje;

public class Casco extends Equipamiento{

    @Override
    public int mitigarAtaque(FieraSalvaje fieraSalvaje) {
        return 15;
    }

    @Override
    public int mitigarAtaque(FieraMansa fieraMansa) {
        return 1;
    }
}
