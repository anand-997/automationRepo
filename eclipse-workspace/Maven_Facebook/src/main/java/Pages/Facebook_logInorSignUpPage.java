package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Facebook_logInorSignUpPage {
	
	private WebDriver driver ;
	private Select select ;
	private WebDriverWait wait ;
	
	// variable initialization
	@FindBy ( xpath = "//input[@id='email']" )
	private WebElement emailAddressorPhonePumber ;
	
	@FindBy ( xpath = "//input[@id='pass']" )
	private WebElement password;
	
	@FindBy ( xpath = "//button[@name='login']" )
	private WebElement logInButton;
	
	@FindBy ( xpath = "//a[text()='Forgotten password?']" )
	private WebElement forgottenPassword ;
	
	@FindBy ( xpath = "//a[text()='Create New Account']" )
	private WebElement createNewAccountButton ;
	
	@FindBy ( xpath = "//a[text()='Messenger']" )
	private WebElement messenger;
	
	// Create new account popup elements 
	
	@FindBy ( xpath = "//input[@name='firstname']" )
	private WebElement firstname ;
	
	@FindBy ( xpath = "//input[@name='lastname']" )
	private WebElement lastname ;
	
	@FindBy ( xpath = "//input[@name='reg_email__']" )
	private WebElement mobileNumberorEmailAddress ;
	
	@FindBy ( xpath = "//input[@name='reg_email_confirmation__']" )
	private WebElement reEnterEmailConfirmation ;
	
	@FindBy ( xpath = "//input[@name='reg_passwd__']" )
	private WebElement newPassword ;
	
	@FindBy ( xpath = "//select[@id='day']" )
	private WebElement day ;
	
	@FindBy ( xpath = "//select[@id='month']" )
	private WebElement month ;
	
	@FindBy ( xpath = "//select[@id='year']" )
	private WebElement year ;
	
	@FindBy ( xpath = "(//input[@type='radio'])[1]" )
	private WebElement female ;
	
	@FindBy ( xpath = "(//input[@type='radio'])[2]" )
	private WebElement male ;
	
	@FindBy ( xpath = "(//input[@type='radio'])[3]" )
	private WebElement custom ;
	
	@FindBy ( xpath = "//select[@name='preferred_pronoun']" )
	private WebElement selectYourPronoun ;
	
	@FindBy ( xpath = "//input[@name='custom_gender']" )
	private WebElement genderOptional ;
	
	@FindBy ( xpath = "(//button[@type='submit'])[2]" )
	private WebElement signUpButton ;
	
	// variables initialization 
	
	public Facebook_logInorSignUpPage (WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
		this.driver = driver ;
		wait = new WebDriverWait (driver, 10) ;
	}
	
	// variables reuse
	
	public void sendEmailAddressorPhonePumber (String userName)
	{
		emailAddressorPhonePumber.sendKeys(userName) ;
	}

	public void sendPassword (String pass)
	{
		password.sendKeys(pass);
	}
	
	public void ClickOnLogInButton ()
	{
		logInButton.click();
	}
	
	public void applicantLogIn(String userName, String pass )
	{
		emailAddressorPhonePumber.sendKeys("nittyanand11@gmail.com") ;
		password.sendKeys("pleasure20");
		logInButton.click();
	}
	
	// Forgave password // new account // messenger
	public void clickOnForgottenPassword ()
	{
		forgottenPassword.click();
	}
	
	public void clickOnCreateNewAccountButton ()
	{
		createNewAccountButton.click();
	}
	
	public void openMessenger ()
	{
		messenger.click();
	}
	
	
	// registration applicant
	public void sendFirstname (String firstName)
	{
		firstname.sendKeys(firstName);
	}
	
	public void sendLastname(String lastName)
	{
		lastname.sendKeys(lastName);
	}
	
	public void sendMobileNumberorEmailAddress (String enterEmail)
	{
		mobileNumberorEmailAddress.sendKeys(enterEmail);
	}
	
	public void sendReEnterEmail (String renterEmail)
	{
		wait.until(ExpectedConditions.visibilityOf(reEnterEmailConfirmation));
		reEnterEmailConfirmation.sendKeys(renterEmail);
	}
	
	public void sendNewPassword (String newPass)
	{
		newPassword.sendKeys(newPass);
	}
	
	public void dayMonthYear ()
	{
		select = new Select (day) ;
		select.selectByIndex(19);
		select = new Select (month) ;
		select.selectByValue("2");
		select = new Select (year) ;
		select.selectByVisibleText("1997");
	}
	
	public void  selectFemale ()
	{
		female.click();
	}
	
	public void  selectMale ()
	{
		male.click();
	}
	
	public void  selecCustom ()
	{
		custom.click();
	}
	
	public void  selectYourPronoun ()
	{
		select = new Select (selectYourPronoun) ;
		select.selectByValue("2");
		
	}
	
	public void  sendGenderOptional (String gender)
	{
		genderOptional.sendKeys(gender);
	}
	
	public void clickOnSignUpButton ()
	{
		signUpButton.click();
	}
	
	public void applicantRegistration ()
	{
		firstname.sendKeys("Johny");
		lastname.sendKeys("leon");
		wait.until(ExpectedConditions.visibilityOf(mobileNumberorEmailAddress)) ;
		mobileNumberorEmailAddress.sendKeys("john.leon@gmail.com") ;
		wait.until(ExpectedConditions.visibilityOf(reEnterEmailConfirmation)) ;
		reEnterEmailConfirmation.sendKeys("john.leon@gmail.com") ;
		newPassword.sendKeys("jl@123") ;
		select = new Select (day) ;
		select.selectByIndex(19) ;
		select = new Select (month) ;
		select.selectByValue("2") ;
		select = new Select (year) ;
		select.selectByVisibleText("1997") ;
//		female.click() ;
//		male.click() ;
		custom.click() ;
		select = new Select (selectYourPronoun) ;
		select.selectByValue("2") ;
		genderOptional.sendKeys("male") ;
		signUpButton.click() ;
	}
}
