package com.Flipkart.Actions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.Flipkart.CommonActions.CommonActions;
import com.Flipkart.CommonActions.Windowhandler;
import com.Flipkart.Locators.FlipkartLocators;
import com.Flipkart.TestBase.TestBase;

public class FlipkartActions extends TestBase {
	WebDriver driver;
	FlipkartLocators fliploc;
	CommonActions commonActions;
	Windowhandler windowHandler;
	public FlipkartActions(WebDriver driver)
	{
		commonActions = new CommonActions(driver);
		fliploc = new FlipkartLocators(driver);
		this.driver = driver;
	}
	public void SearchInput(String mobile,String password, String Selenium) throws Exception
	{
		//commonActions.ClickOnSearch(fliploc.getClosebutton);
		commonActions.enterText(fliploc.getMobileNumber, mobile);
		commonActions.ClickOnSearch(fliploc.getContinue);
		commonActions.enterText(fliploc.getPassword, password);
		commonActions.ClickOnSearch(fliploc.getLogin);
		commonActions.enterText(fliploc.getSearchBox, Selenium);
		commonActions.ClickOnSearch(fliploc.getSearchSubmitButton);
		commonActions.ClickOnSearch(fliploc.getFirstBook);
		
		
	}
	/*public void getAllProductName()
	{
		ArrayList<String> data=new ArrayList<>();
		for (WebElement ele : fliploc.getProductNameInList) {
			data.add(ele.getAttribute("title"));
			System.out.println(ele.getAttribute("title"));

		}	
			
	}*/
	public void HandleWindowOperation() throws InterruptedException
	   {
		   Set<String> handles = driver.getWindowHandles(); 
		   Iterator<String> iterator = handles.iterator();
		   String parentWindowHandler = driver.getWindowHandle(); 
		   String subWindowHandler = null;
		   while (iterator.hasNext()){
			    subWindowHandler = iterator.next();
			}
			driver.switchTo().window(subWindowHandler);
			commonActions.ClickOnSearch(fliploc.getAddToCart);
			driver.close();
			driver.switchTo().window(parentWindowHandler);
			driver.navigate().refresh();
	   }
	public void logout()
	{
		Actions action = new Actions(driver);
		action.moveToElement(fliploc.getmyAccountLink).build().perform();
		//commonActions.ClickOnSearch(fliploc.getmyAccountLink);
		//action.moveToElement(fliploc.getLogout).build().perform();
		action.click(fliploc.getLogout).build().perform();
	}
	
	

}
