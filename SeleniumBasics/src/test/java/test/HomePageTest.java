package test;

import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import automation_core.Base;

public class HomePageTest extends Base
{
	@Test
	public void verifyHomePageTitle()
	{
		driver.get("https://demowebshop.tricentis.com/");
		String actualtile=driver.getTitle();
		System.out.println("WebPage Title : "+actualtile);
		String expectedtitle="Demo Web Shop";
		Assert.assertEquals(actualtile, expectedtitle, "Title Mismatch");
	}
	@Test
	public void verifyCommunitySelectionPoll()
	{
		boolean status=false;
		driver.get("https://demowebshop.tricentis.com/");
		List<WebElement> communitypoll=driver.findElements(By.xpath("//input[@type='radio']"));
		int size=communitypoll.size();
		WebElement goodradiobutton=driver.findElement(By.xpath("//input[@id='pollanswers-2']"));
		
		for(int i=0;i<size;i++)
		{
			if(communitypoll.get(i).equals(goodradiobutton))
			{
				goodradiobutton.click();
				status=goodradiobutton.isSelected();
			}
		}
		
		Assert.assertTrue(status,"Radio Button Not Selected");
		
	}
	
	

}
