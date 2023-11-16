package org.example.Equipamiento;

import org.example.ConcecuenciaDeCasilleros.Fieras.FieraMansa;
import org.example.ConcecuenciaDeCasilleros.Fieras.FieraSalvaje;

public class Armadura extends Equipamiento{

    @Override
    public int mitigarAtaque(FieraSalvaje fieraSalvaje) {
        return fieraSalvaje.atacarArmadura();
    }

    @Override
    public int mitigarAtaque(FieraMansa fieraMansa) {
        return fieraMansa.atacarArmadura();
    }

    @Override
    public Equipamiento incrementar() {
        return new EscudoYEspada();
    }
}
