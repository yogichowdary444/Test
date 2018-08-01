package POM_utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory {
	
	static WebDriver driver;
	
	public static WebDriver StartBrowser(String BrowserName, String Url) {
		
		if(BrowserName.equalsIgnoreCase("firefox")){
			
			driver = new FirefoxDriver();
			
		} else if(BrowserName.equalsIgnoreCase("chrome")) {
			driver= new ChromeDriver();
			}
		
		else if(BrowserName.equalsIgnoreCase("IE")) {
			
			driver= new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		driver.get(Url);
		return driver;
	}

}
