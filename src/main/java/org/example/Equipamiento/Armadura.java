package org.example.Equipamiento;

import org.example.ConcecuenciaDeCasilleros.Fieras.Animal;

public class Armadura implements Equipamiento{

    @Override
    public int repelerAtaque(Animal animal) {
        return animal.atacarATravesDeEquipamiento(this);
    }
}
