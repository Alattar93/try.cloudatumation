package com.trycloud.tests.testCase;

import com.trycloud.tests.base.testBase;
import com.trycloud.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class JuliaLUserStory3 extends testBase {
  WebDriver driver;
  @Test
    public void Test(){
    //1. Open browser
    driver = WebDriverFactory.getDriver("chrome");

    //2. Go to website:
    driver.get("http://qa.trycloud.net/index.php/login?clear=1");
    //  driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    driver.findElement(By.xpath("//input[@type='text']")).sendKeys(userName);
    driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
    driver.findElement(By.xpath("//input[@type='submit']")).click();

    String actualTitle=driver.getTitle();
    String expectedTitle="Files - Trycloud - QA";
    Assert.assertEquals(actualTitle,expectedTitle);
  }

  }

