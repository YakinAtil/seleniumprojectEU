package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LibraryLoginPage {
    //1- Open a chrome browser
    //2- Go to: https://library1.cydeo.com
    //3- Do not enter any information
    //4- Click to “Sign in” button
    //5- Verify expected error is displayed:
    //Expected: This field is required.
    //

    public   LibraryLoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath ="//input[@id='inputEmail']")

    public WebElement inputUserName;

    @FindBy(id = "inputPassword")
    public WebElement inputPassword;


    @FindBy(xpath = "//button[.='Sign in']")
    public WebElement signInButton;

    @FindBy(xpath = "//div[text()='This field is required.']")

    public WebElement fieldRequiredAlertMessage ;

    @FindBy(xpath = "//*[@id=\"inputEmail-error\"]")

    public WebElement enterValidEMailMessage;

    @FindBy(xpath = "//div[.='Sorry, Wrong Email or Password']")
    public  WebElement wrongMailOrPasswordAlert;

}
