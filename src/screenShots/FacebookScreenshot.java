package screenShots;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import library.Utility;

public class FacebookScreenshot {
	public WebDriver driver;
	@Test
	public void CaptureScreenShot() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yogi.v\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		//Utility.CaptureScreenshot(driver, "Browser Started");
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Utility.CaptureScreenshot(driver, "Facebook ");
		WebElement email = driver.findElement(By.xpath(".//*[@id='emailassas']"));
		email.sendKeys("yogichowdary");
		//Utility.CaptureScreenshot(driver, "username screenshot");
		
		
		
	}
	
	@AfterMethod
	public void tearDown(ITestResult result) {
		if(ITestResult.FAILURE==result.getStatus()) {
			Utility.CaptureScreenshot(driver, result.getName());
		}
			driver.quit();
	}
	
}
