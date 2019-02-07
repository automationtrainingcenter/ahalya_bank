package in.srssprojects.keximbank;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class TestListener implements ISuiteListener, ITestListener {
	static ExtentReports report;
	static ExtentTest test;

	@Override
	public void onStart(ISuite suite) {
		report = new ExtentReports(".//reports//report "+suite.getName()+".html");
	}

	@Override
	public void onFinish(ISuite suite) {
		report.flush();
		report.close();
	}

	@Override
	public void onTestStart(ITestResult result) {
		test = report.startTest(result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		test.log(LogStatus.PASS, "test passed");
		report.endTest(test);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		test.log(LogStatus.FAIL, "test failed");
		report.endTest(test);
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		test.log(LogStatus.SKIP, "test skipped");
		report.endTest(test);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub

	}

}
