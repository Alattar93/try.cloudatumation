package com.trycloud.tests.testCase;

import com.trycloud.tests.base.TestBase;
import com.trycloud.utilities.BrowserUtilities;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import com.trycloud.utilities.TrycloudUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class UserStory3_TC5 extends TestBase {


    @Test
    public void Test_CheckBoxVerification(){
     //   1.Login as a user
       TrycloudUtil.login();

      //  2.Click the “+” icon on top
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        Driver.getDriver().findElement(By.xpath("//li[@data-id='files']//a")).click();
        BrowserUtilities.sleep(2);
      //  3.Click “upload file”
        Driver.getDriver().findElement(By.xpath("//a[@class='button new']")).click();
        BrowserUtilities.sleep(2);
      WebElement chooseFile=  Driver.getDriver().findElement(By.xpath("//span[@class='displayname']"));
        //4.Upload a file


        chooseFile.click();
        String path= "/Users/jp/Desktop/A1.png";
        BrowserUtilities.sleep(2);
        chooseFile.sendKeys(path);
        //5.Verify the file is displayed on the pag

    }

}
/*
Test case #5 -
verify users can upload a file directly to the homepage (File-Uploading)
1.Login as a user
2.Click the “+” icon on top
3.Click “upload file”
4.Upload a file
5.Verify the file is displayed on the pag
 */