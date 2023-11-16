package org.example;

import org.example.ConcecuenciaDeCasilleros.Fieras.Animal;
import org.example.Equipamiento.Equipamiento;

public class Gladiador {

    private Equipamiento equipamiento;
    private int salud = 20;

    public void recibirAtaque(Animal animal) {
        this.defenderse(animal);
    }

    private void defenderse(Animal animal) {
        int danioRecibido = animal.atacarATravesDelEquipamiento(equipamiento);
        salud = salud - danioRecibido;
    }

    public void incrementarEquipamiento() {
        equipamiento = equipamiento.incrementar();
    }

    // A finalidad del ejemplo, esto no iria asi
    public void setEquipamiento(Equipamiento equipamiento) {
        this.equipamiento = equipamiento;
    }

    // A finalidad del ejemplo, esto no iria asi
    public int getSalud() {
        return salud;
    }
}
