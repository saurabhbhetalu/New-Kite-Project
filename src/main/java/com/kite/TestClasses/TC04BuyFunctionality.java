package com.kite.TestClasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.kite.POMClasses.StockListPage;

public class TC04BuyFunctionality extends BaseClass
{
	@Test
	public void verifyBuyFunctionality() throws InterruptedException
	{
		StockListPage st =  new StockListPage(driver);
		
		st.HclStock();
		log.info("click on hcl stock");
		
		st.buyButton();
		log.info("click on buy  Button");
		
		st.BUY();
		log.info("click on BUY");
		
		
//		st.intradaybutton();
//		Thread.sleep(3000);
		
		
		
		String E = "Error";
		String A = st.message();
		
		Assert.assertEquals(E, A);
	}

}
