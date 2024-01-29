package com.drivera.clase5.practica5;

import com.drivera.clase5.practica4.Persona;

public class NoDocente extends Persona {

    public NoDocente(String nombre, String apellido) {
        super(nombre, apellido);
    }

    @Override
    public void saludar() {
        System.out.println("Buen día");
    }
}
