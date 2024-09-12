package coverFox_Test_Cases;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import coverFox_Utility.coverFoxUtility;
import coverFox_base_Classes.CoverFox_Base_Class;
import coverFox_pom_Classes.CoverFoxResultPage;
import coverFox_pom_Classes.CoverFox_HomePage;
import coverFox_pom_Classes.coverFoxAddressDetailsPage;
import coverFox_pom_Classes.coverFoxHealthPlanPage;
import coverFox_pom_Classes.coverFoxMemberDetailsPage;

public class CoverFox_TC1_Functionality_Banners extends CoverFox_Base_Class {
    
	public static Logger logger;
	CoverFox_HomePage homePage;
	coverFoxAddressDetailsPage addressDetailPage;
	coverFoxHealthPlanPage healthPlanPage;
	coverFoxMemberDetailsPage memberDetailsPage;
	CoverFoxResultPage resultPage;
	String filePath;

	@BeforeTest
	public void initialize() {
		logger = logger.getLogger("CoverFox");
		PropertyConfigurator.configure("log4j.properties");
		logger.info("Open Browser");
		launchBrowser();
		homePage = new CoverFox_HomePage(driver);
		addressDetailPage = new coverFoxAddressDetailsPage(driver);
		healthPlanPage = new coverFoxHealthPlanPage(driver);
		memberDetailsPage = new coverFoxMemberDetailsPage(driver);
		resultPage = new CoverFoxResultPage(driver);
		filePath = System.getProperty("user.dir") +"\\coverFoxFunctionality.xlsx";
		// C:\Users\rahul\eclipse-workspace\CoverFoxFunctionality\coverFoxFunctionality.xlsx

	}

	@BeforeClass
	public void preCondition() throws EncryptedDocumentException, IOException, InterruptedException {
		logger.info("Click On Male Button");
		homePage.clickOnMaleButton();
		Thread.sleep(1000);
		logger.info("Click On Next Button");
		healthPlanPage.clickOnNextButton();
		Thread.sleep(5000);
		logger.info("Handle DropDown");
		logger.warn("Age Between 18 To 75");
		memberDetailsPage.handleDropDown(coverFoxUtility.readDataFromExcel(filePath,"Sheet1",0,0));
		Thread.sleep(1000);
		logger.info("Click On Next Button");
		memberDetailsPage.clickOnNextButton();
		Thread.sleep(1000);
		logger.info("Pin Code");
		addressDetailPage.enterPinCode(coverFoxUtility.readDataFromExcel(filePath,"Sheet1",0,1));
		Thread.sleep(1000);
		logger.info("Enter Mobile Number");
		addressDetailPage.enterMobileNumber(coverFoxUtility.readDataFromExcel(filePath,"Sheet1",0,2));
		Thread.sleep(1000);
		logger.info("Click On Contineu Button");
		addressDetailPage.clickOnContineuButton();

	}

	@Test
	public void validateBanners() throws InterruptedException {
		logger.info("Functionality Of Banners");
		Thread.sleep(3000);
		assertEquals(resultPage.numberFromBanners(), resultPage.numberFromString(), "Both Are Not Equal");
	}

	@AfterTest
	public void closeBrowser() {
		logger.info("Close Browser");
		tearDown(); 
	}
}
