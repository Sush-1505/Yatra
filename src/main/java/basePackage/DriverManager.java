package basePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class DriverManager {

	 private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

	    public static void setDriver(String browser) {

	        if(browser.equalsIgnoreCase("chrome")) {
	        	ChromeOptions options = new ChromeOptions();
	            options.addArguments("--disable-notifications");

	            driver.set(new ChromeDriver(options));
	        }
	        else if(browser.equalsIgnoreCase("edge")) {

	        	EdgeOptions options = new EdgeOptions();
	        	options.addArguments("--disable-notifications");

	        	driver.set(new EdgeDriver(options));
	        }
	        else if(browser.equalsIgnoreCase("firefox")){
	        	//driver.set(new FirefoxDriver());
	        	FirefoxOptions options = new FirefoxOptions();
	        	options.addPreference("dom.webnotifications.enabled", false);

	        	driver.set(new FirefoxDriver(options));
	        }
	    }

	    public static WebDriver getDriver() {
	        return driver.get();
	    }

	    public static void quitDriver() {
	        driver.get().quit();
	        driver.remove();
	    }
}
