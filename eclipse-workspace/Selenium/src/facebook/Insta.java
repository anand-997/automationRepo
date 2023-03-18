package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Insta {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\aq1\\\\Downloads\\\\java software\\\\selenium_chromedriver\\\\app\\\\crome\\\\chromedriver_win32\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver () ;
		
		
		driver.navigate().to("https://insuranceproject123.atlassian.net/jira/software/projects/BOQ/boards/1");
		Thread.sleep(5000);
		Actions cursor = new Actions (driver) ;
		WebElement LogIn = driver.findElement(By.xpath("//input[@name='username']"));
		LogIn.sendKeys("anandpawarasp@gmail.com");	
		
		WebElement con = driver.findElement(By.xpath("//span[text()='Continue']"));
		con.click();
		Thread.sleep(3000);
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("pleasure20");
		
		WebElement login = driver.findElement(By.xpath("//span[text()='Log in']"));
		login.click();
		
		Thread.sleep(20000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(2000,0) ; ");
		
		
		System.out.println("pass");
	}

}
