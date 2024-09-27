package Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Baseclass {
	
	
	public static WebDriver driver;
	
	
	@BeforeClass
	public void setup() throws Throwable {
		
		driver=new ChromeDriver();
		Thread.sleep(3000);
		driver.manage().window().maximize();
	}
	
	//@AfterClass
	//public void teardpwn() {
	//	driver.quit();
	//}
		
	}


