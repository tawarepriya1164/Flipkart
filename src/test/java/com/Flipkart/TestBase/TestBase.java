package com.Flipkart.TestBase;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class TestBase {
	public WebDriver driver;
	public Properties prop = new Properties();
	
	@BeforeClass
	@Parameters("browser")
	public void initialization(String browser) throws IOException
	{
		loadPropertiesFile();
		broweserSelection(browser);
		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
	}
	public void broweserSelection(String browser)
	{
		if(browser.contains("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\test\\java\\com\\Flipkart\\browsers\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
		}
		else if(browser.contains("firefox"))
		{
			System.setProperty("Webdriver.gecko.driver", System.getProperty("user.dir")+"\\src\\test\\java\\com\\Flipkart\\browsers\\geckodriver.exe");
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
		}

	}
	
	public void loadPropertiesFile() throws IOException
	{
		File file=new File(System.getProperty("user.dir")+"\\src\\test\\java\\com\\Flipkart\\config.properties\\config.properties");
		FileInputStream fis = new FileInputStream(file);
		prop.load(fis);
	}
	/*@AfterClass
	public void tearDown()
	{
	
		driver.quit();
	}*/

}
