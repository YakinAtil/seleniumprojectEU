package com.cydeo.tests.angie;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Task01  {

    //Task 1: The task consists on the next steps:
    //1.	Go to https://www.amazon.com

    @Test

    public void searchHat() throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.amazon.com");
        WebElement searchBox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        searchBox.sendKeys("hats for men" + Keys.ENTER);
        String actual = driver.findElement(By.xpath("//span[@class =\"a-color-state a-text-bold\"]")).getText();
        String expected = "hats for men";
        Assert.assertTrue(actual.contains(expected));


        //3.	Add the first hat appearing to Cart with quantity 2

        driver.findElement(By.xpath("(//img[@class='s-image'])[1]")).click();
        Thread.sleep(3000);

        Select quantity = new Select(driver.findElement(By.cssSelector("#quantity")));
        quantity.selectByValue("2");
        driver.findElement(By.xpath("//input[@value='Add to Cart']")).click();

        //4.	Open cart and assert that the total price and quantity are correct

        String actualNumber =driver.findElement(By.xpath("//*[@id=\"nav-cart-count\"]")).getText();
        String expectedNumber ="2";
        String actualPrice = driver.findElement(By.xpath("//*[@id=\"sw-subtotal\"]/span[2]/span/span[2]/span[2]")).getText();
        System.out.println(actualPrice);

        Assert.assertEquals(actualNumber,expectedNumber,"Number");
//Assert.assertTrue(actualPrice.contains("102"));
driver.navigate().back();
Thread.sleep(3);
        Select quantity1 = new Select(driver.findElement(By.cssSelector("#quantity")));
        quantity1.selectByValue("1");
        driver.findElement(By.xpath("//input[@value='Add to Cart']")).click();
        String actualNumber1 =driver.findElement(By.xpath("//*[@id=\"nav-cart-count\"]")).getText();
        String expectedNumber1 ="1";
       // String actualPrice1 = driver.findElement(By.xpath("//*[@id=\"sw-subtotal\"]/span[2]/span/span[2]/span[2]")).getText();
       // System.out.println(actualPrice1);

        Assert.assertEquals(actualNumber,expectedNumber,"Number");
      //  Assert.assertTrue(actualPrice.contains("51"));

//5.	Reduce the quantity from 2 to 1 in Cart for the item selected in the step 3
        //6.	Assert that the total price and quantity has been correctly changed
        //The goal of this test is to check if you are able to automate a test of a
        // given website, but we'd like you to also demonstrate the coding quality, structure, and style of the deliverables.
    }
}