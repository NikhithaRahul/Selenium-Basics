package org.teztGCommands;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

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

}
