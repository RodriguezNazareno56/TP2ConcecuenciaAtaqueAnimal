package org.example.Gladiadores;

import org.example.ConcecuenciaDeCasilleros.Fieras.Animal;
import org.example.Equipamiento.Equipamiento;

public abstract class Gladiador {

    protected Equipamiento equipamiento;
    protected int salud = 20;

    public void recibirAtaque(Animal animal) {
        this.defenderse(animal);
    }

    protected abstract void defenderse(Animal animal);

    // A finalidad del ejemplo, esto no iria asi
    public void setEquipamiento(Equipamiento equipamiento) {
        this.equipamiento = equipamiento;
    }

    // A finalidad del ejemplo, esto no iria asi
    public int getSalud() {
        return salud;
    }
}
