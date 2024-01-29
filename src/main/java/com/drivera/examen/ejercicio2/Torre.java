package com.drivera.examen.ejercicio2;

public class Torre extends Personaje {

    private Integer nivel;

    public Torre(Integer salud, Integer nivel) {
        super(salud);
        this.nivel = nivel;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    public void entrenar() {
        setNivel(nivel + 1);
    }
}
