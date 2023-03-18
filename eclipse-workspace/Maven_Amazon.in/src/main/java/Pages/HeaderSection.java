package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HeaderSection {
	
	private WebDriver driver ;
	private Actions act ;
	
	// variables declarations
	@FindBy (xpath = "//a[@id='nav-logo-sprites']")
	private WebElement logo;
	
	@FindBy (xpath = "//span[@id='glow-ingress-line2']")
	private WebElement selectYourAddress;
	
	@FindBy (xpath = "//i[@class='nav-icon']")
	private WebElement allsearchIn;
	
	@FindBy (xpath = "//input[@id='twotabsearchtextbox']")
	private WebElement searchTextBox ;
	
	@FindBy (xpath = "(//input[@type='submit'])[1]")
	private WebElement searchButton;
	
	@FindBy (xpath = "(//span[@class='nav-icon nav-arrow'])[1]")
	private WebElement selectlaungaugeIcon ;
	
	@FindBy (xpath = "//span[text()='Account & Lists']")
	private WebElement helloSignInAccountLists;
		
	@FindBy (xpath = "//span[text()='& Orders']")
	private WebElement returnsAndOrders ;
	
	@FindBy (xpath = "(//span[@class='nav-line-2'])[3]")
	private WebElement cart ;
	
	@FindBy (xpath = "//span[text()='Sign Out']")
	private WebElement signOut;
	
	// variable initialization
	public HeaderSection (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver = driver ;
		act = new Actions (driver) ;
	}
	
	public void clickOnlogo ()
	{
		logo.click();
	}

	public void selectYourAddress ()
	{
		selectYourAddress.click();
	}
	
	public void allsearchIn ()
	{
		allsearchIn.click();
	}
	
	public void sendTosearchTextBox ()
	{
		searchTextBox.sendKeys("mobile");
	}
	
	public void clickOnsearchButton ()
	{
		searchButton.click();
	}
	
	public void selectlaungauge ()
	{
		selectlaungaugeIcon.click();
	}
	
	public void SignInAndAccountLists()
	{
		helloSignInAccountLists.click();
	}
	
	public void openReturnsAndOrders ()
	{
		returnsAndOrders.click();
	}
	
	public void openCart ()
	{
		cart.click();
	}
	
	public void signOutAccount ()
	{
		act.moveToElement(helloSignInAccountLists).perform();
		act.moveToElement(signOut).click().build().perform();
	}
	
	
	
}
