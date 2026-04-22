package basePackage;
import org.openqa.selenium.By
;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utilityPackage.ScreenshotUtil;
import utilityPackage.GetDataMain;
import static basePackage.DriverManager.*;

public class BaseTest {

	// public static WebDriver driver;

//	    @BeforeMethod
//	    public void startBrowser() throws InterruptedException {  
//
//	        ChromeOptions options = new ChromeOptions();
//	        options.addArguments("--disable-notifications");
//	        driver = new ChromeDriver(options);
//
//	        driver.manage().window().maximize();
//	        driver.get(getDataMain.getProperty("Base_url"));
//	        Thread.sleep(2000);
//	    }
//
//	    @AfterMethod
//	    public void tearDownx() { 
//	        driver.quit();
//	    }
	
	
	    @BeforeMethod
	    public void setup() {
	        setDriver("chrome");   // or "firefox"
	        getDriver().manage().window().maximize();
	        getDriver().get(GetDataMain.getProperty("Base_url"));
	        closeWindow();
	        try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
	    }

	    @AfterMethod
	    public void tearDown() {
	        quitDriver();
	    }
	    
	    
	 //   @AfterMethod
	    public void tearDown(ITestResult result) {

	        if(result.getStatus() == ITestResult.FAILURE) {
	            ScreenshotUtil.captureScreenshot(result.getName());
	        }

	        quitDriver();
	    }
	    
	    
	    public static void closeWindow() {
	    	getDriver().findElement(By.xpath("//span[contains(@class,\"style_cross__q1ZoV\")]//img")).click();
	    }

		    }
