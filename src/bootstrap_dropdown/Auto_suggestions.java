package bootstrap_dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Auto_suggestions {
	
	WebDriver driver;
	@Test
	public  void ChromeBrowser() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yogi.v\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement element = driver.switchTo().activeElement();
		element.sendKeys("Guru99");
		List<WebElement> lstGoogle = driver.findElement(By.xpath("//ul[@role='listbox']"))
		.findElements(By.xpath("(//li[@role='presentation'])[3]"));
		for (int i = 0; i < lstGoogle.size(); i++) {
		System.out.println(lstGoogle.get(i).getText());
		}
		element.submit();
		System.out.println("Page title is: " + driver.getTitle());
		//getScreenShot(driver);
		}
}
