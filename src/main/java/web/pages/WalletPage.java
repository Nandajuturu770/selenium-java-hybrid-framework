package web.pages;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import web.generic.WebElementActions;

public class WalletPage extends WebElementActions {

    final static Logger logger = LogManager.getLogger(WalletPage.class);
    WebDriver driver;

    public WalletPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //* Element of profile banner
    @FindBy(xpath = "//*[@class='breadcrumbs']/span")
    private WebElement homeLnk;

    @FindBy(xpath = "//*[@class='my-wallet-container']/descendant::*[contains(@class,'MuiAvatar-root')]/img")
    private WebElement profile;

    @FindBy(xpath = "//*[contains(@aria-label,' Welcome')]")
    private WebElement welcomeWalletProfileNameTxt;

    @FindBy(xpath = "//*[contains(@aria-label,' Welcome')]/following-sibling::*")
    private WebElement earnAndSpendProfileDescTxt;

    @FindBy(xpath = "//*[@class='relative']/descendant::*[contains(@class,'absolute')]/img")
    private WebElement bannerNavCoinsPAnimationTxt;

    @FindBy(xpath = "//*[text()='Streak']/parent::div/preceding-sibling::*")
    private WebElement streakImg;

    @FindBy(xpath = "//*[text()='Streak']/preceding-sibling::b")
    private WebElement streakCountTxt;

    @FindBy(xpath = "//*[text()='Streak']")
    private WebElement streakTxt;

    @FindBy(xpath = "//*[text()='Coupons unlocked']/parent::div/preceding-sibling::*")
    private WebElement couponUnlockedImg;

    @FindBy(xpath = "//*[text()='Coupons unlocked']/preceding-sibling::b")
    private WebElement couponUnlockedCountTxt;

    @FindBy(xpath = "//*[text()='Coupons unlocked']")
    private WebElement couponUnlockedTxt;

    @FindBy(xpath = "//*[contains(text(),'NavCoins') and @class='couponSub-title']/ancestor::div/preceding-sibling::img[@class]")
    private WebElement navCoinsImg;

    @FindBy(xpath = "//*[contains(text(),'NavCoins')]/preceding-sibling::b")
    private WebElement navCoinsCountTxt;

    @FindBy(xpath = "//*[contains(text(),'NavCoins')]")
    private WebElement navCoinsTxt;

    //* Navcoins balance
    @FindBy(className = "placeholder")
    private WebElement navCoinsBalanceTitleTxt;

    @FindBy(className = "sub-title")
    private WebElement numberOfNavCoinsTxt;

    @FindBy(xpath = "//*[@class='day-parent']/following-sibling::div/img")
    private WebElement navCoinsBalanceNavCoinsAnimationImg;

    @FindBy(xpath = "//*[@class='nav-coin-earn']/div[@class='coins']")
    private WebElement totalEarnedNavCoinsCountTxt;

    @FindBy(xpath = "//*[@class='nav-coin-earn']/div[@class='nav-coin-help-text']")
    private WebElement navCoinsEarnedTxt;

    @FindBy(xpath = "//*[@class='nav-coin-spend']/div[@class='coins']")
    private WebElement totalSpentNavCoinsCountTxt;

    @FindBy(xpath = "//*[@class='nav-coin-spend']/div[@class='nav-coin-help-text']")
    private WebElement navCoinsSpentTxt;

    //* Recent transactions
    @FindBy(className = "nav-trn-title")
    private WebElement transactionsTitleTxt;

    @FindBy(className = "view-all")
    private WebElement transactionsViewAllLnk;

    @FindBy(xpath = "//*[@alt='Transaction Icon']")
    private WebElement transactionImg;

    @FindBy(xpath = "//*[@alt='Transaction Icon']/following-sibling::*/child::*[contains(@class,'font-bold')]")
    private WebElement transactionHeaderTxt;

    @FindBy(xpath = "//*[@alt='Transaction Icon']/following-sibling::*/child::*[contains(@class,'font-semibold text-neutral')]")
    private WebElement transactionDataTxt;

    @FindBy(xpath = "//*[contains(@class,'items-end whitespace')]/*[contains(@class,'font-semibold')]")
    private WebElement transactionAmountTxt;

    @FindBy(xpath = "//*[contains(@class,'items-end whitespace')]/*[contains(@class,'font-semibold')]")
    private WebElement transactionTypeTxt;

    //* My wallet and categories
    @FindBy(className = "nav-coin-container-title")
    private WebElement myWalletTitleTxt;

    @FindBy(className = "category-title")
    private WebElement categoriesTxt;

    @FindBy(xpath = "//*[@alt='Earn Icon']")
    private WebElement earnNavCoinsBtn;

    @FindBy(xpath = "//*[@alt='Earn Icon']/parent::*/following-sibling::*")
    private WebElement earnNavCoinsTxt;

    @FindBy(xpath = "//*[@alt='Spend Icon']")
    private WebElement spendNavCoinsBtn;

    @FindBy(xpath = "//*[@alt='Spend Icon']/parent::*/following-sibling::*")
    private WebElement spendNavCoinsTxt;

    @FindBy(xpath = "//*[@alt='Rewards Icon']")
    private WebElement myRewardsBtn;

    @FindBy(xpath = "//*[@alt='Rewards Icon']/parent::*/following-sibling::*")
    private WebElement myRewardsTxt;

    @FindBy(xpath = "//*[@alt='History Icon']")
    private WebElement transactionHistoryBtn;

    @FindBy(xpath = "//*[@alt='History Icon']/parent::*/following-sibling::*")
    private WebElement transactionHistoryTxt;

    //* Put your to use
    @FindBy(xpath = "//*[@class='coupons-header']/child::h1")
    private WebElement putYourCoinsUseTxt;

    @FindBy(xpath = "//*[@class='couponBlueBlock']/img")
    private WebElement blueCouponImg;

    @FindBy(xpath = "//*[@class='couponBlueBlock']/p")
    private WebElement blueNumberOfCouponsTxt;

    @FindBy(xpath = "//*[@class='couponGreenBlock']/img")
    private WebElement greenCouponImg;

    @FindBy(xpath = "//*[@class='couponGreenBlock']/p")
    private WebElement greenNumberOfCouponsTxt;

    //* Coupon card
    @FindBy(xpath = "//*[contains(@class,'lock-container')]")
    private WebElement couponCardMainImg;

    @FindBy(className = "'image-259-wrapper")
    private WebElement navNeetStoreLnk;

    @FindBy(className = "percentageValue")
    private WebElement percentageValueTxt;

    @FindBy(className = "percentageOff")
    private WebElement offTxt;

    @FindBy(xpath = "//*[@class='coin-info']/img")
    private WebElement couponNavCoinsImg;

    @FindBy(xpath = "//*[@class='coin-info']/child::*[@class='navcoins']")
    private WebElement couponNoOfNavCoinsTxt;

    @FindBy(className = "lock-icon")
    private WebElement lockedIcon;

    @FindBy(className = "criteriaText")
    private WebElement miniumPurchaseTxt;

    @FindBy(xpath = "//*[@class='viewCoupneCodeBtnAvail']/button")
    private WebElement viewCouponCodeBtn;

    @FindBy(xpath = "//*[@class=' viewCoupneCodeBtn']/button")
    private WebElement claimNowBtn;

    @FindBy(xpath = "RedeemCategory-title")
    private WebElement wayToEarnNavCoinsTitleTxt;

    @FindBy(xpath = "//*[@class='RedeemCategory-title']/following-sibling::button")
    private WebElement viewAllBtn;

    @FindBy(xpath = "//*[@alt='Code Icon']")
    private WebElement redeemAccessCodeBtn;

    @FindBy(xpath = "//*[@alt='Code Icon']/parent::*/following-sibling::*")
    private WebElement redeemAccessCodeTxt;

    @FindBy(xpath = "//*[@alt='Fire Icon']")
    private WebElement loginStreakBtn;

    @FindBy(xpath = "//*[@alt='Fire Icon']/parent::*/following-sibling::*")
    private WebElement loginStreakTxt;

    @FindBy(xpath = "//*[@alt='Flight  Icon']")
    private WebElement upgradeToPremiumBtn;

    @FindBy(xpath = "//*[@alt='Flight  Icon']/parent::*/following-sibling::*")
    private WebElement upgradeToPremiumTxt;

    @FindBy(xpath = "//*[@alt='File Icon']")
    private WebElement completedReadingBookBtn;

    @FindBy(xpath = "//*[@alt='File Icon']/parent::*/following-sibling::*")
    private WebElement completedReadingBookTxt;

    //* Book details for redeem and upgrade to premium and completed book
    @FindBy(xpath = "//*[contains(@class,'earn-coins')]/img")
    private WebElement bookNavCoinsImg;

    @FindBy(xpath = "//*[contains(@class,'earn-coins')]/span")
    private WebElement bookNoOfNavCoinsTxt;

    @FindBy(xpath = "//*[@class='book-card']/child::img")
    private WebElement bookCoverImg;

    @FindBy(xpath = "redeemBookTitle")
    private WebElement bookTittleTxt;

    @FindBy(xpath = "//*[@alt='Premium Icon']")
    private WebElement premiumIconImg;

    @FindBy(xpath = "//*[@alt='Premium Icon']/parent::*/following-sibling::*")
    private WebElement premiumTxt;

    @FindBy(xpath = "//*[@class='redeemBtn']/button")
    private WebElement redeemOrUpgradeOrReadeBtn;

    //* Login Streak 
    @FindBy(xpath = "//*[@class='streakCount']/descendant::img")
    private WebElement streakCountImg;

    @FindBy(xpath = "//*[@class='streakCount']/descendant::*[@class='streakText']")
    private WebElement noOfDaysSteakCountTxt;

    @FindBy(xpath = "//*[@class='rewardBadge']/descendant::img")
    private WebElement streakRewardImg;

    @FindBy(xpath = "//*[@class='rewardBadge']/descendant::*[@class='rewardText']")
    private WebElement streakRewardTxt;

    @FindBy(xpath = "//*[@class='streakHeader']/following-sibling::*[@class='streakMessage']")
    private WebElement streakMessageTxt;

    @FindBy(className = "calendarContainer")
    private WebElement weekCalendarSec;

    @FindBy(className = "dayCard")
    private List<WebElement> dayCardSec;

    @FindBy(xpath = "//*[@class='dayContent']/img")
    private List<WebElement> dayNavCoinsImg;

    @FindBy(xpath = "//*[@class='dayContent']/*[@class='dayText']")
    private List<WebElement> dayTxt;

    @FindBy(xpath = "//*[@class='viewCalendarButton']/descendant::button")
    private WebElement viewStreakCalendarBtn;

    //* Calendar Popup
    @FindBy(xpath = "//*[@class='dateRangeHeader']/descendant::img")
    private WebElement calenderHeaderImg;

    @FindBy(xpath = "//*[@class='dateRangeHeader']/descendant::h3")
    private WebElement calenderHeaderTxt;

    @FindBy(xpath = "//*[@class='dateRangeHeader']/descendant::*[@data-testid='CloseIcon']")
    private WebElement calendarCloseBtn;

    @FindBy(className = "date-input")
    private List<WebElement> monthTxt;

    @FindBy(xpath = "//*[@alt='Backward']")
    private WebElement monthBackwardBtn;

    @FindBy(xpath = "//*[@alt='Forward']/parent::*")
    private WebElement monthForwardBtn;

    @FindBy(className = "rdrMonthName")
    private List<WebElement> monthHeadersTxt;

    @FindBy(className = "rdrWeekDays")
    private List<WebElement> weekDaysSec;

    @FindBy(xpath = "(//*[@class='rdrWeekDays'])[last()]/span")
    private List<WebElement> weekDaysTxt;

    @FindBy(xpath = "//*[@class='rdrDayNumber']/div")
    private WebElement monthDaysTxt;

    @FindBy(xpath = "//*[@class='streakNotificationContent']/img")
    private WebElement streakNotificationImg;

    @FindBy(xpath = "//*[@class='streakNotificationContent']/span")
    private WebElement streakNotificationTxt;

    @FindBy(className = "foregroundImage")
    private WebElement noBooksImg;

    @FindBy(className = "noResultsTitle")
    private WebElement noResultTitleTxt;

    @FindBy(className = "noResultsDescription")
    private WebElement noResultDescriptionTxt;

    /* Getter Methods */
    public WebElement getHomeLnk() {
        return homeLnk;
    }

    public WebElement getProfile() {
        return profile;
    }

    public WebElement getWelcomeWalletProfileNameTxt() {
        return welcomeWalletProfileNameTxt;
    }

    public WebElement getEarnAndSpendProfileDescTxt() {
        return earnAndSpendProfileDescTxt;
    }

    public WebElement getBannerNavCoinsPAnimationTxt() {
        return bannerNavCoinsPAnimationTxt;
    }

    public WebElement getStreakImg() {
        return streakImg;
    }

    public WebElement getStreakCountTxt() {
        return streakCountTxt;
    }

    public WebElement getStreakTxt() {
        return streakTxt;
    }

    public WebElement getCouponUnlockedImg() {
        return couponUnlockedImg;
    }

    public WebElement getCouponUnlockedCountTxt() {
        return couponUnlockedCountTxt;
    }

    public WebElement getCouponUnlockedTxt() {
        return couponUnlockedTxt;
    }

    public WebElement getNavCoinsImg() {
        return navCoinsImg;
    }

    public WebElement getNavCoinsCountTxt() {
        return navCoinsCountTxt;
    }

    public WebElement getNavCoinsTxt() {
        return navCoinsTxt;
    }

    public WebElement getNavCoinsBalanceTitleTxt() {
        return navCoinsBalanceTitleTxt;
    }

    public WebElement getNumberOfNavCoinsTxt() {
        return numberOfNavCoinsTxt;
    }

    public WebElement getNavCoinsBalanceNavCoinsAnimationImg() {
        return navCoinsBalanceNavCoinsAnimationImg;
    }

    public WebElement getTotalEarnedNavCoinsCountTxt() {
        return totalEarnedNavCoinsCountTxt;
    }

    public WebElement getNavCoinsEarnedTxt() {
        return navCoinsEarnedTxt;
    }

    public WebElement getTotalSpentNavCoinsCountTxt() {
        return totalSpentNavCoinsCountTxt;
    }

    public WebElement getNavCoinsSpentTxt() {
        return navCoinsSpentTxt;
    }

    public WebElement getTransactionsTitleTxt() {
        return transactionsTitleTxt;
    }

    public WebElement getTransactionsViewAllLnk() {
        return transactionsViewAllLnk;
    }

    public WebElement getTransactionImg() {
        return transactionImg;
    }

    public WebElement getTransactionHeaderTxt() {
        return transactionHeaderTxt;
    }

    public WebElement getTransactionDataTxt() {
        return transactionDataTxt;
    }

    public WebElement getTransactionAmountTxt() {
        return transactionAmountTxt;
    }

    public WebElement getTransactionTypeTxt() {
        return transactionTypeTxt;
    }

    public WebElement getMyWalletTitleTxt() {
        return myWalletTitleTxt;
    }

    public WebElement getCategoriesTxt() {
        return categoriesTxt;
    }

    public WebElement getEarnNavCoinsBtn() {
        return earnNavCoinsBtn;
    }

    public WebElement getEarnNavCoinsTxt() {
        return earnNavCoinsTxt;
    }

    public WebElement getSpendNavCoinsBtn() {
        return spendNavCoinsBtn;
    }

    public WebElement getSpendNavCoinsTxt() {
        return spendNavCoinsTxt;
    }

    public WebElement getMyRewardsBtn() {
        return myRewardsBtn;
    }

    public WebElement getMyRewardsTxt() {
        return myRewardsTxt;
    }

    public WebElement getTransactionHistoryBtn() {
        return transactionHistoryBtn;
    }

    public WebElement getTransactionHistoryTxt() {
        return transactionHistoryTxt;
    }

    public WebElement getPutYourCoinsUseTxt() {
        return putYourCoinsUseTxt;
    }

    public WebElement getBlueCouponImg() {
        return blueCouponImg;
    }

    public WebElement getBlueNumberOfCouponsTxt() {
        return blueNumberOfCouponsTxt;
    }

    public WebElement getGreenCouponImg() {
        return greenCouponImg;
    }

    public WebElement getGreenNumberOfCouponsTxt() {
        return greenNumberOfCouponsTxt;
    }

    public WebElement getCouponCardMainImg() {
        return couponCardMainImg;
    }

    public WebElement getNavNeetStoreLnk() {
        return navNeetStoreLnk;
    }

    public WebElement getPercentageValueTxt() {
        return percentageValueTxt;
    }

    public WebElement getOffTxt() {
        return offTxt;
    }

    public WebElement getCouponNavCoinsImg() {
        return couponNavCoinsImg;
    }

    public WebElement getCouponNoOfNavCoinsTxt() {
        return couponNoOfNavCoinsTxt;
    }

    public WebElement getLockedIcon() {
        return lockedIcon;
    }

    public WebElement getMiniumPurchaseTxt() {
        return miniumPurchaseTxt;
    }

    public WebElement getViewCouponCodeBtn() {
        return viewCouponCodeBtn;
    }

    public WebElement getClaimNowBtn() {
        return claimNowBtn;
    }

    public WebElement getWayToEarnNavCoinsTitleTxt() {
        return wayToEarnNavCoinsTitleTxt;
    }

    public WebElement getViewAllBtn() {
        return viewAllBtn;
    }

    public WebElement getRedeemAccessCodeBtn() {
        return redeemAccessCodeBtn;
    }

    public WebElement getRedeemAccessCodeTxt() {
        return redeemAccessCodeTxt;
    }

    public WebElement getLoginStreakBtn() {
        return loginStreakBtn;
    }

    public WebElement getLoginStreakTxt() {
        return loginStreakTxt;
    }

    public WebElement getUpgradeToPremiumBtn() {
        return upgradeToPremiumBtn;
    }

    public WebElement getUpgradeToPremiumTxt() {
        return upgradeToPremiumTxt;
    }

    public WebElement getCompletedReadingBookBtn() {
        return completedReadingBookBtn;
    }

    public WebElement getCompletedReadingBookTxt() {
        return completedReadingBookTxt;
    }

    public WebElement getBookNavCoinsImg() {
        return bookNavCoinsImg;
    }

    public WebElement getBookNoOfNavCoinsTxt() {
        return bookNoOfNavCoinsTxt;
    }

    public WebElement getBookCoverImg() {
        return bookCoverImg;
    }

    public WebElement getBookTittleTxt() {
        return bookTittleTxt;
    }

    public WebElement getPremiumIconImg() {
        return premiumIconImg;
    }

    public WebElement getPremiumTxt() {
        return premiumTxt;
    }

    public WebElement getRedeemOrUpgradeOrReadeBtn() {
        return redeemOrUpgradeOrReadeBtn;
    }

    public WebElement getStreakCountImg() {
        return streakCountImg;
    }

    public WebElement getNoOfDaysSteakCountTxt() {
        return noOfDaysSteakCountTxt;
    }

    public WebElement getStreakRewardImg() {
        return streakRewardImg;
    }

    public WebElement getStreakRewardTxt() {
        return streakRewardTxt;
    }

    public WebElement getStreakMessageTxt() {
        return streakMessageTxt;
    }

    public WebElement getWeekCalendarSec() {
        return weekCalendarSec;
    }

    public List<WebElement> getDayCardSec() {
        return dayCardSec;
    }

    public List<WebElement> getDayNavCoinsImg() {
        return dayNavCoinsImg;
    }

    public List<WebElement> getDayTxt() {
        return dayTxt;
    }

    public WebElement getViewStreakCalendarBtn() {
        return viewStreakCalendarBtn;
    }

    public WebElement getCalenderHeaderImg() {
        return calenderHeaderImg;
    }

    public WebElement getCalenderHeaderTxt() {
        return calenderHeaderTxt;
    }

    public WebElement getCalendarCloseBtn() {
        return calendarCloseBtn;
    }

    public List<WebElement> getMonthTxt() {
        return monthTxt;
    }

    public WebElement getMonthBackwardBtn() {
        return monthBackwardBtn;
    }

    public WebElement getMonthForwardBtn() {
        return monthForwardBtn;
    }

    public List<WebElement> getMonthHeadersTxt() {
        return monthHeadersTxt;
    }

    public List<WebElement> getWeekDaysSec() {
        return weekDaysSec;
    }

    public List<WebElement> getWeekDaysTxt() {
        return weekDaysTxt;
    }

    public WebElement getMonthDaysTxt() {
        return monthDaysTxt;
    }

    public WebElement getStreakNotificationImg() {
        return streakNotificationImg;
    }

    public WebElement getStreakNotificationTxt() {
        return streakNotificationTxt;
    }

    public WebElement getNoBooksImg() {
        return noBooksImg;
    }

    public WebElement getNoResultTitleTxt() {
        return noResultTitleTxt;
    }

    public WebElement getNoResultDescriptionTxt() {
        return noResultDescriptionTxt;
    }

}
