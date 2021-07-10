package com.demoqaautomation.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class JavaScript {

    public static void executeScript(WebDriver driver, By by, String script) {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript(script, driver.findElement(by));
    }
}