package windowHandle;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.thoughtworks.selenium.webdriven.commands.GetTitle;

public class MultipleWiindowHandles {
	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yogi.v\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		driver= new ChromeDriver();
		
		driver.get("http://www.ghmc.gov.in/");
		String parent = driver.getWindowHandle();
		System.out.println("Parent window ID is " + parent);
		Set<String> allwindows = driver.getWindowHandles();
		int count = allwindows.size();
		System.out.println("Total windows " +count );
		ArrayList<String> tabs = new ArrayList<>(allwindows);
		driver.switchTo().window(tabs.get(2));
		System.out.println("Second window is "+ driver.getTitle()); 
		Thread.sleep(3000);
		driver.close(); 
		driver.switchTo().window(tabs.get(1));
		System.out.println("Second window is "+ driver.getTitle());
		Thread.sleep(3000);
		driver.close();
		
		driver.switchTo().window(tabs.get(0));
		System.out.println("parent window title is "+ driver.getTitle());

	}

	

}
