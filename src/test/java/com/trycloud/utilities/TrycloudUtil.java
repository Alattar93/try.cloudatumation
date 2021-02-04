package com.trycloud.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class TrycloudUtil {

    public static void login(WebDriver driver) {


        WebElement inputUsername = driver.findElement(By.name("user"));
        String username = ConfigurationReader.getProperty("username");
        inputUsername.sendKeys(username);

        WebElement inputPassword = driver.findElement(By.name("password"));
        String password = ConfigurationReader.getProperty("password");
        inputPassword.sendKeys(password);


        WebElement loginButton = driver.findElement(By.id("submit-form"));
        loginButton.click();


    }

}
