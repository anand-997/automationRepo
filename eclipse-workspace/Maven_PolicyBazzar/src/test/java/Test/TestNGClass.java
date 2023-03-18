package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.HealthInsurance;
import Pages.HomePage_Insurance;
import Pages.TermLifeInsurance;

public class TestNGClass {
	
	private WebDriver driver ;
	private HomePage_Insurance homePage_Insurance ;
	
	@BeforeClass
	public void lounchBrowser() {
		System.setProperty("webdriver.chrome.driver", 
				"D:\\Running Tools\\selenium_chromedriver\\chromedriver_win32 105\\"
				+ "chromedriver.exe");
		driver = new ChromeDriver () ;
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
	}
	
	@BeforeMethod
	public void hitURL() {
		driver.get("https://www.policybazaar.com/");
		homePage_Insurance = new HomePage_Insurance(driver) ;
	}
	
	@Test (priority = 1, invocationCount = 2)
	public void verifyTermLifeInsurance() throws InterruptedException {
		homePage_Insurance.openTermLifeInsurance();
		String title = driver.getTitle();
		String url = driver.getCurrentUrl();
		if (title.equals("Term Life Insurance - Compare & Buy Life Insurance Online") )
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}
		
//		TermLifeInsurance termLifeInsurance = new TermLifeInsurance (driver) ;
//		termLifeInsurance.navigateOnviewFreeQuotes();
	}
	
	@Test (priority = 4, invocationCount = 2)
	public void verifyCarInsurance() {
		homePage_Insurance.openCarInsurance();
		String title = driver.getTitle();
		String url = driver.getCurrentUrl();
		if (title.equals("PolicyBazaar Car Insurance: Insure Your Car Today"))
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}
	}
	
	@Test (priority = 6, invocationCount = 2)
	public void verifyFamilyHealthInsurance() {
		homePage_Insurance.openFamilyHealthInsurance();
		String title = driver.getTitle();
		String url = driver.getCurrentUrl();
		if (title.equals("PolicyBazaar Health Insurance: Get a 5 Lac health plan @Rs. 373/Month"))
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}
	}
	
	@Test (priority = 10, invocationCount = 2)
	public void verifyChildSavingsPlans() {
		homePage_Insurance.openChildSavingsPlans();
		String title = driver.getTitle();
		String url = driver.getCurrentUrl();
		if (title.equals("Investment Plan"))
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}
	}
	
	@AfterMethod
	public void logOut() {
		System.out.println("Log Out");
	}
	
	@AfterClass
	public void closeTab() {
		driver.close();		
	}

}
