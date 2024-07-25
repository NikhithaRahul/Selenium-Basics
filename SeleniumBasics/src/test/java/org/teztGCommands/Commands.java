package org.teztGCommands;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
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
		String expectedlogotext="SwaLabs";
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
	@Test
	public void verifydynamicWebTable()
	{
		driver.get("https://money.rediff.com/indices/nse");
		WebElement showmore=driver.findElement(By.xpath("//a[@id='showMoreLess']"));
		showmore.click();
		//This line locates the table with the ID dataTable and assigns it to the dynamic table variable.
		WebElement dynamictable=driver.findElement(By.xpath("//table[@id='dataTable']"));
		//System.out.println(dynamictable.getText());
		WebElement tablerow=driver.findElement(By.xpath("//table[@id='dataTable']/tbody/tr[1]"));//This finds the first row of the table and prints its text content to the console.
		System.out.println(tablerow.getText());
		//retrieves all the rows in the table and stores them in a list called rows. It also stores the number of rows in rowsize.
		List<WebElement> rows=dynamictable.findElements(By.tagName("tr"));
		int rowsize=rows.size();
		//This loop iterates over each row. For each row, it finds all the cells (td elements) and stores them in a list called coloumn. It also stores the number of cells in coloumnsize.
		for(int i=0;i<rowsize;i++)
		{
			List<WebElement> coloumn=rows.get(i).findElements(By.tagName("td")); 
			int coloumnsize=coloumn.size();
			for(int j=0;j<coloumnsize;j++)
			{
				String celltype=coloumn.get(j).getText();
				if(celltype.equals("NIFTY NEXT 50"))
				{
					System.out.println("Previous close value is  "+coloumn.get(1).getText());
				}
			}
		}
		
	}
	@Test
	public void verifyWaits()
	{
		driver.get("https://demoqa.com/alerts");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  //  implicit wait
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10)); 
		// explicit wait
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		WebElement clickmebutton=driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("timerAlertButton")));
		clickmebutton.click();
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert=driver.switchTo().alert();
	    alert.accept();	
	}
	@Test
	public void verifyFleuntWait()
	{
		driver.get("https://demoqa.com/alerts");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		WebElement clickmebutton=driver.findElement(By.id("timerAlertButton"));
		FluentWait wait=new FluentWait(driver);
		wait.withTimeout(Duration.ofSeconds(10));
		wait.pollingEvery(Duration.ofSeconds(2));
		wait.ignoring(NoSuchElementException.class);
		clickmebutton.click();
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert=driver.switchTo().alert();
		alert.accept();			
	}
}
