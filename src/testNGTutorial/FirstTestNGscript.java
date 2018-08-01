package testNGTutorial;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstTestNGscript {
	
	@Test(priority = 0, description = "This test case verify login functionality")
	public void loginApplication() {
		System.out.println("Login to Application");
		Assert.assertEquals(12, 13);
	}
	
	@Test(priority = 1, description = "This test case will add certain items in basket")
	public void SelectItems() {
		System.out.println("Item Selected");
	}
	
	@Test(priority = 2, description = "This test case will verify checkout functionality")
	public void CheckOut() {
		System.out.println("Checkout Completed");
	}
}
