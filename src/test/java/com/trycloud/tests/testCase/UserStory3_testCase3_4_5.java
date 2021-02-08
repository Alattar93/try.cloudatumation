package com.trycloud.tests.testCase;
import com.trycloud.utilities.BrowserUtilities;
import com.trycloud.utilities.Driver;
import com.trycloud.utilities.TrycloudUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserStory3_testCase3_4_5 {

        //Click action-icon from any file on the page
        //choose 'add to favirotes'
        //click "favorites" option
        //verify the chosen file is listed on the table
        //preconditon:there should be one file uploaded


        @Test
        public void testCase3()  {
            TrycloudUtil.login();

            Driver.getDriver().findElement(By.xpath("//ul[@id='appmenu']//li[2]/a")).click();

            JavascriptExecutor js = new JavascriptExecutor() {
                @Override
                public Object executeScript(String s, Object... objects) {
                    return null;
                }

                @Override
                public Object executeAsyncScript(String s, Object... objects) {
                    return null;
                }
            };

            WebElement element = Driver.getDriver().findElement(By.xpath("//*[contains(text(),'schedule')]/../..//a[2]"));
            js.executeScript("arguments[0].scrollIntoView(true);", element);
            element.click();

            WebElement fileActionMenu=Driver.getDriver().findElement(By.xpath("//span[contains(text(),'Add to favorites')]"));
            BrowserUtilities.sleep(2);
            fileActionMenu.click();

            BrowserUtilities.sleep(1);
            WebElement activityIcon=Driver.getDriver().findElement(By.xpath("//ul[@id='appmenu']//li[4]/a"));
            activityIcon.click();

            WebElement actualTextLocater=Driver.getDriver().findElement(By.xpath("//*[@id='container']/div[1]/div[2]/div/div[2]"));
            String actualtext=actualTextLocater.getText();
            BrowserUtilities.sleep(2);

            String expectedText="You added schedule (3).pages to your favorites";
            Assert.assertTrue(actualtext.contains(expectedText));


            WebElement fileIcon=Driver.getDriver().findElement(By.xpath("//ul[@id='appmenu']//li[2]"));
            fileIcon.click(); //click file (top)

            BrowserUtilities.sleep(2);
            Driver.getDriver().findElement(By.xpath("//*[@id='fileList']/tr[1]/td[2]/a/span[2]/a[2]")).click();
//click action icon


            BrowserUtilities.sleep(2);

            Driver.getDriver().findElement(By.xpath("//*[@id='fileList']/tr[1]/td[2]/div/ul/li[3]/a")).click();
// click remove from favorites

            TrycloudUtil.tearDown();
            //comment
            //one comment
        }

    }




