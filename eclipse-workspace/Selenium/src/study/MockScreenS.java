package study;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class MockScreenS {
	
	

	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Running Tools\\selenium_chromedriver\\chromedriver_win32 105\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		File copy = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File past = new File ("D:\\amazonmockss.jpeg");
		FileHandler.copy(copy, past);
		
		driver.close();
		System.out.println("end");
	}

}
