package com.cydeo.utilities;

/*
In this class only general utility methods that are not related t0 some specific page.
 */

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.Set;

public class BrowserUtils {

    // This method accept int (int seconds) and execute Thread.sleep
    //for given duration
    public static void sleep(int second){

        try{
            Thread.sleep(second*1000);
        }
        catch (InterruptedException e){

        }


    }

    public static void switchWindowAndVerify(WebDriver driver, String expectedInUrl, String expectedInTitle){


        Set<String> allWindows = driver.getWindowHandles();

        for (String each : allWindows){
            driver.switchTo().window(each);
            System.out.println("Current URL: " + driver.getCurrentUrl());
            if (driver.getCurrentUrl().contains(expectedInUrl)){
                break;
            }
        }


        //5. Assert: Title contains “Etsy”
        String actualTitle = driver.getTitle();

        Assert.assertTrue(actualTitle.contains(expectedInTitle));



    }

}
