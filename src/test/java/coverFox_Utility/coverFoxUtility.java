package coverFox_Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class coverFoxUtility
{

	public static String readDataFromExcel(String filePath,String sheetName,int rowNumber,int cellNumber) throws EncryptedDocumentException, IOException 
	{
		FileInputStream myFile=new FileInputStream(filePath);
		String value = WorkbookFactory.create(myFile).getSheet(sheetName).getRow(rowNumber).getCell(cellNumber).getStringCellValue();
		return value;
	}	
	
	public static String readDataFromFile(String filePath,String key) throws IOException 
	{
		FileInputStream myFile=new FileInputStream(filePath);
		Properties prop=new Properties();
		prop.load(myFile);
		String value = prop.getProperty(key);
		return value;
	}	
		
	public static void takesScreenShot(WebDriver driver,String fileName) throws IOException 
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    File dest = new File(System.getProperty("user.dir")+"\\screenShot\\"+fileName+".png");
	    //C:\Users\rahul\eclipse-workspace\CoverFoxFunctionality\screenShot
	    FileHandler.copy(src, dest);
	}
	
	public static void scrollIntoView(WebDriver driver,WebElement element) 
	{
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].scrollIntoView(true)", element);
	}
	
	
}
