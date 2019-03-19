package com.Flipkart.Test;

import org.testng.annotations.Test;

import com.Flipkart.Actions.FlipkartActions;
import com.Flipkart.TestBase.TestBase;

public class SearchAndAddToBagScript extends TestBase{
	
	@Test
	public void TC_01() throws Exception
	{
		FlipkartActions flipActions = new FlipkartActions(driver);
		flipActions.SearchInput("Selenium");
		//flipActions.getAllProductName();
		flipActions.HandleWindowOperation();
	}
}