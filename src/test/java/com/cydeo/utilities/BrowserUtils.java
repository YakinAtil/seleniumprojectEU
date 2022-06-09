package com.cydeo.utilities;

/*
In this class only general utility methods that are not related t0 some specific page.
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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
    /*
    This method accepts 3 arguments
    1-driver
    2- if url contains given String
    3- Check if actual title equals expected title
     */

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
    /*
    This methods checked if expected equals actual title
     */
    public static  void verifyTitle (WebDriver driver, String expectedTitle){

        Assert.assertEquals(driver.getTitle(), expectedTitle);

    }
    /*
    Creating a utility method for ExplicitWait, so we don't have to repeat the lines
     */
    public static void waitForInvisibilityOf(WebElement webElement){
        //Driver.getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.invisibilityOf(webElement));
    }


}
