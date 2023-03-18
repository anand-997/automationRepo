package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElectronicTab {
			
	@FindBy (xpath = "(//span[@class='nav-a-content'])[6]")
	private WebElement camera ;
	
	public ElectronicTab (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void openCamera () {
		camera.click();
	}
	
	

}
