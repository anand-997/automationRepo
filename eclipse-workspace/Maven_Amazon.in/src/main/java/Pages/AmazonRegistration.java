package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonRegistration {
	
	// variable declaration 
	@FindBy (xpath="//input[@id='ap_customer_name']")
	private WebElement yourName ;
	
	@FindBy (xpath="//input[@id='ap_phone_number']")
	private WebElement mobileNumber ;
	
	@FindBy (xpath="//input[@id='ap_email']")
	private WebElement emailoptional ;
	
	@FindBy (xpath="//input[@id='ap_password']")
	private WebElement password ;
	
	@FindBy (xpath="//input[@id='continue']")
	private WebElement continew ;
	
	// variable initialization 
	public AmazonRegistration (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	// variable use
	public void sendyourName ()
	{
		yourName.sendKeys("jhony");
	}
	
	public void sendmobileNumber ()
	{
		mobileNumber.sendKeys("9981545694");
	}
	
	public void sendemailoptional ()
	{
		emailoptional.sendKeys("abcd@gmail.com");
	}
	
	public void sendpassword ()
	{
		password.sendKeys("Abc@123");
	}
	
	public void sendcontinue ()
	{
		continew.click();
	}
	
	public void applicamtRegistration ()
	{
		yourName.sendKeys("jhony");
		mobileNumber.sendKeys("9981545694");
		emailoptional.sendKeys("abcd@gmail.com");
		password.sendKeys("Abc@123");
		continew.click();		
	}

}
