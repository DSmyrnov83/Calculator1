package com.calculator.pages;

import org.openqa.selenium.By;

public class CalculatorPage  extends AbstractPage {
    private By expression = By.xpath("//*[@id=/cwtltblr']/div[2]");
    private By result = By.xpath("//*[@id='cwos']");
    private static final String CALCULATOR_BUTTON_TEMPLATE = "//*[@id='cwbt45' and text()='%s']/div/span";


    public void enterExpression(String text){
        getElement(expression).sendKeys(text);
    }

    public void clickCalculatorButton(String buttonText){
        String locator = String.format(CALCULATOR_BUTTON_TEMPLATE, buttonText);
        getElement(By.xpath(locator)).click();
    }


    public String getResult() {
        return getElement(result).getText();
    }
}
