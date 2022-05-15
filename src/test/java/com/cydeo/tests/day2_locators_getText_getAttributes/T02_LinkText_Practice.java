package com.cydeo.tests.day2_locators_getText_getAttributes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T02_LinkText_Practice {


    public static void main(String[] args) {
//        TC #2: Back and forth navigation






        //Day 2 Task 02 linkText

//1- Open a chrome browser

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
//2- Go to: https://practice.cydeo.com
        driver.get("https://practice.cydeo.com");
//3- Click to A/B Testing from top of the list.
        //driver.findElement(By.linkText("A/B Testing")).click();

        WebElement abTestlink = driver.findElement(By.linkText("A/B Testing"));
        abTestlink.click();
//4- Verify title is:
//Expected: No A/B Test

        String expectedTitle = "No A/B Test";
        String actualTitle = driver.getTitle();

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title test passed!");
        } else {
            System.out.println("Title test failed!");
        }
        //5- Go back to home page by using the .back();
        driver.navigate().back();

        //6- Verify title equals:
        //Expected: Practice

        String expectedTitle2 = "Practice";
        String actualTitle2 = driver.getTitle();

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Main Title test passed!");
        } else {
            System.out.println("Main Title test failed!");
        }




    }
}
