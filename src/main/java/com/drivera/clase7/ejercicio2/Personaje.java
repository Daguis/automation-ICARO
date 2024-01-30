package com.drivera.clase7.ejercicio2;

//Ejercicio 2
//        Se necesita modelar los personajes de un juego y para ello se dispone de la siguiente información:
//        ● Personaje: tiene el atributo salud (tipo entero) y un método abstracto entrenar()
//        ● Espadachín: este personaje extiende de Personaje y además tiene el atributo ataque (tipo entero). Cuando el espadachín entrena, incrementa su ataque en 10.
//        ● Torre: extiende de Personaje y tiene el atributo nivel (tipo entero). Cuando entrena, aumenta su nivel en 1
//        ● Mago: extiende de Personaje y tiene el atributo magia (tipo String). Los magos son vagos, no les gusta entrenar. Por lo tanto cuando entrenan, no sucede nada.
//        Todas las clases deberán contar con sus constructores correspondientes y los métodos getters & setters
//        Nota: no es necesario crear ninguna clase que contenga main para instanciar estas clases.

abstract class Personaje {

    private Integer salud;

    public Personaje(Integer salud) {
        this.salud = salud;
    }

    public Integer getSalud() {
        return salud;
    }

    public void setSalud(Integer salud) {
        this.salud = salud;
    }

    abstract public void entrenar();

}




