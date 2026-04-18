package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

//import static basePackage.BaseTest.*;

import org.testng.annotations.Test;

import basePackage.BaseTest;

public class FlightTestCases extends BaseTest {

	@Test
	public void checkVisibilityOfFlightButton() throws InterruptedException {
		
		closeWindow();
		Thread.sleep(2000);
		WebElement flightButton=driver.findElement(By.xpath("//span[text()='Flights']/parent::button[@id=\"simple-tab-0\"]"));
		System.out.println(flightButton.isDisplayed());
		
	}
}
