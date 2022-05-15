package com.cydeo.tests.day2_locators_getText_getAttributes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T03_GoogleSearch {
    public static void main(String[] args) {

//        TC#3: Google search
//        1- Open a chrome browser
//        2- Go to: https://google.com
//        3- Write “apple” in search box
//        4- Click enter
//        5- Verify title:
//        Expected: Title should start with “apple” word



       // 1- Open a chrome browser

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        //        2- Go to: https://google.com
        driver.get("https://google.com");

        driver.manage().window().maximize();

        // 3- Write “apple” in search box

        WebElement googleSearchBox = driver.findElement(By.name("q"));

        //        4- Click enter

        googleSearchBox.sendKeys("apple" + Keys.ENTER);
     //   5- Verify title:
//        Expected: Title should start with “apple” word
        String expected = "apple";
        String actual = driver.getTitle();

        if (actual.startsWith(expected)) {
            System.out.println("Test passed!");
        } else {
            System.out.println("Test failed!");
        }
        driver.close();
    }
}
