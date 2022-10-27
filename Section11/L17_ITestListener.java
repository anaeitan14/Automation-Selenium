package Section11;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class L17_ITestListener implements ITestListener {

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test has failed and this message is from the ITestListener interface");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test has passed and this message is from the ITestListener interface");
	}
}
