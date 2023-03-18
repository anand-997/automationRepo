package Exec_Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.AmazonHomePage;
import Pages.MobilePhones;

public class VerifyHeadphonesTab {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Running Tools\\selenium_chromedriver\\chromedriver_win32 105\\chromedriver.exe");
		WebDriver driver = new ChromeDriver () ;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		
		AmazonHomePage amazonHomePage = new AmazonHomePage (driver) ;
		amazonHomePage.openMobilestab();
		
		MobilePhones mobilePhones = new MobilePhones (driver) ;
		mobilePhones.openHeadsets();
		String title = driver.getTitle();
		String url = driver.getCurrentUrl();
		
		if (title.equals("Amazon.in: Mobile Headsets: Electronics") 
			&& 
			url.equals("https://www.amazon.in/b/ref=AF_WIN_bub_w_cml_t_4?pf_rd_r=K88J957MTK3JHAHY7ZTB&pf_rd_p=27b0e0ac-606f-412c-a9f0-000f59666c15&pf_rd_m=A1VBAL9TL5WCBF&pf_rd_s=merchandised-search-2&pf_rd_t=&pf_rd_i=1389401031&node=21541572031"))
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}
		
	}

}
