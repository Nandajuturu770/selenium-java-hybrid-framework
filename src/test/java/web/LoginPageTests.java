package web;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import web.generic.BaseTest;
import web.pages.LoginPage;

public class LoginPageTests extends BaseTest {

	String mobileNumber = "7702425817";
	String password = "111111";
	LoginPage loginPage;

	@BeforeClass(alwaysRun = true)
	public void initialization() {
		 loginPage = new LoginPage(driver);
	}

	@Test
	public void verifyLoginFeaturesAndLoginIntoApplication() {
		loginPage.verifyLoginPage();
		loginPage.verifyCreateAccountFeature();
		loginPage.verifyForgotPassword();
		loginPage.verifyHowToUse();
		loginPage.loginIntoApplication(mobileNumber, password);
	}
}