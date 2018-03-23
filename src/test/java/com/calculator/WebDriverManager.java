package com.calculator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverManager {

    private static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            System.setProperty("webdriver.chrome.driver", "C:/Users/d.smyrnov/Desktop/Calculator/chromedriver.exe");
            driver = new ChromeDriver();
        }
        return driver;
    }
}

