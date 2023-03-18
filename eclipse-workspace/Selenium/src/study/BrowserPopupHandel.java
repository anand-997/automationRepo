package study;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserPopupHandel {
	
	public static void main(String[] args) throws InterruptedException {
		
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--disable-notifications");
	System.setProperty("webdriver.chrome.driver", "D:\\Running Tools\\selenium_chromedriver\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver =new ChromeDriver(options);
	driver.get("https://www.ajio.com/");
	Thread.sleep(4000);
//	driver.manage().window().maximize();
	System.out.println("end");
	}
}
