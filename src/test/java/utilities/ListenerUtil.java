package utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerUtil implements ITestListener{
	
	public void onStart(ITestContext context) {
		System.out.println("Test Execution started for "+ context.getName());
		
	}

	public void onFinish(ITestContext context) {
		System.out.println("Test Execution Finished for " + context.getName());
		
	}

	public void onTestStart(ITestResult result) {
		System.out.println("Test execution started for " + result.getName());
		
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	

}
