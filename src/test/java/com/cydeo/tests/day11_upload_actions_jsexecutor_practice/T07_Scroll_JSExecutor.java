package com.cydeo.tests.day11_upload_actions_jsexecutor_practice;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class T07_Scroll_JSExecutor {
    @Test
    public void scrollTest(){
    //1- Open a chrome browser
    //2- Go to: https://practice.cydeo.com/large
    Driver.getDriver().get("https://practice.cydeo.com/large");
    //3- Scroll down to “Cydeo” link

        WebElement element = Driver.getDriver().findElement(By.linkText("CYDEO"));
        WebElement home =Driver.getDriver().findElement(By.linkText("Home"));
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        BrowserUtils.sleep(2);
        js.executeScript("arguments[0].scrollIntoView(true)",element);
    //4- Scroll up to “Home” link
        BrowserUtils.sleep(2);

        js.executeScript("arguments[0].scrollIntoView(true)",home);

        //5- Use below provided JS method only

}}
