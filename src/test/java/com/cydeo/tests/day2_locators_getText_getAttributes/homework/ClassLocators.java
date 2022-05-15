package com.cydeo.tests.day2_locators_getText_getAttributes.homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassLocators {
    public static void main(String[] args) {
        //TC #4: Practice Cydeo – Class locator practice
        //1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //2- Go to: https://practice.cydeo.com/inputs
        driver.navigate().to("https://practice.cydeo.com/inputs");
        driver.manage().window().maximize();
        //3- Click to “Home” link
        driver.findElement(By.className("nav-link")).click();
        //4- Verify title is as expected:
        //Expected: Practice
        String actualTitle = driver.getTitle();
        String expectedTitle = "Practice" ;

        if(actualTitle.equalsIgnoreCase(expectedTitle)){
            System.out.println("Head Title verification has passed.");
        } else {
            System.out.println("Head Title verification has failed.");
        }

       


    }
}
