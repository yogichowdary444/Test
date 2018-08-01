package bootstrap_dropdown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Rightclick_menu {
	
	WebDriver driver;
	@Test
	public void contextclick() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yogi.v\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("http://medialize.github.io/jQuery-contextMenu/demo.html");
		WebElement rightclick =  driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions act = new Actions(driver);
		act.contextClick(rightclick).build().perform();
		WebElement editOPtion = driver.findElement(By.xpath("//span[text()='Edit']"));
		act.click(editOPtion).perform();
		driver.switchTo().alert().accept();
		
		
		
	}
}
