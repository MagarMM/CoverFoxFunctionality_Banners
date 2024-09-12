package coverFox_pom_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class coverFoxAddressDetailsPage {

	// variable
	// constructor
	// method

	// variable
	@FindBy(xpath = "//input[@class='mp-input-text']")
	private WebElement pin;

	@FindBy(xpath = "(//input[@type='number'])[2]")
	private WebElement mobileNum;

	@FindBy(xpath = "//div[@class='next-btn']")
	private WebElement contineuButton;

	// constructor
	public coverFoxAddressDetailsPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	// method
	public void enterPinCode(String pinNumber) 
	{
		pin.sendKeys(pinNumber);
	}

	public void enterMobileNumber(String mobileNumber) 
	{
		mobileNum.sendKeys(mobileNumber);
	}

	public void clickOnContineuButton() 
	{
		contineuButton.click();
	}

}
