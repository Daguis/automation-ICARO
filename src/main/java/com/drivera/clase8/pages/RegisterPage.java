package com.drivera.clase8.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterPage {

    /*
     * Formas de buscar locators en la web:
     * -General: //li[@class="dropdown"]
     * -Con elemento hijo a: //li/a[@title="My Account"] == /a[@title="My Account"]
     * -Con name: //input[@name="search"]
     * -Con id: //div[@id="content"]
     * -Con Texto: //a[text()="Login"]
     * -Con contains: //div[contains(text(),"No Match")]
     */

    By contentBy = By.id("content");
    By inputFirstNameBy = By.id("input-firstname");
    By inputLastNameBy = By.id("input-lastname");
    By inputEmailBy = By.id("input-email");
    By inputTelephoneBy = By.id("input-telephone");
    By inputPasswordBy = By.id("input-password");
    By inputPasswordConfirmBy = By.id("input-confirm");
    By inputNewsYesBy = By.xpath("//input[@name=\"newsletter\" and @value=\"1\"]");
    By inputNewsNoBy = By.xpath("//input[@name=\"newsletter\" and @value=\"0\"]");
    By inputAgreePolicyBy = By.xpath("//input[@name=\"agree\"]");
    By continueButtonBy = By.xpath("//input[@value=\"Continue\"]");
    By creacionExitosaBy = By.xpath("//p[text()=\"Congratulations! Your new account has been successfully created!\"]");

    private WebDriver driver;
    private WebDriverWait wait;

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void setFirstName(String firstName) {
        WebElement inputFirstNameEl = wait.until(ExpectedConditions.presenceOfElementLocated(inputFirstNameBy));
        inputFirstNameEl.sendKeys(firstName);
    }

    public void setLastName(String lastName) {
        WebElement inputLastNameEl = wait.until(ExpectedConditions.presenceOfElementLocated(inputLastNameBy));
        inputLastNameEl.sendKeys(lastName);
    }

    public void setEmail(String email) {
        WebElement inputEmailEl = wait.until(ExpectedConditions.presenceOfElementLocated(inputEmailBy));
        inputEmailEl.sendKeys(email);
    }

    public void setTelephone(String telephone) {
        WebElement inputTelephoneEl = wait.until(ExpectedConditions.presenceOfElementLocated(inputTelephoneBy));
        inputTelephoneEl.sendKeys(telephone);
    }

    public void setPassword(String password) {
        WebElement inputPasswordEl = wait.until(ExpectedConditions.presenceOfElementLocated(inputPasswordBy));
        inputPasswordEl.sendKeys(password);
    }

    public void setPasswordConfirm(String passwordConfirm) {
        WebElement inputPasswordConfirmEl = wait
                .until(ExpectedConditions.presenceOfElementLocated(inputPasswordConfirmBy));
        inputPasswordConfirmEl.sendKeys(passwordConfirm);
    }

    public void setNewsYes() {
        WebElement inputNewsYesEl = wait.until(ExpectedConditions.presenceOfElementLocated(inputNewsYesBy));
        inputNewsYesEl.click();
    }

    public void setNewsNo() {
        WebElement inputNewsNoEl = wait.until(ExpectedConditions.presenceOfElementLocated(inputNewsNoBy));
        inputNewsNoEl.click();
    }

    public void completarCrearCuentaConNews(String firstName, String lastName, String email, String telephone,
            String password,
            String passwordConfirm) {
        setFirstName(firstName);
        setLastName(lastName);
        setEmail(email);
        setTelephone(telephone);
        setPassword(passwordConfirm);
        setPasswordConfirm(passwordConfirm);
        setNewsYes();
    }

    public void completarCrearCuentaSinNews(String firstName, String lastName, String email, String telephone,
            String password,
            String passwordConfirm) {
        setFirstName(firstName);
        setLastName(lastName);
        setEmail(email);
        setTelephone(telephone);
        setPassword(passwordConfirm);
        setPasswordConfirm(passwordConfirm);
        setNewsNo();
    }

    public void aceptarPoliticasContinue() {
        WebElement inputAgreePolicyEl = wait.until(ExpectedConditions.presenceOfElementLocated(inputAgreePolicyBy));
        WebElement continueButtonEl = wait.until(ExpectedConditions.elementToBeClickable(continueButtonBy));
        inputAgreePolicyEl.click();
        continueButtonEl.click();
    }

    public boolean creacionExitosa() {
        WebElement creacionExitosaEl = wait.until(ExpectedConditions.presenceOfElementLocated(creacionExitosaBy));
        return creacionExitosaEl.isDisplayed();
    }

}
