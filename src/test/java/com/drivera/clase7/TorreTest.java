package com.drivera.clase7;

import com.drivera.clase7.ejercicio2.Espadachin;
import com.drivera.clase7.ejercicio2.Torre;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TorreTest {

    private Torre torre;

    @BeforeMethod
    public void setup() {
        torre = new Torre(2000, 99);
    }

    @Test
    public void nivelDespuesDeEntrenar() {
        torre.entrenar();
        Assert.assertEquals(torre.getNivel(), 100, "El nivel luego de entrenar no es correcto");

    }

    @Test
    public void nivelDespuesDeDefender() {
        torre.defender();
        Assert.assertEquals(torre.getNivel(), 102, "El nivel luego de entrenar no es correcto");

    }
}
