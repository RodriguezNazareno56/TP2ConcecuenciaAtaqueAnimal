package org.example.Gladiadores;

import org.example.ConcecuenciaDeCasilleros.Fieras.Animal;

/**
 * Gladiador apariencia más pesada, armado con un casco de cresta de pescado, un pequeño escudo rectangular y una espada corta
 */
public class Thraex extends Gladiador{

    @Override
    protected void defenderse(Animal animal) {
        int danioRecibido = equipamiento.repelerAtaque(this, animal);
        salud = salud - danioRecibido;
    }
}
