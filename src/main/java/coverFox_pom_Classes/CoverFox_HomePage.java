package coverFox_pom_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverFox_HomePage {
	// variable
	// constructor
	// method
    
	// variable
	@FindBy(xpath = "//div[text()='Male']")
	private WebElement maleButton;
	
	// constructor
	public CoverFox_HomePage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	//method
	public void clickOnMaleButton() 
	{
		maleButton.click();
	}

}
