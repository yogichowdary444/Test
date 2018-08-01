package windowHandle;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window1 {
	WebDriver driver;
	public static void main(String[] args) throws Exception {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yogi.v\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2017/");
		
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		driver.findElement(By.xpath("//a[@name='link1']")).click();
		
		Set<String> allwindows =  driver.getWindowHandles();
		int a = allwindows.size();
		System.out.println("Total Windows " +a);
		
		
//		for(String child:allwindows ) {
//			if(!parent.equalsIgnoreCase(child)){
//				driver.switchTo().window(child);
//				driver.findElement(By.xpath("//*[@name='q']")).sendKeys("Selenium Webdriver");
//				driver.findElement(By.xpath("//input[@value='Google Search']")).click();
//				driver.close();
//				
//			}
//			
//		}
//		
		//driver.quit();
		
		for(String child:allwindows) {
			if(!parent.equalsIgnoreCase(child)) {
				driver.switchTo().window(child);
				driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Selenium Webdriver");
				//Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@value='Google Search']")).click();
				
				driver.findElement(By.xpath("//input[@name='q']")).clear();
				driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Selenium");
				driver.close();
				
			}
		}
		
		driver.switchTo().window(parent);
		parent = driver.getTitle();
		System.out.println("parent window is "+parent);

	}

}
