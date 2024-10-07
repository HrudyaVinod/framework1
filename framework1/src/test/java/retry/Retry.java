package retry;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class Retry implements IRetryAnalyzer {
	int counter = 0;
	int retryLimit = 4;

	public boolean retry(ITestResult result) {

		if (counter < retryLimit) {
			counter++;
			return true;// if return true it will retry or else it wont retry
		}
		return false;
	}
}
