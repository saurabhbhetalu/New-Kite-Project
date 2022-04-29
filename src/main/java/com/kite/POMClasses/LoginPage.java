package com.kite.POMClasses;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	
	private WebDriver driver;
	private Scanner in;
	
	@FindBy(xpath="//input[@id='userid']")
	private WebElement username; 
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement password;
	
	@FindBy(xpath="//input[@id='pin']")
	private WebElement pin;
	
	@FindBy(xpath="//button[text()='Continue ']")
	private WebElement pincontinue;
	
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement loginButton;
	
	@FindBy(xpath="//span[text()='Password should be minimum 6 characters.']")
	private WebElement errormessage;
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
		in = new Scanner(System.in);  
	}
	
	
	public void username()
	{
		username.sendKeys("EP8702");
	}
	
	public void password()
	{
		
		password.sendKeys(in.nextLine());
	}
	
	public void pin()
	{
		pin.sendKeys(in.nextLine());
	}
	
	public void pincontinue()
	{
		pincontinue.click();
	}
	
	public void loginbutton()
	{
		loginButton.click();
	}
	
	public String errormessage()
	{
		String x = errormessage.getText();
		return x;
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
