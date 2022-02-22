package com.cjc;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ItestDemo implements ITestListener{

	public void onTestStart(ITestResult result)
	{
		System.out.println("in onTest start method under Test listener");
	}
	 
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("in onTest success method under Test listener");
	}
	
	public void onTestFailure(ITestResult result)
	{
		System.out.println("in onTest onTestFailure method under Test listener");
	}
	
	public void onTestSkippesd(ITestResult result)
	{
		System.out.println("in onTest onTestSkippesd method under Test listener");
	}
	
	public void onTestFailedButWithinSuccessPercentage(ITestResult result)
	{
		System.out.println("in onTest onTestFailedButWithSuccessPercentage method under Test listener");
	}
	
	public void onStart(ITestContext result)
	{
		System.out.println("in onTest onTestStart method under Test listener");
	}
	
	public void onFinish(ITestContext result)
	{
		System.out.println("in onTest onTestFinish method under Test listener");
	}
	
}
