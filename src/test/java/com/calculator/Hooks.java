package com.calculator;

import com.calculator.WebDriverManager;
import org.junit.After;
import org.junit.Before;

public class Hooks {

    @Before
    public void executedBeforeEach() {
        WebDriverManager.getDriver().manage().window().maximize();
    }

    @After
    public void executedAfterEach() {
        WebDriverManager.getDriver().quit();
    }
}
