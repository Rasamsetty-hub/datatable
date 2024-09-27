import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datatables1 {
	
	public static void main(String[]args) throws Throwable {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://datatables.net/examples/basic_init/alt_pagination.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)", "");
		Thread.sleep(3000);
		int rows = driver.findElements(By.xpath("//div[@class='dt-layout-row dt-layout-table']//tbody/tr")).size();
		System.out.println("total number of rows:"+rows);
		
		for(int i=1;i<=rows;i++) {
			Thread.sleep(3000);
		String Name = driver.findElement(By.xpath("(//div[@class='dt-layout-row dt-layout-table']//tbody/tr["+i+"]/td[1])")).getText();
		//System.out.println("name of the person is:"+ Name );
		if(Name.equalsIgnoreCase("Brielle Williamson")) {
			String salary= driver.findElement(By.xpath("(//div[@class='dt-layout-row dt-layout-table']//tbody/tr["+i+"]/td[6])")).getText();
		String position=driver.findElement(By.xpath("(//div[@class='dt-layout-row dt-layout-table']//tbody/tr["+i+"]/td[2])")).getText();
		String Office=driver.findElement(By.xpath("(//div[@class='dt-layout-row dt-layout-table']//tbody/tr["+i+"]/td[3])")).getText();	
		String Age=driver.findElement(By.xpath("(//div[@class='dt-layout-row dt-layout-table']//tbody/tr["+i+"]/td[4])")).getText();
		String Startdate=driver.findElement(By.xpath("(//div[@class='dt-layout-row dt-layout-table']//tbody/tr["+i+"]/td[5])")).getText();	
			System.out.println(position+" "+salary+" "+Office+" "+Age+"  "+Startdate);
		}
		}
		driver.quit();
	}

}
