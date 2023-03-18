package Amazon;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Amazon1 {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Running Tools\\selenium_chromedriver\\chromedriver_win32 105\\chromedriver.exe");
		WebDriver driver = new ChromeDriver () ;
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		JavascriptExecutor js=  (JavascriptExecutor)driver;
	    
		js.executeScript("window.scrollBy(0,3000)");

		
		
		
		
		
		
//		for (int i = 0; i < 7; i++)
//		{
//			DateTimeFormatter DateTime = DateTimeFormatter.ofPattern("MM-dd-yyyy HH-mm-ss");
//			LocalDateTime now = LocalDateTime.now();
//			System.out.println(DateTime.format(now));
//			
//			File Copyss = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//			File Pastss = new File ("C:\\Users\\aq1\\Pictures\\Screenshots\\img" + DateTime.format(now) + ".jpg");
//			FileHandler.copy(Copyss, Pastss);
//			Thread.sleep(1000);
//		}
//		System.out.println("end");
	}
}
