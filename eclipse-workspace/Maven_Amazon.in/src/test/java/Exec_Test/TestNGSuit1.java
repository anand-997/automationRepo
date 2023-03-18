package Exec_Test;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import BrowserSetup.Base;
import Pages.AmazonHomePage;
import Pages.CameraLenses;
import Pages.CameraTab;
import Pages.ElectronicTab;

public class TestNGSuit1 extends Base {
	
	private WebDriver driver ;
	private AmazonHomePage amazonHomePage ;
	private ElectronicTab electronicTab ;
	private CameraTab cameraTab ;
	private CameraLenses cameraLenses ;
	private ArrayList<String> tabList ;
	
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
	public void lounchBrowser () {
//		headerSection = new HeaderSection (driver);
//		amazon_Sign_In = new Amazon_Sign_In (driver);
		amazonHomePage = new AmazonHomePage (driver) ;
		electronicTab = new ElectronicTab (driver) ;
		cameraTab = new CameraTab (driver);
		cameraLenses = new CameraLenses (driver);
	}
	
	@BeforeMethod
	public void goToHomePage () {
		driver.get("https://www.amazon.in/");
//		headerSection.SignInAndAccountLists();
//		amazon_Sign_In.applicantSignIn();		
	}

	@Test (priority = 4)
	public void Verify12thProductInCameraLense () throws InterruptedException {
		int TestID = 2001 ;
		amazonHomePage.openElectronics();
		electronicTab.openCamera();		
		cameraTab.openLenses();		
		cameraLenses.open12thCanonLense();	
		tabList = new ArrayList<String> (driver.getWindowHandles());
		String window = tabList.get(1);
		driver.switchTo().window(window);
		String title = driver.getTitle();
		Assert.assertEquals(title, 
				"Canon RF 100-400mm f/5.6-8 is USM Mirrorl"
				+ "ess TelePhoto Zoom Lens : Amazon.in: "
				+ "Electronics");
//		Thread.sleep(4000);
	}
	
	@AfterMethod
	public void logOut () {
		driver.close();
//		headerSection = new HeaderSection (driver);
//		headerSection.signOutAccount();
	}
	
	@AfterClass
	public void removeObject () {
//		headerSection = null;
//		amazon_Sign_In = null;
		amazonHomePage = null ;
		electronicTab = null ;
		cameraTab = null ;
		cameraLenses = null ;
	}
	
	@AfterTest
	public void browserClose () {

		driver.quit();
		driver = null ;
		System.gc(); // garbage collector
	}

}
