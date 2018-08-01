package mytest;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {
	int a = 100;
	int b = 50;
	static WebDriver driver = null;
	

	{
		System.out.println(a);
	}
	
	static {
		Test two = new Test();
		System.out.println(two.b);
	}
	
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Test one = new Test();
		System.out.println(one.a+one.b);
		String browserName= "CHROME";
		switch(browserName.toUpperCase()){
		case "FF":
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\yogi.v\\Downloads\\geckodriver-v0.21.0-win64\\geckodriver.exe");
			driver=new FirefoxDriver();
			break;
		
		case "CHROME": 
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\yogi.v\\Downloads\\geckodriver-v0.21.0-win64\\geckodriver.exe");
			driver = new ChromeDriver();
			break;
			
		
			
		}
		
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.quit();
	}

}
