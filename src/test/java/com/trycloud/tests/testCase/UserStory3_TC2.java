package com.trycloud.tests.testCase;

import com.trycloud.tests.base.TestBase;
import com.trycloud.utilities.TrycloudUtil;
import org.testng.annotations.Test;

public class UserStory3_TC2 extends TestBase {


    @Test
    public void Test_CheckBoxVerification(){
       // Test case #2 - verify users can select all the uploaded files from the page
      //  1.Login as a user
        TrycloudUtil.login();
        // 2.Click the top left checkbox of the table

        // 3.Assert all the files are selected

    }

}
