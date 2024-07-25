package test;

import java.io.IOException;
import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import automation_core.Base;
import listners.RetryAnalyser;
import utilities.ExcelUtility;

public class HomePageTest extends Base
{
	@Test(groups="Sanity",retryAnalyzer=RetryAnalyser.class)
	public void verifyHomePageTitle() throws IOException
	{
		driver.get("https://demowebshop.tricentis.com/");
		String actualtile=driver.getTitle();
		System.out.println("WebPage Title : "+actualtile);
		String expectedtitle=ExcelUtility.getStringData(0, 0, "HomePage");
		Assert.assertEquals(actualtile, expectedtitle, "Title Mismatch");
	}
	@Test(groups="Regression",retryAnalyzer=RetryAnalyser.class)
	public void verifyCommunitySelectionPoll()   // failed testcase
	{
			
		driver.get("https://demowebshop.tricentis.com/");
		List<WebElement> communitypoll=driver.findElements(By.xpath("//li[@class='answer']"));
		int size=communitypoll.size();
		WebElement goodradiobutton=driver.findElement(By.xpath("//input[@id='pollanswers-2']"));
		
		for(int i=0;i<size;i++)
		{					
			String value=communitypoll.get(i).getText();
			System.out.println(value);
			if(value.equals("Good"))
			{				
				communitypoll.get(i).click();
				
			}
			
		}
		boolean status=goodradiobutton.isSelected();
		 
		Assert.assertTrue(status,"Radio Button Not Selected");
		
	}
	
	

}
