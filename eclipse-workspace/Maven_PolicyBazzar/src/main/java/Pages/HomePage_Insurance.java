package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_Insurance {
	
	// variables declared
	@FindBy (xpath = "//a[text()='View Plan']")
	private WebElement viewPlans ;
	
	@FindBy (xpath = "//p[text()='Term Life']")
	private WebElement termLifeInsurance ;
	
	@FindBy (xpath = "//p[text()='Health']")
	private WebElement healthInsurance ;
	
	@FindBy (xpath = "//p[text()='Investment ']")
	private WebElement investmentPlans ;

	@FindBy (xpath = "//p[text()='Car']")
	private WebElement carInsurance ;
	
	@FindBy (xpath = "//p[text()='2 Wheeler']")
	private WebElement twoWheelerInsurance ;
	
	@FindBy (xpath = "//p[text()='Family Health']")
	private WebElement familyHealthInsurance ;
	
	@FindBy (xpath = "//p[text()='Travel']")
	private WebElement travelInsurance ;
	
	@FindBy (xpath = "//p[text()='Saral Jeevan']")
	private WebElement saralJeevanBima ;
	
	@FindBy (xpath = "//p[text()='Guaranteed Return']")
	private WebElement guaranteedReturnPlans ;

	@FindBy (xpath = "//p[text()='Child Savings']")
	private WebElement childSavingsPlans ;
	
	@FindBy (xpath = "//p[text()='Retirement']")
	private WebElement retirementPlans ;
	
	@FindBy (xpath = "(//p[text()='Group Health'])[2]")
	private WebElement groupHealthInsurance ;
	
	@FindBy (xpath = "(//p[text()='Home Insurance'])[1]")
	private WebElement homeInsurance ;
	
	@FindBy (xpath = "//p[text()='View All']")
	private WebElement viewAllProducts ;
	
	//variables initialization
	public HomePage_Insurance (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	// Variables use - Action on WebElements
	
	public void openViewPlans ()
	{
		viewPlans.click();
	}
	
	public void openTermLifeInsurance ()
	{
		termLifeInsurance.click();
	}
	
	public void openHealthInsurance ()
	{
		healthInsurance.click();
	}
	
	public void openInvestmentPlans ()
	{
		investmentPlans.click();
	}
	
	public void openCarInsurance ()
	{
		carInsurance.click();
	}
	
	public void openTwoWheelerInsurance ()
	{
		twoWheelerInsurance.click();
	}
	
	public void openFamilyHealthInsurance ()
	{
		familyHealthInsurance.click();
	}
	
	public void openTravelInsurance ()
	{
		travelInsurance.click();
	}
	
	public void openSaralJeevanBima ()
	{
		saralJeevanBima.click();
	}
	
	public void openGuaranteedReturnPlans ()
	{
		guaranteedReturnPlans.click();
	}
	
	public void openChildSavingsPlans ()
	{
		childSavingsPlans.click();
	}
	
	public void openRetirementPlans ()
	{
		retirementPlans.click();
	}
	public void openGroupHealthInsurance ()
	{
		groupHealthInsurance.click();
	}
	public void openHomeInsurance ()
	{
		homeInsurance.click();
	}
	public void openViewAllProducts ()
	{
		viewAllProducts.click();
	}
			
			
			   
			
	
	
}
