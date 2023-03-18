package Exel_Handle;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandel {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aq1\\Downloads\\selenium_chromedriver\\app\\crome\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver ();
		
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		WebElement submit = driver.findElement(By.xpath("//input[@name='submit']"));
		submit.click();
		Thread.sleep(3000);
//		Alert alert = driver.switchTo().alert();
//		alert.accept();
//		Thread.sleep(2000);
//		alert.accept();
//		Thread.sleep(3000);
		WebElement agile = driver.findElement(By.xpath("//a[text()='Agile Project']"));
		agile.click();
		
	}

}
