package testListeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestResultListener implements ITestListener {

    @Override
    public void onTestStart(ITestResult result) {
        // This method is invoked before each test method
        System.out.println("Test Started: " + result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        // This method is invoked when a test method succeeds
        System.out.println("Test Passed: " + result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        // This method is invoked when a test method fails
        System.out.println("Test Failed: " + result.getName());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        // This method is invoked when a test method is skipped
        System.out.println("Test Skipped: " + result.getName());
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        // This method is invoked when a test method fails but is within the success percentage
        System.out.println("Test Failed with Success Percentage: " + result.getName());
    }

    @Override
    public void onStart(ITestContext context) {
        // This method is invoked before the start of all tests belonging to a certain context (suite)
        System.out.println("Tests Started in Context: " + context.getName());
    }

    @Override
    public void onFinish(ITestContext context) {
        // This method is invoked after all the tests belonging to a certain context (suite) have been run
        System.out.println("Tests Finished in Context: " + context.getName());
    }
}
