package coverFox_base_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class CoverFox_Base_Class 
{

	static protected WebDriver driver;
	
    public void launchBrowser() 
    {
    	ChromeOptions opt= new ChromeOptions();
    	opt.addArguments("--disable-notifications");
    	driver= new ChromeDriver(opt);
    	driver.get("https://www.coverfox.com/");
    	driver.manage().window().maximize();
    } 
	
	public void tearDown() 
	{
		driver.close();
	}
	
	
	
	
	
}
