package Testcases;








import org.testng.annotations.Test;

import FormsPage.FormsWebPage;
import Pageobjects.Baseclass;
import Pageobjects.Homepage;

public class Formpagetestcase1 extends Baseclass {
	
	
	
	  
	@Test()
	public void formpage() throws Throwable {
		driver.get("https://demoqa.com/");
		Homepage hmp=new Homepage(driver);
		hmp.scrootodown();
		Thread.sleep(2000);
		 hmp.clickFormsbutton();
		 FormsWebPage fpg=new FormsWebPage(driver);
		 Thread.sleep(3000);
		 fpg.clickonpractiseformbutton();
		 Thread.sleep(2000);
		 fpg.setfirstname("siva");
		 fpg.setlastname("prasad");
		
		 fpg.setEmail("nukalusivaprasad@gmail.com");
		 fpg.setgender("male");
		 fpg.userMobilenumber("8179209310");
		 fpg.setdate("15 Jul 1998");
		 Thread.sleep(4000);
		 fpg.userselectsubject();
		 
//		 fpg.userselectsubject();
		 fpg.enteradrees("3/97");
		
		 fpg.picture();
		 Thread.sleep(2000);
		
		// fpg.scrolltoodown();
		 Thread.sleep(4000);
		 //fpg.submit();
		 
		 
		
		 
	}
	
        	
		
	}
	

