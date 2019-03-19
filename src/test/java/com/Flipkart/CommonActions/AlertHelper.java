package com.Flipkart.CommonActions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public class AlertHelper {
	WebDriver driver;
	Alert alert = driver.switchTo().alert();
	public AlertHelper(WebDriver driver)
	{
		this.driver=driver;
	}
	public void alertAccept()
	{
	 
	 alert.accept();
	}
   public void alertDismiss()
   {
	   alert.dismiss();
   }
}
