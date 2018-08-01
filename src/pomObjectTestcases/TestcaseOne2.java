package pomObjectTestcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pomObject.FirstPOM;
import pomObject.SecondPOM;

public class TestcaseOne2 {
	
	
	@Test
	public void verifyLogin() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yogi.v\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demosite.center/wordpress/wp-login.php");
		
		SecondPOM login = new SecondPOM(driver);
		login.VerifyWP_login("admin", "demo123");
		System.out.println(driver.getTitle());
		
		driver.quit();
		
	}

}
