package com.trycloud.tests.testCase;

import com.trycloud.tests.base.TestBase;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import com.trycloud.utilities.TrycloudUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserStory_2 {

    @Test
    public void Verify_AccessTO_MainModules() {

        TrycloudUtil.login();

        WebElement files = Driver.getDriver().findElement(By.xpath("(//li)[2]"));
        Assert.assertTrue(files.isEnabled());

        WebElement photos = Driver.getDriver().findElement(By.xpath("(//li)[3]"));
        Assert.assertTrue(photos.isEnabled());

        WebElement activity = Driver.getDriver().findElement(By.xpath("(//li)[4]"));
        Assert.assertTrue(activity.isEnabled());

        WebElement talk = Driver.getDriver().findElement(By.xpath("(//li)[5]"));
        Assert.assertTrue(talk.isEnabled());

        WebElement contacts= Driver.getDriver().findElement(By.xpath("(//li)[6]"));
        Assert.assertTrue(contacts.isEnabled());

        WebElement cirdes= Driver.getDriver().findElement(By.xpath("(//li)[7]"));
        Assert.assertTrue(cirdes.isEnabled());


        WebElement calender= Driver.getDriver().findElement(By.xpath("(//li)[8]"));
        Assert.assertTrue(calender.isEnabled());

        WebElement deck= Driver.getDriver().findElement(By.xpath("(//li)[9]"));
        Assert.assertTrue(deck.isEnabled());



         TrycloudUtil.tearDown();
    }


}
