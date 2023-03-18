package BrowserSetup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	
	public static WebDriver openChromeBrowser () {
		System.setProperty("webdriver.chrome.driver", "D:\\Running Tools\\"
				+ "selenium_chromedriver\\chromedriver_win32 105\\chrome"
				+ "driver.exe");
		WebDriver driver = new ChromeDriver () ;
		return driver;
		
	}
	
	public static WebDriver openFirefoxBrowser () {
		System.setProperty("webdriver.gecko.driver", "D:\\Running Tools"
				+ "\\selenium_chromedriver\\Firefox\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver () ;
		return driver;
		
	}
	
	public static WebDriver openEdgeBrowser () {
		System.setProperty("webdriver.edge.driver", "D:\\Running Tools\\"
				+ "selenium_chromedriver\\edge\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver () ;
		return driver;
		
	}
	
}
