package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import automation_core.Base;

public class LoginPageTest extends Base
{
	@Test
	public void verifyLoginPageTitle()
	{
		driver.get("https://demowebshop.tricentis.com/");
		WebElement login=driver.findElement(By.xpath("//a[@class='ico-login']"));
		login.click();
		String actualtitle=driver.getTitle();
		System.out.println("WebPage Title :  "+actualtitle);
		String expectedtitle="Demo Web Shop. Login";
		Assert.assertEquals(actualtitle, expectedtitle, "Title Mismatch");
	}
	@Test
	public void verifyUserLogin()
	{
		driver.get("https://demowebshop.tricentis.com/");
		WebElement login=driver.findElement(By.xpath("//a[@class='ico-login']"));
		login.click();
		WebElement emailfield=driver.findElement(By.xpath("//input[@id='Email']"));
		System.out.println(emailfield);
		emailfield.sendKeys("nikhitha1992@gmail.com");
		WebElement passwordfield=driver.findElement(By.xpath("//input[@id='Password']"));
		passwordfield.sendKeys("nikhitha1111");
		WebElement loginbutton=driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
		loginbutton.click();
		WebElement actualusername=driver.findElement(By.xpath("//a[text()='nikhitha1992@gmail.com']"));
		String actual=actualusername.getText();
		String expected="nikhitha1992@gmail.com";
		Assert.assertEquals(actual, expected, "Invalid");
		
	}
	public void verifyUserLoginwithInvalidCredentials()
	{
		
	}
	

}
