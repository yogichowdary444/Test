package mytest;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Checkboxlist {
	
	WebDriver driver;
	@Test(invocationCount=1)
	public void login(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yogi.v\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.applypanonline.com/new-pan-card-applicationform.php");
		System.out.println("Browser Started");
//		List<WebElement> checkBoxes = driver.findElements(By.xpath("//label[@class='form-label']"));
//		System.out.println(checkBoxes.size());
//		for (WebElement checkBox: checkBoxes) {
//		    System.out.println(checkBox.getText()); // to iterate over each checkbox element.
//		}
		
		  List<WebElement> s=driver.findElements(By.xpath("//label[@class='form-label']"));
          
          System.out.println(s.size());
           
           for (int i = 0; i < s.size(); i++) {

           System.out.println(s.get(i).getText()); 
         
         }
		
           System.out.println("Browser Ended");
	}

	public static void main(String[] args) {
		Checkboxlist selenium = new Checkboxlist();
		selenium.login();

	}

}
