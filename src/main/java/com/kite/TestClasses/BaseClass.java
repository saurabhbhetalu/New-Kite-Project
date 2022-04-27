package com.kite.TestClasses;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.kite.POMClasses.LoginPage;

public class BaseClass 
{
	WebDriver driver;
	Logger log;
	
	@BeforeMethod
	public void setupmethod() throws InterruptedException
	{	
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--disable-notifications");
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Desktop\\selenium\\chromedriver.exe");
		driver = new ChromeDriver(op);
		
		log = Logger.getLogger("MavenKiteProjectv1");
		PropertyConfigurator.configure("log4j.properties");
		
		log.info("Broswer is open");
		
		driver.get("https://kite.zerodha.com/");
		log.info("02.Enter the Saucedemo Website");
		
		driver.manage().window().maximize();
		log.info("03.Maximize the Browser");
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		LoginPage lp = new LoginPage(driver);
		lp.username();
		log.info("Enter the UserName");
		
		lp.password();
		log.info("Enter the Password");
		
		lp.loginbutton();
		log.info("Click the Login Button");
		
		lp.pin();
		log.info("pin Enter");
		
		lp.pincontinue();
		log.info("click on continue");
	}
	
	
	@AfterMethod
	public void teardownMethod()
	{
		
	driver.quit();
	log.info("closed the Browser");
	}

}
