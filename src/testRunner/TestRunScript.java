package testRunner;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;
import org.testng.annotations.Test;

public class TestRunScript {
		@Test
		public void m1(){
		TestNG runner = new TestNG();
		List<String> list = new ArrayList<String>();
		list.add("F:\\selenium\\workspace\\Test\\test-output\\SmokeTestScenario\\testng-failed.xml");
		runner.setTestSuites(list);
	}

}
