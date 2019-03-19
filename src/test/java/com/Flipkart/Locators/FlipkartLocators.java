package com.Flipkart.Locators;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Flipkart.TestBase.TestBase;

public class FlipkartLocators extends TestBase{
	public FlipkartLocators(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@type='text']") public WebElement getSearchBox; 
	@FindBy(xpath ="//button[@type='submit']") public WebElement getSearchSubmitButton;
	@FindBy(xpath = "//div[@class ='_3O0U0u' ]") public WebElement getAlllist;
	@FindBy(xpath = "//button[@class = '_2AkmmA _29YdH8']") public WebElement getClosebutton;
    @FindBy(xpath="//div[@class='_3O0U0u']//a[2]") public List<WebElement> getProductNameInList;
    @FindBy(xpath="//a[@class='_2cLu-l' and @title='Mastering Selenium WebDriver 3.0']") public WebElement getFirstBook;
    @FindBy(xpath="//button[@class='_2AkmmA _2Npkh4 _2MWPVK']") public WebElement getAddToCart;
}
