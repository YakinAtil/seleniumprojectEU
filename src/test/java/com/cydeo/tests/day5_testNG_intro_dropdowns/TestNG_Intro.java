package com.cydeo.tests.day5_testNG_intro_dropdowns;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestNG_Intro {

  @BeforeClass
  public void setUpMethodClass(){
    System.out.println("--->BeforeClass is running.");

  }
  @AfterClass

  public void tearDownClass(){
    System.out.println("--->AfterClass is running.");
  }

  @BeforeMethod

  public  void setUpMethod(){
    System.out.println("---> BeforeMethod is running");
  }
  @AfterMethod

  public void tearDownMethod(){
    System.out.println("---> AfterMethod is running.");
  }

  @Test (priority = 1)
    public void Test1(){

      System.out.println("Test1 is running.");
//ASSERT EQUALS = Compare two of the same things
      String actual = "apple";
      String expected = "apple";
    Assert.assertEquals(actual,expected);

    }
    @Test (priority = 2)
  public void Test2(){

    System.out.println("Test2 is running.");
      String actual = "apple";
      String expected = "apple";
      Assert.assertTrue(actual.equals(expected));
  }



}
