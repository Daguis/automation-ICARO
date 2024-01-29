package com.drivera.examen.ejercicio2;

public class Espadachin extends Personaje {
    private Integer ataque;

    public Espadachin(Integer salud, Integer ataque) {
        super(salud);
        this.ataque = ataque;
    }

    public Integer getAtaque() {
        return ataque;
    }

    public void setAtaque(Integer ataque) {
        this.ataque = ataque;
    }

    @Override
    public void entrenar() {
        setAtaque(ataque + 10);
    }
}

