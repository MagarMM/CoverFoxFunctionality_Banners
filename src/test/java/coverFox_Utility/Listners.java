package coverFox_Utility;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listners implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {

		Reporter.log(" TC " + result.getName() + "Start", true);

	}
	
	@Override
	public void onTestSuccess(ITestResult result) 
	{
		
		Reporter.log("TC"+result.getName()+"start", true);
		
	}

}
