package com.cydeo.tests.day12_pom_design_explicit_wait;

import com.cydeo.pages.DynamicLoad1Page;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DynamicLoad1PageTest {
      @Test



    public void test() {
          Driver.getDriver().get("https://practice.cydeo.com/dynamic_loading/1");

        //2. Click to start
        DynamicLoad1Page dynamicLoad1Page=new DynamicLoad1Page();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);

    dynamicLoad1Page.startButton.click();
        //3. Wait until loading bar disappears

        wait.until(ExpectedConditions.invisibilityOf(dynamicLoad1Page.loadingBar));
        //4. Assert username inputbox is displayed
        Assert.assertTrue(dynamicLoad1Page.username.isDisplayed());
        //5. Enter username: tomsmith
        dynamicLoad1Page.username.sendKeys("tomsmith");
        //6. Enter password: incorrectpassword
        dynamicLoad1Page.password.sendKeys("incorrectpassword ");
        //7. Click to Submit button
        dynamicLoad1Page.submitButton.click();
        //8. Assert “Your password is invalid!” text is displayed.
        Assert.assertTrue((dynamicLoad1Page.invalidPassword.isDisplayed()));

        Driver.closeDriver();

    }
}
