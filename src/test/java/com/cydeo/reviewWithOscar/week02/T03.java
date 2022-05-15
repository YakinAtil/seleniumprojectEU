package com.cydeo.reviewWithOscar.week02;

import com.cydeo.utilities.HandleWait;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class T03 {



    public static void main(String[] args) {

        //Task 3:
        //You have to implement the following Web automated checks over our DEMO ONLINE SHOP:
        // https://www.demoblaze.com/index.html
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.demoblaze.com/index.html");
        driver.manage().window().maximize();
        HandleWait.staticWait(2);
        //    • Customer navigation through product categories: Phones, Laptops and Monitors
        //    Navigate to "Laptop" → "Sony vaio i5" and verify the price is 790 dollars
        driver.findElement(By.partialLinkText("Laptops")).click();
        HandleWait.staticWait(2);
        driver.findElement(By.partialLinkText("Sony vaio i5")).click();
        HandleWait.staticWait(3);

int expectedPrice = 790 ;

String priceText = driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/h3")).getText();
        System.out.println("priceText = " + priceText);
int actualPrice = Integer.parseInt((priceText.split(" ")[0].substring(1)));
        System.out.println("actualPrice = " + actualPrice);
        System.out.println("expectedPrice = " + expectedPrice);
if (expectedPrice == actualPrice) {
    System.out.println("Price verification passed");
} else {
    System.out.println("Price verification failed");
}
HandleWait.staticWait(3);

        driver.close();
    }

}
