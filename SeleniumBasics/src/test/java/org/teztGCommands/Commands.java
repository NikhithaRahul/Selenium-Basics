package org.teztGCommands;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
	@Test
	public void verifyJavaScriptExecutorSendKeysClick()
	{
		driver.get("https://demowebshop.tricentis.com/");
		JavascriptExecutor js=(JavascriptExecutor)driver;  //for creating reference of javascriptexecutor
		js.executeScript("document.getElementById(\"newsletter-email\").value='nikhitha@gmail.com'");  // for Sendkeys
		js.executeScript("document.getElementById(\"newsletter-subscribe-button\").click()");
	}
	@Test
	public void verifyJavaScriptVerticalScroll()
	{
		driver.get("https://demowebshop.tricentis.com/login");
		JavascriptExecutor js=(JavascriptExecutor)driver;		//for creating reference of javascriptexecutor
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");			// For Scroll
	}
	@Test
	public void verifyKeyBoardEvents() throws AWTException
	{
		driver.get("https://demowebshop.tricentis.com/login");
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_T);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_T);
		
	}
	@Test
	public void verifyJavaScriptDemoWebShopLogin()
	{
		driver.get("https://demowebshop.tricentis.com/");
		WebElement login=driver.findElement(By.xpath("//a[@class='ico-login']"));
		login.click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.getElementById(\"Email\").value='nikhitha1992@gmail.com'");
		js.executeScript("document.getElementById(\"Password\").value='nikhitha1111'");
		
		WebElement loginbutton=driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
		loginbutton.click();
				
	}
	@Test

	public void verifyJavaScriptScrollAlerts()
	{
		driver.get("https://demoqa.com/alerts");
		JavascriptExecutor js=(JavascriptExecutor)driver;	
		js.executeScript("window.scrollTo(0,500)");
		js.executeScript("document.getElementById(\"promtButton\").click()");
		Alert alert=driver.switchTo().alert();
		alert.sendKeys("Nikhitha");
		alert.accept();
		WebElement resulttext=driver.findElement(By.xpath("//span[@id='promptResult']"));
		String text=resulttext.getText();
		System.out.println("After clicking ok button text message :   "+text);
		
	}
}
