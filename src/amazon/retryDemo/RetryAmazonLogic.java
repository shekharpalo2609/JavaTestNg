package amazon.retryDemo;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAmazonLogic implements IRetryAnalyzer {

	int initialCount = 0;
	int retryTimes = 5;

	public boolean retry(ITestResult result) {


		if (initialCount < retryTimes) {
			initialCount++;
			return true;
		}
		return false;
	}

}
