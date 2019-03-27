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

import com.pom.base.GeneralFunctions;

public class MyListeners implements ITestListener {

		
	public static WebDriver driver;
	public MyListeners() {
		super();
	}
	
	
	public void onTestStart(ITestResult result) {
		
		System.out.println("Test case -" +result.getName() + " is STARTED");

	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Test case -" +result.getName() + " is PASS");
		
	}

	public void onTestFailure(ITestResult result) {
		
		String output = result.getName();
		System.out.println("Test case - " + output + " is FAILED");
		
		GeneralFunctions.takeScreenshot(output);
		
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
