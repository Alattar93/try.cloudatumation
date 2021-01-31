package com.trycloud.tests.testCase;

import com.trycloud.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;



    public class JuliaUStory3TC1 {

        WebDriver driver;

        @BeforeMethod
        public void setUpMethod(){
            //1. Open browser
            driver = WebDriverFactory.getDriver("chrome");

            //2. Go to website:
            driver.get("https://trycloud.net/");
            //  driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            driver.findElement(By.id("menu-item-47")).click();
            driver.findElement(By.xpath("//input[@type='text']")).sendKeys("User2");
            driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Userpass123");
            driver.findElement(By.xpath("//input[@type='submit']")).click();
        }

}
