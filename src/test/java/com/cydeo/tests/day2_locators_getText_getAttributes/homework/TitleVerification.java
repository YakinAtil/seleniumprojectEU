package com.cydeo.tests.day2_locators_getText_getAttributes.homework;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class TitleVerification {
    public static void main(String[] args) {
        //TC #1: Etsy Title Verification
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //2. Go to https://www.etsy.com
        driver.get("https://www.etsy.com");
        driver.manage().window().maximize();

        //3. Search for “wooden spoon”
        driver.findElement(By.xpath("//*[@id=\"global-enhancements-search-query\"]")).sendKeys("wooden spoon" + Keys.ENTER);
        //4. Verify title:
        //Expected: “Wooden spoon | Etsy”

        String actualTitle = driver.getTitle();
        String expectedTitle = "Wooden spoon | Etsy" ;
        if(actualTitle.equalsIgnoreCase(expectedTitle)) {
            System.out.println("Title verification has passed!");
        } else {
            System.out.println("title verification has failed!");
        }
driver.close();
    }
}
