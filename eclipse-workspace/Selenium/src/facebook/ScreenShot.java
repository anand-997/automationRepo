package facebook;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {
	
public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aq1\\Downloads\\java software\\selenium_chromedriver\\app\\crome\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver ();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		
		File copyto = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE) ;
		File pastto = new File("C:\\Users\\aq1\\Pictures\\Screenshots\\ss.jpg") ;
		FileHandler.copy(copyto, pastto);

}
}
