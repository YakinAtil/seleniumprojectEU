package com.cydeo.tests.day10_upload_actions_jsexecutor;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T02_Upload_Practice {
    //C:\Users\Atıl\Desktop\SDET\Automation\HTML\audi.jpg

    @Test
    public void upload_test(){
        // TC #2 Upload Test
        //        1. Go to https://practice.cydeo.com/upload
        Driver.getDriver().get("https://practice.cydeo.com/upload");
        //        2. Find some small file from your computer, and get the path of it.
        String path = "C:\\Users\\Atıl\\Desktop\\SDET\\Automation\\HTML\\audi.jpg" ;

        WebElement fileUpload =Driver.getDriver().findElement(By.id("file-upload"));
        BrowserUtils.sleep(2);
        fileUpload.sendKeys(path);
        //        3. Upload the file.
        Driver.getDriver().findElement(By.id("file-submit")).click();
        //        4. Assert:
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//*[@id=\"content\"]/div/h3")).isDisplayed());
        //        -File uploaded text is displayed on the page








    }
}
