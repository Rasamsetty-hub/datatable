package FormsPage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class FormsWebPage {
	
	
	public WebDriver driver;
	public FormsWebPage(WebDriver driver) {
		
		this.driver=driver;
	PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(xpath="//span[contains(text(),'Practice Form')]")
	WebElement PractiseFormbutton;
	@FindBy(xpath="//input[@class=' mr-sm-2 form-control']")
	WebElement FirstName;
	@FindBy(id="lastName")
	WebElement LasttName;
	
	@FindBy(id="userEmail")
	WebElement emailfromPractiseform;
	@FindBy(xpath="//label[normalize-space()='Male']")
	WebElement maleradiobutton;
	@FindBy(xpath="//label[normalize-space()='Female']")
	WebElement Femaleradiobutton;
	@FindBy(xpath="//label[normalize-space()='Other']")
	WebElement Otherradiobutton;
	@FindBy(xpath="//input[@id='userNumber']")
	WebElement Mobilenumberinpractiseform;
	@FindBy(id="dateOfBirthInput")
	WebElement dob;
	
	
	@FindBy(xpath="//input[@id='hobbies-checkbox-1']")
	WebElement Sportspractiseform;
	
	@FindBy(xpath="//input[@id='hobbies-checkbox-2']")
	WebElement Readinginpractiseform;
	@FindBy(xpath="//input[@id='hobbies-checkbox-3']")
	WebElement Musicpractiseform;
	
	@FindBy(xpath="//input[@id='uploadPicture']")
	WebElement uploadingpictureinpractiseform;
	
	@FindBy(xpath="//textarea[@id='currentAddress']")
	WebElement sendingdataintocurrenradress;
	
	@FindBy(xpath="(//div[@class='col-md-4 col-sm-12'])[1]")
	WebElement SeleectState;
	
	@FindBy(xpath="//button[text()='Submit']")
	WebElement submitbuttonofparctiseform;
	
	public void scrolltoodown() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)", "");
	}
	
	
	public void clickonpractiseformbutton() throws Throwable {
		Thread.sleep(3000);
		PractiseFormbutton.click();
	}
	public void setfirstname(String fname) {
		FirstName.sendKeys(fname);
	}
	public void setlastname(String lname ) {
		LasttName.sendKeys(lname);
	}
	public void setEmail(String email) {
		emailfromPractiseform.sendKeys(email);
	}
	public void setgender(String gender) {
		if(gender.equalsIgnoreCase("Male")) {
			maleradiobutton.click();
   		 }
   	else if(gender.equalsIgnoreCase("Female")) {
   		Femaleradiobutton.click();
   	}
   	else {
   		driver.quit();
   	}
	}
	public void userMobilenumber(String number) {
		Mobilenumberinpractiseform.sendKeys(number,Keys.TAB);
		
	}
	public void userselectsubject() throws Throwable {

JavascriptExecutor jse = ((JavascriptExecutor)driver);          
WebElement sub = driver.findElement(By.xpath("//div[@class='subjects-auto-complete__placeholder css-1wa3eu0-placeholder']"));
jse.executeScript("arguments[0].value='ENGLISH'",sub );
	
	}
	public void enteradrees(String Address) {
		sendingdataintocurrenradress.sendKeys(Address);
	}
	public void setdate(String dob1) throws Throwable {
		Thread.sleep(2000);
		dob.sendKeys(Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,
				Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE);
		dob.sendKeys(dob1);
		
	}
	
	
     public void picture() {
    	 uploadingpictureinpractiseform.sendKeys("C:\\Users\\DELL\\Downloads"); 
     }
     public void submit() {
    	 
    	 
 		submitbuttonofparctiseform.click();
 		
 		}
 	
	
		
	}

