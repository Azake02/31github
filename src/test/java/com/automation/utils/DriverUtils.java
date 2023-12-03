package com.automation.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DriverUtils {
    static WebDriver driver = DriverUtils.getDriver();

    public static void createDriver() {
        driver = new ChromeDriver();
        driver.get(ConfigProperties.getProperty("application.url"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    public static WebDriver getDriver() {
        return driver;
       //fu mf githubfadsfas


    }
}
