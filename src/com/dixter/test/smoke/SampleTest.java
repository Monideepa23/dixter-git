package com.dixter.test.smoke;

import org.testng.annotations.Test;

import com.dixter.lib.utils.CreateDriver;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class SampleTest {
	
	WebDriver driver;
  @Test
  public void SampleTest() {
	  String actualTitle = driver.getTitle();
	  String expectedTitle = "actiTIME - Login";
	  Assert.assertEquals(actualTitle, expectedTitle);
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  driver = CreateDriver.getDriverInstance();
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
