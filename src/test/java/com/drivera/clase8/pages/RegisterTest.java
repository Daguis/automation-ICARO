package com.drivera.clase8.pages;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterTest extends BaseTest {

    @Test
    public void CrearCuentaExitosaConNewsTest() {
        HomePage homePage = new HomePage(getDriver());
        RegisterPage registerPage = new RegisterPage(getDriver());

        // 1- Levantar la Pagina
        getDriver().get("https://opencart.abstracta.us/");

        // 2- Click en My account
        homePage.clickMyAccount();

        // 3- Click en Register
        homePage.clickRegister();

        // 4- Completar formulario de registro
        registerPage.completarCrearCuentaConNews("Diego", "Rivera", "email99912301@gmail.com", "351123321",
                "contrasena",
                "contrasena");

        // 5- Aceptar politicas y continuar
        registerPage.aceptarPoliticasContinue();

        // 6- Validar creacion de cuenta
        Assert.assertTrue(registerPage.creacionExitosa());
    }

}