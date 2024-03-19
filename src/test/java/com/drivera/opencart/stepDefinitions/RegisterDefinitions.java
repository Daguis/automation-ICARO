package com.drivera.opencart.stepDefinitions;

import com.drivera.opencart.hooks.Hooks;
import com.drivera.opencart.pages.AccountPage;
import com.drivera.opencart.pages.HomePage;
import com.drivera.opencart.pages.LoginPage;
import com.drivera.opencart.pages.RegisterPage;
import com.github.javafaker.Faker;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import org.openqa.selenium.devtools.v118.fedcm.model.Account;
import org.testng.Assert;

public class RegisterDefinitions {

    private HomePage homePage;
    private RegisterPage registerPage;
    private AccountPage accountPage;

    private Faker faker;


    public RegisterDefinitions() {

        this.homePage = new HomePage(Hooks.getDriver());
        this.registerPage = new RegisterPage(Hooks.getDriver());
        this.accountPage = new AccountPage(Hooks.getDriver());
        this.faker = new Faker();

    }
    @Y("el usuario ingresa a la pantalla de registro")
    public void elUsuarioIngresaALaPantallaDeRegistro() {
        homePage.clickMyAccount();
        homePage.clickRegisterDropdown();
    }

    @Cuando("el usuario completa el formulario de registro correctamente")
    public void elUsuarioCompletaElFormularioDeRegistroCorrectamente() {
        registerPage.completarFormulario(
                faker.name().firstName(),
                faker.name().lastName(),
                faker.internet().emailAddress(),
                faker.phoneNumber().phoneNumber(),
                faker.internet().password()
        );
    }

    @Y("el usuario acepta las politicas para continuar")
    public void elUsuarioAceptaLasPoliticasParaContinuar() {


    }

    @Entonces("se valida que el usuario creo correctamente su cuenta")
    public void seValidaQueElUsuarioCreoCorrectamenteSuCuenta() {
        Assert.assertTrue(accountPage.titleIsDisplayed());
        Assert.assertTrue(accountPage.descriptionIsDisplayed());

    }

    @Cuando("el usuario no completa el formulario de registro correctamente")
    public void elUsuarioNoCompletaElFormularioDeRegistroCorrectamente() {
        registerPage.completarFormulario(
                faker.name().firstName(),
                faker.name().lastName(),
                "",
                faker.phoneNumber().phoneNumber(),
                faker.internet().password()
        );
    }

    @Entonces("se valida que el usuario no pudo crear su cuenta")
    public void seValidaQueElUsuarioNoPudoCrearSuCuenta() {
        Assert.assertTrue(registerPage.alertaFormularioConError());
    }
}
