package smokeTests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import junit.framework.Assert;

public class PageTitleJUnity {

	@Test
	public void pageTitleTest() {
		String webPage_url = "http://www.digitalfeet.com";
		String browserType = "chrome";
		String actualTitle, expectedTitle;
		
		//WebDriver init
		WebDriver driver;
		driver = utilities.DriverFactory.open(browserType);
		driver.get(webPage_url);
		
		actualTitle = driver.getTitle();
		expectedTitle = "Digital Feet";
		
		Assert.assertEquals(actualTitle, expectedTitle);
		
		driver.close();
		driver.quit();
	}
}
