package com.cydeo.tests.day04;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T01_xpath_css {
    public static void main(String[] args) {


//        XPATH and CSS Selector PRACTICES
//        DO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
//        TC #1: XPATH and cssSelector Practices
//        1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");

//        2. Go to https://practice.cydeo.com/forgot_password
        driver.get("https://practice.cydeo.com/forgot_password ");
        driver.manage().window().maximize();
//        3. Locate all the WebElements on the page using XPATH and/or CSS
//        locator only (total of 6)
//        a. “Home” link
        WebElement homeElement = driver.findElement(By.xpath("//a[@class=\"nav-link\"]"));
        WebElement homeElement1 = driver.findElement(By.cssSelector("a[class='nav-link']"));
        WebElement homeElement2 = driver.findElement(By.cssSelector("a.nav-link"));
        WebElement homeElement3 = driver.findElement(By.cssSelector("a[href='/']"));


//        b. “Forgot password” header
        WebElement header1 = driver.findElement(By.cssSelector("div.example>h2"));
        WebElement header2 = driver.findElement(By.xpath("//h2[text()='Forgot Password']"));
       // System.out.println("password is displayed = " + password.isDisplayed());
//        c. “E-mail” text
        WebElement email1 = driver.findElement(By.xpath("//label[@for='email']"));
        String mailText = email1.getText();

//        d. E-mail input box
        WebElement inputBox = driver.findElement(By.xpath("//input[@pattern=\"[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,3}$\"]"));
        WebElement inputBox2 = driver.findElement(By.xpath("//input[contains(@name,'email')]"));

//        e. “Retrieve password” button
        WebElement retrieve = driver.findElement(By.cssSelector("i[class ='icon-2x icon-signin']"));
        WebElement retrieve1 = driver.findElement(By.xpath("//i[@class ='icon-2x icon-signin']"));
//        f. “Powered by Cydeo text
        WebElement byCydeoText = driver.findElement(By.xpath("//div[contains(@style ,'align')]"));
        WebElement byCydeoText1 = driver.findElement(By.cssSelector("div[style ='text-align: center;']"));
//        4. Verify all web elements are displayed.
//        First solve the task with using cssSelector only. Try to create 2 different
//        cssSelector if possible
        System.out.println("homeElement.isDisplayed() = " + homeElement.isDisplayed());
        System.out.println("email1.isDisplayed() = " + email1.isDisplayed());
        System.out.println("inputBox.isDisplayed() = " + inputBox.isDisplayed());
        System.out.println("retrieve.isDisplayed() = " + retrieve.isDisplayed());
        System.out.println("byCydeoText.isDisplayed() = " + byCydeoText.isDisplayed());

//
//        Then solve the task using XPATH only. Try to create 2 different
//        XPATH locator if possible








    }
}
