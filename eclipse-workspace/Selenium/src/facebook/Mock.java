package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Mock {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aq1\\Downloads\\java software\\selenium_chromedriver\\app\\crome\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		Actions act = new Actions (driver);
		
		WebElement close = driver.findElement(By.xpath("//button[text()='✕']"));
		act.moveToElement(close).click().build().perform();
		Thread.sleep(8000);
		
		WebElement login = driver.findElement(By.xpath("//button[@id='loginbutton']"));
		act.moveToElement(login).contextClick(login).build().perform();
		
		
//		WebElement Day = driver.findElement(By.xpath("//select[@id='day']"));
//		Select selDay = new Select(Day);
//		selDay.selectByIndex(19);
//		
//		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
//		Select selmonth = new Select(month);
//		selmonth.selectByValue("2");
//		
//		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
//		Select selyear = new Select(year);
//		selyear.selectByVisibleText("1997");
		
		System.out.println("Pass");
		
		
		
		
		
	}

}
