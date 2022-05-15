package com.cydeo.tests.day04;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TC04_FindElements {
    public static void main(String[] args) {


        //1- Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        //2- Go to: https://practice.cydeo.com/abtest
        driver.get("https://practice.cydeo.com/abtest");
        //3- Locate all the links in the page.
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));

        //4- Print out the number of the links on the page.
        System.out.println("Number of links: " + allLinks.size());
        //5- Print out the texts of the links.
        for (WebElement e : allLinks) {
            System.out.println("Test of link = " + e.getText());
        }
        //6- Print out the HREF attribute values of the links
        for (WebElement allLink : allLinks) {
            System.out.println("link: = " + allLink.getAttribute("href"));

        }




    }
}