package com.BriteErp.step_definitions;

import com.BriteErp.pages.LoginPage;
import com.BriteErp.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;

public class LoginStepDefs {


    @When("the user enter valid user information")
    public void the_user_enter_valid_user_information() {
        new LoginPage().login_as("Manufacturing_manager");
    }

    @Then("the user should be able to login")
    public void the_user_should_be_able_to_login() {
        System.out.println("Title() = " + Driver.get().getTitle());
        System.out.println("CurrentUrl() = " + Driver.get().getCurrentUrl());
        Assert.assertEquals("Odoo",Driver.get().getTitle());
    }

    @When("the user login as {string}")
    public void the_user_login_as(String string) {
        new LoginPage().login_as(string);
    }

    @When("the user enter {string} and {string}")
    public void the_user_enter_and(String string, String string2) {
        new LoginPage().login(string,string2);
    }

    @Then("the user must see Wrong login\\/password. message {string}")
    public void the_user_must_see_Wrong_login_password_message(String string) {
        LoginPage loginPage=new LoginPage();
        if(string.contains("blank")){
            if(string.contains("username")){
                String expectedValidationMessage="Please fill in this field.";
                String actualValidationMessage = loginPage.userName.getAttribute("validationMessage");
                Assert.assertEquals("verify please fill in this field message is displayed",expectedValidationMessage,actualValidationMessage);
            }else{
                String expectedValidationMessage="Please fill in this field.";
                String actualValidationMessage = loginPage.password.getAttribute("validationMessage");
                Assert.assertEquals("verify please fill in this field message is displayed",expectedValidationMessage,actualValidationMessage);
            }
        }else{
            String actualText = loginPage.WrongLogin_passwordMessage.getText();
            String expectedText="Wrong login/password";
            Assert.assertEquals("verify Wrong login\\/password",expectedText,actualText);

        }

    }


}
