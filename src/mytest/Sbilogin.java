package mytest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sbilogin {
	
	WebDriver driver;
	@Test(invocationCount=2)
	public void login(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yogi.v\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.onlinesbi.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@class='login-new']")).click();
		driver.findElement(By.xpath("//a[@class='login_button']")).click();
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("123455");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("1234567");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.getTitle();
		//driver.quit();
	}

}
