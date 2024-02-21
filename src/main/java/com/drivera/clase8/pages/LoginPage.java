package com.drivera.clase8.pages;

import java.time.Duration;

import javax.crypto.spec.DESKeySpec;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

    By inputEmailBy = By.id("input-email");
    By inputPasswordBy = By.id("input-password");
    By inputLoginButtonBy = By.xpath("//input[@value=\"Login\"]");
    By errorBy = By.xpath("//div[contains(text(),\"No match for E-Mail Address and/or Password\")]");

    private WebDriver driver;
    private WebDriverWait wait;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void setEmail(String email) {
        WebElement inputEmailEl = wait.until(ExpectedConditions.presenceOfElementLocated(inputEmailBy));
        inputEmailEl.sendKeys(email);
    }

    public void setPassword(String password) {
        WebElement inputPasswordEl = wait.until(ExpectedConditions.presenceOfElementLocated(inputPasswordBy));
        inputPasswordEl.sendKeys(password);
    }

    public void clickLogin() {
        WebElement inputLoginButtonEl = wait.until(ExpectedConditions.elementToBeClickable(inputLoginButtonBy));
        inputLoginButtonEl.click();
    }

    public boolean credentialsErrorDisplayed() {
        WebElement errorEl = wait.until(ExpectedConditions.visibilityOfElementLocated(errorBy));
        return errorEl.isDisplayed();
    }

    public void login(String email, String password) {
        setEmail(email);
        setPassword(password);
        clickLogin();
    }
}
