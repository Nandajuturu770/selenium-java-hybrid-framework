package web.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import web.generic.WebElementActions;

public class WayToEarnNavCoinsPage extends WebElementActions {

    final static Logger logger = LogManager.getLogger(WayToEarnNavCoinsPage.class);
    WebDriver driver;

    public WayToEarnNavCoinsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    //* Element of buttons Section
    @FindBy(className = "section-title")
    private WebElement wayToEarnNavCoinsTitleTxt;

    @FindBy(xpath = "//*[@alt='Book Icon']")
    private WebElement buyPremiumDigiBookBtn;

    @FindBy(xpath = "//*[@alt='Book Icon']/parent::*/following-sibling::*")
    private WebElement buyPremiumDigiBookTxt;

    @FindBy(xpath = "//*[@alt='Access Icon']")
    private WebElement buyBasicDigiBookBtn;

    @FindBy(xpath = "//*[@alt='Access Icon']/parent::*/following-sibling::*")
    private WebElement buyBasicDigiBookTxt;

    @FindBy(className = "title-name-categories")
    private WebElement sectionTitleTxt;

    @FindBy(className = "title-name-categories-count")
    private WebElement sectionTitleCountTxt;

    // Buy book section book details
    @FindBy(xpath = "//*[@class='earn-coinsBook']/img")
    private WebElement bookEarnedCoinsImg;

    @FindBy(xpath = "//*[@class='earn-coinsBook']/span")
    private WebElement bookEarnedCoinsTxt;

    @FindBy(xpath = "//*[@class='bookCoverImgForBasics']/img")
    private WebElement bookCoverImg;

    @FindBy(className = "Cookbook")
    private WebElement bookNameTxt;

    @FindBy(xpath = "(//*[@class='whiteHeartIcon'])[1]/img[contains(@alt ,'White')]")
    private WebElement firstBookWhiteHeartImg;

    @FindBy(xpath = "(//*[@class='whiteHeartIcon'])[1]/img[contains(@alt ,'Red')]")
    private WebElement firstBookRedHeartImg;

    @FindBy(className = "navneetBookDetails")
    private WebElement bookDescTxt;

    @FindBy(xpath = "//*[@class='ratingContainer']/img")
    private WebElement ratingImg;

    @FindBy(className = "ratingNumber")
    private WebElement ratingValueTxt;

    @FindBy(xpath = "//*[@class='numberofRating']/span")
    private WebElement noOfRatingsTxt;

    @FindBy(className = "bookGradeName")
    private WebElement bookGradeTxt;

    @FindBy(className = "bookGradeDetails")
    private WebElement bookGradeValueTxt;

    @FindBy(className = "bookSubjectName")
    private WebElement bookSubjectTxt;

    @FindBy(className = "bookSubjectDetails")
    private WebElement bookSubjectValueTxt;

    @FindBy(xpath = "//*[@class='cart-Item-premium-label']/img")
    private WebElement bookPremiumIconImg;

    @FindBy(xpath = "//*[@class='cart-Item-premium-label']/span")
    private WebElement bookPremiumTxt;

    @FindBy(xpath = "//*[@class='smartStoreCard-price']/span")
    private WebElement bookPriceTxt;

    @FindBy(xpath = "(//*[@class='addToCartBtn'])[1]/*[text()='Add to Cart']")
    private WebElement firstBookAddToCartBtn;

    @FindBy(xpath = "(//*[@class='addToCartBtn'])[1]/*[text()='Go to Cart']")
    private WebElement firstBookGoToCartBtn;

    //* Spend NavCoins Page
    @FindBy(className = "spendCoinsText")
    private WebElement spendNavCoinsTitleTxt;

    @FindBy(className = "explore-ways-to")
    private WebElement exploreWaysToEarnNavCoinsBtn;

    /* Getter Methods */
    public WebElement getWayToEarnNavCoinsTitleTxt() {
        return wayToEarnNavCoinsTitleTxt;
    }

    public WebElement getBuyPremiumDigiBookBtn() {
        return buyPremiumDigiBookBtn;
    }

    public WebElement getBuyPremiumDigiBookTxt() {
        return buyPremiumDigiBookTxt;
    }

    public WebElement getBuyBasicDigiBookBtn() {
        return buyBasicDigiBookBtn;
    }

    public WebElement getBuyBasicDigiBookTxt() {
        return buyBasicDigiBookTxt;
    }

    public WebElement getSectionTitleTxt() {
        return sectionTitleTxt;
    }

    public WebElement getSectionTitleCountTxt() {
        return sectionTitleCountTxt;
    }

    public WebElement getBookEarnedCoinsImg() {
        return bookEarnedCoinsImg;
    }

    public WebElement getBookEarnedCoinsTxt() {
        return bookEarnedCoinsTxt;
    }

    public WebElement getBookCoverImg() {
        return bookCoverImg;
    }

    public WebElement getBookNameTxt() {
        return bookNameTxt;
    }

    public WebElement getFirstBookWhiteHeartImg() {
        return firstBookWhiteHeartImg;
    }

    public WebElement getFirstBookRedHeartImg() {
        return firstBookRedHeartImg;
    }

    public WebElement getBookDescTxt() {
        return bookDescTxt;
    }

    public WebElement getRatingImg() {
        return ratingImg;
    }

    public WebElement getRatingValueTxt() {
        return ratingValueTxt;
    }

    public WebElement getNoOfRatingsTxt() {
        return noOfRatingsTxt;
    }

    public WebElement getBookGradeTxt() {
        return bookGradeTxt;
    }

    public WebElement getBookGradeValueTxt() {
        return bookGradeValueTxt;
    }

    public WebElement getBookSubjectTxt() {
        return bookSubjectTxt;
    }

    public WebElement getBookSubjectValueTxt() {
        return bookSubjectValueTxt;
    }

    public WebElement getBookPremiumIconImg() {
        return bookPremiumIconImg;
    }

    public WebElement getBookPremiumTxt() {
        return bookPremiumTxt;
    }

    public WebElement getBookPriceTxt() {
        return bookPriceTxt;
    }

    public WebElement getFirstBookAddToCartBtn() {
        return firstBookAddToCartBtn;
    }

    public WebElement getFirstBookGoToCartBtn() {
        return firstBookGoToCartBtn;
    }

    public WebElement getSpendNavCoinsTitleTxt() {
        return spendNavCoinsTitleTxt;
    }

    public WebElement getExploreWaysToEarnNavCoinsBtn() {
        return exploreWaysToEarnNavCoinsBtn;
    }

}
