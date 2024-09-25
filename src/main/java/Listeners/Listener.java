package Listeners;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Resources.Setup;
import Utilities.ExtentReporter;

public class Listener extends Setup implements ITestListener {
	String name;
	public ExtentReports extentReports;
	public ExtentTest eTest;
	public WebDriver driver;
	public ThreadLocal<ExtentTest> eTestThread = new ThreadLocal<ExtentTest>();

	@Override
	public void onTestStart(ITestResult result) {

		eTest = extentReports.createTest(result.getName()+"Test is created");
		eTestThread.set(eTest);
	}

	@Override
	public void onTestSuccess(ITestResult result) {

		// eTest.log(Status.PASS, "Test is passed");
		eTestThread.get().log(Status.PASS, "Test is passed");
		extentReports.flush();
	}

	@Override
	public void onTestFailure(ITestResult result) {
		 eTest.fail(result.getThrowable());
		eTestThread.get().fail(result.getThrowable());
		extentReports.flush();
		try {
			driver = (WebDriver) result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
			
		} catch (IllegalArgumentException | IllegalAccessException | NoSuchFieldException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String ScreenshotFilePath=takeScreenshot(result.getName(),driver);
//		if (ScreenshotFilePath != null && !ScreenshotFilePath.isEmpty()) {
//			eTestThread.get().addScreenCaptureFromPath(ScreenshotFilePath);
//	    } else {
//	    	eTestThread.get().log(Status.FAIL, "Screenshot path is not available.");
//	    }
		eTestThread.get().addScreenCaptureFromPath(ScreenshotFilePath,result.getName());

	}

	@Override
	public void onTestSkipped(ITestResult result) {

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {

	}

	@Override
	public void onStart(ITestContext context) {
		extentReports = ExtentReporter.getExtentReport(context.getName());
	}

	@Override
	public void onFinish(ITestContext context) {
		extentReports.flush();
	}

}
