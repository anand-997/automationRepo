package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TermLifeInsurance {

	@FindBy (xpath = "(//i[@class='radio'])[1]")
	private WebElement male ;
	
	@FindBy (xpath = "(//i[@class='radio'])[2]")
	private WebElement female ;
	
	@FindBy (xpath = "//input[@id='nameAdd']")
	private WebElement yourName ;
		
	@FindBy (xpath = "//input[@id='dob']")
	private WebElement dateOfBirth ;
		
	@FindBy (xpath = "//input[@id='mobileNo']")
	private WebElement mobileNumber ;
		
	@FindBy (xpath = "//span[text()='View Free Quotes ']")
	private WebElement viewFreeQuotes ;
	
	@FindBy (xpath = "//span[@class='control']")
	private WebElement updatesonWhatsApp ;
	
	@FindBy (xpath = "//a[text()=' Privacy policy,']")
	private WebElement privacypolicy ;
	
	@FindBy (xpath = "//a[text()='Terms of Use ']")
	private WebElement termsofUse ;
	
	@FindBy (xpath = "//a[text()=' Disclaimers ']")
	private WebElement disclaimers ;
	
	// variable initialization 
	public TermLifeInsurance (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	// use of variables
	public void clickOnMale ()
	{
		male.click();
	}
	
	public void clickOnFemale ()
	{
		female.click();
	}
	
	public void sendyourName ()
	{
		yourName.sendKeys("Juley");
	}
	
	public void senddDateOfBirth ()
	{
		dateOfBirth.sendKeys("21031999");
	}
	
	public void sendmobileNumber ()
	{
		mobileNumber.sendKeys("9764613651");
	}
	
	public void clickOnviewFreeQuotes ()
	{
		viewFreeQuotes.click();
	}
	
	public void navigateOnviewFreeQuotes ()
	{
		male.click();
		yourName.sendKeys("jhony mike");
		dateOfBirth.sendKeys("21031999");
		mobileNumber.sendKeys("9764613651");
		viewFreeQuotes.click();
	}
	
	public void EnableUpdatesonWhatsApp ()
	{
		updatesonWhatsApp.click();
	}
	
	public void openPrivacypolicy ()
	{
		privacypolicy.click();
	}
	
	public void openTermsofUse ()
	{
		termsofUse.click();
	}
	
	public void openDisclaimers ()
	{
		disclaimers.click();
	}
	
}
