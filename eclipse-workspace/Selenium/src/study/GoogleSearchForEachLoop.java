package study;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GoogleSearchForEachLoop {
	public static void main(String[] args) throws InterruptedException {
		
		
//		System.setProperty("webdriver.chrome.driver", "D:\\Running Tools\\selenium_chromedriver\\chromedriver_win32 105\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.google.co.in/");
//		
//		WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
//		search.sendKeys("java tutorials");
//		Thread.sleep(3000);
//		List<WebElement> search1 = driver.findElements(By.xpath("//li[@class='sbct']//div[@role='option']//div[1]//span"));
//		WebElement a = search1.get(0);
//		String b = a.getText();
//		System.out.println(b);
//		
//		for (WebElement ele : search1 )
//		{
//			if (ele.getText().contains("beginners"))
//			{
//				ele.click();
//				break;
//			}
//		}
//		System.out.println("end");
		
		//////////////////////////////////////////////////////////////////////////////////
		
		System.setProperty("webdriver.chrome.driver", "D:\\Running Tools\\selenium_chromedriver\\chromedriver_win32 105\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/maps");
		Thread.sleep(3000);
		WebElement search = driver.findElement(By.xpath("//input[@id='searchboxinput']"));
		search.sendKeys("gondia");
		Thread.sleep(3000);
		String text;
		do 
		{
			search.sendKeys(Keys.ARROW_DOWN);
			text = "Amar Nagar";
		}
		while (!text.isEmpty());
				
		List<WebElement> search1 = driver.findElements(By.xpath(""));
		System.out.println("end");
	}

}
