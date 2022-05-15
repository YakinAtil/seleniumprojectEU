package com.cydeo.reviewWithOscar.week03;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class WebOrderTestsTask {

    WebDriver driver;
    //CheckBox, CheckAll and UncheckAll Buttons
    //1.    Go to http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx
    //2.    Login with-----Username: Tester, password: test
    //
    //3.    Click on check all button verify all the checkboxes are checked
    //4.    Click on uncheck all button verify that all the checkboxes are unchecked
    //Test Case 2
    //1.    Go to http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx
    //2.    Login with-----Username: Tester, password: test
    //3.    Select one of the checkbox and delete one person
    //4.    Then verify that deleted item is no longer exists



    @BeforeMethod

    public void startWith(){
        //CheckBox, CheckAll and UncheckAll Buttons
        System.out.println("login steps for application");

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //1.    Go to http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");
        //2.    Login with-----Username: Tester, password: test
        WebElement userName = driver.findElement(By.xpath("// input[@id=\"ctl00_MainContent_username\"]"));
        userName.sendKeys("Tester");
        WebElement password = driver.findElement(By.xpath("// input[@id=\"ctl00_MainContent_password\"]"));
        password.sendKeys("test");
        driver.findElement(By.xpath("// input[@class=\"button\"]")).click();

    }

    @Test

    public void verifyAllChecked () {

//3.    Click on check all button verify all the checkboxes are checked
        System.out.println("Implementing steps 3 and 4 for Test case 1");
        driver.findElement(By.xpath("// a[@id=\"ctl00_MainContent_btnCheckAll\"]")).click();

        List<WebElement> checkBox = driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));


        for (WebElement each : checkBox) {

            Assert.assertTrue(each.isSelected(),"Check box is UNSELECTED");

            }


        //4.    Click on uncheck all button verify that all the checkboxes are unchecked



    }
    @Test
    public void unCheckAll(){
driver.findElement(By.linkText("Uncheck All")).click();
        List<WebElement> checkBox = driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));

        for (WebElement eachBox : checkBox) {

            Assert.assertFalse(eachBox.isSelected(),"Checkbox is SELECTED");

        }}



    @AfterMethod

    public  void closeTest(){

        driver.close();

    }


}
