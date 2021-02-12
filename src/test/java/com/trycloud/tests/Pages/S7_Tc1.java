package com.trycloud.tests.Pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class S7_Tc1 {

    public S7_Tc1() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "user")
    public WebElement userName;

    @FindBy(id = "password")
    public WebElement passWord;

    @FindBy(id = "submit-form")
    public WebElement submit;


    @FindBy(className = "material-design-icon__svg")
    public WebElement magnifier;

    @FindBy(xpath = "//input[@type='search']")
    public WebElement searchBar;


    @FindBy(xpath = "//h3[@title='Files']")
    public WebElement expectedResult;
}
