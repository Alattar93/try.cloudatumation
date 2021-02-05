package com.trycloud.tests.testCase;

import com.trycloud.tests.base.TestBase;
import com.trycloud.utilities.Driver;
import com.trycloud.utilities.TrycloudUtil;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserStory3_TC1 extends TestBase {


    @Test
    public void Test1(){
         TrycloudUtil.login(driver);
        //.Login as a user2.
        //Verify the page title is Files module’s tile
        String actualTitle=driver.getTitle();
        String excpectedTitle="Dashboard - Trycloud";
        System.out.println(actualTitle);
        Assert.assertEquals(actualTitle,excpectedTitle);

    }
}
