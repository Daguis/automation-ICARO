package com.drivera.clase7.ejercicio2;

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
        ataque += 10;
    }

    public void pelear() {
        ataque -= 10;
    }
}

