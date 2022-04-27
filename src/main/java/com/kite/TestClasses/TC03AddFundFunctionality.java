package com.kite.TestClasses;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.kite.POMClasses.HomePage;

public class TC03AddFundFunctionality extends BaseClass
{
	@Test
	
	public void verifyAddFundFunctionality()
	{
		HomePage hp = new HomePage(driver);
		hp.clickfund();
		log.info("click on fund button");
		hp.clickaddfund();
		log.info("click on add fund button");
		
		List<String> str= new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(str.get(1));
		
		String Eurl = "https://cashier.zerodha.com/?type=login";
		String Aurl =driver.getCurrentUrl();
		System.out.println(Aurl);
		
		Assert.assertEquals(Eurl, Aurl);
		
	}

}
