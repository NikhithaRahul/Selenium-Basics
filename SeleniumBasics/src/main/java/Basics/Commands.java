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
		WebElement loginbutton=driver.findElement(By.className("login-button"));
		loginbutton.click();
	}
	public void verifylinkText()
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/index.php");
		driver.manage().window().maximize();
		WebElement linktextdemo=driver.findElement(By.linkText("your destination"));
		linktextdemo.click();
	}
	public void verifyPartialLinkText()
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/index.php");
		driver.manage().window().maximize();
		WebElement partial=driver.findElement(By.partialLinkText("destination"));
		partial.click();
		driver.close();
	}
	public void verifyDemoTourRegistration()
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		WebElement firstname= driver.findElement(By.name("firstName"));
		firstname.sendKeys("Nikhitha");
		WebElement lastname=driver.findElement(By.name("lastName"));
		lastname.sendKeys("S");
		WebElement phone=driver.findElement(By.name("phone"));
		phone.sendKeys("7558034303");
		WebElement email=driver.findElement(By.id("userName"));
		email.sendKeys("nikhithasdharan@gmail.com");
		WebElement address=driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[7]/td[2]/input"));
		address.sendKeys("Mukkadayil Veedu");
		WebElement city=driver.findElement(By.cssSelector("body > div:nth-child(5) > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(5) > td > form > table > tbody > tr:nth-child(8) > td:nth-child(2) > input"));
		city.sendKeys("Kadakkal");
		WebElement state=driver.findElement(By.name("state"));
		state.sendKeys("Kerala");
		WebElement postalcode=driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[10]/td[2]/input"));
		postalcode.sendKeys("691536");
		WebElement username=driver.findElement(By.id("email"));
		username.sendKeys("NikhithaRahul");
		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys("12345");
		WebElement confirmpassword=driver.findElement(By.cssSelector("body > div:nth-child(5) > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(5) > td > form > table > tbody > tr:nth-child(15) > td:nth-child(2) > input[type=password]"));
		confirmpassword.sendKeys("12345");
		WebElement submitbutton=driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[17]/td/input"));
		submitbutton.click();
		driver.close();
		
		
	}
	public void demoWebShopLoginXpath()
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		WebElement login=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a"));
		login.click();
		WebElement emailfield= driver.findElement(By.xpath("//*[@id=\"Email\"]"));
		emailfield.sendKeys("nikhitha1992@gmail.com");
		WebElement passwordfield=driver.findElement(By.xpath("//*[@id=\"Password\"]"));
		passwordfield.sendKeys("nikhitha1111");
		WebElement loginbutton=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input"));
		loginbutton.click();
		driver.close();
	}
	public void demoWebShopLogincssSelector()
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		WebElement login=driver.findElement(By.cssSelector("body > div.master-wrapper-page > div.master-wrapper-content > div.header > div.header-links-wrapper > div.header-links > ul > li:nth-child(2) > a"));
		login.click();
		WebElement emailfield= driver.findElement(By.cssSelector("#Email"));
		emailfield.sendKeys("nikhitha1992@gmail.com");
		WebElement passwordfield=driver.findElement(By.cssSelector("#Password"));
		passwordfield.sendKeys("nikhitha1111");
		WebElement loginbutton=driver.findElement(By.cssSelector("body > div.master-wrapper-page > div.master-wrapper-content > div.master-wrapper-main > div.center-2 > div > div.page-body > div.customer-blocks > div.returning-wrapper > div.form-fields > form > div.buttons > input"));
		loginbutton.click();
		driver.close();
	}
	public static void main(String[] args) {
		Commands obj = new Commands();
		//obj.verifySwagLabsLogin();
		//obj.demoWebShopLogin();
		//obj.verifylinkText();
		//obj.verifyPartialLinkText();
		//obj.verifyDemoTourRegistration();
		//obj.demoWebShopLoginXpath();
		obj.demoWebShopLogincssSelector();
	

	}

}

