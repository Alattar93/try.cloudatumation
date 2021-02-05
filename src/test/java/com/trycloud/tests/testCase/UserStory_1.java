package com.trycloud.tests.testCase;

import com.github.javafaker.Faker;
import com.trycloud.tests.base.TestBase;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserStory_1 extends TestBase {


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


        String expectedUrl = "http://qa2.trycloud.net/index.php/apps/dashboard/";
        String actualUrl = driver.getCurrentUrl();


        Assert.assertEquals(actualUrl,expectedUrl, "Test FAIL!!! login is not successful");

    }


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

        String actualText=driver.findElement(By.xpath("//p[@class='warning wrongPasswordMsg']")).getText();
        String expectedText="Wrong username or password.";
        Assert.assertEquals(actualText,expectedText);

    }


}
