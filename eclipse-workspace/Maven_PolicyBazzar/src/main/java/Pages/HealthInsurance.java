package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HealthInsurance {
	
	// variable declaration
	@FindBy (xpath="(//i[@class='checkbox'])[1]")
	private WebElement self;
	
	@FindBy (xpath="(//i[@class='checkbox'])[2]")
	private WebElement spouse;
	
	@FindBy (xpath="(//i[@class='checkbox'])[3]")
	private WebElement son;
	
	@FindBy (xpath="(//i[@class='checkbox'])[4]")
	private WebElement daughter;
	
	@FindBy (xpath="(//i[@class='checkbox'])[5]")
	private WebElement father;
	
	@FindBy (xpath="(//i[@class='checkbox'])[6]")
	private WebElement mother;
	
	@FindBy (xpath="//p[text()='More members']")
	private WebElement moreMembers;
	
	@FindBy (xpath="//input[@id='submitButton']")
	private WebElement continew ;

	// variable initialization
	public HealthInsurance (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	// use of variables
	public void ClickOnself ()
	{
		self.click();
	}
	
	public void ClickOnspouse ()
	{
		spouse.click();
	}
	
	public void ClickOnson ()
	{
		son.click();
	}
	
	public void ClickOndaughter ()
	{
		daughter.click();
	}
	
	public void ClickOnfather ()
	{
		father.click();
	}
	
	public void ClickOnmother ()
	{
		mother.click();
	}
	
	public void clickOnmoreMembers ()
	{
		moreMembers.click();
	}
	
	public void ClickOncontinue ()
	{
		continew.click();
	}
	
	public void applicantContinue ()
	{
		self.click();
		spouse.click();
		son.click();
		daughter.click();
		father.click();
		mother.click();
		continew.click();
	}
}
