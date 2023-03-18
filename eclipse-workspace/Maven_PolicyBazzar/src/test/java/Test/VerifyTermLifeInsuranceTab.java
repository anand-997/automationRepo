package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.HomePage_Insurance;
import Pages.TermLifeInsurance;

public class VerifyTermLifeInsuranceTab {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Running Tools\\selenium_chromedriver\\chromedriver_win32 105\\chromedriver.exe");
		WebDriver driver = new ChromeDriver () ;
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.policybazaar.com/");
		
		HomePage_Insurance homePage_Insurance = new HomePage_Insurance(driver) ;
		homePage_Insurance.opentermLifeInsurance();
		
		String title = driver.getTitle();
		String url = driver.getCurrentUrl();
		
		if (title.equals("Term Life Insurance - Compare & Buy Life Insurance Online") 
			&& 
			url.equals("https://termlife.policybazaar.com/prequotes?utm_content=home_v11"))
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}
		
		TermLifeInsurance termLifeInsurance = new TermLifeInsurance (driver) ;
		termLifeInsurance.navigateOnviewFreeQuotes();
	}

}
