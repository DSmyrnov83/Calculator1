package com.calculator.steps;

import com.calculator.WebDriverManager;
import com.calculator.pages.CalculatorPage;
import com.calculator.pages.GooglePage;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebDriver;


public class CalculatorSteps {
    private WebDriver driver;
    private GooglePage googlePage;
    private CalculatorPage calculatorPage;

    public CalculatorSteps(GooglePage googlePage, CalculatorPage calculatorPage) {
        this.googlePage = googlePage;
        this.calculatorPage = calculatorPage;
    }

    /*@Before
    public void maximizeBrowser() {
        WebDriverManager.getDriver().manage().window().maximize();
    }


    @After
    public void closeBrowser() {
        WebDriverManager.getDriver().quit();
    }*/


    @Given("^user is navigated to '(.*)'$")
    public void navigateToGooglePage(String webAddress) {
        WebDriverManager.getDriver().get(webAddress);
    }

    @When("^(?:user |)enters '(.*)' into search field$")
    public void enterQueryIntoSearchField(String query) {
        googlePage.enterSearchText(query);
    }

    @When("^(?:user |)clicks on search button$")
    public void clickOnSearchButton() {
        googlePage.clickSearchButton();
    }

    @When("^(?:user |)enters '(.*)' into calculator field$")
    public void calcutation(String expression) {
        calculatorPage.enterExpression(expression);
    }

    @When("^(?:user |)clicks '(.*)' button$")
    public void clickCalculatorButton(String buttonText){
        calculatorPage.clickCalculatorButton(buttonText);
    }


    @Then("^result is (.*)$")
    public void verifyResult(String expectedResult) {
        String actualResult = calculatorPage.getResult();
        Assert.assertEquals(expectedResult, actualResult);
    }


}
