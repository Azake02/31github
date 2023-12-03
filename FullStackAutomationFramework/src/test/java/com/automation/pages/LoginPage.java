package com.automation.pages;

import com.automation.utils.ConfigProperties;
import io.opentelemetry.sdk.autoconfigure.spi.ConfigProperties;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.locks.Condition;

public class LoginPage extends BasePage {

    @FindBy(id = "username")
    WebElement usernameElement;

    @FindBy(id = "password")
    WebElement passwordElement;

    @FindBy(id = "submit")
    WebElement submitBtn;

    public void openWebsite() {
        driver.get(ConfigProperties.getProperty("application.url"));
    }

    public void doLogin(String username, String password){

        usernameElement.sendKeys(username);
        passwordElement.sendKeys(password);
        submitBtn.click();
    }

    public void verifyLoginPage(){
        Assert.assertTrue(submitBtn.isDisplayed());
    }
}
