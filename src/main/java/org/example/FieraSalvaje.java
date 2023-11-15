package org.example;

public class FieraSalvaje implements Concecuencia{
    @Override
    public void afectarGladiador(Gladiador gladiador) {
        // Una fiera aspira a causar 20 de daño, la evasion (la defensa) depende del gladiador
        gladiador.recibirAtaque(this);
    }

    public void lograrDanioATravesDeEquipamiento(Armadura armadura) {
    }

    public void lograrDanioATravesDeEquipamiento(Casco armadura) {
    }
}
