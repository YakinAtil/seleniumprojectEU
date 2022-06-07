package com.cydeo.tests.day12_pom_design_explicit_wait;

import com.cydeo.pages.DynamicLoad7Page;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DynamicLoad7PagePractice {
    //1. Go to https://practice.cydeo.com/dynamic_loading/7
    DynamicLoad7Page dynamicLoad7Page;

    @BeforeMethod
    public void setUpMethod() {
        Driver.getDriver().get("https://practice.cydeo.com/dynamic_loading/7");


    }
@Test
    public void dynamic_load_test(){
    //2. Wait until title is “Dynamic title”
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);

wait.until(ExpectedConditions.titleIs("Dynamic title"));
    dynamicLoad7Page = new DynamicLoad7Page();

        //3. Assert: Message “Done” is displayed.

        Assert.assertTrue(dynamicLoad7Page.doneText.isDisplayed());




        Assert.assertTrue(dynamicLoad7Page.image.isDisplayed());
        Driver.closeDriver();
    }
    //4. Assert: Image is displayed.

}
