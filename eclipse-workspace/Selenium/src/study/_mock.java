package study;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class _mock {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Running Tools"
				+ "\\selenium_chromedriver\\chromedriver_win32 105\\chromedriver.exe");
		WebDriver driver = new ChromeDriver () ;
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.w3schools.com/");
				
		WebElement tutorials = driver
				.findElement(By.xpath("//a[@id='navbtn_tutorials']"));
		tutorials.click();
		Actions act = new Actions (driver) ;
		for (int i = 31; i <= 35 ; i++)
		{
			WebElement JavaScript = driver
					.findElement(By.xpath("(//a[@class='w3-bar-item w3-button'])[" + i + "]"));
			act.keyDown(Keys.LEFT_CONTROL).click(JavaScript).build().perform(); 
		}
		
		String [] url1 = { "https://www.w3schools.com/js/js_json_intro.asp",
							"https://www.w3schools.com/angular/default.asp",
							"https://www.w3schools.com/react/default.asp",
							"https://www.w3schools.com/jquery/default.asp",
							"https://www.w3schools.com/js/default.asp"};
				
		for (int j = 0; j <= (url1.length-1) ; j++)
		{
			
			ArrayList<String> list = new ArrayList<String> (driver.getWindowHandles());
			String window1 = list.get(j+1);
			driver.switchTo().window(window1);
			Thread.sleep(5000);
			String url = driver.getCurrentUrl();
			if (url.equals(url1[j]))
			{ 
				System.out.println("PASS");
			}
			else
			{
				System.out.println("FAIL");
			}
		}
	
		
		
		
		
		
		
	}

}
