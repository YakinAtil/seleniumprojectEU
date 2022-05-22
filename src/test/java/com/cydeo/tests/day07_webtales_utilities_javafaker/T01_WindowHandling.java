package com.cydeo.tests.day07_webtales_utilities_javafaker;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class T01_WindowHandling {

    WebDriver driver ;

    @BeforeMethod

    public void setup() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.amazon.com");
    }
    @Test

    public void windowHandling02(){

        //TC #1: Window Handle practice
        //1. Create new test and make set ups
        //2. Go to : https://www.amazon.com
        //3. Copy paste the lines from below into your class
        //Lines to be pasted:
        ((JavascriptExecutor) driver).executeScript("window.open('http://google.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('http://etsy.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('http://facebook.com','_blank');");
        //These lines will simply open new tabs using something called JavascriptExecutor
        //and get those pages. We will learn JavascriptExecutor later as well.
        //4. Create a logic to switch to the tab where Etsy.com is open


        Set<String> allWindows = driver.getWindowHandles();

        for (String each : allWindows){
            driver.switchTo().window(each);
            if (driver.getCurrentUrl().contains("etsy.com")){
                break;
            }
        }


        //5. Assert: Title contains “Etsy”
        System.out.println("Title is "+driver.getTitle());

        Assert.assertTrue(driver.getTitle().contains("Etsy"));



    }
    @AfterMethod

    public void teardown(){
        driver.quit();
    }
}
