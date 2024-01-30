package com.drivera.clase7.ejercicio2;

public class Main {
    public static void main(String[] args) {

        Espadachin espadachin = new Espadachin(900,90);
        System.out.println("Espadachin -> Salud: " + espadachin.getSalud() + " Ataque: " + espadachin.getAtaque());

        espadachin.entrenar();
        System.out.println("Espadachin entrenado -> Salud " + espadachin.getSalud() + " Ataque: " + espadachin.getAtaque());

        Torre torre = new Torre(2000,1);
        System.out.println("Torre -> Salud: " + torre.getSalud() + " Nivel: " + torre.getNivel());

        torre.entrenar();
        System.out.println("Torre entrenada -> Salud: " + torre.getSalud() + " Nivel: " + torre.getNivel());

        Mago mago = new Mago(450,"Fuego");
        System.out.println("Mago -> Salud: " + mago.getSalud() + " Magia: " + mago.getMagia());

        mago.entrenar();
        System.out.println("Mago entrenado -> Salud: " + mago.getSalud() + " Magia: " + mago.getMagia());


    }
}
