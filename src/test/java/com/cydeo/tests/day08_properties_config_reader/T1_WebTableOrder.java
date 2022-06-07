package com.cydeo.tests.day08_properties_config_reader;

import com.cydeo.utilities.WebTableUtils;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_WebTableOrder {


    public WebDriver driver;


    @BeforeMethod

    public void setupMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/web-tables");
    }

    @Test

    public void order_name_verify_test() {

//1. Go to: https://practice.cydeo.com/web-tables
        //2. Verify Bob’s name is listed as expected.

        String actual = driver.findElement(By.xpath("//table[@class=\"SampleTable\"]//tr[7]//td[2]")).getText();

        //Expected: “Bob Martin”

        String expected = "Bob Martin";

        Assert.assertTrue(actual.equals(expected));
    }

    //3. Verify Bob Martin’s order date is as expected
    @Test
    public void order_name_verify_test2() {

        String actualDate = driver.findElement(By.xpath("//table[@class=\"SampleTable\"]//tr[7]//td[5]")).getText();
        String expectedDate = "12/31/2021";
        //Expected: 12/31/2021

        Assert.assertTrue(actualDate.equals(expectedDate));

    }
    @Test

    public void order_name_verify_test3(){
        String customerOrderDate1 = WebTableUtils.returnOrderDate(driver, "Alexandra Gray");
        System.out.println(customerOrderDate1);

    }
    @Test
    public void order_name_verify_test4(){

        WebTableUtils.orderVerify(driver,"Bart Fisher", "01/16/2021"); }
        @AfterMethod




    public void endMethod () {
        driver.close();
    }


}
