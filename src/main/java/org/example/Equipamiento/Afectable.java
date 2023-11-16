package org.example.Equipamiento;

import org.example.ConcecuenciaDeCasilleros.Fieras.FieraMansa;
import org.example.ConcecuenciaDeCasilleros.Fieras.FieraSalvaje;

public interface Afectable {

    int mitigarAtaque(FieraSalvaje fieraSalvaje);
    int mitigarAtaque(FieraMansa fieraMansa);
}
