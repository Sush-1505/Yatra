package testCases;

import basePackage.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import basePackage.BaseTest;

public class BusTestCases extends BaseTest {
	
	@Test
public void checkVisibilityOfFlightButton() throws InterruptedException {
		
		WebElement BusButton=DriverManager.getDriver().findElement(By.xpath("//span[text()='Bus']/parent::button[@id=\"simple-tab-0\"]"));
		System.out.println(BusButton.isDisplayed());
		
	}
	

}
