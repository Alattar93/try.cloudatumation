package com.trycloud.tests.testCase.Mohamed;

import com.trycloud.tests.Pages.S7_Tc1;
import com.trycloud.utilities.BrowserUtilities;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;

public class Story7_TC1 {

    @Test
    public void search() {
        Driver.getDriver().get("http://qa2.trycloud.net/index.php/login?clear=1");

        S7_Tc1 s = new S7_Tc1();

        s.userName.sendKeys("User1");
        s.passWord.sendKeys("Userpass123");
        BrowserUtilities.sleep(1);
        s.submit.click();

        s.magnifier.click();
        BrowserUtilities.sleep(1);


        s.searchBar.sendKeys("schedule");
        BrowserUtilities.sleep(2);


        Assert.assertTrue(s.expectedResult.getAttribute("title").contains("schedule"));
        System.out.println(s.expectedResult.getAttribute("title"));




    }
}
