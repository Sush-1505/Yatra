package testCases;

import basePackage.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import basePackage.BaseTest;

public class HotelsTestCases extends BaseTest {
	
	@Test
	public void checkVisibilityOfHotelButton() throws InterruptedException {
		
		WebElement hotelButton=DriverManager.getDriver().findElement(By.xpath("//span[text()='Hotels']/parent::button[@id=\"simple-tab-0\"]"));
		System.out.println(hotelButton.isDisplayed());
		
		
	}

}
