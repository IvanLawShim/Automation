package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

// Do not touch this unless a new browser is needed for testing

public class DriverFactory {
	
	public static WebDriver open(String browserType) {
		if (browserType.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "D:\\Automation\\animationtest\\resources\\browser_drivers\\chromedriver.exe");
			return new ChromeDriver();
		}
		else if (browserType.equalsIgnoreCase("edge")){
			System.setProperty("webdriver.msedge.driver", "D:\\Automation\\animationtest\\resources\\browser_drivers\\msedgedriver.exe");
			return new EdgeDriver();
		}
		else{
			System.setProperty("webdriver.gecko.driver", "D:\\Automation\\animationtest\\resources\\browser_drivers\\geckodriver.exe");
			return new FirefoxDriver();
		}
	}
}
