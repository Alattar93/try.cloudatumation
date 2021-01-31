package com.trycloud.tests.base;

import com.trycloud.utilities.BrowserUtilities;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public abstract class testBase {
    public WebDriver driver;
    public String url=ConfigurationReader.getProperty("webOrderUrl");
    public String userName=ConfigurationReader.getProperty("username");
    public String password=ConfigurationReader.getProperty("password");



    @BeforeClass
    public void setUpMethod(){
        driver = WebDriverFactory.getDriver(ConfigurationReader.getProperty("browser"));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(url);
        driver.manage().window().maximize();

    }
    @AfterClass
    public void tearDown(){
        BrowserUtilities.sleep(2);
       driver.close();
    }

}
