package com.BriteErp.step_definitions;

import com.BriteErp.pages.LoginPage;
import com.BriteErp.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

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

    @Then("the user must see Login and, or password are wrong. message")
    public void the_user_must_see_Login_and_or_password_are_wrong_message() {

    }


}
