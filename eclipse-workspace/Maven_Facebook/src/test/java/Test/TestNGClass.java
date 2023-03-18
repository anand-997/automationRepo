package Test;



import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import BrowserSetup.Base;
import Pages.Facebook_logInorSignUpPage;
import utils.Utility;

public class TestNGClass extends Base {
	private WebDriver driver ;
	private Facebook_logInorSignUpPage facebook_logInorSignUpPage ;
	private String data ;
	private int testID ;
	
	@Parameters ("browser")
	@BeforeTest
	public void browserLounch (String browserName)
	{
		if (browserName.equals("Chrome")) {
			driver = openChromeBrowser();
		}
		
		if (browserName.equals("Firefox")) {
			driver = openFirefoxBrowser();
		}
		
		if (browserName.equals("Edge")) {
			driver = openEdgeBrowser() ;
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	
	}
	
	@BeforeClass
	public void objectDeclare ()
	{
		facebook_logInorSignUpPage = 
				new Facebook_logInorSignUpPage (driver) ;
	}
	
	@BeforeMethod
	public void clickOnSignUpButton ()
	{
		driver.get("https://www.facebook.com/");
		facebook_logInorSignUpPage.clickOnCreateNewAccountButton();
	}
	
	@Test
	public void test1 () throws IOException
	{
		testID = 101 ;
		data = Utility.getExcelSheet("Facebook", 1, 0) ;
		facebook_logInorSignUpPage.sendFirstname(data);
		data = Utility.getExcelSheet("Facebook", 1, 1) ;
		facebook_logInorSignUpPage.sendLastname(data);
		data = Utility.getExcelSheet("Facebook", 2, 0) ;
		facebook_logInorSignUpPage.sendMobileNumberorEmailAddress(data);
		data = Utility.getExcelSheet("Facebook", 2, 0) ;
		facebook_logInorSignUpPage.sendReEnterEmail(data);
		data = Utility.getExcelSheet("Facebook", 2, 1) ;
		facebook_logInorSignUpPage.sendNewPassword(data);
		facebook_logInorSignUpPage.dayMonthYear();
		facebook_logInorSignUpPage.selecCustom();
		facebook_logInorSignUpPage.selectYourPronoun();
		data = Utility.getExcelSheet("Facebook", 3, 1) ;
		facebook_logInorSignUpPage.sendGenderOptional(data);
		facebook_logInorSignUpPage.clickOnSignUpButton();
		
		String url = driver.getCurrentUrl() ;
		
		Assert.assertEquals(url, "https://www.facebook.com/confirmemai"
				+ "l.php?next=https%3A%2F%2Fwww.facebook.com%2F", "url is wrong");
	}
	
	@AfterMethod
	public void afterMethod (ITestResult result) throws IOException
	{
		if (ITestResult.FAILURE == result.getStatus()) {
			Utility.captureScreenshot(driver, testID);			
		}
	}
	
	@AfterClass
	public void afterClass ()
	{
		facebook_logInorSignUpPage = null ;
	}
	
	@AfterTest
	public void afterTest ()
	{
		driver.close();
		System.gc();
	}
	
	

}
