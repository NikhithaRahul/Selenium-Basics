package Basics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumPractice {
	
	public void xpathPractice()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		//WebElement firstnamefield=driver.findElement(By.xpath("//input[@name='firstName']"));
		//firstnamefield.sendKeys("Rahul");
		//WebElement firstnamefield=driver.findElement(By.xpath("//input[contains(@name,'firstName')]"));
		//firstnamefield.sendKeys("Rahul");
		
		driver.close();
		
	}
	public void verifyXpath()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/selenium-xpath.html");
		driver.manage().window().maximize();
		//WebElement userid=driver.findElement(By.xpath("//td[text()='UserID']")); //xpath using text
		//WebElement userid=driver.findElement(By.xpath("//input[starts-with(@name,'ui')]"));     // xpath using starts-with
		//userid.sendKeys("Nikh");
		//WebElement password=driver.findElement(By.xpath("//input[@type='password'and@name='password']")); // xpath using and
		//password.sendKeys("123");
		//WebElement userid=driver.findElement(By.xpath("//input[@type='text'or@name='uid']"));// xpath using or
		//userid.sendKeys("Nikhitha");
		//WebElement userid=driver.findElement(By.xpath("//form[@name='frmLogin']//input[@name='uid']"));// xpath from parent to child
		//userid.sendKeys("Nikhitha");
	}
	public void verifyRightClick()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		WebElement register=driver.findElement(By.cssSelector(".ico-register"));
		Actions actions=new Actions(driver);
		actions.contextClick(register).build().perform();
		driver.close();
		
	}
	public void verifyDoubleClick()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		WebElement doubleclick=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		Actions actions=new Actions(driver);
		actions.doubleClick(doubleclick).build().perform();
		Alert alert=driver.switchTo().alert();
		String str=alert.getText();
		System.out.println("Text message in alert box:  "+str);
		alert.accept();
		driver.close();
	}
	public void verifyDragAndDrop()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/droppable");
		driver.manage().window().maximize();
		WebElement dragme=driver.findElement(By.cssSelector("div#draggable"));
		WebElement dropme=driver.findElement(By.cssSelector("div#droppable"));
		Actions actions=new Actions(driver);
		actions.dragAndDrop(dragme, dropme);
	}
	public void fileUpload()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/upload/");
		driver.manage().window().maximize();
		
		WebElement choosefilebutton=driver.findElement(By.cssSelector("input#uploadfile_0"));
		choosefilebutton.sendKeys("C:\\Users\\DELL\\git\\Selenium-Basics\\SeleniumBasics\\src\\main\\resources\\level 2.docx");
		WebElement checkbox=driver.findElement(By.cssSelector("input#terms"));
		checkbox.click();
		WebElement submitbutton=driver.findElement(By.cssSelector("button#submitbutton"));
		submitbutton.click();
		driver.close();
	}
	public static void main(String[] args) {
		SeleniumPractice obj=new SeleniumPractice();
		//obj.xpathPractice();
		//obj.verifyXpath();
		//obj.verifyRightClick();
		//obj.verifyDoubleClick();
		//obj.verifyDragAndDrop();
		obj.fileUpload();
	}

}
