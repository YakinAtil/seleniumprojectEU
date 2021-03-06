package com.cydeo.tests.day06_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DropdownPractice {
    //TC #5: Selecting state from State dropdown and verifying result
    //1. Open Chrome browser
    //2. Go to http://practice.cybertekschool.com/dropdown
    //3. Select Illinois
    //4. Select Virginia
    //5. Select California
    //6. Verify final selected option is California.
    //Use all Select options. (visible text, value, index)

    public WebDriver driver;

    @BeforeMethod
    public  void setupMethod(){

            driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cydeo.com/dropdown ");
}
    @Test

    public void test1() {



        // We locate the dropdown
        Select stateDropdown = new Select(driver.findElement(By.xpath("//select[@id=\"state\"]")));

        stateDropdown.selectByVisibleText("Illinois");
        stateDropdown.selectByValue("VA");
        stateDropdown.selectByIndex(5);
        //6. Verify final selected option is California.
        String expectedOptionText = "California";
        String actualOptionText = stateDropdown.getFirstSelectedOption().getText();

        Assert.assertTrue(actualOptionText.equals(expectedOptionText));

    }
    @Test
    public void dropdownTask06(){
        //TC #6: Selecting date on dropdown and verifying
        //1. Open Chrome browser
        //2. Go to https://practice.cydeo.com/dropdown
        //3. Select “December 1st, 1923” and verify it is selected.
        //Select year using  : visible text

        Select yearDropdown =new Select( driver.findElement(By.xpath("//select[@id='year']")));
        //Select month using   : value attribute

        Select monthDropdown =new Select( driver.findElement(By.xpath("//select[@id='month']")));

        //Select day using : index number
        Select dayDropdown =new Select( driver.findElement(By.xpath("//select[@id='day']")));
        yearDropdown.selectByVisibleText("1923");
        monthDropdown.selectByValue("11");

        dayDropdown.selectByIndex(0);

        String yearSelected = yearDropdown.getFirstSelectedOption().getText();
        String monthSelected = monthDropdown.getFirstSelectedOption().getText();
        String daySelected = dayDropdown.getFirstSelectedOption().getText();

        Assert.assertEquals(monthSelected+daySelected+yearSelected,"December11923");

    }
    @AfterMethod
    public void endMethod(){
        driver.close();
    }

}
