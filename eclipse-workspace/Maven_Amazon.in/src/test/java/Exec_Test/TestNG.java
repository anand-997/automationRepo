package Exec_Test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Pages.AmazonHomePage;
import Pages.Amazon_Sign_In;
import Pages.CameraLenses;
import Pages.CameraTab;
import Pages.ElectronicTab;
import Pages.HeaderSection;
import Pages.MobilePhones;
import Pages.Smartphones_ProductListningPage;

public class TestNG {
	
	private WebDriver driver ;
	private AmazonHomePage amazonHomePage ;
	private MobilePhones mobilePhones ;
	private Amazon_Sign_In amazon_Sign_In ;
	private HeaderSection headerSection ;
	private SoftAssert soft ;
	
	@BeforeClass
	public void lounchBrowser () {
		System.setProperty("webdriver.chrome.driver", "D:\\Running Tools\\"
				+ "selenium_chromedriver\\chromedriver_win32 105\\chrome"
				+ "driver.exe");
		driver = new ChromeDriver () ;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);		
	}
	
	@BeforeMethod
	public void goToHomePage () {
		driver.get("https://www.amazon.in/");
//		headerSection = new HeaderSection (driver);
//		headerSection.SignInAndAccountLists();
//		amazon_Sign_In = new Amazon_Sign_In (driver);
//		amazon_Sign_In.applicantSignIn();
		
	}
	
	@Test (priority = 1)
	public void goMobileAndOpenHeadsets () {
		amazonHomePage = new AmazonHomePage (driver) ;
		amazonHomePage.openMobilestab();
		mobilePhones = new MobilePhones (driver) ;
		mobilePhones.openHeadsets();
		String title = driver.getTitle();
		String url = driver.getCurrentUrl();
		
//		Assert.assertEquals(title, "Amazon.in: Mobile Headsets: Electronics");
//		Assert.assertEquals(url, url);
		soft = new SoftAssert () ;
		soft.assertEquals(title, "Amazon.in: Mobile Headsets: Electronics");
//		soft.assertEquals(url, url);
		soft.assertAll();
	}
	
	@Test (priority = 2, dependsOnMethods = "Verify15thProduct")
	public void goMobileAndOpenSmartphones () {
		soft = new SoftAssert () ;
		amazonHomePage = new AmazonHomePage (driver) ;
		amazonHomePage.openMobilestab();
		mobilePhones = new MobilePhones (driver) ;
		mobilePhones.openSmartphone();
		String title = driver.getTitle();
		String url = driver.getCurrentUrl();
		
//		Assert.assertEquals(title, "Smartphones: Buy Smart Mobile Phones "
//				+ "Online at Best Prices in India - Amazon.in");
//		Assert.assertEquals(url, url);
		soft = new SoftAssert () ;
		soft.assertEquals(title, "Smartphones: Buy Smart Mobile Phones "
				+ "Online at Best Prices in India - Amazon.in");
		soft.assertEquals(url, url);
		soft.assertAll();
	}
	
	@Test (priority = 3)
	public void Verify15thProduct () throws IOException {
		amazonHomePage = new AmazonHomePage (driver) ;
		amazonHomePage.openMobilestab();
		mobilePhones = new MobilePhones (driver) ;
		mobilePhones.openSmartphone();
		Smartphones_ProductListningPage smartphones_ProductListningPage = 
				new Smartphones_ProductListningPage (driver) ;
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,3000);");
		File takesSccreenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File copy = new File ("D:\\product15.jpeg") ;
		FileHandler.copy(takesSccreenshot, copy);
		smartphones_ProductListningPage.openProductNo15();
	}
	
	
	
	@AfterMethod
	public void logOut () {
//		headerSection = new HeaderSection (driver);
//		headerSection.signOutAccount();
	}
	
	@AfterClass
	public void closeTab () {
		driver.close();	
	}

}
