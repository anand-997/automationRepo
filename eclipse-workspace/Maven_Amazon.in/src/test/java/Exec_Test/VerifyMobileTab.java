package Exec_Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.AmazonHomePage;
import Pages.MobilePhones;

public class VerifyMobileTab {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Running Tools\\selenium_chromedriver\\chromedriver_win32 105\\chromedriver.exe");
		WebDriver driver = new ChromeDriver () ;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		
		AmazonHomePage amazonHomePage = new AmazonHomePage (driver) ;
		amazonHomePage.openMobilestab();
		
		String url = driver.getCurrentUrl() ;
		String title = driver.getTitle() ;
		
		if (url.equals("https://www.amazon.in/mobile-phones/b/?ie=UTF8&node=1389401031&ref_=nav_cs_mobiles") 
			&& 
			title.equals("Mobile Phones: Buy New Mobiles Online at Best Prices in India | Buy Cell Phones Online - Amazon.in"))
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}
		
		MobilePhones mobilePhones = new MobilePhones (driver) ;
		mobilePhones.openPowerBanks() ;
		
		url = driver.getCurrentUrl() ;
		title = driver.getTitle() ;
		
		if (url.equals("https://www.amazon.in/b/ref=AF_WIN_bub_w_cml_t_5?pf_rd_r=09A3PCEWAVV9CTH9ERZ4&pf_rd_p=27b0e0ac-606f-412c-a9f0-000f59666c15&pf_rd_m=A1VBAL9TL5WCBF&pf_rd_s=merchandised-search-2&pf_rd_t=&pf_rd_i=1389401031&node=6612025031") 
				&& 
				title.equals("Power Bank: Buy Power Banks online at best prices in India - Amazon.in"))
			{
				System.out.println("PASS");
			}
			else
			{
				System.out.println("FAIL");
			}
		
	}

}
