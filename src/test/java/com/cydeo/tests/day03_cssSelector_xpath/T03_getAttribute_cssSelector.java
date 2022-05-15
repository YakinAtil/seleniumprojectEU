package com.cydeo.tests.day03_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T03_getAttribute_cssSelector {
    public static void main(String[] args) {

        //TC #3: NextBaseCRM, locators, getText(), getAttribute() practice
        //1- Open a chrome browser

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");
        driver.manage().window().maximize();
        //3- Verify “Log in” button text is as expected:
        //Expected: Log In
        WebElement signInButton = driver.findElement(By.cssSelector("input[type='submit']"));
        if (signInButton.getAttribute("value").equalsIgnoreCase("Log In")) {
            System.out.println("Log in verification is passed!");
        } else {
            System.out.println("Log in verification is failed");
        }
       driver.close();


    }
}
