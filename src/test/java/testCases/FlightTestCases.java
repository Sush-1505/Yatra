package testCases;

import basePackage.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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
	
	
	@Test
	public void checkOneWayRadioButtonClickability() throws InterruptedException {
		WebElement oneWayButton=DriverManager.getDriver().findElement(By.xpath("//h4[text()='One Way']"));
		oneWayButton.click();
		
		Thread.sleep(2000);
		
		System.out.println(oneWayButton.isEnabled());
		
	}
	
	@Test
	public void checkRoundTripRadioButtonClickability() throws InterruptedException {
		
		WebElement roundTripButton=DriverManager.getDriver().findElement(By.xpath("//h4[text()='Round Trip']"));
		roundTripButton.click();
		
		Thread.sleep(2000);
		
		System.out.println(roundTripButton.isEnabled());

	}
	
	@Test
	public void checkMultiCityRadioButtonClickability() throws InterruptedException {
		
		WebElement multiCityButton=DriverManager.getDriver().findElement(By.xpath("//h4[text()='Multi City']"));
		multiCityButton.click();
		
		Thread.sleep(2000);
		
		System.out.println(multiCityButton.isEnabled());
	}
	
	@Test
	public void checkDepartureInputs() throws InterruptedException {
		
		Actions act=new Actions(DriverManager.getDriver());
		WebElement departure=DriverManager.getDriver().findElement(By.xpath("//div[contains(@aria-label,\"Departure From\")]"));
		departure.click();
		Thread.sleep(2000);
		WebElement input=DriverManager.getDriver().findElement(By.xpath("//input[@id=\"input-with-icon-adornment\"]"));
		input.sendKeys("New Delhi");
		
		Thread.sleep(2000);
		
		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ENTER).perform();
		
		WebElement departureValue=DriverManager.getDriver().findElement(By.xpath("//div[contains(@aria-label,\"Departure From\")]//p[@title]"));
		System.out.println(departureValue.getAttribute("title"));
		
	}
	
	@Test
	public void checkGoingToInputs() throws InterruptedException {
		
		Actions act=new Actions(DriverManager.getDriver());
		
		WebElement goingTo=DriverManager.getDriver().findElement(By.xpath("//p[text()='Going To']"));
		goingTo.click();
		Thread.sleep(2000);
		WebElement input1=DriverManager.getDriver().findElement(By.xpath("//input[@type=\"text\"]"));
		input1.sendKeys("Pune");
		
        Thread.sleep(1000);
		
		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ENTER).perform();
		
		Thread.sleep(2000);
		
		WebElement goingtoValue=DriverManager.getDriver().findElement(By.xpath("//div[contains(@aria-label,\"Going To\")]//p[@title]"));
		System.out.println(goingtoValue.getAttribute("title"));
	}
	
	
}
