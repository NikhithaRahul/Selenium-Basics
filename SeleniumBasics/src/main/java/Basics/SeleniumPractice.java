package Basics;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

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
	public void verifyMultipleWindowHandles()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://webdriveruniversity.com/");
		driver.manage().window().maximize();
		String title=driver.getTitle();
		System.out.println("Parent Window Title  :  "+ title);
		System.out.println("--------------------------------------------------");
		String parentwindowhandle=driver.getWindowHandle();
		System.out.println("Parent Window HandleID :  "+parentwindowhandle);
		Set<String> multiplehandleid=driver.getWindowHandles();
		System.out.println("Multiple HandleIDs :  "+multiplehandleid);
		WebElement loginportal=driver.findElement(By.xpath("//h1[text()='BUTTON CLICKS']"));
		loginportal.click();
		
		
		driver.close();
	}
	public void verifyDropDown()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		WebElement countryname=driver.findElement(By.xpath("//select[@name='country']"));
		Select select=new Select(countryname);
		select.selectByVisibleText("ANGOLA");
		WebElement country=select.getFirstSelectedOption();
		System.out.println("Selected  Country  :  "+country.getText());
		driver.close();
	}
	public void verifyTotalDropDownValues()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		WebElement countryname=driver.findElement(By.xpath("//select[@name='country']"));
		Select select=new Select(countryname);
		List<WebElement> totalcountry=select.getOptions();
		System.out.println("Total country:  "+totalcountry.size());
		driver.close();
		
	}
	public void verifySimpleAlert()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		WebElement clickherebutton=driver.findElement(By.xpath("//button[@id='alertButton']"));
		clickherebutton.click();
		Alert alert=driver.switchTo().alert();
		String text=alert.getText();
		System.out.println("Text in alert box:  "+text);
		alert.accept();
		driver.close();
		
	}
	public void verifyConfirmationAlert()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		WebElement clickherebutton=driver.findElement(By.xpath("//button[@id='confirmButton']"));
		clickherebutton.click();
		Alert alert=driver.switchTo().alert();
		String alerttext=alert.getText();
		System.out.println("Text in Alert Box :  "+alerttext);
		alert.dismiss();
		WebElement confirmmessage=driver.findElement(By.xpath("//span[@id='confirmResult']"));
		String text=confirmmessage.getText();
		System.out.println("Confirmation Message is :  "+text);
		driver.close();
	}
	public void verifyPromptAlert()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		WebElement clickhere=driver.findElement(By.xpath("//button[@id='promtButton']"));
		clickhere.click();
		Alert alert=driver.switchTo().alert();
		alert.sendKeys("Nikhitha");
		alert.accept();
		driver.close();
	}
	public void verifyRightClickPrgm()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		WebElement rightclickme=driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions actions=new Actions(driver);
		actions.contextClick(rightclickme).build().perform();
		driver.close();
		
	}
	public void verifyDoubleClickPrgm()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		WebElement doubleclick=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		Actions actions=new Actions(driver);
		actions.doubleClick(doubleclick).build().perform();
		Alert alert=driver.switchTo().alert();
		alert.accept();
		driver.close();
	}
	public void verifyDragandDropPrgm()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/droppable");
		driver.manage().window().maximize();
		WebElement dragme=driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement dropme=driver.findElement(By.xpath("//div[@id='droppableExample-tabpane-simple']//div[@class='drop-box ui-droppable']"));
		Actions action=new Actions(driver);
		action.dragAndDrop(dragme, dropme).build().perform();
		driver.close();
	}
	public void verifyNumberofFrames()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();
		List<WebElement> iframeno=driver.findElements(By.tagName("iframe"));
		int number=iframeno.size();
		System.out.println("Number of frames:  "+number);
	}
	public static void main(String[] args) {
		SeleniumPractice obj=new SeleniumPractice();
		//obj.xpathPractice();
		//obj.verifyXpath();
		//obj.verifyRightClick();
		//obj.verifyDoubleClick();
		//obj.verifyDragAndDrop();
		//obj.fileUpload();
		//obj.verifyMultipleWindowHandles();
		//obj.verifyDropDown();
		//obj.verifyTotalDropDownValues();
		//obj.verifySimpleAlert();
		//obj.verifyConfirmationAlert();
		//obj.verifyPromptAlert();
		//obj.verifyRightClickPrgm();
		//obj.verifyDoubleClickPrgm();
		//obj.verifyDragandDropPrgm();
		obj.verifyNumberofFrames();
	}

}
