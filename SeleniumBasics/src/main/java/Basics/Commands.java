package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Commands {
	public void verifySwagLabsLogin()
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		WebElement usernamefield=driver.findElement(By.id("user-name"));
		usernamefield.sendKeys("standard_user");
		WebElement passwordfield=driver.findElement(By.id("password"));
		passwordfield.sendKeys("secret_sauce");
		WebElement loginbutton=driver.findElement(By.id("login-button"));
		loginbutton.click();
		driver.close();
		
	}
	public void demoWebShopLogin()
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		WebElement login=driver.findElement(By.className("ico-login"));
		login.click();
		WebElement emailfield= driver.findElement(By.id("Email"));
		emailfield.sendKeys("nikhitha1992@gmail.com");
		WebElement passwordfield=driver.findElement(By.id("Password"));
		passwordfield.sendKeys("nikhitha1111");
		WebElement loginbutton=driver.findElement(By.className("button-1 login-button"));
		loginbutton.click();
	}
	public static void main(String[] args) {
		Commands obj = new Commands();
		//obj.verifySwagLabsLogin();
		obj.demoWebShopLogin();
	}
	

	}


