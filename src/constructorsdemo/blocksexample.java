package constructorsdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class blocksexample {
	public static WebDriver driver;
	
	
	
	blocksexample() {
		
		driver.findElement(By.xpath("//a[text()='Create an account']")).click();
		
	}
	
	static{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yogi.v\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		
	}
	
	 {
		driver.findElement(By.xpath("//a[text() = 'Gmail']")).click();
	}
	 blocksexample(int a) {
		 System.out.println(a);
	 }	 
	 
	 public void method(){
			driver.findElement(By.xpath("//a[text()='Sign In']")).click();
			driver.quit();
		}
		
	
	 public static void main(String[] args) {
		 blocksexample obj = new blocksexample();
	//	 blocksexample obj1 = new  blocksexample(10);
		 obj.method();
		// obj1.method();
	}

}
