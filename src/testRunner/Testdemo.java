package testRunner;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testdemo {
	
	@AfterMethod
	public void flash() {
		System.out.println("Flash");
	}
	
	@BeforeMethod
	public void superman() {
		System.out.println("Superman");
	
	}
	@Test
	public void batman() {
		System.out.println("Batman");
	}
	
	@Test
	public void wonderWomen(){
		System.out.println("Wonder Women");
	}
	
	
	

}
