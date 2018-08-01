package pomObjectTestcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import POM_utilities.BrowserFactory;
import pomObject.FindByPOM;

public class FindByTestCase {
	
	@Test
	public void checklogin() {
	
		//This will launch specific browser and url
	WebDriver driver =	BrowserFactory.StartBrowser("firefox", "http://demosite.center/wordpress/wp-login.php");
	
	//created Page object using page factory
	FindByPOM findby=PageFactory.initElements(driver, FindByPOM.class);
	//call the method
	findby.login("admin", "demo123");
	
	}
	
}
