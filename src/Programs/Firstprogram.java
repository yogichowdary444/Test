package Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firstprogram {
	
	public WebDriver driver;
	public void test() throws Exception{
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yogi.v\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();

		
		
		/*driver.findElement(By.xpath("//a[text()='Sign In']")).click();
		
		driver.findElement(By.xpath("//a[text()='Sign In']")).click();
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("yogichowdary444");
		
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
		driver.findElement(By.name("password")).sendKeys("Mydadismyhero.1");
		
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
		driver.findElement(By.xpath("//a[text()='Sign In']")).click();
		driver.findElement(By.xpath("//input[@type='email']")).click();*/
		
		
		/*driver.get("http://www.google.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().back();
		String title = driver.getTitle();
		System.out.println(title);
	    //driver.findElement(By.className("gmail-nav__nav-link gmail-nav__nav-link__sign-in")).click();
		driver.findElement(By.xpath("//a[@class='gmail-nav__nav-link gmail-nav__nav-link__sign-in']")).click();
		driver.findElement(By.name("identifier")).sendKeys("v.yogi555@gmail.com");*/
		
		
		
	
		driver.navigate().to("https://www.flipkart.com/");
		driver.findElement(By.xpath("a[text()= 'Login & Signup']")).click();
		driver.findElement(By.xpath("//input[@type= 'text']")).sendKeys("9963696981");	
		driver.findElement(By.xpath("//input[@type= 'password']")).sendKeys("yogi@4B8");
		driver.findElement(By.xpath("//input[type= 'submit']")).click();
		
		//driver.close();
				
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Firstprogram a=new Firstprogram();
		a.test();
	}

}
