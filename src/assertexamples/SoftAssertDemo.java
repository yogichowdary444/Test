package assertexamples;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertDemo {
	
	@Test
	public void TestSoft() {
		SoftAssert assertion = new SoftAssert();
		System.out.println("Test 1 starts");
		assertion.assertEquals(12, 13);
		System.out.println("Test 1 completed");
		assertion.assertAll();
	}
	
	@Test
	public void TestHardAssert() {
		
		System.out.println("Test 2 starts");
		Assert.assertEquals(12, 13);
		System.out.println("Test 2 completed");
		
	}

}
