package com.testng_listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListeners implements ITestListener {

	public void onFinish(ITestContext result) {
		System.out.println("******Test completed: " + result.getName());
	}

	public void onStart(ITestContext result) {
		// TODO Auto-generated method stub

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	public void onTestFailure(ITestResult result) {
		System.out.println("******Test failed: " + result.getName());
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("******Test skipped: " + result.getName());
		
	}

	public void onTestStart(ITestResult result) {

		System.out.println("*******Test started: " + result.getName());
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("******Test is successful: " + result.getName());
	}

}
