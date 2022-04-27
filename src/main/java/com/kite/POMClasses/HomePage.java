package com.kite.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage 
{
	private WebDriver driver;
	
	@FindBy(xpath="//span[text()='EP8702']")
	private WebElement EP8702;
	
	@FindBy(xpath="//a[@href='/logout']")
	private WebElement logout;
	
	@FindBy(xpath="(//div//a//span)[5]")
	private WebElement fund;
	
	@FindBy(xpath="//button[text()='Add funds ']")
	private WebElement addfund;
	
	
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickEP8702()
	{
		EP8702.click();
	}
	
	public void clicklogout()
	{
		
		logout.click();
	}
	
	public void clickfund()
	{
		
		fund.click();
	}
	
	
	public void clickaddfund()
	{
		
		addfund.click();
	}

}
