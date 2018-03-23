package com.calculator.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GooglePage  extends AbstractPage {
    private By searchField = By.xpath("//*[@id='lst-ib']");
    private By searchButton = By.xpath("//button[@type='submit']");

    public void enterSearchText(String text){
        getElement(searchField).sendKeys(text);
    }

    public void clickSearchButton(){
        getElement(searchButton).click();
    }


}
