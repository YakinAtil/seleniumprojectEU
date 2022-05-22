package com.cydeo.tests.day06_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AlertPractice {
    public WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://practice.cydeo.com/javascript_alerts");
    }

    @Test

    public void testAlertPractice01()    {


        //TC #1: Information alert practice
        //1. Open browser
        //2. Go to website: http://practice.cydeo.com/javascript_alerts
        //3. Click to “Click for JS Alert” button
       driver.findElement(By.xpath("//button[@onclick=\"jsAlert()\"]")).click();
        //4. Click to OK button from the alert
        Alert alert = driver.switchTo().alert();
        alert.accept();

        //5. Verify “You successfully clicked an alert” text is displayed

        WebElement actualTextDriver = driver.findElement(By.xpath("//p[@id='result']"));
        String expectedTitleText = "You successfully clicked an alert";

       Assert.assertTrue(actualTextDriver.isDisplayed(),"You successfully clicked an alert");
        String actualText = driver.findElement(By.xpath("//p[@id='result']")).getText();
        Assert.assertEquals(actualText,expectedTitleText);
    }
    @AfterMethod
    public void endMethod() {
        driver.close();
    }

}
