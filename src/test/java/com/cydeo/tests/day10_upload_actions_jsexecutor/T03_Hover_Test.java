package com.cydeo.tests.day10_upload_actions_jsexecutor;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T03_Hover_Test {
    @Test
    public void hovering_test(){
        //TC #3: Hover Test
        //1. Go to https://practice.cydeo.com/hovers
        Driver.getDriver().get("https://practice.cydeo.com/hovers ");
        WebElement img1 = Driver.getDriver().findElement(By.xpath("(//img)[1]"));
        WebElement img2 = Driver.getDriver().findElement(By.xpath("(//img)[2]"));
        WebElement img3 = Driver.getDriver().findElement(By.xpath("(//img)[3]"));


        WebElement user1 = Driver.getDriver().findElement(By.xpath("//h5[.=\"name: user1\"]"));
        WebElement user2 = Driver.getDriver().findElement(By.xpath("//h5[.=\"name: user2\"]"));
        WebElement user3 = Driver.getDriver().findElement(By.xpath("//h5[.=\"name: user3\"]"));


        WebElement profile1=Driver.getDriver().findElement(By.xpath("(//*[text()=\"View profile\"])[1]"));
        WebElement profile2=Driver.getDriver().findElement(By.xpath("(//*[text()=\"View profile\"])[2]"));
        WebElement profile3=Driver.getDriver().findElement(By.xpath("(//*[text()=\"View profile\"])[3]"));

        Actions actions = new Actions(Driver.getDriver()) ;

        //2. Hover over to first image
        BrowserUtils.sleep(2);
        actions.moveToElement(img1).perform();
        //a. “name: user1” is displayed
        Assert.assertTrue(user1.isDisplayed());
        Assert.assertTrue(profile1.isDisplayed());
        //3. Assert:

        //b. “view profile” is displayed
        //4. Hover over to second image
        //3. Assert:
        //3. Assert:
        BrowserUtils.sleep(2);
        actions.moveToElement(img2).perform();
        Assert.assertTrue(user2.isDisplayed());
        Assert.assertTrue(profile2.isDisplayed());

        //5. Assert:
        //a. “name: user2” is displayed
        //b. “view profile” is displayed
        //6. Hover over to third image
        BrowserUtils.sleep(2);
        actions.moveToElement(img3).perform();
        Assert.assertTrue(user3.isDisplayed());
        Assert.assertTrue(profile3.isDisplayed());


        //7. Confirm:

        //a. “name: user3” is displayed
        //b. “view profile” is displayed
    }

}
