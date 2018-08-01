package pomObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FindByPOM {
	WebDriver driver;
	
	public void FindByPOM(WebDriver driverone){
		
		this.driver = driverone;
		
	}
	
	@FindBy(id="user_login")
	@CacheLookup
	WebElement username;
	
	@FindBy(how=How.ID, using="user_pass")
	@CacheLookup
	WebElement userpass;
	
	@FindBy(how=How.XPATH, using="//input[@type='submit']")
	@CacheLookup
	WebElement submit;
	
	@FindBy(how=How.LINK_TEXT, using="Lost your password?")
	@CacheLookup
	WebElement Forgot_passwordLink;
	
	public void login(String uname, String Pname){
		
		username.sendKeys(uname);
		userpass.sendKeys(Pname);
		submit.click();
	}

}
