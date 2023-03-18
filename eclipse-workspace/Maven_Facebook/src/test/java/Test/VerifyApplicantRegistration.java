package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.Facebook_logInorSignUpPage;

public class VerifyApplicantRegistration {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Running Tools\\selenium_chromedriver\\chromedriver_win32 105\\chromedriver.exe");
		WebDriver driver = new ChromeDriver () ;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
		Facebook_logInorSignUpPage facebook_logInorSignUpPage = 
				new Facebook_logInorSignUpPage (driver) ;
		facebook_logInorSignUpPage.clickOnCreateNewAccountButton();
		facebook_logInorSignUpPage.sendFirstname();
		facebook_logInorSignUpPage.sendLastname();
		facebook_logInorSignUpPage.sendMobileNumberorEmailAddress();
		facebook_logInorSignUpPage.sendReEnterEmail();
		facebook_logInorSignUpPage.sendNewPassword();
		facebook_logInorSignUpPage.dayMonthYear();
		facebook_logInorSignUpPage.selecCustom();
		facebook_logInorSignUpPage.selectYourPronoun();
		facebook_logInorSignUpPage.sendGenderOptional();
		facebook_logInorSignUpPage.clickOnSignUpButton();
	}

}
