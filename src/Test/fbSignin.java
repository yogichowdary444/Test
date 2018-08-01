package Test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class fbSignin {
	
	WebDriver driver;
	
	@Test
	public void fblogin(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yogi.v\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.fb.com");
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("yogi");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Vutla");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9963696981");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("v.yogi555@gmail.com");
		Select sel =new Select(driver.findElement(By.xpath("//select[@id='day']")));
		sel.selectByVisibleText("15");
		Select selmnth =new Select(driver.findElement(By.xpath("//select[@id='month']")));
		selmnth.selectByValue("4");
		Select selyear =new Select(driver.findElement(By.xpath("//select[@id='year']")));
		selyear.selectByIndex(4);
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		driver.findElement(By.name("websubmit")).click();
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
		driver.quit();
		
		
	}

}
