package com.drivera.clase7;

import com.drivera.clase7.ejercicio2.Espadachin;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class EspadachinTest {
    private Espadachin espadachin;

    @BeforeMethod
    public void setup() {
        espadachin = new Espadachin(100, 30);
    }

    @Test
    public void ataqueDespuesDeEntrenar() {
        espadachin.entrenar();
        Assert.assertEquals(espadachin.getAtaque(), 40, "El ataque luego de entrenar no es correcto");
    }

    @Test
    public void ataqueDespuesDePelear(){
        espadachin.pelear();
        Assert.assertEquals(espadachin.getAtaque(),20,"El ataque luego de pelear no es correcto");
    }

}
