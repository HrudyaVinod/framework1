package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import constant.Constant;
import elementRepository.ClientsPage;
import elementRepository.DashboardPage;
import elementRepository.LoginPage;

public class ClientsTestCases extends BaseClass {
	@Test
	public void VerifyRequiredPOCheckBox() {
		LoginPage lp = new LoginPage(driver);
		lp.inputUserName("carol");
		lp.inputPassword("1q2w3e4r");
		lp.clickLoginButton();
		DashboardPage dp = lp.clickLoginButton();

		ClientsPage cp = dp.clickOnClients();// page chaining
		cp.clickOnCreateClient();
		cp.clickOnRequiredPOCheckBox();
		Boolean actualcheckBox = cp.selectCheckbox();
		Boolean expectedcheckBox = true;
		
		System.out.println();
		Assert.assertEquals(actualcheckBox, expectedcheckBox, Constant.errorMessageCheckBox);// static is there so using
																								// classname we need to
																								// call,for static
																								// keyword no need to
																								// create obj
		// Assert.assertTrue(cp.selectCheckbox(), "The Required po checkbox should be
		// selected");
	}
}
