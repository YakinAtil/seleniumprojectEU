package com.cydeo.tests.day2_locators_getText_getAttributes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T04_LibraryLoginPage {

    public static void main(String[] args) {

        //TC #4: Library verifications
        //1. Open Chrome browser
        //2. Go to http://library2.cybertekschool.com/login.html
        //3. Enter username: “incorrect@email.com”
        //4. Enter password: “incorrect password”
        //5. Click sign in
        //5. Verify: visually “Sorry, Wrong Email or Password”
        //displayed
        //PS: Locate username input box using “className” locator
        //Locate password input box using “id” locator
        //Locate Sign in button using “tagName” locator


        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        //2. Go to http://library2.cybertekschool.com/login.html
        driver.get("http://library2.cybertekschool.com/login.html");
        driver.manage().window().maximize();
        //3. Enter username: “incorrect@email.com”

        WebElement eMail = driver.findElement(By.className("form-control"));

        eMail.sendKeys("@incorrectemail");
        //4. Enter password: “incorrect password”
        WebElement password = driver.findElement(By.id("inputPassword"));

        password.sendKeys("@incorrectpassword");

        //5. Click sign in

        WebElement signIn = driver.findElement(By.tagName("button"));

        signIn.click();






    }
}
