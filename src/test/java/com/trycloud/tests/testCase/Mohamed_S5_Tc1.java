package com.trycloud.tests.testCase;

import com.trycloud.utilities.BrowserUtilities;
import com.trycloud.utilities.Driver;
import com.trycloud.utilities.TrycloudUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Mohamed_S5_Tc1 {
    @Test
    public void verify_user_can_access_to_Talks_module() {
        Driver.getDriver().get("http://qa2.trycloud.net");
        BrowserUtilities.sleep(1);
        TrycloudUtil.login();
        WebElement contacts = Driver.getDriver().findElement(By.xpath("//li[6]"));
        BrowserUtilities.sleep(1);
        contacts.click();
        String title = Driver.getDriver().getTitle();
        System.out.println(title);
        Assert.assertEquals(title, "Contacts - Trycloud");
        BrowserUtilities.sleep(2);

        TrycloudUtil.tearDown();
    }
}
