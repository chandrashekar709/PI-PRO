package com.pi.utility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManager implements ITestListener {
	public ExtentSparkReporter sparkReporter;
	public ExtentReports extent;
	public ExtentTest test;
	public void onStart(ITestContext context)
	{
sparkReporter =new ExtentSparkReporter(System.getProperty("user.dir")+"/reports/myreports.html");
sparkReporter.config().setDocumentTitle("Automation Report");//title of report
sparkReporter.config().setReportName("Functional Testing");//name of the report
sparkReporter.config().setTheme(Theme.DARK);
extent=new ExtentReports();
extent.attachReporter(sparkReporter);
extent.setSystemInfo("computer name", "local host");
extent.setSystemInfo("Environment", "QA");
extent.setSystemInfo("Testerr name", "Chandhu");
extent.setSystemInfo("OS", "Windows11");
extent.setSystemInfo("Browser name", "Chrome");
	
	}
	
	public void onTestSuccess(ITestResult result)
	{
		test=extent.createTest(result.getName());//create new entry in the report
		test.log(Status.PASS, "Test case PASSED is:" + result.getName());//update status pass/fail/skip
			
	}
	public void onTestFailure(ITestResult result)
	{
		test=extent.createTest(result.getName());//create new entry in the report
		test.log(Status.FAIL, "Test case FAILED is:" + result.getThrowable());//update status pass/fail/skip
			
	}
	public void onTestSkipped(ITestResult result)
	{
		test=extent.createTest(result.getName());//create new entry in the report
		test.log(Status.SKIP, "Test case SKIPPED is:" + result.getName());//update status pass/fail/skip
			
	}
	public void onFinish(ITestContext context)
	{
		extent.flush();
		
	}

	


	

}
