package testNGTutorial;


import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;




public class OrangeHRM {
	 WebDriver driver;
	 
	 @BeforeClass
	 public void StartBrowser() {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\yogi.v\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			driver = new ChromeDriver();
			System.out.println("Browser Started");
	 }
	
	@Test
	public void StartApp() {
		
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/mercurysignon.php");
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String currentURL = driver.getCurrentUrl();
		Assert.assertTrue(currentURL.contains("mercurysignon.php"));
		System.out.println("Application Loaded");
	
	}
	
	@Test(dependsOnMethods = "StartApp")
	public void Login() throws Exception {
		WebElement username = driver.findElement(By.xpath("//*[@name='userName']"));
		username.sendKeys("yogichowdary");
		WebElement password = driver.findElement(By.xpath("//*[@name='password']"));
		password.sendKeys("yogi@4b8");
		
		WebElement Login = driver.findElement(By.xpath("//*[@name='login']"));
		Login.click();
		
		boolean status = driver.findElement(By.xpath("//b[text()= 'Passengers:']")).isDisplayed();
		Assert.assertTrue(status);
		
		System.out.println("Login Successfully");
		 
	}
	
	@Test(dependsOnMethods = "Login")
	public void Logout() throws Exception {
		
		WebElement logout = driver.findElement(By.xpath("//a[text()='SIGN-OFF']"));
		logout.click();
		Assert.assertTrue(driver.findElement(By.xpath("//*[@name='userName']")).isDisplayed());
		System.out.println("Logout Successfully");
		Thread.sleep(1000);
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File ("D:\\screenshot.png"));
		Thread.sleep(1000);
		System.out.println("learning github");
	}
	
	@AfterClass
	public void CloseBrowser() {
		driver.quit();
		System.out.println("Browser Closed");
	}
}
