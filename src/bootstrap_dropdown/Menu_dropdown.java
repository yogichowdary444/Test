package bootstrap_dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Menu_dropdown {
	
	WebDriver driver;
	@Test
	public void dropdown() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yogi.v\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
		driver.findElement(By.xpath("//button[@id='menu1']")).click();
		Actions act= new Actions(driver);
		WebElement element = driver.findElement(By.xpath("//a[text()='CSS']"));
		
		act.moveToElement(element).build().perform();
		driver.findElement(By.xpath("//a[text()='CSS']")).click();
			
//		Thread.sleep(5000);
//		List<WebElement>dd_menu=driver.findElements(By.xpath("//ul[@class='dropdown-menu']//li//a"));
//		
//		for(int i=0; i<dd_menu.size(); i++){
//		WebElement element=	dd_menu.get(i);
//		String innerhtml = element.getAttribute("innerHTML");
//		if(innerhtml.contentEquals("JavaScript")) {
//			element.click();
//			break;
//		}
//		System.out.println("Values Of Dropdownn is " + innerhtml);
			//}
		
	}

}
