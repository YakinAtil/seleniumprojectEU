package com.cydeo.tests.day2_locators_getText_getAttributes.homework;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HeadTitleVerification {
    public static void main(String[] args) {
        //TC #2: Zero Bank header verification
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        //2. Go to http://zero.webappsecurity.com/login.html
        driver.get("http://zero.webappsecurity.com/login.html");
        driver.manage().window().maximize();
        //3. Verify header text
        //Expected: “Log in to ZeroBank”
        String actualHeaderText = driver.findElement(By.xpath("/html/head")).getText();
        String expectedHeaderText = "Log in to ZeroBank";

        if (actualHeaderText.equalsIgnoreCase(expectedHeaderText)){
            System.out.println("Header Text verification has passed.");
        } else {
            System.out.println("Header Text verification has passed.");
        }

    }
}
