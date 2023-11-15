package org.example;

public class Gladiador {

    private Equipamiento equipo;
    private int salud = 20;

    public void recibirAtaque(FieraSalvaje fieraSalvaje) {
        this.defenderse(fieraSalvaje);
    }

    private void defenderse(FieraSalvaje fieraSalvaje) {
        int danioRecibido = equipo.repelerAtaqueDeFiera(fieraSalvaje);
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
