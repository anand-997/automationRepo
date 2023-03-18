package Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindow {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Running Tools\\selenium_chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver () ;
		driver.get("https://www.amazon.in/");
		
		WebElement mobile = driver.findElement(By.xpath("//a[text()='Mobiles']"));
		mobile.click();
		
		
		
		
		
		Thread.sleep(8000);
		driver.quit();
	}

}
