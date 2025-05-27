package web.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import web.enums.ProfileFields;
import web.generic.WebElementActions;
import web.utils.StringUtils;

public class RedeemAccessCodePage extends WebElementActions {

    final static Logger logger = LogManager.getLogger(RedeemAccessCodePage.class);
    WebDriver driver;
    HomePage homePage;

    public RedeemAccessCodePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        homePage = new HomePage(driver);
    }

    //* Element of redeem access code
    @FindBy(xpath = "//h2[text()='Redeem Access Code']")
    private WebElement redeemAccessCodeTitleTxt;

    @FindBy(xpath = "//*[@data-testid='CloseIcon']")
    private WebElement closeBtn;

    @FindBy(xpath = "//*[contains(@class,'relative')]/img")
    private WebElement backGroundImg;

    @FindBy(xpath = "//*[@alt='Coins GIF or Phone Image']")
    private WebElement redeemAccessCodeImg;

    @FindBy(xpath = "//*[contains(text() , 'Enter')]")
    private WebElement enterAccessCodeToWinRewardTxt;

    @FindBy(xpath = "//*[contains(text(),'find access code')]/preceding-sibling::img")
    private WebElement youtubeImg;

    @FindBy(xpath = "//*[contains(text(),'find access code')]")
    private WebElement youtubeLnk;

    @FindBy(xpath = "//*[contains(text(),'YOUR ACCESS')]")
    private WebElement enterAccessCodeTxt;

    @FindBy(id = "accessCode")
    private WebElement accessCodeTxtfd;

    @FindBy(xpath = "//*[@class='m-4']/button")
    private WebElement redeemAccessCodeBtn;

    //* Wrong access code popup
    @FindBy(xpath = "//*[contains(text(),'Something')]")
    private WebElement somethingWentWrongTitleTxt;

    @FindBy(xpath = "//*[contains(@class,'relative')]/img")
    private WebElement wPBackGroundImg;

    @FindBy(xpath = "//*[contains(@class,'absolute ')]/p")
    private WebElement WpEnterYourAccessCodeToWinRewardsTxt;

    @FindBy(xpath = "//*[contains(@class,'absolute ')]/img")
    private WebElement errorMessageSec;

    @FindBy(xpath = "//*[contains(@class,'justify-center')]/p")
    private WebElement errorMessageTxt;

    /* Getter Methods */
    public WebElement getRedeemAccessCodeTitleTxt() {
        return redeemAccessCodeTitleTxt;
    }

    public WebElement getCloseBtn() {
        return closeBtn;
    }

    public WebElement getBackGroundImg() {
        return backGroundImg;
    }

    public WebElement getRedeemAccessCodeImg() {
        return redeemAccessCodeImg;
    }

    public WebElement getEnterAccessCodeToWinRewardTxt() {
        return enterAccessCodeToWinRewardTxt;
    }

    public WebElement getYoutubeImg() {
        return youtubeImg;
    }

    public WebElement getYoutubeLnk() {
        return youtubeLnk;
    }

    public WebElement getEnterAccessCodeTxt() {
        return enterAccessCodeTxt;
    }

    public WebElement getAccessCodeTxtfd() {
        return accessCodeTxtfd;
    }

    public WebElement getRedeemAccessCodeBtn() {
        return redeemAccessCodeBtn;
    }

    public WebElement getSomethingWentWrongTitleTxt() {
        return somethingWentWrongTitleTxt;
    }

    public WebElement getWPBackGroundImg() {
        return wPBackGroundImg;
    }

    public WebElement getWpEnterYourAccessCodeToWinRewardsTxt() {
        return WpEnterYourAccessCodeToWinRewardsTxt;
    }

    public WebElement getErrorMessageSec() {
        return errorMessageSec;
    }

    public WebElement getErrorMessageTxt() {
        return errorMessageTxt;
    }

    /**
     * @description this method is used to verify redeem access code popup
     * @param close <code>boolean</code>
     */
    public void verifyRedeemAccessCodePopup(boolean close) {
        logger.info("verification of redeem access code is started...");
        elementIsDisplayed(getRedeemAccessCodeTitleTxt(), "RedeemAccessCodeTitleTxt");
        elementIsDisplayed(getCloseBtn(), "CloseBtn");
        elementIsDisplayed(getBackGroundImg(), "BackGroundImg");
        elementIsDisplayed(getRedeemAccessCodeImg(), "RedeemAccessCodeImg");
        elementIsDisplayed(getEnterAccessCodeToWinRewardTxt(), "EnterAccessCodeToWinRewardTxt");
        elementIsDisplayed(getYoutubeImg(), "YoutubeImg");
        elementIsDisplayed(getYoutubeLnk(), "YoutubeLnk");
        elementIsDisplayed(getEnterAccessCodeTxt(), "EnterAccessCodeTxt");
        elementIsDisplayed(getAccessCodeTxtfd(), "AccessCodeTxtfd");
        elementIsDisplayed(getRedeemAccessCodeBtn(), "RedeemAccessCodeBtn");
        if(close){
            click(getCloseBtn(), "CloseBtn");
        }
        logger.info("verification of redeem access code is completed successfully.\n");
    }

    /**
     * @description this method is used to verify the wrong popup.
     * @param close <code>boolean</code>
     */
    public void verifyWrongAccessCodePopup(boolean close){
        logger.info("verification of wrong redeem access code is started...");
        if(!checkIfElementIsDisplayed(getRedeemAccessCodeTitleTxt(), "RedeemAccessCodeTitleTxt")){
            homePage.openHomeFeaturesByName(ProfileFields.REDEEM_ACCESS_CODE.getProfileFieldName());
            waitTillElementIsDisplayedWithinTime(getRedeemAccessCodeTitleTxt(), "RedeemAccessCodeTitleTxt", 3);
        }
        // to generate random string
        String randomString = StringUtils.generateRandomString(7);
        enterValue(getAccessCodeTxtfd(), "AccessCodeTxtfd", randomString);
        checkElementIsEnabled(getRedeemAccessCodeBtn(), "RedeemAccessCodeBtn");
        click(getRedeemAccessCodeBtn(), "RedeemAccessCodeBtn");
        elementIsDisplayed(getSomethingWentWrongTitleTxt(), "SomethingWentWrongTitleTxt");
        elementIsDisplayed(getWPBackGroundImg(), "WPBackGroundImg");
        elementIsDisplayed(getWpEnterYourAccessCodeToWinRewardsTxt(), "WpEnterYourAccessCodeToWinRewardsTxt");
        elementIsDisplayed(getErrorMessageSec(), "ErrorMessageSec");
        elementIsDisplayed(getErrorMessageTxt(), "ErrorMessageTxt");
        elementIsDisplayed(getYoutubeImg(), "YoutubeImg");
        elementIsDisplayed(getYoutubeLnk(), "YoutubeLnk");
        elementIsDisplayed(getEnterAccessCodeTxt(), "EnterAccessCodeTxt");
        elementIsDisplayed(getAccessCodeTxtfd(), "AccessCodeTxtfd");
        elementIsDisplayed(getRedeemAccessCodeBtn(), "RedeemAccessCodeBtn");
        if(close){
            click(getCloseBtn(), "CloseBtn");
        }
        logger.info("verification of wrong redeem access code is completed successfully.\n");

    }

}
