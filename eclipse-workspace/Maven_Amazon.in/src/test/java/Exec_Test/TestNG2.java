package Exec_Test;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.AmazonHomePage;
import Pages.CameraLenses;
import Pages.CameraTab;
import Pages.ElectronicTab;

public class TestNG2 {
	
	private WebDriver driver ;
	private AmazonHomePage amazonHomePage ;
	
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

	@Test (priority = 4)
	public void Verify12thProductInCameraLense () throws InterruptedException {
		amazonHomePage = new AmazonHomePage (driver) ;
		amazonHomePage.openElectronics();
		ElectronicTab electronicTab = new ElectronicTab (driver) ;
		electronicTab.openCamera();
		CameraTab cameraTab = new CameraTab (driver);
		cameraTab.openLenses();
		CameraLenses cameraLenses = new CameraLenses (driver);
		cameraLenses.open12thCanonLense();
			
		ArrayList<String> tabList = new ArrayList<String> (driver.getWindowHandles());
		String window = tabList.get(1);
		driver.switchTo().window(window);
		
		String title = driver.getTitle();
		Assert.assertEquals(title, 
				"Buy Canon EF 85mm f/1.8 USM Medium Telephoto Lens for Canon SLR Cameras Online at Low Price in India | Canon Camera Reviews & Ratings - Amazon.in");
	}
	
	@AfterMethod
	public void logOut () {
//		headerSection = new HeaderSection (driver);
//		headerSection.signOutAccount();
		driver.close();
	}
	
	@AfterClass
	public void closeTab () {
		driver.quit();
	}
}
