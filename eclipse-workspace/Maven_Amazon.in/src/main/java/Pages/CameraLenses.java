package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CameraLenses {
	
	@FindBy (xpath = "(//i[@class='a-icon a-icon-checkbox'])[2]")
	WebElement topBrand ;
	
	@FindBy (xpath = "(//span[text()='Canon'])[1]")
	WebElement canonBrand ;
	
	@FindBy (xpath = "//input[@id='low-price']")
	WebElement minPrice ;
	
	@FindBy (xpath = "//input[@id='high-price']")
	WebElement maxPrice ;
	
	@FindBy (xpath = "//input[@class='a-button-input']")
	WebElement goButton ;
	
	@FindBy (xpath = "//span[text()='100-300 mm']")
	WebElement minFocusLenseSize ;
	
	@FindBy (xpath = "//div[@data-index='1']")
	WebElement product1st ;

	public CameraLenses (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void open12thCanonLense () throws InterruptedException {
		topBrand.click();
		Thread.sleep(2000);
		canonBrand.click();
		Thread.sleep(2000);
		minPrice.sendKeys("70000");
		maxPrice.sendKeys("140000");
		goButton.click();
		Thread.sleep(2000);
		minFocusLenseSize.click();
		Thread.sleep(2000);
		product1st.click();		
	}
	
	
}
