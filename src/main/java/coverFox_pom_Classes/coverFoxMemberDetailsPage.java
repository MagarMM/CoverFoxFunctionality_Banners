package coverFox_pom_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class coverFoxMemberDetailsPage {

	// variable
	// constructor
	// method

	// variable
	@FindBy(id = "Age-You")
	private WebElement dropDown;

	@FindBy(xpath = "//div[text()='Next']")
	private WebElement selectButton;

	// constructor
	public coverFoxMemberDetailsPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	// method
	public void handleDropDown(String age) 
	{
		Select slt = new Select(dropDown);
		slt.selectByValue(age + "y");
	}

	public void clickOnNextButton() 
	{
		selectButton.click();
	}

}
