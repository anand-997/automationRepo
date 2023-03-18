package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MobilePhones {
	// variable declaration
//	@FindBy (xpath = "//div[@class='sl-sobe-carousel-sub-card-image']")
//	private List<WebElement> elementsOfMobileTab ;
	
	@FindBy (xpath = "(//div[@class='sl-sobe-carousel-sub-card-image'])[1]")
	private WebElement smartphone;
	
	@FindBy (xpath = "(//div[@class='sl-sobe-carousel-sub-card-image'])[2]")
	private WebElement allMobilesAccersories;
	
	@FindBy (xpath = "(//div[@class='sl-sobe-carousel-sub-card-image'])[3]")
	private WebElement featurePhone;
	
	@FindBy (xpath = "(//div[@class='sl-sobe-carousel-sub-card-image'])[4]")
	private WebElement headsets;
	
	@FindBy (xpath = "(//div[@class='sl-sobe-carousel-sub-card-image'])[5]")
	private WebElement powerBanks;
	
	@FindBy (xpath = "(//div[@class='sl-sobe-carousel-sub-card-image'])[6]")
	private WebElement casesAndCover;
	
	// variable initialization
	public MobilePhones (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	// variable use
	public void openSmartphone ()
	{
		smartphone.click();
	}
	
	public void openAllMobilesAccersories ()
	{
		allMobilesAccersories.click();
	}
	
	public void openFeaturePhone()
	{
		featurePhone.click();
	}
	
	public void openHeadsets ()
	{
		headsets.click();
	}
	
	public void openPowerBanks ()
	{
		powerBanks.click();
	}
	
	public void openCasesAndCover ()
	{
		casesAndCover.click();
	}
	

}
