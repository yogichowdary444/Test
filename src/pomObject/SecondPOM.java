/**
 * 
 */
package pomObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author yogi.v
 *
 */
public class SecondPOM {
	
	WebDriver driver;
	
	By username = By.id("user_login");
	By password = By.xpath("//*[@name='pwd']");
	By login = By.name("wp-submit");
	
	public SecondPOM(WebDriver driver){
		this.driver = driver;
	}
	
	public void VerifyWP_login(String user, String pass) {
		driver.findElement(username).sendKeys(user);
		driver.findElement(password).sendKeys(pass);
		driver.findElement(login).click();
	}
	
//	public void LoginUName(String uid){
//		driver.findElement(username).sendKeys(uid);
//	}
//	
//	public void LoginPwd(String pwd){
//		driver.findElement(password).sendKeys(pwd);
//	}
//	
//	public void LoginBtn() {
//		driver.findElement(login).click();
//	}

}
