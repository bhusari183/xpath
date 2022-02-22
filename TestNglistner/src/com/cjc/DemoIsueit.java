package com.cjc;

import org.testng.ISuite;
import org.testng.ISuiteListener;

public class DemoIsueit implements ISuiteListener{

	public void onStart(ISuite suite)
	{
		System.out.println(" on start method of Isuite");
	}

	public void onFinish(ISuite suite)
	{
		System.out.println("onFinish method of siute");
	}
}
