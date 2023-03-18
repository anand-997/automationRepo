package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.HealthInsurance;
import Pages.HomePage_Insurance;

public class VerifyHealthInsuranceTab {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Running Tools\\selenium_chromedriver\\chromedriver_win32 105\\chromedriver.exe");
		WebDriver driver = new ChromeDriver () ;
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		driver.get("https://www.policybazaar.com/");
		
		HomePage_Insurance homePage_Insurance = new HomePage_Insurance(driver) ;
		homePage_Insurance.openhealthInsurance();
		
		String title = driver.getTitle();
		String url = driver.getCurrentUrl();
		
		if (title.equals("PolicyBazaar Health Insurance: Get a 5 Lac health plan @Rs. 373/Month") 
			&& 
			url.equals("https://health.policybazaar.com/?pq=health0&new=1&utm_content=home_v12"))
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}
		
		HealthInsurance healthInsurance = new HealthInsurance (driver) ;
		healthInsurance.ClickOncontinue();
	}

}
