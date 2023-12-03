package com.automation.steps;

import com.automation.pages.LoginPage;
import com.automation.utils.ConfigProperties;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginSteps {
    LoginPage loginPage = new LoginPage();
    @Given("user is on the website")
    public void user_is_on_the_website() {
        loginPage.verifyLoginPage();
    }

    @When("user enter the username {string} and password {string}")
    public void user_enter_the_username_and_password(String usernameKey, String passwordKey) {
        loginPage.doLogin(ConfigProperties.getProperty(usernameKey),ConfigProperties.getProperty(passwordKey));
    }


}
