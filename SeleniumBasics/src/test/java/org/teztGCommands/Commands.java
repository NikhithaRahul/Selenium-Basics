package org.teztGCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Commands extends BrowserLaunch
{
	@Test
	public void verifyHomePageTitle()
	{
		driver.get("https://demowebshop.tricentis.com/");
		String actualtitle=driver.getTitle();
		System.out.println("Webpage Title :  "+actualtitle);
		String expectedtitle="Demo WebShop";
		Assert.assertEquals(actualtitle, expectedtitle,"Title Mismatch");
	}
	@Test
	public void verifyDemoWebShopLogin()
	{
		driver.get("https://demowebshop.tricentis.com/login");
		WebElement emailfield=driver.findElement(By.xpath("//input[@id='Email']"));
		emailfield.sendKeys("nikhitha1992@gmail.com");
		WebElement passwordfield=driver.findElement(By.xpath("//input[@id='Password']"));
		passwordfield.sendKeys("nikhitha1111");
		WebElement loginbutton=driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
		loginbutton.click();
		WebElement actualusername=driver.findElement(By.xpath("//a[text()='nikhitha1992@gmail.com']"));
		String actual=actualusername.getText();
		String expectedusername="nikhitha1992@gmail.com";
		Assert.assertEquals(expectedusername, actual,"Invalid");
		
	}
	@Test
	public void verifyGenderRadioButtonIsSelected()
	{
		driver.get("https://demowebshop.tricentis.com/register");
		WebElement malebutton=driver.findElement(By.xpath("//input[@id='gender-male']"));
		boolean malebuttonstatus=malebutton.isSelected();
		Assert.assertFalse(malebuttonstatus, "Gender Field Selected");
		WebElement maleradiobutton=driver.findElement(By.xpath("//input[@id='gender-male']"));
		maleradiobutton.click();
		boolean status=maleradiobutton.isSelected();
		Assert.assertTrue(status, "Gender Field not Selected");
		
				
	}
	@Test
	public void verifySwagLab()
	{
		driver.get("https://www.saucedemo.com/");
		WebElement usernamefield=driver.findElement(By.xpath("//input[@id='user-name']"));
		usernamefield.sendKeys("standard_user");
		WebElement passwordfield=driver.findElement(By.xpath("//input[@id='password']"));
		passwordfield.sendKeys("secret_sauce");
		WebElement loginbutton=driver.findElement(By.xpath("//input[@id='login-button']"));
		loginbutton.click();
		WebElement swaglablogo=driver.findElement(By.xpath("//div[@class='app_logo']"));
		String actuallogotext=swaglablogo.getText();
		String expectedlogotext="Swag Labs";
		Assert.assertEquals(actuallogotext, expectedlogotext,"Logo Mismatch");
	}
	@Test
	public void verifyDemoWebShopIsEnabled()
	{
		driver.get("https://demowebshop.tricentis.com/");
		WebElement subscribebutton=driver.findElement(By.xpath("//input[@id='newsletter-subscribe-button']"));
		boolean subscribe=subscribebutton.isEnabled();
		Assert.assertTrue(subscribe, "Subscribe Button not Enabled");
				
	}
	@Test
	public void verifyDemoWebShopIsDisplayed()
	{
		driver.get("https://demowebshop.tricentis.com/");
		WebElement votebutton=driver.findElement(By.xpath("//input[@id='vote-poll-1']"));
		boolean vote=votebutton.isDisplayed();
		Assert.assertTrue(vote, "VoteButton not Displayed");
		
	}
}
