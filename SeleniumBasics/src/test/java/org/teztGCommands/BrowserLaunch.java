package org.teztGCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BrowserLaunch 
{
	WebDriver driver;				// instance variable
		public void initialiseBrowser(String browser)
	{
		if(browser.equals("Chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browser.equals("Firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if(browser.equals("Edge"))
		{
			driver=new EdgeDriver();
		}
		else
		{
			throw new RuntimeException("INVALID BROWSER");
		}
		driver.manage().window().maximize();
		
	}
	@BeforeMethod
	public void setUp()
	{
		initialiseBrowser("Chrome");
  	}
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}
	

}
