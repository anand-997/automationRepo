package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonHomePage {
	
	private WebDriver driver ;
	private Actions act ;
	private WebDriverWait wait ;
	
	// variables declarations 
	@FindBy (xpath = "(//span[text()='All'])[2]")
	WebElement allMenu ;
	
	@FindBy (xpath = "(//a[@class='nav-a  '])[1]")
	WebElement bestSellers ;
	
	@FindBy (xpath = "//a[text()='Mobiles']")
	WebElement mobiles ;
	
	// personal accouny
	@FindBy (xpath = "//a[text()='Mobiles']")
	WebElement pMobiles ;
		
	@FindBy (xpath = "(//a[@class='nav-a  '])[3]")
	WebElement customerService ;
	
	@FindBy (xpath = "(//a[@class='nav-a  '])[4]")
	WebElement books ;
	
	@FindBy (xpath = "(//a[@class='nav-a  '])[5]")
	WebElement todaysDeals ;
	
	@FindBy (xpath = "//a[text()=' Electronics ']")
	WebElement electronics ;
	
	@FindBy (xpath = "(//a[@class='nav-a  '])[7]")
	WebElement fashion ;
	
	@FindBy (xpath = "(//a[@class='nav-a  '])[8]")
	WebElement prime ;
	
	@FindBy (xpath = "(//a[@class='nav-a  '])[9]")
	WebElement newReleases ;
	
	@FindBy (xpath = "(//a[@class='nav-a  '])[10]")
	WebElement homeandKitchen ;
	
	@FindBy (xpath = "(//a[@class='nav-a  '])[11]")
	WebElement amazonPay ;
	
	@FindBy (xpath = "(//a[@class='nav-a  '])[12]")
	WebElement computers ;
	
	@FindBy (xpath = "(//a[@class='nav-a  '])[13]")
	WebElement sell ;
	
	@FindBy (xpath = "(//a[@class='nav-a  '])[14]")
	WebElement coupons ;
	
	// variables initialization
	public AmazonHomePage (WebDriver driver)
	{
		PageFactory.initElements(driver, this) ;
		act = new Actions (driver) ;
		this.driver = driver ;
		wait = new WebDriverWait (driver, 20) ;
	}
	
	// variable used
	public void clickOnallMenu() 
	{
		allMenu.click();
	}
	
	public void openbestSellersTab() 
	{
		bestSellers.click();
	}
	
	public void openMobilestab () 
	{
		wait.until(ExpectedConditions.visibilityOf(mobiles)) ;
		mobiles.click();
	}
	
	public void pOpenMobilestab () 
	{
		wait.until(ExpectedConditions.visibilityOf(pMobiles)) ;
		pMobiles.click();
	}
	
	public void openCustomerService () 
	{
		customerService.click();
	}
	
	public void openBooksTab () 
	{
		books.click();
	}
	
	public void opentodaysDealsTab () 
	{
		todaysDeals.click();
	}
	
	public void openElectronics () 
	{
		electronics.click();
	}
	
	public void fashion () 
	{
		fashion.click();
	}
	
	public void hoverOnPrime () 
	{
		act.moveToElement(prime).perform();
	}
	
	public void opennewReleases () 
	{
		newReleases.click();
	}
	
	public void openHomeandKitchentab () 
	{
		homeandKitchen.click();
	}
	
	public void openamazonPay () 
	{
		amazonPay.click();
	}
	
	public void openComputersLink () 
	{
		computers.click();
	}
	
	public void openSell() 
	{
		sell.click();
	}
	
	public void openCoupons () 
	{
		coupons.click();
	}
	
}
