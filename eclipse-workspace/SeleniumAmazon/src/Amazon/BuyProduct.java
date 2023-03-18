package Amazon;

import java.time.Duration;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BuyProduct {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Running Tools\\selenium_chromedriver\\chromedriver_win32 105\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); // 3.141.59 version
		
		driver.get("https://www.amazon.in/");
		
		Actions mouse = new Actions (driver);
		WebElement logIn = driver.findElement(By.xpath("//span[text()='Account & Lists']"));
		mouse.moveToElement(logIn).perform();
		WebElement logInButton = driver.findElement(By.xpath("//span[text()='Sign in']"));
		mouse.moveToElement(logInButton).click().build().perform();
		
		WebElement emailTestBox = driver.findElement(By.xpath("//input[@id='ap_email']"));
		emailTestBox.sendKeys("nittyanand11@gmail.com");
		
		WebElement continew = driver.findElement(By.xpath("//input[@id='continue']"));
		continew.click();
		
		WebElement pass = driver.findElement(By.xpath("//input[@id='ap_password']"));
		pass.sendKeys("Pleasure@20");
		
		WebElement signIn = driver.findElement(By.xpath("//input[@id='signInSubmit']"));
		signIn.click();
		
//		WebElement passs = driver.findElement(By.xpath("//input[@id='ap_password']"));
//		passs.sendKeys("Pleasure@20");
//		
//		Thread.sleep(10000);
//		
//		WebElement signIna = driver.findElement(By.xpath("//input[@id='signInSubmit']"));
//		signIna.click();
		
		WebElement allmenu = driver.findElement(By.xpath("//i[@class='hm-icon nav-sprite']"));
		allmenu.click();
		
		WebElement mobCom = driver.findElement(By.xpath("//div[text()='Mobiles, Computers']"));
		mobCom.click();
		
		WebElement allMonCom = driver.findElement(By.xpath("//a[text()='All Mobile Phones']"));
		allMonCom.click();
		
		WebElement mobile = driver.findElement(By.xpath("(//span[@class='rush-component'])[2]"));
		mobile.click();
		
		ArrayList<String> list = new ArrayList<String>(driver.getWindowHandles());
		String window1 = list.get(0);
		System.out.println(window1);
		String window2 = list.get(1);
		System.out.println(window2);
		
		driver.switchTo().window(window2);
		
		WebElement addToCartButton = driver.findElement(By.xpath("//input[@type='button']"));
		addToCartButton.click();
		
		WebDriverWait wait = new WebDriverWait (driver, Duration.ofSeconds(10));
		WebElement closePopup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@id='attach-close_sideSheet-link'])[1]")));
		closePopup.click();
		
		Wait<WebDriver> fwait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofMillis(100))
				.ignoring(NoSuchElementException.class);
		
		WebElement ele = fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[text()='1'])[1]")));
//			until(new Function<WebDriver, WebElement>(){
//			public WebElement apply(WebDriver driver)
//			{
//				return driver.findElement(By.xpath("(//span[text()='1'])[1]"));
//			}
//			
//		});
		ele.click();

		
		WebElement procedToBye = driver.findElement(By.xpath("(//input[@type='submit'])[2]"));
		procedToBye.click();
		
		WebElement useadd = driver.findElement(By.xpath("(//input[@type='submit'])[2]"));
		useadd.click();
		
		WebElement radio = driver.findElement(By.xpath("(//input[@type='radio'])[12]"));
		radio.click();
		
		WebElement usepay = driver.findElement(By.xpath("(//input[@type='submit'])[63]"));
		usepay.click();
		
		Thread.sleep(5000);
		driver.quit();
		
		System.out.println("done");
		
		
		
		
		
		
		
		
		
		
	}
}
