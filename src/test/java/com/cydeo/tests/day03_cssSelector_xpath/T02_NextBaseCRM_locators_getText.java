package com.cydeo.tests.day03_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class T02_NextBaseCRM_locators_getText {
    public static void main(String[] args) {



    //TC #2: NextBaseCRM, locators, getText(), getAttribute() practice
    //1- Open a chrome browser

    WebDriver driver = WebDriverFactory.getDriver("chrome");

    //2- Go to: "https://login1.nextbasecrm.com/"
    driver.get("https://login1.nextbasecrm.com/");
    driver.manage().window().maximize();
    //3- Verify “remember me” label text is as expected:
        if(driver.findElement(By.className("login-item-checkbox-label")).getText().equalsIgnoreCase("Remember me on this computer")){

            System.out.println( "Remember verification has passed!");

        } else {
            System.out.println(" Remember verification has failed!!");
        }
    //Expected: Remember me on this computer
    //4- Verify “forgot password” link text is as expected:
        if(driver.findElement(By.className("login-link-forgot-pass")).getText().equalsIgnoreCase("Forgot your password?")){
            System.out.println("Forgot password verification has passed!");
        } else {
            System.out.println("Forgot password verification has failed!!");
        }
    //Expected: Forgot your password?
    //5- Verify “forgot password” href attribute’s value contains expected:
    //Expected: forgot_password=yes
       if( driver.findElement(By.className("login-link-forgot-pass")).getAttribute("href").contains("forgot_password=yes"))
       {
           System.out.println("Href test passed!");
       } else {
           System.out.println("Href test failed!");
       }
    //PS: Inspect and decide which locator you should be using to locate web
    //elements.


driver.close();
    }}
