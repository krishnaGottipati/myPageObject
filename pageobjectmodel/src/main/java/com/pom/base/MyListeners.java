package com.pom.listeners;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.pom.base.Base;
import com.pom.base.GeneralFunctions;
import com.relevantcodes.extentreports.LogStatus;

public class MyListeners extends Base implements ITestListener {

		
	public static WebDriver driver;
	public MyListeners() {
		super();
	}
	
	
	public void onTestStart(ITestResult result) {
		test =rep.startTest(result.getName());
		
		System.out.println("Test case -" +result.getName() + " is STARTED");

	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Test case -" +result.getName() + " is PASS");
		test.log(LogStatus.PASS, result.getName() + " is PASS");
		rep.endTest(test);
		rep.flush();
		
		
	}

	public void onTestFailure(ITestResult result) {
		test.log(LogStatus.FAIL, result.getName() + " FAILED" + result.getThrowable());
		
		
		System.setProperty("org.uncommons.reportng.escape-output", "false");
		
		String testCaseName = result.getName();
		Reporter.log("Test case - " + testCaseName + " is FAILED");
		System.out.println("Test case - " + testCaseName + " is FAILED");
		String screenshotName = GeneralFunctions.takeScreenshot(testCaseName);
		String href = System.getProperty("user.dir")+ "\\test-output\\html\\screenshots\\" + screenshotName + ".jpg" ;
		System.out.println( "href = " +href);
		Reporter.log("<a href= "+ href + " target= \"_blank\"> click screenshot</a>");
		
		test.log(LogStatus.FAIL, test.addScreenCapture(href));
		rep.endTest(test);
		rep.flush();
		
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
	
	
	private static ITestNGMethod[] getmethodName(ITestContext result) {
		return result.getAllTestMethods();
	}

}
