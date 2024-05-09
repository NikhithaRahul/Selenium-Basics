package Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeNavigation {

	public static void main(String[] args) {
		WebDriver driver= new EdgeDriver();
		driver.get("https://www.seleniumeasy.com/");
		driver.manage().window().maximize();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().to("https://www.selenium.dev/");
		driver.close();


	}

}
