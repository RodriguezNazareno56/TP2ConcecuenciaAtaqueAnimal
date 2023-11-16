package org.example.Equipamiento;

import org.example.ConcecuenciaDeCasilleros.Fieras.FieraMansa;
import org.example.ConcecuenciaDeCasilleros.Fieras.FieraSalvaje;

public class EscudoYEspada extends Equipamiento {

    @Override
    public int mitigarAtaque(FieraSalvaje fieraSalvaje) {
        return fieraSalvaje.atacarEscudoYEspada();
    }

    @Override
    public int mitigarAtaque(FieraMansa fieraMansa) {
        return fieraMansa.atacarEscudoYEspada();
    }
}
