package com.kite.TestClasses;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.kite.POMClasses.HomePage;

public class TC02Logoutfunctionality extends BaseClass 
{
	@Test
	public void verifyLogoutFunctionlity()
	{
		
		HomePage hp = new HomePage(driver);
		hp.clickEP8702();
		hp.clicklogout();
		
		String expectedurl="https://kite.zerodha.com/#loggedout";
		String actualurl =driver.getCurrentUrl();
		Assert.assertEquals(actualurl, expectedurl);
				
	}
	

}
