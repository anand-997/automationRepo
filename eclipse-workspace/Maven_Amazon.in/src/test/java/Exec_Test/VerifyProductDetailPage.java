package Exec_Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.AmazonHomePage;
import Pages.Amazon_Sign_In;
import Pages.HeaderSection;
import Pages.MobilePhones;
import Pages.MobileProductDiscriptionPage;
import Pages.Smartphones_ProductListningPage;

public class VerifyProductDetailPage {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", 
				"D:\\Running Tools\\selenium_chromedriver\\"
				+ "chromedriver_win32 105\\chromedriver.exe");
		WebDriver driver = new ChromeDriver () ;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		
		HeaderSection headerSection = new HeaderSection (driver);
		headerSection.SignInAndAccountLists();
		
		Amazon_Sign_In amazon_Sign_In = new Amazon_Sign_In (driver) ;
		amazon_Sign_In.applicantSignIn();
		
		AmazonHomePage amazonHomePage = new AmazonHomePage (driver);
		amazonHomePage.pOpenMobilestab();
		
		MobilePhones mobilePhones = new MobilePhones (driver);
		mobilePhones.openSmartphone();
		
		Smartphones_ProductListningPage smartphones_ProductListningPage = 
				new Smartphones_ProductListningPage (driver);
		smartphones_ProductListningPage.openProductNo1();
		
		MobileProductDiscriptionPage mobileProductDiscriptionPage = 
				new MobileProductDiscriptionPage (driver);
		mobileProductDiscriptionPage.changeImage();
		mobileProductDiscriptionPage.changeBannerForward();
		mobileProductDiscriptionPage.changeBannerBackward();
		mobileProductDiscriptionPage.clickOnAddToCartOnProductPage();
		
		headerSection.openCart();
		headerSection.signOutAccount();
		
		driver.close();
		
	}

}
