package org.example.Gladiadores;

import org.example.ConcecuenciaDeCasilleros.Fieras.Animal;

/**
 * Gladiador ligero con una red y un tridente. A menudo, llevaban poco o ningún tipo de armadura.
 */
public class Retiarius extends Gladiador{

    @Override
    protected void defenderse(Animal animal) {
        int danioRecibido = equipamiento.repelerAtaque(this, animal);
        salud = salud - danioRecibido;
    }
}
