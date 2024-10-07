package testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import elementRepository.DashboardPage;
import elementRepository.LoginPage;
import utilities.ExcelReadUtility;

public class LoginTestCases extends BaseClass {
	@Test
	public void verifyLoginWithValidUser() throws IOException {
		LoginPage lp = new LoginPage(driver);
		lp.inputUserName(ExcelReadUtility.readStringData(0, 1));// classname.functionname
		lp.inputPassword(ExcelReadUtility.readStringData(1, 1));
		DashboardPage dp = lp.clickLoginButton();
		String actual = dp.getTextFromHeading();
		String expected = "PAYROLL APPLICATION";
		Assert.assertEquals(actual, expected, "Login Feature is not working");
	}
}
