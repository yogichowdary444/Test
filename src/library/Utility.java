package library;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

public class Utility {

	public static void CaptureScreenshot(WebDriver driver, String ScreenshotName) {
		
		try {
			TakesScreenshot ts = (TakesScreenshot)driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source, new File("./screenShots/"+ScreenshotName+".png"));
			System.out.println("ScreenShot Taken");
			
		} catch (Exception e) {
			System.out.println("Exception handling while taking screen shot" + e.getMessage());
		} 

	}

}
