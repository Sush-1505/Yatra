package basePackage;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utilityPackage.getDataMain;

public class BaseTest {

	 public static WebDriver driver;
	 
	 

	    @BeforeMethod
	    public void startBrowser() throws InterruptedException {  

	        ChromeOptions options = new ChromeOptions();
	        options.addArguments("--disable-notifications");
	        driver = new ChromeDriver(options);

	        driver.manage().window().maximize();
	        driver.get(getDataMain.getProperty("Base_url"));
	        Thread.sleep(2000);
	    }

	    @AfterMethod
	    public void tearDown() { 
	        driver.quit();
	    }
	    
	    public static void closeWindow() {
	    	driver.findElement(By.xpath("//span[contains(@class,\"style_cross__q1ZoV\")]//img")).click();
	    }

		    }
