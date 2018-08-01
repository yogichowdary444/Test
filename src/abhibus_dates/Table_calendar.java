package abhibus_dates;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Table_calendar {
	
	WebDriver driver;
	
	@Test
	public void selectDate() throws Exception{
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\yogi.v\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		driver= new ChromeDriver();
		
		driver.get("https://www.abhibus.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
		driver.findElement(By.xpath("//input[@value='Leaving from']")).sendKeys("");
		driver.findElement(By.id("datepicker1")).click();
		driver.findElement(By.xpath("(((//table)[1]//tr)[3]//td)[4]")).click();
		Thread.sleep(3000);
		driver.quit();
	}
	

}
