package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MobileProductDiscriptionPage {

	private WebDriver driver ;
	
//	private Actions act ;
	
	@FindBy (xpath = "(//input[@class='a-button-input'])[12]")
	private WebElement img1 ;
	
	@FindBy (xpath = "(//input[@class='a-button-input'])[13]")
	private WebElement img2 ;
	
	@FindBy (xpath = "(//input[@class='a-button-input'])[14]")
	private WebElement img3 ;
	
	@FindBy (xpath = "(//i[@class='a-icon a-icon-next-rounded'])[1]")
	private WebElement advertisingBannerNext1 ;
	
	@FindBy (xpath = "(//i[@class='a-icon a-icon-next-rounded'])[2]")
	private WebElement advertisingBannerNext2 ;
	
	@FindBy (xpath = "(//i[@class='a-icon a-icon-next-rounded'])[3]")
	private WebElement advertisingBannerNext3 ;
	
	@FindBy (xpath = "(//i[@class='a-icon a-icon-previous-rounded'])[1]")
	private WebElement advertisingBannerBack1 ;
	
	@FindBy (xpath = "(//i[@class='a-icon a-icon-previous-rounded'])[2]")
	private WebElement advertisingBannerBack2 ;
	
	@FindBy (xpath = "(//i[@class='a-icon a-icon-previous-rounded'])[3]")
	private WebElement advertisingBannerBack3 ;
	
	@FindBy (xpath = "//input[@id='add-to-cart-button']")
	private WebElement addToCartOnProductPage ;
	
	public MobileProductDiscriptionPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver = driver ;
	}
	
	public void changeImage () throws InterruptedException {
		img1.click();
		Thread.sleep(2000);
		img2.click();
		Thread.sleep(2000);
		img3.click();
		Thread.sleep(2000);
	}
	
	public void changeBannerForward () throws InterruptedException {
		advertisingBannerNext1.click();
		Thread.sleep(2000);
		advertisingBannerNext2.click();
		Thread.sleep(2000);
		advertisingBannerNext3.click();
		Thread.sleep(2000);
		}
		
	public void changeBannerBackward () throws InterruptedException {
		advertisingBannerBack1.click();
		Thread.sleep(2000);
		advertisingBannerBack2.click();
		Thread.sleep(2000);
		advertisingBannerBack3.click();
		Thread.sleep(2000);
		}
		public void clickOnAddToCartOnProductPage () {
			addToCartOnProductPage.click();
		}
}
