package com.TryCloud_Group1.step_definitions;

import com.TryCloud_Group1.pages.LoginPage;
import com.TryCloud_Group1.utilities.ConfigurationReader;
import io.cucumber.java.en.When;

public class LoginAnyUserStepDefs_BD {

    LoginPage loginPage = new LoginPage();

    @When("user enters the username {string} and password {string}")
    public void user_enters_the_username_and_password(String username, String password) {
        loginPage.login(ConfigurationReader.getProperty(username), ConfigurationReader.getProperty(password));
    }


}
