package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicLoad7Page {

    public DynamicLoad7Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//img[contains(@class,'rounded mx-auto')]")

   public WebElement image;


    @FindBy(xpath = "//*[.=\"Dynamic title\"]")

    public WebElement titleDynamicText;

    @FindBy(xpath = "//strong[text()='Done!']")

    public WebElement doneText;
}

