package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import automation_core.Base;

public class RegisterPagetest extends Base
{
	@Test
	public void verifyRegisterPageTitle()
	{
		driver.get("https://demowebshop.tricentis.com/");
		WebElement register=driver.findElement(By.xpath("//a[@class='ico-register']"));
		register.click();
		String actualtitle=driver.getTitle();
		System.out.println("WebPage Title : "+actualtitle);
		String expectedtitle="Demo Web Shop. Register";
		Assert.assertEquals(actualtitle, expectedtitle, "Title Mismatch");
		
	}
	@Test
	public void verifyUserRegistration()
	{
		driver.get("https://demowebshop.tricentis.com/");
		WebElement register=driver.findElement(By.xpath("//a[@class='ico-register']"));
		register.click();
		WebElement genderradiobutton=driver.findElement(By.xpath("//input[@id='gender-female']"));
		genderradiobutton.click();
		WebElement firstnamefield=driver.findElement(By.id("FirstName"));
		firstnamefield.sendKeys("Niveditha");
		WebElement lastnamefield=driver.findElement(By.id("LastName"));
		lastnamefield.sendKeys("Sujith");
		WebElement emailfield=driver.findElement(By.id("Email"));
		emailfield.sendKeys("niveditha00@gmail.com");
		WebElement passwordfield=driver.findElement(By.id("Password"));
		passwordfield.sendKeys("niveditha123");
		WebElement confirmpassword=driver.findElement(By.id("ConfirmPassword"));
		confirmpassword.sendKeys("niveditha123");
		WebElement registerbutton=driver.findElement(By.xpath("//input[@id='register-button']"));
		registerbutton.click();
		WebElement actualemail=driver.findElement(By.xpath("//div[@class='header-links']//a[@class='account']"));
		String actual=actualemail.getText();
		String expectedemail="niveditha00@gmail.com";
		Assert.assertEquals(actual, expectedemail, "Registration failed");
	//	WebElement message=driver.findElement(By.xpath("//div[@class='page-title']//div[@class='result']"));
	//	String actualmessage=message.getText();
	//	System.out.println(actualmessage);
	}

}
