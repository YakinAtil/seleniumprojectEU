package com.cydeo.tests.day06_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T04_Iframe {

    WebDriver driver ;

    @BeforeMethod

    public void setup(){driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/iframe");

    }
    @Test

    public  void iframe_test(){
        //TC #4: Iframe practice
        //1. Create a new class called: T4_Iframes
        //2. Create new test and make set ups
        //3. Go to: https://practice.cydeo.com/iframe
        //4. Assert: “Your content goes here.” Text is displayed.
        WebElement iframe = driver.findElement(By.xpath("//iframe[@id=\"mce_0_ifr\"]"));
        driver.switchTo().frame(iframe);
        Assert.assertTrue(driver.findElement(By.xpath("//body[@id=\"tinymce\"]/p")).isDisplayed());

    //5. Assert: “An iFrame containing the TinyMCE WYSIWYG Editor”
        driver.switchTo().parentFrame();
        Assert.assertEquals (driver.findElement(By.tagName("h3")).getText(),
                "An iFrame containing the TinyMCE WYSIWYG Editor");
    }
    @AfterMethod
    public void endMethod() {
        driver.close();
    }
}
