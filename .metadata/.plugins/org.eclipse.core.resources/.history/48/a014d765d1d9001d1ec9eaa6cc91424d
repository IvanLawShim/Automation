package smokeTests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ATagsTesting {
	
	String webPage_url = "http://www.digitalfeet.com";
	String browserType = "chrome";
	WebDriver driver;

	@Test
	public void findTheelements() {
		List <WebElement> aElements =driver.findElements(By.tagName("a"));
		int numberOfATags = aElements.size();
		for (WebElement aElement : aElements) {
			System.out.println(aElement.getText());
		}
		System.out.println(numberOfATags);
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
