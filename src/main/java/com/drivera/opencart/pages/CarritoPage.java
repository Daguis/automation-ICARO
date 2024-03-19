package com.drivera.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CarritoPage extends BasePage{

    private By carritoButon = By.xpath("//a[@title=\"Shopping Cart\"]");

    private By tabletsButton = By.xpath("//a[text()=\"Tablets\"]");

    private By samsungGalaxyTab = By.xpath("//table[@class=\"table table-bordered\"]/tbody/tr/td/a[contains(text(),\"Samsung Galaxy Tab 10.1\")]");

    private By addToCartIcon = By.xpath("//span[contains(text(),\"Add to Cart\")]");
    //            By.xpath("//div[./div/h4/a[text()=\"Canon EOS 5D\"]]/div/button[@data-original-title=\"Add to Wish List\"]");


    public CarritoPage(WebDriver driver) {
        super(driver);
    }

    public void ingresarASeccionTablets() {
        click(tabletsButton);
    }

    public void agregarUnProductoAlCarrito() {
        click(addToCartIcon);
    }

    public void ingresarAlCarrito() {
        click(carritoButon);
    }

    public boolean tabletInCarritoIsDisplayed() {
        return isDisplayed(samsungGalaxyTab);
    }
}


