package com.cydeo.reviewWithOscar.week02;

import com.cydeo.utilities.HandleWait;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task01 {

    public static void main(String[] args) {
        //open chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        //        go to https://practice.cydeo.com/
        driver.get("https://practice.cydeo.com/");
        driver.manage().window().maximize();
        HandleWait.staticWait(1);
        //        then click on "forgot_password" link
        driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[20]/a")).click();
        //        enter any email
        driver.findElement(By.xpath("//*[@id=\"forgot_password\"]/div/div/input")).sendKeys("failmail@email.com");
        //        verify that email is displayed in the input box
        HandleWait.staticWait(1);
        WebElement actualEmail = driver.findElement(By.xpath("//*[@id=\"forgot_password\"]/div/div/input"));
        String expectedEmail = "email@email.com";
        String actualMail = actualEmail.getAttribute("value");
        if (actualMail.equalsIgnoreCase(expectedEmail)){
            System.out.println("Email verification passed");
        } else {
            System.out.println("Failed email verification");
            System.out.println("actualMail = " + actualMail);
            System.out.println("expectedEmail = " + expectedEmail);
        }

        //        click on Retrieve password
        driver.findElement(By.xpath("//*[@id=\"form_submit\"]")).click();

        //        verify that confirmation message says 'Your e-mail's been sent!'
        String expectedResult = "Your e-mail's been sent!";
        String actualResult = driver.findElement(By.name("confirmation_message")).getText();

        if (actualResult.equalsIgnoreCase(expectedResult)){
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed!");
        }
        HandleWait.staticWait(2);
        driver.close();
    }
}
