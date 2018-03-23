package com.calculator.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.calculator.WebDriverManager;

public abstract class AbstractPage {

    private static final Long TIMEOUT = 30L;

    public AbstractPage() {
    }

    protected void waitForElementPresent(By locator) {
        (new WebDriverWait(WebDriverManager.getDriver(), TIMEOUT.longValue())).until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    protected WebElement getElement(By locator) {
        this.waitForElementPresent(locator);
        return WebDriverManager.getDriver().findElement(locator);
    }


}
