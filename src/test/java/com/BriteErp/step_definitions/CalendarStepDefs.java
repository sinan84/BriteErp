package com.BriteErp.step_definitions;

import com.BriteErp.pages.DiscussPage;
import com.BriteErp.utilities.BrowserUtils;
import com.BriteErp.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class CalendarStepDefs {

    @Given("the user navigate the module {string}")
    public void the_user_navigate_the_module(String string) {
        new DiscussPage().navigateToModule(string);
    }

    @Then("the title should be {string}")
    public void the_title_should_be(String expectedTitle) {
        BrowserUtils.waitFor(3);
        String actualTitle=Driver.get().getTitle();
        System.out.println("Title() = " + Driver.get().getTitle());
        Assert.assertEquals(expectedTitle,actualTitle);
    }
}
