package com.trycloud.tests.testCase;

import com.trycloud.tests.base.TestBase;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import com.trycloud.utilities.TrycloudUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserStory3_TC1 extends TestBase {


    @Test
    public void Test1(){
        WebElement inputUsername = driver.findElement(By.name("user"));
        String username = ConfigurationReader.getProperty("username");
        inputUsername.sendKeys(username);

        WebElement inputPassword = driver.findElement(By.name("password"));
        String password = ConfigurationReader.getProperty("password");
        inputPassword.sendKeys(password);


        WebElement loginButton = driver.findElement(By.id("submit-form"));
        loginButton.click();




        String actualTitle=driver.getTitle();
        String excpectedTitle="Dashboard - Trycloud";
        System.out.println(actualTitle);
        Assert.assertEquals(actualTitle,excpectedTitle);

    }
}
