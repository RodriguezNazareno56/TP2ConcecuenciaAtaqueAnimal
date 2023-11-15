package org.example;

import org.example.ConcecuenciaDeCasilleros.Fieras.Animal;
import org.example.Equipamiento.Equipamiento;

public class Gladiador {

    private Equipamiento equipo;
    private int salud = 20;

    public void recibirAtaque(Animal animal) {
        this.defenderse(animal);
    }

    private void defenderse(Animal animal) {
        int danioRecibido = equipo.repelerAtaque(animal);
        salud = salud - danioRecibido;
    }

    // A finalidad del ejemplo, esto no iria asi
    public void setEquipo(Equipamiento equipo) {
        this.equipo = equipo;
    }

    // A finalidad del ejemplo, esto no iria asi
    public int getSalud() {
        return salud;
    }
}
