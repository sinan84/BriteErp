package com.BriteErp.step_definitions;

import com.BriteErp.pages.LoginPage;
import com.BriteErp.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefs {

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {

    }

    @When("the user enter valid user information")
    public void the_user_enter_valid_user_information() {
        new LoginPage().login_as("Manufacturing_manager");
    }

    @Then("the user should be able to login")
    public void the_user_should_be_able_to_login() {
        System.out.println("Title() = " + Driver.get().getTitle());
        System.out.println("CurrentUrl() = " + Driver.get().getCurrentUrl());
    }


}
