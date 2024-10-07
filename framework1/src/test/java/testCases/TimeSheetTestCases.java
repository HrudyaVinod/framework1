package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import constant.Constant;
import elementRepository.DashboardPage;
import elementRepository.LoginPage;
import elementRepository.TimesheetPage;

public class TimeSheetTestCases extends BaseClass {
	@Test
	public void verifyToolTipIsWorking() {
		LoginPage lp = new LoginPage(driver);
		lp.inputUserName("carol");
		lp.inputPassword("1q2w3e4r");
		DashboardPage dp = lp.clickLoginButton();

		TimesheetPage tp = dp.clickOnTimesheet();
		tp.createTimesheet();
		String actual = tp.getToolTipValue();
		System.out.println("The toop tip value is:" + actual);
		String expected = "Select an image...";
		Assert.assertEquals(actual, expected, Constant.errorMessageToolTip);

	}

	@Test
	public void verifyAlertisWorking() {
		LoginPage lp = new LoginPage(driver);
		lp.inputUserName("carol");
		lp.inputPassword("1q2w3e4r");

		DashboardPage dp = lp.clickLoginButton();

		TimesheetPage tp = dp.clickOnTimesheet();

		tp.generatePlayslip();

		String actual = tp.getAlertWhenClickonGeneratePlayslip(true);
		System.out.println("Alert message of Generate Payslip :" + actual);
		String expected = "Are you sure you want to generate payslip?";
		Assert.assertEquals(actual, expected, Constant.errorMessageGeneralPlaySlip);
	}

	@Test

	public void verifyGenerateInvoiceAlertisWorking() {
		LoginPage lp = new LoginPage(driver);
		lp.inputUserName("carol");
		lp.inputPassword("1q2w3e4r");

		DashboardPage dp = lp.clickLoginButton();

		TimesheetPage tp = dp.clickOnTimesheet();

		tp.generateInvoice();

		String actual = tp.getAlertWhenClickonGenerateInvoice(true);
		System.out.println("Alert message of Generate Invoice:" + actual);
		String expected = "Are you sure you want to generate invoice?";
		Assert.assertEquals(actual, expected, Constant.errorMessageGeneralInvoice);

	}

	@Test

	public void GenerateInvoiceBackgroundColor() {
		LoginPage lp = new LoginPage(driver);
		lp.inputUserName("carol");
		lp.inputPassword("1q2w3e4r");

		DashboardPage dp = lp.clickLoginButton();

		TimesheetPage tp = dp.clickOnTimesheet();

		String actualBackgroundcolor = tp.getGenerateInvoiceBackgroundColor();
		System.out.println("Background color of Generate Invoice :" + actualBackgroundcolor);
		String expectedBackgroundcolor = "rgb(240, 173, 78)";
		Assert.assertEquals(actualBackgroundcolor, expectedBackgroundcolor, Constant.errorMessageBackgroundColor);

	}
}
