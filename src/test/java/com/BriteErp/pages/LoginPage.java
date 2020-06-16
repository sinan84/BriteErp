package com.BriteErp.pages;

import com.BriteErp.utilities.ConfigurationReader;
import com.BriteErp.utilities.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){ PageFactory.initElements(Driver.get(), this); }


    @FindBy(id="login")
    public WebElement userName;

    @FindBy(id="password")
    public WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submit;

    @FindBy(tagName = "p")
    public WebElement WrongLogin_passwordMessage;


    public void login(String userNameStr, String passwordStr) {
        userName.sendKeys(userNameStr);
        password.sendKeys(passwordStr, Keys.ENTER);
    }

    public void login() {
        userName.sendKeys(ConfigurationReader.get("username"));
        password.sendKeys(ConfigurationReader.get("password"));
        submit.click();
    }

    public void login_as (String userType) {
        userName.sendKeys(ConfigurationReader.get(userType+"_username"));
        password.sendKeys(ConfigurationReader.get(userType+"_password"));
        submit.click();
    }




}
