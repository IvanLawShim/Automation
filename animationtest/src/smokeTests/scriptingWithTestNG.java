package smokeTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class scriptingWithTestNG {
	String webPage_url = "http://www.digitalfeet.com";
	String browserType = "chrome";
	WebDriver driver;

	@Test
	public void findTheelements() {
		boolean titlePage = driver.findElement(By.className("custom-logo")).isDisplayed();
		Assert.assertTrue(titlePage, "passed");
	}
	
	@BeforeMethod
	public void init() {
		driver = utilities.DriverFactory.open(browserType);
		driver.get(webPage_url);
	}
	
	@AfterMethod
	public void executed() {
		driver.quit();
	}
}
