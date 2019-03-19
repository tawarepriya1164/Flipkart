package com.Flipkart.CommonActions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CommonActions {
	WebDriver driver;
	public CommonActions(WebDriver driver)
	{
		this.driver=driver;
	}
	public void enterText(WebElement ele,String Value)
	{
		if(Value!=null)
			ele.sendKeys(Value);
	}
	public void ClickOnSearch(WebElement ele)
	{
		ele.click();
	}
	/*public ArrayList<String> getAllData(List<WebElement> locator)
	{
		ArrayList<String> data=new ArrayList<>();
		for (WebElement ele : locator) {
			data.add(ele.getAttribute("titles"));

		}
		return data;
	}*/

}
