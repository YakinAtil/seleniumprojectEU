package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T04_SimpleDropdowns {
    WebDriver driver;


    @Test

    @BeforeMethod

    public void setUpMethod (){
       driver = WebDriverFactory.getDriver("chrome");
        // Maximize page
        driver.manage().window().maximize();
        // Implicit wait
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/dropdown");

    }

    public void simpleDropdownTest(){
//TC#4: Verifying “Simple dropdown” and “State selection” dropdown
        //default values
        //1. Open Chrome browser
        //2. Go to https://practice.cydeo.com/dropdown
        //3. Verify “Simple dropdown” default selected value is correct
        //Expected: “Please select an option”
        Select dropDownDate = new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));
        String expected = "Please select an option";
        String actual = dropDownDate.getFirstSelectedOption().getText();
        Assert.assertEquals(actual,expected);
        //4. Verify “State selection” default selected value is correct
        //Expected: “Select a State”



        Select simpleStateDropdown = new Select(driver.findElement(By.xpath("//select[@id='state']")));

        String expectedState = "Select a State";
        String actualState = simpleStateDropdown.getFirstSelectedOption().getText();

        Assert.assertEquals(actual,expected);


    }
//    @AfterMethod
//
//    public void tearDown(){
//        driver.close();
    //}

}
