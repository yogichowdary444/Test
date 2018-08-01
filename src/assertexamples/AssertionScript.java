package assertexamples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionScript {
	
	@Test
	public void TestScript() {
		System.out.println("Test case 0 started");
		Assert.assertEquals(12, 13);
		System.out.println("Test case 0 completed");
	}
	
	@Test
	public void TestScript1() {
		System.out.println("Test case 1 started");
		Assert.assertEquals(12, 13, "Count Does not match");
		System.out.println("Test case 1 completed");
	}
	
	@Test
	public void TestScript2() {
		System.out.println("Test Case 2 Started");
		Assert.assertEquals("Hello", "Hello", "Words Does not match please check");
		System.out.println("Test Case 2completed");
	}

}
