package Pageobjects;

import java.awt.Window;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	
	public  WebDriver driver;
     public Homepage(WebDriver driver) {
    	 this.driver=driver; 
    	 PageFactory.initElements(driver, this);
    	 }
     
     @FindBy(xpath="(//div[@class='card-up'])[1]")
     WebElement Element;
     
     @FindBy(xpath="//div[@class='card mt-4 top-card']/div//h5[text()='Forms']")
     WebElement forms;
     
     @FindBy(xpath="(//div[@class='card-up'])[3]")
     WebElement AlertsFramesWindows;
     
     @FindBy(xpath="(//div[@class='card-up'])[4]")
     WebElement Widges;
     
     @FindBy(xpath="(//div[@class='card-up'])[5]")
     WebElement Intearactions;
     
     @FindBy(xpath="(//div[@class='card-up'])[6]")
     WebElement BookStroeApplication;
    
     public void scrootodown() {
    	 JavascriptExecutor jse= (JavascriptExecutor)driver;
    	 jse.executeScript("arguments[0].scrollIntoView();", Element);
     }
     
     public void verifyElementbutton() {
    	 Element.click();
     }
     public void clickFormsbutton() {
    	 forms.click();
     }
     
     public void verifyAlertsFramesWindows() {
    	 AlertsFramesWindows.click(); 
     }
     public void verifyIntearactions() {
    	 Intearactions.click(); 
     }
     public void verifyWidges() {
    	 Widges.click();
     }
     public void verifyBookStroeApplication() {
    	 BookStroeApplication.click();
     }
     
    
     
     
     
     
     
     
     
     
     
}
