package com.BriteErp.pages;

import com.BriteErp.utilities.BrowserUtils;
import com.BriteErp.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public BasePage(){ PageFactory.initElements(Driver.get(), this); }

    public WebElement getLinkFromLinkText(String linktext){
        return Driver.get().findElement(By.linkText(linktext));
    }

    public void navigateToModule(String module){
        BrowserUtils.doubleClick(getLinkFromLinkText(module));
    }

}
