package com.trycloud.tests.testCase;

import com.github.javafaker.Faker;
import com.trycloud.tests.base.TestBase;
import com.trycloud.utilities.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserStory1_TC2_Login_invalidPassword extends TestBase {


    @Test
    public void Verify_user_CanNotLogin_InvalidPassword() {

        String url = ConfigurationReader.getProperty("webOrderUrl");

        driver.get(url);

        WebElement inputUsername = driver.findElement(By.name("user"));
        String username = ConfigurationReader.getProperty("username");
        inputUsername.sendKeys(username);


        WebElement inputPassword = driver.findElement(By.name("password"));
        Faker faker = new Faker();
        String password = faker.internet().password(8,12);
        inputPassword.sendKeys(password);


        WebElement loginButton = driver.findElement(By.id("submit-form"));
        loginButton.click();


        String expectedUrl = "http://qa.trycloud.net/index.php/apps/files/";
        String actualUrl = driver.getCurrentUrl();


        Assert.assertNotEquals(actualUrl,expectedUrl, "Test FAIL!!! It is login to homepage");




    }


}