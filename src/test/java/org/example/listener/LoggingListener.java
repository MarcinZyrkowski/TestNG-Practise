package org.example.listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class LoggingListener implements ITestListener {

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("Test start and its details are : " + result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Success of test cases and its details are : " + result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Failure of test cases and its details are : " + result.getName());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("Skip of test cases and its details are : " + result.getName());
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        System.out.println("Failure of test cases and its details are : " + result.getName());
    }

    @Override
    public void onStart(ITestContext context) {
        System.out.println("Start test context : " + context.getName());

    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("Finish test context : " + context.getName());
    }

}
