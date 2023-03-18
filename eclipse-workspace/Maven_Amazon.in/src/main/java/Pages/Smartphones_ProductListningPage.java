package Pages;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Smartphones_ProductListningPage {
	
	private static final String TakesSccreenshot = null;
	private WebDriver driver ;
	private JavascriptExecutor js ;
	private Actions act ;
				// change product by changing index of xpath
	@FindBy ( xpath = "(//div[@class='a-section octopus-pc-item-hue-shield octopus-pc-item-image-background-v3'])[1]")
	private WebElement productNo1 ;
	
	@FindBy ( xpath = "(//div[@class='a-section octopus-pc-item-hue-shield octopus-pc-item-image-background-v3'])[1]")
	private WebElement productNo2 ;
	
	@FindBy ( xpath = "(//div[@class='a-section octopus-pc-item-hue-shield octopus-pc-item-image-background-v3'])[58]")
	private WebElement productNo15 ;
	
	@FindBy (xpath = "//span[text()='Hello, sign in']")
	private WebElement helloSignInAccountLists;
	
	@FindBy (xpath = "//span[text()='Sign Out']")
	private WebElement signOut;
	
	public Smartphones_ProductListningPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver = driver ;
		js = (JavascriptExecutor) driver;
		act = new Actions (driver) ;
	}
	
	public void openProductNo1 ()
	{
		productNo1.click();
	}
	
	public void openProductNo2 ()
	{
		productNo2.click();
	}
	
	public void openProductNo15 ()
	{
		js = (JavascriptExecutor) driver;
		js.executeScript ("arguments[0].scrollIntoView(true);", productNo15 ) ;
		productNo15.click();
	}
	
	public void signOutPage ()
	{
		act.moveToElement(helloSignInAccountLists).perform();
		act.moveToElement(signOut).click().build().perform();
		
	}
}
