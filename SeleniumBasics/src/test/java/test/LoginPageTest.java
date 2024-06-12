package test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import automation_core.Base;
import dataprovider.DataProviders;
import utilities.ExcelUtility;

public class LoginPageTest extends Base
{
	@Test
	public void verifyLoginPageTitle() throws IOException
	{
		driver.get("https://demowebshop.tricentis.com/");
		WebElement login=driver.findElement(By.xpath("//a[@class='ico-login']"));
		login.click();
		String actualtitle=driver.getTitle();
		System.out.println("WebPage Title :  "+actualtitle);
		String expectedtitle=ExcelUtility.getStringData(0, 0, "LoginPage");
		Assert.assertEquals(actualtitle, expectedtitle, "Title Mismatch");
	}
	@Test
	public void verifyUserLogin()
	{
		try
		{
		driver.get("https://demowebshop.tricentis.com/");
		WebElement login=driver.findElement(By.xpath("//a[@class='ico-login']"));
		login.click();
		WebElement emailfield=driver.findElement(By.xpath("//input[@id='Email']"));
		System.out.println(emailfield);
		emailfield.sendKeys(ExcelUtility.getStringData(0, 1, "LoginPage"));
		WebElement passwordfield=driver.findElement(By.xpath("//input[@id='Password']"));
		passwordfield.sendKeys(ExcelUtility.getStringData(0, 2, "LoginPage"));
		WebElement loginbutton=driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
		loginbutton.click();
		WebElement actualusername=driver.findElement(By.xpath("//a[text()='nikhitha1992@gmail.com']"));
		String actual=actualusername.getText();
		String expected=ExcelUtility.getStringData(0, 1, "Loginpage");
		Assert.assertEquals(actual, expected, "Invalid");
		}
		catch(Exception e)
		{
			throw new RuntimeException("Excel Sheet not found");
		}
		
	}
	@Test(dataProvider="Invalidusercredentials",dataProviderClass=DataProviders.class)
	public void verifyUserLoginwithInvalidCredentials(String username,String password)
	{
		driver.get("https://demowebshop.tricentis.com/login");
		WebElement emailfield=driver.findElement(By.id("Email"));
		emailfield.sendKeys(username);
				
		WebElement passwordfield=driver.findElement(By.id("Password"));
		passwordfield.sendKeys(password);
		
		WebElement loginbutton=driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
		loginbutton.click();
		WebElement message=driver.findElement(By.xpath("//span[text()='Login was unsuccessful. Please correct the errors and try again.']"));
		String actualmessage=message.getText();
		String expectedmessage=ExcelUtility.getStringData(0, 3, "LoginPage");
		Assert.assertEquals(actualmessage,expectedmessage,"Login was successful" );
	}
	

}
