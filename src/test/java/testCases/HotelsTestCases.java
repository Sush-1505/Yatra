package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import basePackage.BaseTest;

public class HotelsTestCases extends BaseTest {
	
	@Test
	public void checkVisibilityOfHotelButton() throws InterruptedException {
		
		closeWindow();
		Thread.sleep(2000);
		WebElement flightButton=driver.findElement(By.xpath("//span[text()='Hotels']/parent::button[@id=\"simple-tab-0\"]"));
		System.out.println(flightButton.isDisplayed());
		
		
	}

}
