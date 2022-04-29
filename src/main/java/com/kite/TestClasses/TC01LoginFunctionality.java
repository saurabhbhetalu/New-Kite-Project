 package com.kite.TestClasses;

import org.testng.Assert;
import org.testng.annotations.Test;


public class TC01LoginFunctionality extends BaseClass
{
		@Test
		public void verifyloginFunctionality() throws InterruptedException
		{
		Thread.sleep(3000);
		
		String actualurl = "https://kite.zerodha.com/dashboard";
		String expectedurl = driver.getCurrentUrl();
		
		Assert.assertEquals(expectedurl, actualurl);
		log.info("test case TX01 is executed");
		
		}

}
