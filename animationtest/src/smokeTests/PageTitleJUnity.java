package smokeTests;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import org.junit.Assert;

public class PageTitleJUnity {
	
	String webPage_url = "http://www.digitalfeet.com";
	String browserType = "chrome";
	WebDriver driver;
	

	@Test
	public void pageTitleTest() {
		String actualTitle, expectedTitle;
		
		driver.get(webPage_url);
		
		actualTitle = driver.getTitle();
		expectedTitle = driver.getTitle();
		
		Assert.assertEquals(actualTitle, expectedTitle);
		
		driver.close();
		driver.quit();
	}
	
	@Before
	public void init() {
		System.out.println("Starting!");
		driver = utilities.DriverFactory.open(browserType);
	}
	
	@After
	public void disable() {
		System.out.println("Exit");
		driver.close();
	}
}
