package study;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableHandeling {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Running Tools\\selenium_chromedriver\\chromedriver_win32 105\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		List<WebElement> heading = driver.findElements(By.xpath("//table[@id='customers']//th"));
		List<WebElement> celldata = driver.findElements(By.xpath("//table[@id='customers']//td"));
				
		for (int k = 0 ; k < heading.size(); k++)
		{
			String b = heading.get(k).getText();
			System.out.print(b + ", ");
		}
		System.out.println();
		
		for (int i = 0; i < celldata.size(); i = i + 3)
		{
			for (int j = 0 ; j < 3; j++)
			{
				String b = celldata.get(j+i).getText();
				System.out.print(b + ", ");
			}
			System.out.println();
		}
		System.out.println("end");
	}

}
