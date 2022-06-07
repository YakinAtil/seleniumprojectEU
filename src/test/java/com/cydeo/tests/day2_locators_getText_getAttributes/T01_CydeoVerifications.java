package com.cydeo.tests.day2_locators_getText_getAttributes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T01_CydeoVerifications {
    public static void main(String[] args) {
        /*
       TC #1: Cydeo practice tool verifications
1. Open Chrome browser
2. Go to https://practice.cydeo.com
3. Verify URL contains
Expected: cydeo
4. Verify title:
 Expected: Practice
         */

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://practice.cydeo.com");

        String expectedUrl = "com/cydeo";
        String actualUrl = driver.getCurrentUrl();

        if( actualUrl.contains(expectedUrl)) {
            System.out.println("URL Test passed!");
        } else {
            System.out.println(" URL Test failed!");}

        String expectedTitle = "Practice";
        String actualTitle = driver.getTitle();



        if(actualTitle.equalsIgnoreCase(expectedTitle)) {
            System.out.println("Title Test passed. Actual title: " + actualTitle +" is equals to Expected title: " + expectedTitle);
        } else
        { System.out.println("Title Test failed. Actual title: " + actualTitle +" is not equals to Expected title: " + expectedTitle);

        }

    driver.close();
} }
