package Amazon;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class RandomSS {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aq1\\Downloads\\java software\\selenium_chromedriver\\app\\crome\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver () ;
		driver.get("https://www.amazon.in/");
		
		for (int i = 1; i <= 7; i++)
		{
			Random rnd = new Random ();
			int num = rnd.nextInt(99999);
			System.out.println(num);
			
			File Copyss = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File Pastss = new File ("C:\\Users\\aq1\\Pictures\\Screenshots\\img" + num + ".jpg");
			FileHandler.copy(Copyss, Pastss);
			Thread.sleep(1000);
		}
		System.out.println("end");
	}

}
