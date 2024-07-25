package test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import automation_core.Base;
import utilities.ExcelUtility;
import utilities.RandomDataUtility;

public class RegisterPagetest extends Base
{
	/*(@Test
	public void verifyRegisterPageTitle() throws IOException
	{
		driver.get("https://demowebshop.tricentis.com/");
		WebElement register=driver.findElement(By.xpath("//a[@class='ico-register']"));
		register.click();
		String actualtitle=driver.getTitle();
		System.out.println("WebPage Title : "+actualtitle);
		String expectedtitle=ExcelUtility.getStringData(1, 0, "RegisterPage");
		
		Assert.assertEquals(actualtitle, expectedtitle, "Title Mismatch");
		
	}*/
	@Test
	public void verifyUserRegistration() throws IOException
	{
		driver.get("https://demowebshop.tricentis.com/");
		String firstname=RandomDataUtility.getFirstName();
		String lastname=RandomDataUtility.getLastName();
		String emailid=firstname+"."+lastname+"@gmail.com";
		String password=firstname+"."+lastname;
		WebElement register=driver.findElement(By.xpath("//a[@class='ico-register']"));
		register.click();
		
		WebElement genderradiobutton=driver.findElement(By.xpath("//input[@id='gender-male']"));
		genderradiobutton.click();
		WebElement firstnamefield=driver.findElement(By.id("FirstName"));
		firstnamefield.sendKeys(firstname);
		WebElement lastnamefield=driver.findElement(By.id("LastName"));
		lastnamefield.sendKeys(lastname);
		WebElement emailfield=driver.findElement(By.id("Email"));
		emailfield.sendKeys(emailid);
		WebElement passwordfield=driver.findElement(By.id("Password"));
		passwordfield.sendKeys(password);
		WebElement confirmpassword=driver.findElement(By.id("ConfirmPassword"));
		confirmpassword.sendKeys(password);
		
		WebElement registerbutton=driver.findElement(By.xpath("//input[@id='register-button']"));
		registerbutton.click();
		WebElement actualemail=driver.findElement(By.xpath("//div[@class='header-links']//a[@class='account']"));
		String actual=actualemail.getText();
		String expectedemail=emailid;
		Assert.assertEquals(actual, expectedemail, "Registration failed");
	
	}

}
