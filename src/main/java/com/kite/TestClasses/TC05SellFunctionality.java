package com.kite.TestClasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.kite.POMClasses.StockListPage;

public class TC05SellFunctionality extends BaseClass
{
	@Test
	public void VerifySellFunctionality()
	{
		StockListPage st = new StockListPage(driver);
		st.HclStock();
		log.info("click on hcl stock");
		
		st.sellButton();
		log.info("click on sell hcl stock");
		
		st.SELL();
		log.info("click on sell button");
		
		String E = "Error";
		String A = st.message();
		
		Assert.assertEquals(A, E);
	}

}
