package pomObjectTestcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pomObject.FirstPOM;

public class TestcaseOne {
	
	
	@Test
	public void verifyLogin() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yogi.v\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demosite.center/wordpress/wp-login.php");
		
		FirstPOM login = new FirstPOM(driver);
		login.LoginUName("admin");
		login.LoginPwd("demo123");
		login.LoginBtn();
		System.out.println(driver.getTitle());
		
		driver.quit();
		
	}

}
