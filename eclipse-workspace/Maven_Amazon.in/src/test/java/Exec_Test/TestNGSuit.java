package Exec_Test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
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
import org.testng.asserts.SoftAssert;

import BrowserSetup.Base;
import Pages.AmazonHomePage;
import Pages.Amazon_Sign_In;
import Pages.HeaderSection;
import Pages.MobilePhones;
import Pages.Smartphones_ProductListningPage;
import utils.Utility;

public class TestNGSuit extends Base {
	
	private WebDriver driver ;
	private AmazonHomePage amazonHomePage ;
	private MobilePhones mobilePhones ;
	private Amazon_Sign_In amazon_Sign_In ;
	private HeaderSection headerSection ;
	private SoftAssert soft ;
	private Smartphones_ProductListningPage smartphones_ProductListningPage ;
	private int testID ;
	
	
	@Parameters("browser")
	
	@BeforeTest
	public void lounchBrowser (String browserName) {
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
	public void createPOMObjects () {
//		headerSection = new HeaderSection (driver);
//		amazon_Sign_In = new Amazon_Sign_In (driver);
		soft = new SoftAssert () ;
		amazonHomePage = new AmazonHomePage (driver) ;
		mobilePhones = new MobilePhones (driver) ;
		mobilePhones = new MobilePhones (driver) ;
		amazonHomePage = new AmazonHomePage (driver) ;
		smartphones_ProductListningPage = new Smartphones_ProductListningPage (driver) ;
	}
	
	@BeforeMethod
	public void goToHomePage () {
		driver.get("https://www.amazon.in/");
//		headerSection.SignInAndAccountLists();
//		amazon_Sign_In.applicantSignIn();
		
	}
	
	@Test (priority = 1)
	public void goMobileAndOpenHeadsets () {
		testID = 3001 ;
		amazonHomePage = new AmazonHomePage (driver) ;
		amazonHomePage.openMobilestab();
		mobilePhones = new MobilePhones (driver) ;
		mobilePhones.openHeadsets();
		String title = driver.getTitle();
		String url = driver.getCurrentUrl();
		
//		Assert.assertEquals(title, "Amazon.in: Mobile Headsets: Electronics");
//		Assert.assertEquals(url, url);
		
		soft.assertEquals(title, "Amazon.in: Mobile Headsets: Electronics");
//		soft.assertEquals(url, url);
		soft.fail();
		soft.assertAll();
	}
	
//	@Test (priority = 2)
//	int TestID = 0002 ;
//	public void goMobileAndOpenSmartphones () {
//		amazonHomePage.openMobilestab();
//		mobilePhones.openSmartphone();
//		String title = driver.getTitle();
//		String url = driver.getCurrentUrl();
////		Assert.assertEquals(title, "Smartphones: Buy Smart Mobile Phones "
////				+ "Online at Best Prices in India - Amazon.in");
////		Assert.assertEquals(url, url);
//		soft.assertEquals(title, "Smartphones: Buy Smart Mobile Phones "
//				+ "Online at Best Prices in India - Amazon.in");
//		soft.assertEquals(url, url);
//		soft.assertAll();
//	}
//	
//	@Test (priority = 3)
//	int testID = 0003 ;
//	public void Verify15thProduct () throws IOException {
//		amazonHomePage.openMobilestab();
//		mobilePhones.openSmartphone();
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(0,3000);");
//		File takesSccreenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		File copy = new File ("D:\\product15.jpeg") ;
//		FileHandler.copy(takesSccreenshot, copy);
//		smartphones_ProductListningPage.openProductNo15();
//	}
		
	@AfterMethod
	public void logOut (ITestResult result) throws IOException {
		if (ITestResult.FAILURE == result.getStatus()) {
			Utility.captureScreenshot(driver, testID) ;
		}
//		headerSection = new HeaderSection (driver);
//		headerSection.signOutAccount();
	}
	
	@AfterClass
	public void removeObject () {
//		headerSection = null ;
//		amazon_Sign_In = null ;
		soft = new SoftAssert () ;
		amazonHomePage = null ;
		mobilePhones = null ;
		mobilePhones = null ;
		amazonHomePage = null ;
		smartphones_ProductListningPage = null ;
	}
	
	@AfterTest
	public void closetest () {
		driver.close();	
		driver = null ;
		System.gc(); // garbage collector
	}

}
