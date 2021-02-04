package com.trycloud.tests.testCase;

import com.trycloud.tests.base.TestBase;
import com.trycloud.utilities.TrycloudUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class UserStory2_TC1_AccessTO_MainModules extends TestBase {

@Test
    public void Verify_AccessTO_MainModules () {
    TrycloudUtil.login(driver);

    WebElement files = driver.findElement(By.xpath("//a[@href='/index.php/apps/files/']"));

  

          //  http://qa.trycloud.net/index.php/apps/files/?dir=/&fileid=9077
}



}
