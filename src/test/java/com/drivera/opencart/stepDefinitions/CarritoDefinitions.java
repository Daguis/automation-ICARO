package com.drivera.opencart.stepDefinitions;

import com.drivera.opencart.hooks.Hooks;
import com.drivera.opencart.pages.CarritoPage;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import org.testng.Assert;

public class CarritoDefinitions {

    private CarritoPage carritoPage;

    public CarritoDefinitions() {
        this.carritoPage = new CarritoPage(Hooks.getDriver());
    }


    @Cuando("el usuario agrega un producto al carrito")
    public void elUsuarioAgregaUnProductoAlCarrito() {
        carritoPage.ingresarASeccionTablets();
        carritoPage.agregarUnProductoAlCarrito();
        carritoPage.ingresarAlCarrito();
    }


    @Entonces("se valida que se agrego un producto al carrito correctamente")
    public void seValidaQueSeAgregoUnProductoAlCarritoCorrectamente() {
        Assert.assertTrue(carritoPage.tabletInCarritoIsDisplayed());

    }
}
