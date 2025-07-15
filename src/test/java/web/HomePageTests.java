package web;

import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import web.enums.ProfileFields;
import web.generic.BaseTest;
import web.pages.CartPage;
import web.pages.HomePage;
import web.pages.LoginPage;
import web.pages.ProfilePage;
import web.pages.RedeemAccessCodePage;
import web.pages.WishlistPage;

public class HomePageTests extends BaseTest {

    final static Logger logger = LogManager.getLogger(HomePage.class);

    String mobileNumber = "7702425817";
    String password = "111111";
    LoginPage loginPage;
    HomePage homePage;
    ProfilePage profilePage;
    WishlistPage wishlistPage;
    CartPage cartPage;
    RedeemAccessCodePage redeemAccessCodePage;

    @BeforeClass(alwaysRun = true)
    public void initialization() {
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
        profilePage = new ProfilePage(driver);
        wishlistPage = new WishlistPage(driver);
        cartPage = new CartPage(driver);
        redeemAccessCodePage = new RedeemAccessCodePage(driver);
        loginPage.loginIntoApplication(mobileNumber, password);
    }

    @Test(enabled = true, priority = 1)
    public void verifyHomePage() {
        logger.info("verification of all features of home page is started...");
        homePage.verifyHeaderOfHome();
        homePage.verifyMyLibrary();
        homePage.verifyRecentViewedBooks();
        homePage.verifyRecentlyActivity();
        homePage.verifyTheSmartStore("cart");
        homePage.verifyPromotionalBooks();
        homePage.verifyHelpCenterFeature(true);
        logger.info("verification of all features of home page is completed successfully.");
    }

    @Test(enabled = true, priority = 2)
    public void verifyProfileFeature() {
        logger.info("verification of profile feature is started...");
        homePage.openHomeFeaturesByName(ProfileFields.PROFILE.getProfileFieldName());
        profilePage.verifyRightSideOfProfilePage();
        Map<String, String> details = profilePage.getProfileDetails();
        profilePage.verifyProfileInfoFields();
        Map<String, String> updated = profilePage.updateProfile();
        logger.info(details.entrySet());
        logger.info(updated.entrySet());
        logger.info("verification of profile feature is completed successfully.");
    }

    @Test(enabled = true, priority = 3)
    public void verifyWishlist() throws InterruptedException {
        logger.info("verification of wish list is started...");
        homePage.openHomeFeaturesByName(ProfileFields.MY_WISHLIST.getProfileFieldName());
        wishlistPage.verifySearchWithValidAndInvalid("querty");
        wishlistPage.verifySearchWithValidAndInvalid("BHUGOL");
        wishlistPage.verifyWishlistBookAndGetData(ProfileFields.DELETE.getProfileFieldName());
        wishlistPage.removeAllBooksVerifyEmptyWishlist();
        logger.info("verification of wish list is completed successfully.");
    }

    @Test(enabled = true, priority = 4)
    public void verifyCart() {
        logger.info("verification of cart is started...");
        homePage.openHomeFeaturesByName(ProfileFields.MY_CART.getProfileFieldName());
        cartPage.verifyHeader();
        cartPage.verifyBookAndGetBookDetails("");
        cartPage.verifySummary();
        cartPage.removeAllBooksAndVerifyEmptyCart();
        logger.info("verification of cart is completed successfully.");
    }

    @Test(enabled = true, priority = 5)
    public void verifyRedeemAccessFeature() {
        logger.info("verification of redeem access code feature is started...");
        homePage.openHomeFeaturesByName(ProfileFields.REDEEM_ACCESS_CODE.getProfileFieldName());
        redeemAccessCodePage.verifyRedeemAccessCodePopup(false);
        redeemAccessCodePage.verifyWrongAccessCodePopup(true);
        logger.info("verification of redeem access code feature is completed successfully.");
    }
}