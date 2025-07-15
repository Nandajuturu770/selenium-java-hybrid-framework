package web.pages;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import web.generic.WebElementActions;

public class RewardsPage extends WebElementActions {

    final static Logger logger = LogManager.getLogger(RewardsPage.class);
    WebDriver driver;

    public RewardsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //* Element of no rewards
    @FindBy(className = "spendCoinsText")
    private WebElement myRewardTitleTxt;

    @FindBy(xpath = "//*[@id='available-header']/descendant::*[@class='accordion-header-text']")
    private WebElement availableCouponsTxt;

    @FindBy(xpath = "//*[@id='available-header']/descendant::*[@class='accordion-count']")
    private WebElement availableCouponCountTxt;

    @FindBy(xpath = "//*[@id='available-header']/descendant::*[@alt='accordion icon']")
    private WebElement availableCouponExpandIcon;

    @FindBy(xpath = "//*[@id='unlock-header']/descendant::*[@class='accordion-header-text']")
    private WebElement unLockedCouponsTxt;

    @FindBy(xpath = "//*[@id='unlock-header']/descendant::*[@class='accordion-count']")
    private WebElement unLockedCouponCountTxt;

    @FindBy(xpath = "//*[@id='unlock-header']/descendant::*[@alt='accordion icon']")
    private WebElement unLockedCouponExpandIcon;

    @FindBy(xpath = "//*[@id='locked-header']/descendant::*[@class='accordion-header-text']")
    private WebElement lockedCouponsTxt;

    @FindBy(xpath = "//*[@id='locked-header']/descendant::*[@class='accordion-count']")
    private WebElement lockedCouponCountTxt;

    @FindBy(xpath = "//*[@id='locked-header']/descendant::*[@alt='accordion icon']")
    private WebElement lockedCouponExpandIcon;

    // No data element for available coupons section
    @FindBy(xpath = "//*[@id='available-content']/descendant::*[@class='no-lock-coupon-container']")
    private WebElement noAvailableCouponSec;

    @FindBy(xpath = "//*[@id='available-content']/descendant::*[@class='couponsUnlockHeaderText']")
    private WebElement noAvailableCouponsTxt;

    @FindBy(xpath = "//*[@id='available-content']/descendant::*[@class='couponsUnlockParaText']")
    private WebElement noAvailableCouponDescTxt;

    // No data element for unlock coupons section
    @FindBy(xpath = "//*[@id='unlock-contentt']/descendant::*[@class='no-lock-coupon-container']")
    private WebElement noCouponsUnlockSec;

    @FindBy(xpath = "//*[@id='unlock-content']/descendant::*[@class='couponsUnlockHeaderText']")
    private WebElement noCouponsUnlockTxt;

    @FindBy(xpath = "//*[@id='unlock-content']/descendant::*[@class='couponsUnlockParaText']")
    private WebElement noCouponsUnlockDescTxt;

    //* View coupon popup
    @FindBy(xpath = "//*[contains(text(),'View Coupon')]")
    private WebElement viewCouponCodeTitleTxt;

    @FindBy(xpath = "//*[@data-testid='CloseIcon']")
    private WebElement viewCouponCodeCloseBtn;

    @FindBy(xpath = "//*[@class='EHdaqBpFchOCdpPervVw']/p")
    private WebElement shoppingOnNavNeetTxt;

    @FindBy(xpath = "//*[@class='EHdaqBpFchOCdpPervVw']/img")
    private WebElement shoppingOnNavNeetImg;

    @FindBy(xpath = "//p[text()='Navneet Store']")
    private WebElement navNeetStoreTxt;

    @FindBy(xpath = "//p[text()='Navneet Store']/following-sibling::p")
    private WebElement getPercentageNextBuyingTxt;

    @FindBy(xpath = "//*[@class='copy-button']/parent::*/parent::*/p")
    private WebElement yourCouponCodeTxt;

    @FindBy(xpath = "//*[@class='copy-button']/descendant::h1")
    private WebElement couponCodeValueTxt;

    @FindBy(xpath = "//*[@class='copy-button']/descendant::img")
    private WebElement couponCopyBtn;

    @FindBy(xpath = "//*[contains(text(),'Valid until')]")
    private WebElement couponValidTxt;

    @FindBy(xpath = "//*[@class='m-5']/button")
    private WebElement goToNavNeetStoreBtn;

    //* Unlock coupon popup
    @FindBy(xpath = "//*[@data-testid='CloseIcon']/following-sibling::*//h2")
    private WebElement unlockCouponTitleTxt;

    @FindBy(xpath = "//*[@data-testid='CloseIcon']")
    private WebElement unlockCouponCloseBtn;

    @FindBy(xpath = "//*[@data-testid='CloseIcon']/following-sibling::*/img")
    private WebElement unlockCouponErrorImg;

    @FindBy(xpath = "//*[@class='m-5']/button")
    private WebElement redeemBookToEarnNavCoinsBtn;

    //* Congratulation popup
    @FindBy(xpath = "//*[contains(text(),'Congratulation')]")
    private WebElement congratulationTitleTxt;

    @FindBy(xpath = "//*[contains(text(),'Congratulation')]/following-sibling::img")
    private WebElement congratulationTitleImg;

    @FindBy(xpath = "//*[@data-testid='CloseIcon']")
    private WebElement congratulationCloseBtn;

    @FindBy(xpath = "//*[contains(@class,'absolute top-[')]/preceding-sibling::img")
    private WebElement congratulationBackGroundImg;

    @FindBy(xpath = "//*[contains(@class,'items-center flex-col')]/img")
    private WebElement percentageImg;

    @FindBy(xpath = "//*[contains(text(),'OFF')]")
    private WebElement percentageTxt;

    @FindBy(xpath = "//*[contains(text(),'Claimed Successfully')]")
    private WebElement couponClaimedSuccessfullyTxt;

    @FindBy(xpath = "//*[contains(text(),'Claimed Successfully')]/following-sibling::div/img")
    private WebElement greenTickMarkImg;

    @FindBy(xpath = "//*[contains(text(),'NavCoins Spent')]/preceding-sibling::img")
    private WebElement spentNavCoinsImg;

    @FindBy(xpath = "//*[contains(text(),'NavCoins Spent')]")
    private WebElement navCoinsSpentTxt;

    @FindBy(xpath = "//*[text()='Code:']")
    private WebElement codeTxt;

    @FindBy(xpath = "//*[text()='Code:']/following-sibling::*")
    private WebElement congratulationCodeValueTxt;

    @FindBy(xpath = "//*[text()='COPY']")
    private WebElement congratulationCouponCopyBtn;

    @FindBy(xpath = "//*[contains(text(),'How to')]/preceding-sibling::img")
    private WebElement howToUseImg;

    @FindBy(xpath = "//*[contains(text(),'How to')]")
    private WebElement howToUseTxt;

    @FindBy(xpath = "//li")
    private List<WebElement> howToUseSteps;

    @FindBy(xpath = "//*[contains(text(),'Note:')]")
    private WebElement noteTxt;

    @FindBy(xpath = "//*[contains(text(),'once per')]")
    private WebElement noteDescTxt;

    @FindBy(xpath = "//*[contains(@class,'m-5')]/button")
    private WebElement goToNavNeetBtm;

    @FindBy(xpath = "//*[contains(@class,'button-explore')]/b")
    private WebElement exploreMoreWaysToEarnCoinsBtn;

}
