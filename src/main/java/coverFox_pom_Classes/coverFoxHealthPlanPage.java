package coverFox_pom_Classes;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class coverFoxHealthPlanPage {

	// variable
	// constructor
	// method

	// variable
	@FindBy(xpath = "//div[text()=' Next ']")
	private WebElement nextButton;

	// constructor
	public coverFoxHealthPlanPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// method
	public void clickOnNextButton() 
	{
		nextButton.click();                                                                                                                                                                                                              
	}

}
