package com.cydeo.reviewWithOscar.week1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateToDemoBlaze {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://www.demoblaze.com/");

        String actualTitle = driver.getTitle();
        String expectedTitle = "STORE";

        System.out.println("actualTitle = " + actualTitle);

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }

        try{
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
driver.close();

    }
}
