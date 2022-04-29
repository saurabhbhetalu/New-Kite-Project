package com.kite.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StockListPage 
{
		WebDriver driver;
		
		@FindBy(xpath="//span[text()='HCLTECH']")
		private WebElement hclStock;
		
		@FindBy(xpath="//button[text()='B ']")
		private WebElement buyButton; 
		
		@FindBy(xpath="//button[text()='S ']")
		private WebElement sellButton; 
		
		@FindBy(xpath="//label[text()='Intraday ']")
		private WebElement intradaybutton; 
		
		@FindBy(xpath="(//footer//div//button)[1]")
		private WebElement BUY;
		
		@FindBy(xpath="(//footer//div//button)[1]")
		private WebElement SELL;
		
		@FindBy(xpath="(//footer//div//button)[2]")
		private WebElement CANCEL;
		
		@FindBy(xpath="//h4[text()='Error']")
		private WebElement message;
		
		public StockListPage(WebDriver driver)
		{
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		
		public void HclStock()
		{
			hclStock.click();
		}
		
		public void buyButton()
		{
			buyButton.click();
		}
		
		public void sellButton()
		{
			sellButton.click();
		}
		
		public void intradaybutton()
		{
			intradaybutton.click();
			System.out.println(intradaybutton.isSelected());
		}
		
		public void BUY()
		{
			BUY.click();
		}
		
		public void SELL()
		{
			SELL.click();
		}
		
		public void CANCEL()
		{
			CANCEL.click();
		}
		
		public String message()
		{
			String x = message.getText();
			return x;
		}
		
		
		
		


}
