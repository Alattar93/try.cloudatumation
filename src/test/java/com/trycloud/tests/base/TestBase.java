package com.trycloud.tests.base;

import com.trycloud.utilities.BrowserUtilities;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import com.trycloud.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import java.util.concurrent.TimeUnit;

public abstract class TestBase {
    public WebDriver driver;





    @BeforeClass
    public void setUpMethod() {
        driver = WebDriverFactory.getDriver(ConfigurationReader.getProperty("browser"));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String url=ConfigurationReader.getProperty("webOrderUrl");
        driver.get(url);
        driver.manage().window().maximize();
    }




    @AfterClass
    public void tearDown(){
        BrowserUtilities.sleep(2);
       driver.close();
    }

}
