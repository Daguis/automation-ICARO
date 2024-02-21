package com.drivera.clase8.pages;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void loginTest() {
        HomePage homePage = new HomePage(getDriver());
        LoginPage loginPage = new LoginPage(getDriver());
        MyAccountPage myAccountPage = new MyAccountPage(getDriver());

        // Paso 1: levantar la pagina
        getDriver().get("https://opencart.abstracta.us/");

        // Paso 2: click en My Account
        homePage.clickMyAccount();

        // Paso 3: click en Login del dropdown
        homePage.clickLoginDropdown();

        // Paso 4: hacer login (ingresar user, pass y click en boton login)
        // loginPage.setEmail("cursolunes@gmail.com");
        // loginPage.setPassword("cursolunes");
        // loginPage.clickLogin();
        loginPage.login("cursolunes@gmail.com", "cursolunes");

        // Paso 5: validaciones
        Assert.assertTrue(myAccountPage.titleIsDisplayed());
    }

    @Test
    public void validarLogin() {
        HomePage homepage = new HomePage(getDriver());
        LoginPage loginpage = new LoginPage(getDriver());

        // 1 - Levantar la pagina
        getDriver().get("https://opencart.abstracta.us");

        // 2 - Click en My Account y Login del dropdown
        homepage.clickMyAccount();

        // 3 - Click en Login del dropdown
        homepage.clickLoginDropdown();

        // 4 - hacer login (ingresar user, pass y click en boton login)
        // loginPage.setEmail("cursolunes@gmail.com");
        // loginPage.setPassword("cursolunes");
        // loginPage.clickLogin();
        loginpage.login("hola123@gmail.com", "456");

        // 5 - Validar que se muestre mensaje de Error
        Assert.assertTrue(loginpage.credentialsErrorDisplayed());

    }

}
