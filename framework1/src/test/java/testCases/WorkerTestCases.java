package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import constant.Constant;
import elementRepository.DashboardPage;
import elementRepository.LoginPage;
import elementRepository.WorkerPage;

public class WorkerTestCases extends BaseClass {
	@Test
	// public void verifySearchButtonText() {

	public void SelectTitleFromDropDownAndVerify() {
		// public void verifySearchButtonFontSize() {
		LoginPage lp = new LoginPage(driver);
		lp.inputUserName("carol");
		lp.inputPassword("1q2w3e4r");
		DashboardPage dp = lp.clickLoginButton();// page chaining
		WorkerPage wp = dp.clickOnWorker();// page chaining
		// String actualFontSize = wp.getSearchButtonFontSize();
		// String expectedFontSize = "14px";
		// Assert.assertEquals(actualFontSize, expectedFontSize, "Font size is not
		// correct");

		// String actualSearchButtonText=wp.getTextFromSearchButton();
		// String expectedSearchButtonText="Search";
		// Assert.assertEquals(actualSearchButtonText,
		// expectedSearchButtonText,"SearchButton Text is not proper");

		wp.clickCreateWorker();
		String actual = wp.selectValueFromTitleDropDown();
		String expected = "Ms";

		Assert.assertEquals(actual, expected, Constant.errorMessageTypeDropDown);

	}
}
