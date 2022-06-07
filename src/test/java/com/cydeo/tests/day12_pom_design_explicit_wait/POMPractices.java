package com.cydeo.tests.day12_pom_design_explicit_wait;

import com.cydeo.pages.LibraryLoginPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class POMPractices {

    LibraryLoginPage libraryLoginPage;

    @BeforeMethod
    //1- Open a chrome browser
    //2- Go to: https://library1.cydeo.com
    public void setUpMethod() {
        Driver.getDriver().get("https://library1.cydeo.com");
        libraryLoginPage = new LibraryLoginPage();

    }


    @Test
    public void required_field_error_message_text() {

        //3- Do not enter any information
        //4- Click to “Sign in” button
        libraryLoginPage.signInButton.click();
        //5- Verify expected error is displayed:
        Assert.assertTrue(libraryLoginPage.fieldRequiredAlertMessage.isDisplayed());
        //Expected: This field is required.
        BrowserUtils.sleep(2);
        String actual = libraryLoginPage.fieldRequiredAlertMessage.getText();
        String expected = "This field is required.";
        Assert.assertTrue(actual.equalsIgnoreCase(expected));
        Driver.closeDriver();
    }

    @Test
    public void invalid_email_message() {
        //1- Open a chrome browser
        //2- Go to: https://library1.cydeo.com

        //3- Enter invalid email format
        libraryLoginPage.inputUserName.sendKeys("somethingwrong");
        //4- Verify expected error is displayed:
        //Expected: Please enter a valid email address.
        libraryLoginPage.signInButton.click();
        String actual = libraryLoginPage.enterValidEMailMessage.getText();
        String expected = "Please enter a valid email address.";
        Assert.assertTrue(actual.equalsIgnoreCase(expected));
        Driver.closeDriver();
    }

    @Test
    public void negative_login_test() {
        //1- Open a chrome browser
        //2- Go to: https://library1.cydeo.com
        //3- Enter incorrect username or incorrect password
        libraryLoginPage.inputUserName.sendKeys("sometext@domain.com");
        libraryLoginPage.inputPassword.sendKeys("wrong_password");
        libraryLoginPage.signInButton.click();
        //4- Verify title expected error is displayed:
        libraryLoginPage.wrongMailOrPasswordAlert.isDisplayed();
        String actualWrongMailMessage = libraryLoginPage.wrongMailOrPasswordAlert.getText();
        String expectedWrongMailMessage = "Sorry, Wrong Email or Password";

        Assert.assertTrue(actualWrongMailMessage.equalsIgnoreCase(expectedWrongMailMessage));
        Driver.closeDriver();

        //Expected: Sorry, Wrong Email or Password

    }
}