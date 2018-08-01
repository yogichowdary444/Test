package testNGTutorial;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SecondTestNGScript {
	
	
	@Test(priority = 0, description = "App Started")
	public void StartApp() {
		//Assert.assertEquals(12, 13);
		System.out.println("Started APP");
		
	}
	@Test(priority = 1, description = "Login Functionality", dependsOnMethods= "StartApp")
	public void LoginApplication() {
			System.out.println("Login to App");
		}
	@Test(priority = 2, description = "Logout Fuctionality", dependsOnMethods = "LoginApplication")
	public void LogOut() {
		System.out.println("Logout App");
	}
}
