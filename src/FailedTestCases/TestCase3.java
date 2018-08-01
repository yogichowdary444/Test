package FailedTestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase3 {
	
	@Test()
	public void WordpressTest() {
		
		
		System.out.println("Failed");
		Assert.assertTrue(false);
		System.out.println("Wordpress  Test is Working expected");
	}

}
