package com.cydeo.tests.day07_webtales_utilities_javafaker;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T03_CRM_Login {
    WebDriver driver ;

    @BeforeMethod

    public void setup() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://login1.nextbasecrm.com/");
    }

    @Test

    public  void crm_login_test(){
        //TC #3: Login scenario
        //1. Create new test and make set ups
        //2. Go to : http://login1.nextbasecrm.com/
        //3. Enter valid username
        WebElement userName =driver.findElement(By.xpath("//input[@class=\"login-inp\"][1]"));
        userName.sendKeys("helpdesk2@cybertekschool.com");
        //4. Enter valid password
        WebElement password = driver.findElement(By.xpath("//input[@type=\"password\"]"));
        password.sendKeys("UserUser");
        //5. Click to `Log In` button
        driver.findElement(By.xpath("//input[@class=\"login-btn\"]")).click();
        //6. Verify title is as expected:
        BrowserUtils.verifyTitle(driver,"Portal");
        //Expected: Portal
        //USERNAME PASSWORD
        //helpdesk1@cybertekschool.com UserUser
        //Helpdesk2@cybertekschool.com UserUse
    }
    @AfterMethod
    public  void testEnd(){
        driver.close();
    }
}
