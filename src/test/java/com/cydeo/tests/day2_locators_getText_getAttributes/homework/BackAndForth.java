package com.cydeo.tests.day2_locators_getText_getAttributes.homework;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BackAndForth {
    public static void main(String[] args) throws InterruptedException {
        //TC #3: Back and forth navigation
        //1- Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        //2- Go to: https://google.com
        driver.get("https://google.com");
        driver.manage().window().maximize();
        //3- Click to Gmail from top right.
        driver.findElement(By.xpath("//*[@id=\"gb\"]/div/div[1]/div/div[1]/a")).click();
        //4- Verify title contains:
        //Expected: Gmail
        String actualTitle1 = driver.getTitle();
        String expectedTitle1 = "Gmail";
        if(actualTitle1.equalsIgnoreCase(expectedTitle1)){
            System.out.println("Gmail head title verification has passed!");
        } else {
            System.out.println("Gmail head title verification has failed!");
            System.out.println("expectedTitle1 = " + expectedTitle1);
            System.out.println("actualTitle1 = " + actualTitle1);
        }
        Thread.sleep(3000);
        //5- Go back to Google by using the .back();
        driver.navigate().back();
        //6- Verify title equals:
        //Expected: Google
        String actualTitle2 = driver.getTitle();
       String expectedTitle2 = "Google";

        if(actualTitle2.equalsIgnoreCase(expectedTitle2)){
            System.out.println("Google head title verification has passed!");
        } else {
            System.out.println("Google head title verification has failed!");
        }
        driver.close();

    }
}
