package Basics;

import java.awt.Desktop.Action;
import java.util.Iterator;
import java.util.List;
import java.util.Set;



import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

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
	public void verifyisSelected()
	{
		boolean isbuttonselected;
		WebDriver driver= new ChromeDriver();
		driver.get("https:https://demowebshop.tricentis.com/register");
		driver.manage().window().maximize();
		WebElement radiobuttonfemale=driver.findElement(By.xpath("//input[@id='gender-female'"));
		isbuttonselected=radiobuttonfemale.isSelected();
		System.out.println(" female element before selected : "+isbuttonselected);
		radiobuttonfemale.click();
		isbuttonselected=radiobuttonfemale.isSelected();
		System.out.println("Female element after selected :  "+isbuttonselected);
		driver.close();
				
		
	}
	public void verifyisEnabled()
	{
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		WebElement subscribe=driver.findElement(By.id("newsletter-subscribe-button"));
		subscribe.click();
		boolean issubscribe=subscribe.isEnabled();
		System.out.println(" Button is enabled  "+issubscribe);
		driver.close();
		
	}
	public void verifyisDisplayed()
	{
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		WebElement vote=driver.findElement(By.id("vote-poll-1"));
		vote.click();
		boolean isdisplayed=vote.isDisplayed();
		System.out.println("Button is Displayed  "+isdisplayed);
		driver.close();
		
	}
	public void verifyValuesFromDropDown()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		WebElement countrylist=driver.findElement(By.xpath("//select[@name='country']"));
		Select select=new Select(countrylist);
		//select.selectByVisibleText("ANDORRA");        // select element using visible text
		select.selectByIndex(1);						//select element using index position
		//select.selectByValue("AZERBAIJAN");			//select element using text value
		WebElement getCountryName=select.getFirstSelectedOption();
		System.out.println(getCountryName.getText());			// to print selected element in sonsole
		
		driver.close();
		
	}
	public void getTotalDropDownValues()
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		WebElement countryList=driver.findElement(By.xpath("//select[@name='country']"));
		Select select=new Select(countryList);
		List<WebElement> dropdownlist=select.getOptions();
		System.out.println("Total number of values in drop down list :  "+dropdownlist.size());
		driver.close();
	}
	public void verifySingleInputField()
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https:/https/selenium.qabible.in/simple-form-demo.php");
		driver.manage().window().maximize();
		
		WebElement enterMessageField=driver.findElement(By.xpath("//input[@id='single-input-field']"));
		enterMessageField.sendKeys("SINGLE INPUT FIELD MESSAGE");
		WebElement showMessageButton=driver.findElement(By.xpath("//button[@id='button-one']"));
		showMessageButton.click();
		
		driver.close();
	}
	public void verifyTwoInputFields()
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://selenium.qabible.in/simple-form-demo.php");
		driver.manage().window().maximize();
		
		WebElement enterValueAField=driver.findElement(By.xpath("//input[@id='value-a']"));
		enterValueAField.sendKeys("10");
		WebElement enterValueBField=driver.findElement(By.xpath("//input[@id='value-b']"));
		enterValueBField.sendKeys("20");
		
		WebElement getTotalButton=driver.findElement(By.xpath("//button[@id='button-two']"));
		getTotalButton.click();
		
		WebElement viewTotalField=driver.findElement(By.xpath("//div[@id='message-two']"));
		String st=viewTotalField.getText();
		System.out.println(st);
		
		driver.close();
		
	}
	public void verifyCheckBoxDemo()
	{
		boolean cb;
		WebDriver driver= new ChromeDriver();
		driver.get("https://selenium.qabible.in/check-box-demo.php");
		driver.manage().window().maximize();
		
		WebElement checkbox=driver.findElement(By.xpath("//input[@id='gridCheck']"));
		cb=checkbox.isSelected();
		System.out.println(" CHECK BOX SELECTION STATUS BEFORE SELECTED :  "+cb);
		checkbox.click();
		cb=checkbox.isSelected();
		System.out.println(" CHECK BOX SELECTION STATUS AFTER SELECTED :  "+cb);
		
		WebElement showcheck=driver.findElement(By.xpath("//div[@id='message-one']"));
		String str=showcheck.getText();
		System.out.println("Check Box Selection Status:  "+str);
		
		driver.close();
	}
	public void verifyRadioButtonDemo()
	{
		boolean rb;
		WebDriver driver= new ChromeDriver();
		driver.get("https://selenium.qabible.in/radio-button-demo.php");
		driver.manage().window().maximize();
		
		WebElement radiobutton=driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
		rb=radiobutton.isSelected();
		System.out.println("RADIO BUTTON SELECTION STATUS BEFORE SELECTED :  "+rb);
		radiobutton.click();
		rb=radiobutton.isSelected();
		System.out.println("RADIO BUTTON SELECTION STATUS AFTER SELECTED:  "+rb);
		
		WebElement showselectedvaluebutton=driver.findElement(By.xpath("//button[@id='button-one']"));
		showselectedvaluebutton.click();
		
		WebElement radiotext=driver.findElement(By.xpath("//div[@id='message-one']"));
		String str=radiotext.getText();
		System.out.println(str);
		
		driver.close();
	}
	
	public void verifyColorDropDown()
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://selenium.qabible.in/select-input.php");
		driver.manage().window().maximize();
		
	    WebElement selectcolorfield=driver.findElement(By.xpath("//select[@id='single-input-field']"));
	    Select select=new Select(selectcolorfield);
	    //select.selectByIndex(2);
	   // select.selectByVisibleText("Red");
	    select.selectByValue("Yellow");
	    
	    WebElement selectedcolor=select.getFirstSelectedOption();
	    String str=selectedcolor.getText();
	    System.out.println(str);
	    
	    driver.close();
	    
	}
	public void verifySimpleAlert()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		WebElement clickhere=driver.findElement(By.xpath("//button[@id='alertButton']"));
		clickhere.click();
		Alert alert=driver.switchTo().alert();
		alert.accept();
		driver.close();
		
		
	}
	public void verifyConfirmationAlert()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		WebElement clickherebutton=driver.findElement(By.xpath("//*[@id=\"confirmButton\"]"));
		clickherebutton.click();
		Alert alert=driver.switchTo().alert();
		String str=alert.getText();
		System.out.println(str);
		alert.dismiss();
		WebElement textmessage=driver.findElement(By.xpath("//span[@id='confirmResult']"));
		String st=textmessage.getText();
		System.out.println(st);
		
		driver.close();
	}
	
	public void verifyPromptAlert()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		WebElement clickbutton=driver.findElement(By.xpath("//button[@id='promtButton']"));
		clickbutton.click();
		Alert alert=driver.switchTo().alert();
		String str=alert.getText();
		System.out.println("Message in the alert box :  "+str);
		alert.sendKeys("Nikhitha");
		alert.accept();
		WebElement textmessage=driver.findElement(By.xpath("//span[@id='promptResult']"));
		String st=textmessage.getText();
		System.out.println("After clicking ok button text message is  "+st);
		driver.close();
	}
	
	public void verifyCustomerDeletAlert()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		WebElement customeridtextfield = driver.findElement(By.xpath("//input[@name='cusid']"));
		customeridtextfield.sendKeys("Nikhitha");
		WebElement submitbutton=driver.findElement(By.xpath("//input[@name='submit']"));
		submitbutton.click();
		Alert alert= driver.switchTo().alert();	//switching to alert window
		String str=alert.getText();
		System.out.println("Message displayed in Alert Message:  "+str);
		alert.accept();
		String st=alert.getText();
		System.out.println("Message displayed in second Alert Message:  "+st);
		alert.accept();
		driver.close();
	}
	public void verifyRightClick()
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		WebElement rightclick=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		Actions actions= new Actions(driver);
		actions.contextClick(rightclick).build().perform();
		
		driver.close();
		}
	public void verifyDoubleClick()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		
		WebElement doubleclick=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		Actions action=new Actions(driver);
		action.doubleClick(doubleclick).build().perform();
		
		Alert alert=driver.switchTo().alert();
		String str=alert.getText();
		System.out.println("Text in alert box : "+str);
		alert.accept();
		driver.close();
	}
	public void verifyDragAndDrop()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/droppable");
		driver.manage().window().maximize();
		
		WebElement dragme=driver.findElement(By.xpath("//div[@id='draggable']"));
		
		WebElement drop=driver.findElement(By.xpath("//div[@id='droppableExample-tabpane-simple']//div[@id='droppable']"));
		Actions action=new Actions(driver);
		action.dragAndDrop(dragme, drop).build().perform();
		driver.close();
	}
		public void verifyDragAndDropOffset()
		{
			WebDriver driver=new ChromeDriver();
			driver.get("https://demoqa.com/dragabble");
			driver.manage().window().maximize();
			WebElement dragbutton=driver.findElement(By.xpath("//div[@id='dragBox']"));
			Actions actions=new Actions(driver);
			actions.dragAndDropBy(dragbutton,50,100).build().perform();
			driver.close();
		}
		public void verifyMouseOver()
		{
			WebDriver driver=new ChromeDriver();
			driver.get("https://demoqa.com/menu/");
			driver.manage().window().maximize();
			WebElement mainitemtwo=driver.findElement(By.cssSelector("#nav > li:nth-child(2) > a"));
			Actions actions=new Actions(driver);
			actions.moveToElement(mainitemtwo).build().perform();
			WebElement subsublist=driver.findElement(By.xpath("//*[@id=\"nav\"]/li[2]/ul/li[3]/a"));		
			actions.moveToElement(subsublist).build().perform();
			driver.close();
			
		}
		public void verifyFileUpload()
		{
			WebDriver driver=new ChromeDriver();
			driver.get("https://demo.guru99.com/test/upload/");
			driver.manage().window().maximize();
			
			WebElement choosefilebutton=driver.findElement(By.xpath("//input[@id='uploadfile_0']"));
			choosefilebutton.sendKeys("C:\\Users\\DELL\\git\\Selenium-Basics\\SeleniumBasics\\src\\main\\resources\\Automation.docx");
			
			WebElement checkbox=driver.findElement(By.xpath("//input[@id='terms']"));
			checkbox.click();
			WebElement submitfilebutton=driver.findElement(By.xpath("//button[@id='submitbutton']"));
			submitfilebutton.click();
			driver.close();
		}
		
		public void verifyDragDrop()
		{
			WebDriver driver=new ChromeDriver();
			driver.get("https://selenium.qabible.in/drag-drop.php");
			driver.manage().window().maximize();
			
			WebElement dragfield1=driver.findElement(By.xpath("//span[text()='Draggable n�1']"));
			WebElement dragfield2=driver.findElement(By.xpath("//span[text()='Draggable n�2']"));
			WebElement dragfield3=driver.findElement(By.xpath("//span[text()='Draggable n�3']"));
			WebElement dragfield4=driver.findElement(By.xpath("//span[text()='Draggable n�4']"));
			
			WebElement dropfield=driver.findElement(By.xpath("//div[@id='mydropzone']"));
			Actions actions=new Actions(driver);
			actions.dragAndDrop(dragfield1, dropfield).build().perform();
			actions.dragAndDrop(dragfield2, dropfield).build().perform();
			actions.dragAndDrop(dragfield3, dropfield).build().perform();
			actions.dragAndDrop(dragfield4, dropfield).build().perform();
			
			driver.close();
		}
		public void verifyFrames()
		{
			WebDriver driver=new ChromeDriver();
			driver.get("https://demoqa.com/frames");
			driver.manage().window().maximize();
			List<WebElement> iframetags=driver.findElements(By.tagName("iframe"));
			int sizenumberoftags=iframetags.size();
			System.out.println("Number of iframes:  "+sizenumberoftags);
			
			//driver.switchTo().frame(2);
			//driver.switchTo().frame("frame1");
			WebElement frame1 =driver.findElement(By.xpath("//iframe[@id='frame1']"));
			driver.switchTo().frame(frame1);		//switch to frame from a webpage
			WebElement frametext=driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
			String str=frametext.getText();
			System.out.println("Text message in Frame1:  "+str);
			driver.switchTo().defaultContent();			// switch to web page from frame
			driver.close();
		}
		
		public void verifyFramePractice()
		{
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.hyrtutorials.com/p/frames-practice.html#google_vignette");
			driver.manage().window().maximize();
			WebElement textbox=driver.findElement(By.xpath("//input[@id='name']"));
			textbox.sendKeys("Nikhitha");
			//		FRAME 1
			driver.switchTo().frame("frm1");
			WebElement coursenamedropdown=driver.findElement(By.id("course"));
			Select select=new Select(coursenamedropdown);
			select.selectByIndex(3);
			WebElement selectedoption=select.getFirstSelectedOption();
			String option=selectedoption.getText();
			System.out.println("Selected option from dropdown menu is :  "+option);
			WebElement textinframe1=driver.findElement(By.xpath("//h1[@class='post-title entry-title']"));
			String str=textinframe1.getText();
			System.out.println("Text in frame1 : "+str);
			driver.switchTo().defaultContent();
			//			FRAME 2
			driver.switchTo().frame("frm2");
			WebElement frame2text=driver.findElement(By.xpath("//div[@class='post-head']//h1[@class='post-title entry-title']"));
			String text2=frame2text.getText();
			System.out.println("text in frame 2 : "+text2);
			WebElement basiccontroldropdown=driver.findElement(By.id("selectnav1"));
			Select selectobj=new Select(basiccontroldropdown);
			selectobj.selectByIndex(1);
			WebElement selectedbasiccontrol=selectobj.getFirstSelectedOption();
			String text=selectedbasiccontrol.getText();
			System.out.println("Selected option from basic control dropdown in frame 2 :  "+text);
		/*WebElement firstnamefield=driver.findElement(By.xpath("//*[@id=\"firstName\"]"));
			//firstnamefield.sendKeys("Nikhitha");
			WebElement lastnamefield=driver.findElement(By.xpath("//input[@id='lastName']"));
			lastnamefield.sendKeys("Rahul");
			WebElement genderselect=driver.findElement(By.xpath("//input[@id='femalerb']"));
			genderselect.click();
			WebElement languageknown=driver.findElement(By.xpath("//input[@id='englishchbx']"));
			languageknown.click();
			WebElement emailfield=driver.findElement(By.xpath("//input[@id='email']"));
			emailfield.sendKeys("nikhitha@gmail.com");*/
			driver.switchTo().defaultContent();
			
			//		FRAME 3
			driver.switchTo().frame("frm3");
			//WebElement frame3textbox=driver.findElement(By.xpath("//input[@id='name']"));
			//frame3textbox.sendKeys("Niveditha");
			
			WebElement basiccontrldropdwn=driver.findElement(By.xpath("//select[@id='selectnav1']"));
			Select basic=new Select(basiccontrldropdwn);
			basic.selectByIndex(3);
			WebElement basiccontrol=basic.getFirstSelectedOption();
			String basiccontroltext=basiccontrol.getText();
			System.out.println("Selected option from basic control dropdown in frame 3 :  "+basiccontroltext);
			
						
			driver.close();
	
		}
		public void verifyMultipleWindowHandling()
		{
			WebDriver driver= new ChromeDriver();
			driver.get("https://demo.guru99.com/popup.php");
			driver.manage().window().maximize();
			String parentwindowid=driver.getWindowHandle();
			System.out.println("Parent Window Handle ID:  "+parentwindowid);
			WebElement clickherebutton=driver.findElement(By.xpath("//a[text()='Click Here']"));
			clickherebutton.click();
			Set<String > multiplehandleid=driver.getWindowHandles();
			System.out.println("Handle ID s : "+multiplehandleid);
			Iterator<String> values = multiplehandleid.iterator();
			while(values.hasNext())
			{
				String handleid=values.next();
						if(!handleid.equals(parentwindowid))
								{
								driver.switchTo().window(handleid);
								WebElement emailfield=driver.findElement(By.xpath("//input[@name='emailid']"));
								emailfield.sendKeys("nikhitha@gmail.com");
								WebElement submitbutton=driver.findElement(By.xpath("//input[@name='btnLogin']"));
								submitbutton.click();
								//driver.close();							
								}
						
					
				
				
			}
			driver.quit();
			//driver.switchTo().defaultContent();
		}
		public void sample()
		{
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demo.guru99.com/popup.php");
		}
		
	public static void main(String[] args) {
		Commands obj = new Commands();
		//obj.verifySwagLabsLogin();
		//obj.demoWebShopLogin();
		//obj.verifylinkText();
		//obj.verifyPartialLinkText();
		//obj.verifyDemoTourRegistration();
		//obj.demoWebShopLoginXpath();
		//obj.demoWebShopLogincssSelector();
		//obj.verifyisSelected();
		//obj.verifyisEnabled();
		//obj.verifyisDisplayed();
		//obj.verifyValuesFromDropDown();
		//obj.getTotalDropDownValues();
		//obj.verifySingleInputField();
		//obj.verifyTwoInputFields();
		//obj.verifyCheckBoxDemo();
		//obj.verifyRadioButtonDemo();
		//obj.verifyColorDropDown();
		//obj.verifySimpleAlert();
		//obj.verifyConfirmationAlert();
		//obj.verifyPromptAlert();
	    //obj.verifyCustomerDeletAlert();
		//obj.verifyRightClick();
		//obj.verifyDoubleClick();
		//obj.verifyDragAndDrop();
		//obj.verifyDragAndDropOffset();
		//obj.verifyMouseOver();
		//obj.verifyFileUpload();
		//obj.verifyDragDrop();
		//obj.verifyFrames();
		
		//obj.verifyFramePractice();
		//obj.verifyMultipleWindowHandling();
	//obj.sample();

	}

}

