package org.example.Equipamiento;

import org.example.ConcecuenciaDeCasilleros.Fieras.Animal;
import org.example.Gladiadores.Retiarius;
import org.example.Gladiadores.Thraex;

public class Casco extends Equipamiento{

    @Override
    public int repelerAtaque(Retiarius retiarius, Animal animal) {
        return animal.atacarATravesDeEquipamiento(retiarius, this);
    }

    @Override
    public int repelerAtaque(Thraex thraex, Animal animal) {
        return animal.atacarATravesDeEquipamiento(thraex, this);
    }
}
