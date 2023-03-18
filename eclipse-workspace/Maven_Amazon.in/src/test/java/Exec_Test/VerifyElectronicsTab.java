package Exec_Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.AmazonHomePage;

public class VerifyElectronicsTab {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Running Tools\\selenium_chromedriver\\chromedriver_win32 105\\chromedriver.exe");
		WebDriver driver = new ChromeDriver () ;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		
		AmazonHomePage amazonHomePage = new AmazonHomePage (driver) ;
		amazonHomePage.openElectronics();
		
		String url = driver.getCurrentUrl();
		String title = driver.getTitle();
		
		if (url.equals("https://www.amazon.in/electronics/b/?ie=UTF8&node=976419031&ref_=nav_cs_electronics") 
				&& 
				title.equals("Electronics Store: Buy Electronics products Online at Best Prices in India at Amazon.in"))
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}
		
	}

}
