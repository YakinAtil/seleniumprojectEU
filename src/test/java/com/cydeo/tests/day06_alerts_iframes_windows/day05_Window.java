package com.cydeo.tests.day06_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class day05_Window {
    WebDriver driver ;

    @BeforeMethod

    public void setup() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/windows");
    }
    @Test

    public void windowTest(){

        //TC #5: Window Handle practice
        //1. Create a new class called: T5_WindowsPractice
        //2. Create new test and make set ups
        //3. Go to : https://practice.cydeo.com/windows
        //4. Assert: Title is “Windows”
        String actualTitle = driver.getTitle();
        String expectedTitle = "Windows";
        System.out.println("title before click:" + actualTitle);

        Assert.assertEquals(actualTitle,expectedTitle);
      //  String mainHandle = driver.getWindowHandle();

        //5. Click to: “Click Here” link
     WebElement elementClick = driver.findElement(By.xpath("//a[@href=\"/windows/new\"]"));
     elementClick.click();



        //6. Switch to new Window.

        Set<String> allWindowsHandle = driver.getWindowHandles();

        for(String each : allWindowsHandle){

        driver.switchTo().window(each);
            System.out.println("Current title while switching windows "+driver.getTitle());}

        //7. Assert: Title is “New Window”
        System.out.println("title before click:" + driver.getTitle());

        Assert.assertEquals(driver.getTitle(),"New Window");







    }
    @AfterMethod

    public void teardown(){
        driver.quit();
    }




    }
