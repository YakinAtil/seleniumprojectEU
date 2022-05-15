package com.cydeo.tests.day03_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class T04_getText_cssSelector {

    public static void main(String[] args) {

        //TC #4: NextBaseCRM, locators, getText(), getAttribute() practice
        //1- Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        //2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes
        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes");
        driver.manage().window().maximize();
        //3- Verify “Reset password” button text is as expected:
        String actualResult = driver.findElement(By.cssSelector("button[class='login-btn']")).getText() ;
        //Expected: Reset password
        System.out.println("actualResult = " + actualResult);
        driver.close();


    }
}
