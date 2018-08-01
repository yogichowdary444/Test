package constructorsdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstConstructordemo {
	public WebDriver driver;
	
	//constructor 
	 FirstConstructordemo() throws Exception {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\yogi.v\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		 driver= new ChromeDriver();
		 driver.get("https://www.fb.com");
		 driver.manage().window().maximize();
		Thread.sleep(3000);
		 //driver.quit();
		
	}


}
