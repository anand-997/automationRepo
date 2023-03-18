package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HeaderSection {
	
	// variables declared
	
	@FindBy (xpath = "//a[@class='logo']")
	private WebElement logo ;
	
	@FindBy (xpath = "//a[text()='Sign in']")
	private WebElement signIn ;
	
	@FindBy (xpath = "//a[text()='Insurance Products ']")
	private WebElement insuranceProducts ;
		
	@FindBy (xpath = "//a[text()='Renew Your Policy ']")
	private WebElement renewYourPolicy ;
		
	@FindBy (xpath = "//a[text()='Claim ']")
	private WebElement claim ;
		
	@FindBy (xpath = "//a[text()='Support']")
	private WebElement support ;
		
//	@FindBy (xpath = "//a[text()='Term Insurance']")
//	WebElement termInsurance ;
	
	
	// variables initialization 
	public HeaderSection (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
		
	// use of variables
	public void clickOnLogo ()
	{
		logo.click();
	}
		
	public void clickOnSignIn ()
	{
		signIn.click();
	}
	
	public void moveToInsuranceProducts (Actions mouse)
	{
		mouse.moveToElement(insuranceProducts).perform();
	}
	
	public void moveToRenewYourPolicy (Actions mouse)
	{
		mouse.moveToElement(renewYourPolicy).perform();
	}
	
	public void moveToClaim (Actions mouse)
	{
		mouse.moveToElement(claim).perform();
	}
	
	public void moveToSupport (Actions mouse)
	{
		mouse.moveToElement(support).perform();
	}
	
}


