package com.cydeo.reviewWithOscar.week02;

import com.cydeo.utilities.HandleWait;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Task02 {
    public static void main(String[] args) {
        //- Go to:  http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        driver.manage().window().maximize();
        //- Verify title equals: String expectedTitle = "Web Orders Login"
        String expectedTitle = "Web Orders Login";
        String actualTitle = driver.getTitle();
        if (actualTitle.equals(expectedTitle)){
            System.out.println("success");
        } else {
            System.out.println("failed");
            System.exit(-1);
        }
        HandleWait.staticWait(2);
        //- Enter username: Tester
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        //- Enter password: test
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
        HandleWait.staticWait(2);
        //- Click “Sign In” button
        driver.findElement(By.id("ctl00_MainContent_login_button")).click();
        //- Verify title equals: String expectedHomePageTitle = "Web Orders"

        if (driver.getTitle().equals("Web Orders")){
            System.out.println("Title verification passes");
        } else {
            System.out.println("Title verification failed.");
        }


    }
}
