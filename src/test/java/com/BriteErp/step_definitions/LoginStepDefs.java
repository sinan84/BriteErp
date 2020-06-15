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


}
