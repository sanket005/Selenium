package Utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporter {
	public static ExtentReports getExtentReport(String classname) {
		String filePath = System.getProperty("user.dir") + "\\Reports\\"+classname+".html";
		ExtentSparkReporter Reporter = new ExtentSparkReporter(filePath);
		Reporter.config().setReportName(classname+" Report");
		Reporter.config().setDocumentTitle(classname+" Report");
		ExtentReports extentReport = new ExtentReports();
		extentReport.attachReporter(Reporter);
		extentReport.setSystemInfo("Tester", "Sanket");
		extentReport.setSystemInfo("Environment", "QA");
		extentReport.setSystemInfo("Environment", "QA");
		return extentReport;

	}
}
