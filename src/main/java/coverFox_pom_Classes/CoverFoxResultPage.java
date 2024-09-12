package coverFox_pom_Classes;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverFoxResultPage {

	// variable
	// constructor
	// method

	// variable
	@FindBy(xpath = "//div[text()='50 matching Health Insurance Plans']")
	private WebElement text;

	@FindBy(className = "plan-card-container")
	private List<WebElement> banners;

	// constructor
	public CoverFoxResultPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// method
	public int numberFromString() {
		String[] myText = text.getText().split(" ");
		int result = Integer.parseInt(myText[0]);
		return result;
	}

	public int numberFromBanners() {
		int totalBanners = banners.size();
		return totalBanners;
	}

}
