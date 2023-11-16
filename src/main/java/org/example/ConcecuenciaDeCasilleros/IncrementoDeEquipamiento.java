package org.example.ConcecuenciaDeCasilleros;

import org.example.Gladiador;

public class IncrementoDeEquipamiento extends Consecuencia {
    @Override
    public void afectarGladiador(Gladiador gladiador) {
        gladiador.incrementarEquipamiento();
    }
}
