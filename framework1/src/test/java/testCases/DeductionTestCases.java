package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import constant.Constant;
import elementRepository.DashboardPage;
import elementRepository.DeductionPage;
import elementRepository.LoginPage;

public class DeductionTestCases extends BaseClass {
	@Test
	public void selectWorkerandTypeFromDropDownandverify() {
		LoginPage lp = new LoginPage(driver);
		lp.inputUserName("carol");
		lp.inputPassword("1q2w3e4r");
		DashboardPage dp = lp.clickLoginButton();

		DeductionPage de = dp.clickOnDeduction();
		de.clickOnAddDeduction();
		// String actualworker=de.selectValueFromWorkerDropDown();
		// String expectedworker="Dennis Benny";
		// Assert.assertEquals(actualworker, expectedworker,"Worker Dropdown is not
		// working");
		de.inputAmount();
		de.inputEffectiveFrom();
		de.clickOnSaveButton();

		String actualtype = de.selectValueFromTypeDropDown();
		String expectedtype = "CRB";
		Assert.assertEquals(actualtype, expectedtype, Constant.errorMessageTypeDropDown);

	}
}
