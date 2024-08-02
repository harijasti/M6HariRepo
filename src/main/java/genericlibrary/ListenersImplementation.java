package genericlibrary;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.google.common.io.Files;



public class ListenersImplementation implements ITestListener
{
	public SeleniumUtility sutil = new SeleniumUtility();

	@Override
	public void onTestStart(ITestResult result) {
		String methodname = result.getMethod().getMethodName();
		Reporter.log(methodname+" execution starts");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String methodname = result.getMethod().getMethodName();
		Reporter.log(methodname+" execution success");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String methodname=result.getMethod().getMethodName();
		
		TakesScreenshot ts=(TakesScreenshot)BaseClass.driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("D:\\EclipseJava\\com.crm.section3FW\\screenshot",methodname+".png");
		try {
			Files.copy(src, dest);
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String methodname = result.getMethod().getMethodName();
		Reporter.log(methodname+" execution skip");
	}

}
