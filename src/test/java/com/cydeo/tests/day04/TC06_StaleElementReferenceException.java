package com.cydeo.tests.day04;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class TC06_StaleElementReferenceException {
    public static void main(String[] args)  {


        //1- Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //2- Go to: https://practice.cydeo.com/abtest
        driver.get("https://practice.cydeo.com/abtest");
       //3- Locate “CYDEO” link, verify it is displayed.
        WebElement element = driver.findElement(By.xpath("//a[text()='CYDEO']"));
        System.out.println("element.isDisplayed() = " + element.isDisplayed());

        //4- Refresh the page.
        System.out.println("Refreshing the page");
        driver.navigate().refresh();
        //5- Verify it is displayed, again.
        element = driver.findElement(By.xpath("//a[text()='CYDEO']"));
                System.out.println("element.isDisplayed() after refresh, expecting true = " + element.isDisplayed());


    }
}