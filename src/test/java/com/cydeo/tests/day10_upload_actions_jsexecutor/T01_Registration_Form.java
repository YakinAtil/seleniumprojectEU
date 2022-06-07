package com.cydeo.tests.day10_upload_actions_jsexecutor;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T01_Registration_Form {

    @Test
    public void registration_form_test(){
        //TC#1: Registration form confirmation
        //Note: Use JavaFaker OR read from configuration.properties file when possible.
        //1. Open browser
        //2. Go to website: https://practice.cydeo.com/registration_form
        Driver.getDriver().get(ConfigurationReader.getProperty("registration.form.url"));
        //3. Enter first name
        WebElement inputFirstName = Driver.getDriver().findElement(By.xpath("//input[@name=\"firstname\"]"));
        Faker faker = new Faker();
        inputFirstName.sendKeys(faker.name().firstName());
        //4. Enter last name
        WebElement inputLastName = Driver.getDriver().findElement(By.xpath("//input[@name=\"lastname\"]"));
        inputLastName.sendKeys(faker.name().lastName());
        //5. Enter username
        WebElement userName = Driver.getDriver().findElement(By.xpath("//input[@name=\"username\"]"));
        String userName1=faker.bothify("helpdesk###");
        userName.sendKeys(userName1);
        //6. Enter email address
        WebElement email = Driver.getDriver().findElement(By.xpath("//input[@name=\"email\"]"));
        email.sendKeys(faker.bothify(userName1+"@email.com"));
        //7. Enter password
        WebElement password = Driver.getDriver().findElement(By.xpath("//input[@name=\"password\"]"));
       password.sendKeys(faker.numerify("########"));
        //8. Enter phone number
        WebElement phoneNumber = Driver.getDriver().findElement(By.xpath("//input[@name=\"phone\"]"));
        phoneNumber.sendKeys(faker.numerify("333-###-####"));
        //9. Select a gender from radio buttons
       Driver.getDriver().findElement(By.xpath("//input[@value=\"female\"]")).click();
        //10. Enter date of birth
        WebElement dateOfBirth = Driver.getDriver().findElement(By.xpath("//input[@name=\"birthday\"]"));
        dateOfBirth.sendKeys("01/01/1977");
        //11. Select Department/Office
        Select office = new Select(Driver.getDriver().findElement(By.xpath("//select[@name=\"department\"]")));
        office.selectByIndex(faker.number().numberBetween(1,9));
        //12. Select Job Title
        Select jobTitle = new Select(Driver.getDriver().findElement(By.xpath("//select[@name=\"job_title\"]")));
        jobTitle.selectByIndex(faker.number().numberBetween(1,8));

        //13. Select programming language from checkboxes
        Driver.getDriver().findElement(By.xpath("//*[@value=\"java\"]")).click();
        //14. Click to sign up button
        Driver.getDriver().findElement(By.xpath("//button[@type=\"submit\"]")).click();
        //15. Verify success message “You’ve successfully completed registration.” is
        //displayed.
        String actual= Driver.getDriver().findElement(By.xpath("//*[@id=\"content\"]/div/div/p")).getText();
        String expected = " You've successfully completed registration!";
        System.out.println(actual);
        System.out.println(expected);
        Assert.assertEquals(actual,expected);
        //
        //
        //Note:
        //1. Use new Driver utility class and method
        //2. User JavaFaker when possible
        //3. User ConfigurationReader when it makes sense
    }
}
