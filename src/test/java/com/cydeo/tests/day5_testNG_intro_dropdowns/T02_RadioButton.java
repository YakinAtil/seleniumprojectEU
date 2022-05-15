package com.cydeo.tests.day5_testNG_intro_dropdowns;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class T02_RadioButton {
    public static void main(String[] args) throws InterruptedException {
        //TC #2: Radiobutton handling
        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //2. Go to https://practice.cydeo.com/radio_buttons
        driver.get("https://practice.cydeo.com/radio_buttons");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //3. Click to “Hockey” radio button
        WebElement hockeyRadioBtn= driver.findElement(By.xpath("//input[@id=\"hockey\"]"));
        Thread.sleep(2000);
        hockeyRadioBtn.click();
        //4. Verify “Hockey” radio button is selected after clicking.
        if(hockeyRadioBtn.isSelected())
        {
            System.out.println("HockeyRadioBtn is selected");
        }
else {
            System.out.println("HockeyRadioBtn is not selected");

        }
    }
}
