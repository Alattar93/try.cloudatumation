package com.trycloud.tests.testCase;

import com.trycloud.tests.base.TestBase;
import com.trycloud.utilities.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserStory1_TC1_LoginSuccessfully extends TestBase {


    @Test
    public void Verify_user_login_successfully() {


        WebElement inputUsername = driver.findElement(By.name("user"));
        String username = ConfigurationReader.getProperty("username");
        inputUsername.sendKeys(username);

        WebElement inputPassword = driver.findElement(By.name("password"));
        String password = ConfigurationReader.getProperty("password");
        inputPassword.sendKeys(password);


        WebElement loginButton = driver.findElement(By.id("submit-form"));
        loginButton.click();


        String expectedUrl = "http://qa.trycloud.net/index.php/apps/files/";
        String actualUrl = driver.getCurrentUrl();


        Assert.assertEquals(actualUrl,expectedUrl, "Test FAIL!!! login is not successful");




    }


}
