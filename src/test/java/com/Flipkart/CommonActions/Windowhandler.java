package com.Flipkart.CommonActions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Windowhandler {
	WebDriver  driver;
	public Windowhandler(WebDriver driver)
	{
		this.driver=driver;
	}
   public void HandleWindowOperation(WebElement ele)
   {
	   Set<String> handles = driver.getWindowHandles(); 
	   Iterator<String> iterator = handles.iterator();
	   String parentWindowHandler = driver.getWindowHandle(); 
	   String subWindowHandler = null;
	   while (iterator.hasNext()){
		    subWindowHandler = iterator.next();
		}
		driver.switchTo().window(subWindowHandler);
   }
  
}
