package com.automation.pages;

import com.automation.utils.DriverUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage extends DriverUtils{
    WebDriver driver;

    BasePage(){
        driver= DriverUtils.getDriver();
        PageFactory.initElements(driver, this);
    }
}
