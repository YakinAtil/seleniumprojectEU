package com.cydeo.tests.day03_cssSelector_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T01_locators_getText {
    public static void main(String[] args) {

        //TC #1: NextBaseCRM, locators and getText() practice
        //1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");
        //3- Enter incorrect username: “incorrect”
        driver.findElement(By.name("USER_LOGIN")).sendKeys("incorrect");

        //4- Enter incorrect password: “incorrect”
        driver.findElement(By.name("USER_PASSWORD")).sendKeys("incorrect");
        //5- Click to log in button.
        driver.findElement(By.className("login-btn")).click();
        //6- Verify error message text is as expected:
        //Expected: Incorrect login or password
        WebElement errorMessage = driver.findElement(By.className("errortext"));
        String actualErrorMessage = errorMessage.getText();
        String expectedErrorMessage = "Incorrect login or password";

        if(actualErrorMessage.equals(expectedErrorMessage)){
            System.out.println("Error message verification passed!");}
            else {
                System.out.println( "Error message verification failed!!");
            }
            driver.close();
        }
        //PS: Inspect and decide which locator you should be using to locate web
        //elements.


    }

