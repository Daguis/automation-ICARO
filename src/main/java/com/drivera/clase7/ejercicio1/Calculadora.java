package com.drivera.clase7.ejercicio1;


//una clase que tenga el método especial main para poder ejecutar lo que se pide en los requerimientos,

public class Calculadora {

    private Integer resultado;

    public void sumar(Integer numero1, Integer numero2) {
        resultado = numero1 + numero2;
    }

    public void restar(Integer numero1, Integer numero2) {
        resultado = numero1 - numero2;
    }

    public void multiplicar(Integer numero1, Integer numero2) {
        resultado = numero1 * numero2;
    }

    public void dividir(Integer numero1, Integer numero2) {
        resultado = numero1 / numero2;
    }

    public Integer getResultado() {
        return resultado;
    }

    public void setResultado(Integer resultado) {
        this.resultado = resultado;
    }
}
