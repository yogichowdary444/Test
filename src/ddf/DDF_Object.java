package ddf;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DDF_Object {
	WebDriver driver;
	
	@Test(dataProvider="NexivoData")
	public void login(String userName, String passWord) throws Exception{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yogi.v\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.navigate().to("http://designerslounge.co.in/wp-admin");
		driver.findElement(By.id("user_login")).sendKeys(userName);
		driver.findElement(By.name("pwd")).sendKeys(passWord);
		driver.findElement(By.xpath("//input[@id='wp-submit']")).click();
		Thread.sleep(4000);
		System.out.println(driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Dashboard"), "User is unable to login - Invalid Credentials");
		System.out.println("Title is verified User is able to login successfully ");
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	@DataProvider(name="NexivoData")
	public Object[][] excel(){
		
		Object[][] data = new Object[3][2];
		
		data[0][0] ="Admin";
		data[0][1] ="Admin";
		
		data[1][0] ="charlie";
		data[1][1] ="nexivo@4781";
		
		data[2][0] ="admin2";
		data[2][1] ="admin2";
		return data;
		
		
		
	}

}
