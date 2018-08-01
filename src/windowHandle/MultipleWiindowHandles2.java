package windowHandle;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.thoughtworks.selenium.webdriven.commands.GetTitle;

public class MultipleWiindowHandles2 {
	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yogi.v\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		driver= new ChromeDriver();
		
		driver.get("http://seleniumpractise.blogspot.com/2017/");
		String parent = driver.getWindowHandle();
		System.out.println("Parent window ID is " + parent);
		
		
		driver.findElement(By.xpath("//a[@href='http://www.google.com']")).click();
		driver.findElement(By.xpath("//a[@href='http://www.facebook.com']")).click();
		driver.findElement(By.xpath("//a[@href='http://www.yahoo.com']")).click();
		Set<String> allwindows = driver.getWindowHandles();
		int count = allwindows.size();
		System.out.println("Total windows " +count );
		List<String> tabs = new ArrayList<String>(allwindows);
		
		driver.switchTo().window(tabs.get(1));
		System.out.println("Google window is "+ driver.getTitle()); 
		Thread.sleep(2000);
		
		driver.switchTo().window(tabs.get(2));
		System.out.println("Facebook window is "+ driver.getTitle());
		Thread.sleep(2000);
		
		
		driver.switchTo().window(tabs.get(3));
		System.out.println("Yahoo window title is "+ driver.getTitle());
		Thread.sleep(2000);
		
		driver.switchTo().window(tabs.get(0));
		System.out.println("parent window title is "+ driver.getTitle());
		Thread.sleep(2000);
		
			
		
	}

	

}
