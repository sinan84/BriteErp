package com.BriteErp.step_definitions;

import com.BriteErp.utilities.BrowserUtils;
import com.BriteErp.utilities.ConfigurationReader;
import com.BriteErp.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.util.concurrent.TimeUnit;

public class Hooks {

    @Before
    public void setUp(){
        Driver.get().manage().window().maximize();
        Driver.get().get(ConfigurationReader.get("url"));
        Driver.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @After
    public void tearDown(Scenario scenario){
        if (scenario.isFailed()){

            final byte[] screenshot = ((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png","screenshot");

        }
        BrowserUtils.waitFor(2);
        Driver.closeDriver();
    }

    @Before("@db")
    public void setupDb(){
        System.out.println("\tconnecting to Database...");

    }

    @After("@db")
    public void closeDb(){
        System.out.println("\tdisconnecting from Database...");

    }
}