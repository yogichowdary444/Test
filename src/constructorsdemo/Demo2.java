package constructorsdemo;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Demo2 extends FirstConstructordemo{

   Demo2() throws Exception {
		//super();
		
	}
public void m1(){
	   List<WebElement> links=driver.findElements(By.tagName("a"));
	   System.out.println(links.size());
   }
	public static void main(String[] args) throws Exception {
		new Demo2().m1();
	}
}
