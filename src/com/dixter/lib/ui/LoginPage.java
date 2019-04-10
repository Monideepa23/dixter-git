package com.dixter.lib.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void WaitForLoginPage()
	{
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.name("LoginForm"))));
	}
	
	public WebElement getUsernameTextbox()
	{
		try
		{
			WebElement element = driver.findElement(By.name("username"));
			return element;
		}
		catch(NoSuchElementException e)
		{
			return null;
		}
	}
	
	public WebElement getPasswordTextbox()
	{
		try
		{
			WebElement element = driver.findElement(By.name("pwd"));
			return element;
		}
		catch(NoSuchElementException e)
		{
			return null;
		}
	}
	
	public WebElement getLoginButton()
	{
		try
		{
			WebElement element = driver.findElement(By.id("loginButton"));
			return element;
		}
		catch(NoSuchElementException e)
		{
			return null;
		}
	}
	
	public WebElement getLoginError()
	{
		try
		{
			WebElement element = driver.findElement(By.xpath("//span[text()='Username or Password is invalid. Please try again.']"));
			return element;
		}
		catch(NoSuchElementException e)
		{
			return null;
		}
	}
	

}
