package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Sign_In {
	
	// variables declaration
	@FindBy (xpath="//input[@id='ap_email']")
	private WebElement emailorMobilePhoneNumber ;
	
	@FindBy (xpath="//input[@id='continue']")
	private WebElement continueButton ;
	
	@FindBy (xpath="//input[@id='ap_password']")
	private WebElement password ;
	
	@FindBy (xpath="//input[@id='signInSubmit']")
	private WebElement signInButton ;
	
	// variable initialization
	public Amazon_Sign_In (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	// variable use
	public void sendEmail ()
	{
		emailorMobilePhoneNumber.sendKeys("abcd@gmail.com");
	}
	
	public void sendMobileNumber ()
	{
		emailorMobilePhoneNumber.sendKeys("958674585");
	}
	
	public void clickOncontinueButton ()
	{
		continueButton.click();
	}
	
	public void sendpassword ()
	{
		password.sendKeys("zaass@abd");
	}
	
	public void clickOnsignInButton ()
	{
		signInButton.click();
	}
	
	public void applicantSignIn ()
	{
		emailorMobilePhoneNumber.sendKeys("nittyanand11@gmail.com");
//		emailorMobilePhoneNumber.sendKeys("9881545694");
		continueButton.click();
		password.sendKeys("Pleasure@20");
		signInButton.click();
		
	}

}
