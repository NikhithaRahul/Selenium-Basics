package org.teztGCommands;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import utilities.ExcelUtility;

public class SeleniumPractice extends BrowserLaunch{
	@Test
	public void dynamicTable()
	{
		driver.get("https://money.rediff.com/indices/nse");
		WebElement showmore=driver.findElement(By.xpath("//a[@id='showMoreLess']"));
		showmore.click();
		WebElement dynamictable=driver.findElement(By.xpath("//table[@id='dataTable']"));
		WebElement tablerow=driver.findElement(By.xpath("//table[@id='dataTable']/tbody/tr[1]"));
		System.out.println(tablerow.getText());
		List<WebElement> rows=dynamictable.findElements(By.tagName("tr"));
		int rowsize=rows.size();
		for(int i=0;i<rowsize;i++)
		{
			List<WebElement> coloumns=rows.get(i).findElements(By.tagName("td"));
			int coloumnsize=coloumns.size();
			for(int j=0;j<coloumnsize;j++)
			{
				String celltype=coloumns.get(j).getText();
				if(celltype.equals("NIFTY NEXT 50"))
				{
					System.out.println("Previous close value is  "+coloumns.get(1).getText());
				}
			}
		}
	}
	@Test
	public void roleselection() {
		driver.get("https://qalegend.com/billing/public/login");
		WebElement usernamefield=driver.findElement(By.id("username"));
		usernamefield.sendKeys("admin");
		WebElement passwordfield=driver.findElement(By.xpath("//input[@name='password']"));
		passwordfield.sendKeys("123456");
		WebElement loginbutton=driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		loginbutton.click();
		WebElement endtourbutton=driver.findElement(By.xpath("//button[@class='btn btn-default btn-sm']"));
		endtourbutton.click();
	
		WebElement usermanagement=driver.findElement(By.xpath("//span[text()='User Management']"));
		List<WebElement> list =driver.findElements(By.xpath("(//span)[7]"));
		System.out.println(list.size());
		usermanagement.click();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement users=driver.findElement(By.xpath("(//span)[8]"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span)[8]")));
		users.click();
		
	}
		
}
