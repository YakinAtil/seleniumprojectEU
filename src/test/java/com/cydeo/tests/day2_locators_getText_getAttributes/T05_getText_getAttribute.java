package com.cydeo.tests.day2_locators_getText_getAttributes;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T05_getText_getAttribute {
    public static void main(String[] args) {
        //TC #5: getText() and getAttribute() method practice
        //1- Open a chrome browser


        WebDriver driver = WebDriverFactory.getDriver("chrome");
        //2- Go to: https://practice.cydeo.com/registration_form
        driver.get("https://practice.cydeo.com/registration_form");
        driver.manage().window().maximize();
        //3- Verify header text is as expected:

        WebElement headerText = driver.findElement(By.tagName("h2"));
        String actualHeaderText = headerText.getText();
        String expectedHeaderText = "Registration form";
        //Expected: Registration form
        if (actualHeaderText.equals(expectedHeaderText)){
            System.out.println("Header Text test passed");
        } else {
            System.out.println("Header text test failed.");
        }
        //4- Locate “First name” input box

        WebElement firstName = driver.findElement(By.name("firstname"));


        //5- Verify placeholder attribute’s value is as expected:
        //Expected: first name
        String expectedPlaceHolder = "first name";
        String actualPlaceHolder = firstName.getAttribute("placeholder");

        if  (actualPlaceHolder.equalsIgnoreCase(expectedPlaceHolder)){
            System.out.println("Place holder text verification Pass");
        } else {
            System.out.println("Place holder text verification Fail");
        }
    driver.close();
    }
}
