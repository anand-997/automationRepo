package Exec_Test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import Pages.AmazonHomePage;
import Pages.MobilePhones;
import Pages.Smartphones_ProductListningPage;

public class VerifyNthNoOfProductOfSmartphones {
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", 
				"D:\\Running Tools\\selenium_chromedriver\\"
				+ "chromedriver_win32 105\\chromedriver.exe");
		WebDriver driver = new ChromeDriver () ;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		
		AmazonHomePage amazonHomePage = new AmazonHomePage (driver) ;
		amazonHomePage.openMobilestab() ;
		
		MobilePhones mobilePhones = new MobilePhones (driver) ;
		mobilePhones.openSmartphone() ;
		
		Smartphones_ProductListningPage smartphones_ProductListningPage = 
				new Smartphones_ProductListningPage (driver) ;
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,3000);");
		
		File takesSccreenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File copy = new File ("D:\\product15.jpeg") ;
		FileHandler.copy(takesSccreenshot, copy);
		smartphones_ProductListningPage.openProductNo15();
		
	}

}
