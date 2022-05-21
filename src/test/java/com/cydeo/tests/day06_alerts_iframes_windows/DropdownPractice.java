package com.cydeo.tests.day06_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
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

    @Test

    public void test1() {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cydeo.com/dropdown ");

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

}
