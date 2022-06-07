package com.cydeo.tests.day11_upload_actions_jsexecutor_practice;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class T04_Scroll_Practice {
   @Test
    public void scroll_practice() {
       //TC #4: Scroll practice
       //1- Open a chrome browser
       //2- Go to: https://practice.cydeo.com/
       Driver.getDriver().get("https://practice.cydeo.com/");
       //3- Scroll down to “Powered by CYDEO”
       Actions actions = new Actions(Driver.getDriver());
       WebElement element = Driver.getDriver().findElement(By.xpath("//*[@id=\"page-footer\"]/div/div"));
       //4- Scroll using Actions class “moveTo(element)” method
       actions.moveToElement(element).perform();

       //TC #5: Scroll practice 2
       //1- Continue from where the Task 4 is left in the same test.
       //2- Scroll back up to “Home” link using PageUP button
       actions.sendKeys(Keys.PAGE_UP);

Driver.close();   }
   @Test
   public void test() { Driver.getDriver().get("https://practice.cydeo.com/");}

}

