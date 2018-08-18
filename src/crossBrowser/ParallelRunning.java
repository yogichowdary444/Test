package crossBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelRunning {
	
	WebDriver driver;
	
	@Test
	@Parameters("browser")
	public void verifyTitle(String browserName) {

		if(browserName.equalsIgnoreCase("FF")){
			
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\yogi.v\\Downloads\\geckodriver-v0.21.0-win64\\geckodriver.exe");
			driver=new FirefoxDriver();
			
		} else if(browserName.equalsIgnoreCase("Chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\yogi.v\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			driver=new ChromeDriver();
			
		}
		else if(browserName.equalsIgnoreCase("IE")){
			System.setProperty("webdriver.ie.driver", "C:\\Users\\yogi.v\\Downloads\\IEDriverServer_x64_3.13.0\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			}
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.quit();
		
	}
		
	
	}
	
	


