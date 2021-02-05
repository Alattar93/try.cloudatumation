package com.trycloud.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class TrycloudUtil {

    public static void login() {
        Driver.getDriver().get(ConfigurationReader.getProperty("webOrderUrl"));
        WebElement inputUsername = Driver.getDriver().findElement(By.name("user"));
        String username = ConfigurationReader.getProperty("username");
        inputUsername.sendKeys(username);

        WebElement inputPassword = Driver.getDriver().findElement(By.name("password"));
        String password = ConfigurationReader.getProperty("password");
        inputPassword.sendKeys(password);


        WebElement loginButton = Driver.getDriver().findElement(By.id("submit-form"));
        loginButton.click();


    }
    public static void tearDown (){
        BrowserUtilities.sleep(2);
        Driver.getDriver().close();
    }






}
