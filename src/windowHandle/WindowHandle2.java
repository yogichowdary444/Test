package windowHandle;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle2 {
	static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yogi.v\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.ghmc.gov.in/");
		String parent = driver.getWindowHandle();
		System.out.println("Parent Window ID "+ parent
				);
		Set<String> allwindows = driver.getWindowHandles();
		int count = allwindows.size(); 
		System.out.println("Total Windows "+ count);
		
		for(String child: allwindows){
			if(!parent.equalsIgnoreCase(child)){
				driver.switchTo().window(child);
				String title = driver.getTitle();
				System.out.println(title);
				System.out.println("Child Windows ID "+ child);
				driver.close();
			}
		}
		driver.switchTo().window(parent);
		 String current = driver.getCurrentUrl();
		System.out.println("Parent current URL " + current);

	}

}
