package com.dixter.test.regression.login;

import org.testng.annotations.Test;

import com.dixter.lib.ui.LoginPage;
import com.dixter.lib.utils.CreateDriver;
import com.dixter.lib.utils.DataHandlers;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class TestLoginU13576 {
	
	WebDriver driver;
	LoginPage login;
	
  @Test
  public void Test_Invalid_Login_TC135788() {
	  String username = DataHandlers.getDataFromExcel("Data", "TC135788", 1, 0);

	  String Password = DataHandlers.getDataFromExcel("Data", "TC135788", 1, 1);
	 
	  String ExpectedErrorMsg = DataHandlers.getDataFromExcel("Data", "TC135788", 1, 2);
	 // login.WaitForLoginPageToLoad();
	  login.getPasswordTextbox().sendKeys(username);
	  login.getPasswordTextbox().sendKeys(Password);
	  login.getLoginButton().click();
	  String actualErrorMsg =  login.getLoginError().getText();
	   Assert.assertEquals(actualErrorMsg, ExpectedErrorMsg);
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  driver = CreateDriver.getDriverInstance();
	  login = new LoginPage(driver);
	  
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
