package web;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import web.enums.BookDetails;
import web.enums.ProfileFields;
import web.generic.BaseTest;
import web.pages.HomePage;
import web.pages.LoginPage;
import web.pages.TheSmartStore;

public class TheSmartStoreTests extends BaseTest{

	final static Logger logger = LogManager.getLogger(TheSmartStoreTests.class);
	String mobileNumber = "7702425817";
	String password = "777777";
	LoginPage loginPage;
	HomePage homePage;
	TheSmartStore theSmartStore;

	@BeforeClass(alwaysRun=true)
	public void initialization() {
		loginPage = new LoginPage(driver);
		homePage = new HomePage(driver);
		theSmartStore = new TheSmartStore(driver);
		loginPage.loginIntoApplication(mobileNumber, password);
	}

	@Test(enabled = true)
	public void verifyBookDetailsOfTSS() {
		homePage.openHomeFeaturesByName(ProfileFields.THE_SMART_STORE.getProfileFieldName());
		theSmartStore.verifyHeaderOfTSS();
		theSmartStore.verifyUpgradePopup(BookDetails.BOOK_CARTED.getBookDataValue());
	}
}