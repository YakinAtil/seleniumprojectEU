package com.cydeo.tests.day5_testNG_intro_dropdowns;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class T03_RadioButton2 {
    public static void main(String[] args) {
        //TC #2: Radiobutton handling
        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //2. Go to https://practice.cydeo.com/radio_buttons
        driver.get("https://practice.cydeo.com/radio_buttons");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    // Locate name = 'sports' radio buttons and store them in a List of Web Element

        // Loop through the list and find "hockey"


clickAndVerifyRadioButton(driver,"sport","hockey");

        clickAndVerifyRadioButton(driver,"sport","football");

        clickAndVerifyRadioButton(driver,"color","yellow");


    }
    private static void clickAndVerifyRadioButton( WebDriver driver, String nameAttribute, String idValue) {
        List<WebElement> radioButton = driver.findElements(By.name(nameAttribute));
        for (WebElement each : radioButton) {
            String eachId = each.getAttribute("id");
            System.out.println("eachId = " + eachId);
            if(eachId.equals(idValue)){
                each.click();
                System.out.println(eachId + " is selected = " + each.isSelected());
                break;
            }

        }


    }
}
