package org.example.Equipamiento;

import org.example.ConcecuenciaDeCasilleros.Fieras.Animal;
import org.example.Gladiadores.Retiarius;
import org.example.Gladiadores.Thraex;

public interface Afectable {
    public abstract int repelerAtaque(Retiarius retiarius,Animal animal);
    public abstract int repelerAtaque(Thraex thraex, Animal animal);
}
