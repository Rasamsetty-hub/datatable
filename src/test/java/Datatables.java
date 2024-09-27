import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datatables {

	
	
	public static void main(String []args) throws Throwable {

		ChromeDriver driver=new ChromeDriver();
	
    driver.get("https://datatables.net/examples/basic_init/alt_pagination.html");
	driver.manage().window().maximize();

		
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,600)", "");
	Thread.sleep(3000);
	
	WebElement webtable = driver.findElement(By.xpath("//table[@class='display dataTable']/tbody"));
	
	         List<WebElement> rows = webtable.findElements(By.xpath("//table[@class='display dataTable']/tbody/tr"));
	        int rowscount=rows.size();
	         for(int i=0;i<rowscount;i++) {
		 
		     List<WebElement> cols = rows.get(i).findElements(By.xpath("//table[@class='display dataTable']/tbody/tr//td"));
		     int columnscount =cols.size();
		         for(int j=0;j<columnscount;j++) {
		        	  String textcell = cols.get(j).getText();
		        	  if(textcell.equalsIgnoreCase("Brielle Williamson")) {
		        		  System.out.println("Salary is:"+cols.get(35).getText());
		        	  }
		         }
		
		
	}
	driver.quit();
	}
	
	}
