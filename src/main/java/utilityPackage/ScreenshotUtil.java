package utilityPackage;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import basePackage.DriverManager;

public class ScreenshotUtil {

	 public static void captureScreenshot(String fileName) {

	        TakesScreenshot screenShot = (TakesScreenshot) DriverManager.getDriver();

	        File sourceFile = screenShot.getScreenshotAs(OutputType.FILE);

	        String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());

	        File destFile = new File("./Screenshots/" + fileName + "_" + timestamp + ".png");

	        try {
	            FileUtils.copyFile(sourceFile, destFile);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	        System.out.println("Screenshot saved successfully");
	    }
}
