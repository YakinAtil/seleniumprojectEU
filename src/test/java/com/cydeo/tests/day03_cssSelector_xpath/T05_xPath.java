package com.cydeo.tests.day03_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T05_xPath {
    public static void main(String[] args) {
        //C #5: NextBaseCRM, locators, getText(), getAttribute() practice
        //1- Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        //2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes
        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes");
        driver.manage().window().maximize();
        //3- Enter incorrect username into login box:
       WebElement userName =driver.findElement(By.xpath("//*[@id=\"login-popup\"]/form/div[2]/div[1]/input"));
       userName.sendKeys("incorrect");
        //4- Click to `Reset password` button
        WebElement resetPasswordButton = driver.findElement(By.xpath("//*[@id=\"login-popup\"]/form/div[4]/button"));
        resetPasswordButton.click();
        //5- Verify “error” label is as expected

        //Expected: Login or E-mail not found
        String actualErrorText = driver.findElement(By.xpath("//*[@id=\"login-popup\"]/form/div[2]")).getText();
        String expectedErrorText = "Login or E-mail not found";
        if (actualErrorText.equalsIgnoreCase(expectedErrorText)){
            System.out.println("Error Text Message verification has passed!");
        } else {
            System.out.println("Error Text Message verification has failed!");
        }
        driver.close();
    }
}
