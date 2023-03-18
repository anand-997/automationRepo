package Amazon;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class W3schoolIframe {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Running Tools\\selenium_chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver () ;
		driver.get("https://www.w3schools.com/js/js_popup.asp");
		
		WebElement tryitY = driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[1]"));
		tryitY.click();
		
		ArrayList<String> list = new ArrayList<String> (driver.getWindowHandles());
		String ad1 = list.get(0); // parent
		String ad2 = list.get(1); // child
		
		driver.switchTo().window(ad2);
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		driver.switchTo().frame(frame);
		WebElement tryit = driver.findElement(By.xpath("//button[text()='Try it']"));
		tryit.click();
		
		
		
		
		
	}

}
