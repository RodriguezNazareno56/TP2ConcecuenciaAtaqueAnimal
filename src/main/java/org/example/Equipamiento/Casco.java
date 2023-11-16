package org.example.Equipamiento;

import org.example.ConcecuenciaDeCasilleros.Fieras.FieraMansa;
import org.example.ConcecuenciaDeCasilleros.Fieras.FieraSalvaje;

public class Casco extends Equipamiento{

    @Override
    public int mitigarAtaque(FieraSalvaje fieraSalvaje) {
        return fieraSalvaje.atacarCasco();
    }

    @Override
    public int mitigarAtaque(FieraMansa fieraMansa) {
        return fieraMansa.atacarCasco();
    }

    @Override
    public Equipamiento incrementar() {
        return new Armadura();
    }
}
