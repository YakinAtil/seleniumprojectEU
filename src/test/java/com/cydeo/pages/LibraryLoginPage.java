package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class LibraryLoginPage {

    public  void publicLibraryLogin(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
