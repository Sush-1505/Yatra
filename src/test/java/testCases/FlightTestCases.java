package testCases;

import basePackage.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import basePackage.BaseTest;

public class FlightTestCases extends BaseTest {
	
	@Test
	public void checkVisibilityOfFlightButton() throws InterruptedException {
		
		WebElement flightButton=DriverManager.getDriver().findElement(By.xpath("//span[text()='Flights']/parent::button[@id=\"simple-tab-0\"]"));
		System.out.println(flightButton.isDisplayed());
		
	}
	
	@Test
	public void checkDiscountText() {
		
		WebElement discountText=DriverManager.getDriver().findElement(By.xpath("//button[@id=\"simple-tab-0\"]/span[text()='Upto 15% Off']"));
		System.out.println(discountText.getText());
	}
	
	public void checkRadioButtonClickability() {
		
	}
}
