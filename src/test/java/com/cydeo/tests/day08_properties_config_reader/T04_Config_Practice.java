package com.cydeo.tests.day08_properties_config_reader;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T04_Config_Practice {



//  /*  public WebDriver driver;
//
//
//    @BeforeMethod
//
//    public void setupMethod() {
//        String browserType = ConfigurationReader.getProperty("browser");
//        driver = WebDriverFactory.getDriver(browserType);
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//    }
//
//   */

    @Test

    public void google_search_test() {
        //2- Go to: https://google.com
    //3- Write “apple” in search box
    //4- Verify title:
    //Expected: apple - Google Search
        Driver.getDriver().get("https://google.com");

    WebElement googleSearchBox = Driver.getDriver().findElement(By.xpath("//input[@name='q']"));

    googleSearchBox.sendKeys(ConfigurationReader.getProperty("searchValue") + Keys.ENTER);

    String expectedTitle = ConfigurationReader.getProperty("searchValue")+
            " - Google'da Ara";
    String actualTitle = Driver.getDriver().getTitle();

    Assert.assertEquals(actualTitle,expectedTitle);

}


}
