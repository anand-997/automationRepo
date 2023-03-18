package Exec_Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.Amazon_Sign_In;
import Pages.HeaderSection;

public class VerifyUserShouldBeSignIn {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Running Tools\\selenium_chromedriver\\chromedriver_win32 105\\chromedriver.exe");
		WebDriver driver = new ChromeDriver () ;
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		
		HeaderSection headerSection = new HeaderSection (driver);
		headerSection.SignInAndAccountLists();
		
		Amazon_Sign_In amazon_Sign_In = new Amazon_Sign_In (driver);
//		amazon_Sign_In.sendEmail();
////		amazon_Sign_In.sendMobileNumber();
//		amazon_Sign_In.clickOncontinueButton();
//		amazon_Sign_In.sendpassword();
//		amazon_Sign_In.clickOnsignInButton();
		amazon_Sign_In.applicantSignIn();
		
		headerSection = new HeaderSection (driver);
		headerSection.signOutAccount();

		
		
		
		
	}

}
