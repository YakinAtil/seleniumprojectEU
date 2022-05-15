package com.cydeo.tests.day04;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class RadioButton_XpathLocator {
    public static void main(String[] args) {

        //TC #6: XPATH LOCATOR practice
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15 , TimeUnit.SECONDS);
        //2. Go to http://practice.cydeo.com/multiple_buttons
        driver.get("http://practice.cydeo.com/multiple_buttons");
        //3. Click on Button 1
        driver.findElement(By.xpath("//button[@class=\"btn btn-primary\"]")).click();
        //4. Verify text displayed is as expected:
        //Expected: “Clicked on button one!”
        System.out.println("driver.findElement(By.xpath(\"//*[.='Clicked on button one!']\")).isDisplayed(), expected true = " + driver.findElement(By.xpath("//*[.='Clicked on button one!']")).isDisplayed());
        //USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS




    }
}
