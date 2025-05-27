package web.pages;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import web.generic.WebElementActions;

public class BookDetailsPage extends WebElementActions {

    final static Logger logger = LogManager.getLogger(BookDetailsPage.class);
    WebDriver driver;

    public BookDetailsPage(WebDriver driver) {
        this.driver = driver;
    }

    //* Element of book details page
    @FindBy(className = "product-thumbnail-image")
    private WebElement thumbnailsImg;

    @FindBy(className = "up-arrow-container")
    private WebElement thumbnailUpArrowBtn;

    @FindBy(className = "down-arrow-container")
    private WebElement thumbnailDownArrowBtn;

    @FindBy(className = "product-thumbnail-preview")
    private WebElement thumbnailPreviewImg;

    @FindBy(className = "bookName-title")
    private WebElement bookNameTxt;
    @FindBy(xpath = "//*[@class='bookName-title']/descendant::img")
    private WebElement shareBtn;

    @FindBy(xpath = "//*[@alt='Whatsapp']")
    private WebElement whatsappImg;

    @FindBy(xpath = "//*[@alt='Whatsapp']/following-sibling::p")
    private WebElement whatsappTxt;

    @FindBy(xpath = "//*[@alt='Facebook']")
    private WebElement facebookImg;

    @FindBy(xpath = "//*[@alt='Facebook']/following-sibling::p")
    private WebElement facebookTxt;

    @FindBy(xpath = "//*[@alt='X']")
    private WebElement twitterImg;

    @FindBy(xpath = "//*[@alt='X']/following-sibling::p")
    private WebElement twitterTxt;

    @FindBy(xpath = "//*[@alt='Instagram']")
    private WebElement instagramImg;

    @FindBy(xpath = "//*[@alt='Instagram']/following-sibling::p")
    private WebElement instagramTxt;

    @FindBy(xpath = "//*[@alt='Copy Link']")
    private WebElement copyLinkImg;

    @FindBy(xpath = "//*[@alt='Copy Link']/following-sibling::p")
    private WebElement copyLinkTxt;

    @FindBy(xpath = "//*[@class='rating-box']/descendant::img")
    private WebElement ratingImg;

    @FindBy(xpath = "//*[@class='rating-box']/descendant::img/../following-sibling::span")
    private WebElement noOfRatingsTxt;

    @FindBy(xpath = "//*[@class=' text-[#222222B2]']")
    private WebElement gradeTxt;

    @FindBy(xpath = "//*[@class=' text-[#222222B2]']/span")
    private WebElement gradeValueTxt;

    @FindBy(xpath = "//*[contains(text(),'Subject')]")
    private WebElement subjectTxt;

    @FindBy(xpath = "//*[contains(text(),'Subject')]/span")
    private WebElement subjectValueTxt;

    @FindBy(className = "description-text")
    private WebElement bookDescriptionTxt;

    @FindBy(className = "read-more")
    private WebElement readMoreBtn;

    @FindBy(xpath = "//*[text()='Read less']")
    private WebElement readLessBtn;

    @FindBy(className = "feature-title")
    private WebElement digiBookFeaturesTitleTxt;

    @FindBy(xpath = "//*[@class='digiBook-Features-box']/descendant::img")
    private List<WebElement> digiBookFeaturesImg;

    @FindBy(xpath = "//*[@class='digiBook-Features-box']/descendant::span")
    private WebElement digiBookFeatureNameTxt;

    @FindBy(xpath = "//*[@class='interactives-item-container']/child::img")
    private WebElement digiBookFeatureLeftBtn;

    @FindBy(xpath = "(//*[@class='interactives-item-container']/child::img)[last()]")
    private WebElement digiBookFeatureRightBtn;

    @FindBy(className = "buying-container")
    private WebElement moreBuyingTitleTxt;

    /*Note : for more buying option, we have elements in smart store class */
    @FindBy(xpath = "//*[@class='book-buy-buttons']/child::*[text()='Add to Cart']")
    private WebElement addToCartBtn;

    @FindBy(xpath = "//*[@class='book-buy-buttons']/child::*[text()='Go to Cart']")
    private WebElement goToCartBtn;

    @FindBy(xpath = "//*[@class='book-buy-buttons']/child::*[text()='Add to Wishlist']")
    private WebElement addToWishlistBtn;

    @FindBy(xpath = "//*[@class='book-buy-buttons']/child::*[text()='Wishlisted']")
    private WebElement wishlistedBtn;

    @FindBy(className = "product-expired-label")
    private WebElement bookExpiredTxt;

    @FindBy(xpath = "//*[@class='redeem-note']/descendant::img")
    private WebElement redeemImg;

    @FindBy(xpath = "//*[contains(text(),'Do you possess the')]")
    private WebElement doYouPossessTxt;

    @FindBy(xpath = "//*[contains(text(),'the provided code within')]")
    private WebElement kindlyRequestTxt;
    
    @FindBy(xpath = "//*[@class='redeem-button']/button")
    private WebElement redeemBtn;

    //* You might also need
    @FindBy(xpath = "sub-header-title")
    private WebElement youMightAlsoTxt;

    @FindBy(xpath = "//img[@class='horizontalScrollBar-img']")
    private WebElement TssBookCoverImg;

    @FindBy(xpath = "//*[@class='horizontalscroller-subTitle']")
    private WebElement TssBookNameTxt;

    @FindBy(xpath = "//*[@class='book-current-price']")
    private WebElement TssBookPriceTxt;

    @FindBy(xpath = "//*[@class='book-wishlist-icon']//*[@xmlns='http://www.w3.org/2000/svg']")
    private WebElement TssBookHeartBtn;

    @FindBy(xpath = "//*[@class='premium-label']/img")
    private WebElement TssBookPremiumImg;

    @FindBy(xpath = "//*[@class='book-add-to-cart-button']")
    private WebElement addToCartOrGoToCartBtn;
 
    /* Getter Methods */
    public WebElement getThumbnailsImg() {
        return thumbnailsImg;
    }

    public WebElement getThumbnailUpArrowBtn() {
        return thumbnailUpArrowBtn;
    }

    public WebElement getThumbnailDownArrowBtn() {
        return thumbnailDownArrowBtn;
    }

    public WebElement getThumbnailPreviewImg() {
        return thumbnailPreviewImg;
    }

    public WebElement getBookNameTxt() {
        return bookNameTxt;
    }

    public WebElement getShareBtn() {
        return shareBtn;
    }

    public WebElement getWhatsappImg() {
        return whatsappImg;
    }

    public WebElement getWhatsappTxt() {
        return whatsappTxt;
    }

    public WebElement getFacebookImg() {
        return facebookImg;
    }

    public WebElement getFacebookTxt() {
        return facebookTxt;
    }

    public WebElement getTwitterImg() {
        return twitterImg;
    }

    public WebElement getTwitterTxt() {
        return twitterTxt;
    }

    public WebElement getInstagramImg() {
        return instagramImg;
    }

    public WebElement getInstagramTxt() {
        return instagramTxt;
    }

    public WebElement getCopyLinkImg() {
        return copyLinkImg;
    }

    public WebElement getCopyLinkTxt() {
        return copyLinkTxt;
    }

    public WebElement getRatingImg() {
        return ratingImg;
    }

    public WebElement getNoOfRatingsTxt() {
        return noOfRatingsTxt;
    }

    public WebElement getGradeTxt() {
        return gradeTxt;
    }

    public WebElement getGradeValueTxt() {
        return gradeValueTxt;
    }

    public WebElement getSubjectTxt() {
        return subjectTxt;
    }

    public WebElement getSubjectValueTxt() {
        return subjectValueTxt;
    }

    public WebElement getBookDescriptionTxt() {
        return bookDescriptionTxt;
    }

    public WebElement getReadMoreBtn() {
        return readMoreBtn;
    }

    public WebElement getReadLessBtn() {
        return readLessBtn;
    }

    public WebElement getDigiBookFeaturesTitleTxt() {
        return digiBookFeaturesTitleTxt;
    }

    public List<WebElement> getDigiBookFeaturesImg() {
        return digiBookFeaturesImg;
    }

    public WebElement getDigiBookFeatureNameTxt() {
        return digiBookFeatureNameTxt;
    }

    public WebElement getDigiBookFeatureLeftBtn() {
        return digiBookFeatureLeftBtn;
    }

    public WebElement getDigiBookFeatureRightBtn() {
        return digiBookFeatureRightBtn;
    }

    public WebElement getMoreBuyingTitleTxt() {
        return moreBuyingTitleTxt;
    }

    public WebElement getAddToCartBtn() {
        return addToCartBtn;
    }

    public WebElement getGoToCartBtn() {
        return goToCartBtn;
    }

    public WebElement getAddToWishlistBtn() {
        return addToWishlistBtn;
    }

    public WebElement getWishlistedBtn() {
        return wishlistedBtn;
    }

    public WebElement getBookExpiredTxt() {
        return bookExpiredTxt;
    }

    public WebElement getRedeemImg() {
        return redeemImg;
    }

    public WebElement getDoYouPossessTxt() {
        return doYouPossessTxt;
    }

    public WebElement getKindlyRequestTxt() {
        return kindlyRequestTxt;
    }

    public WebElement getRedeemBtn() {
        return redeemBtn;
    }

    public WebElement getYouMightAlsoTxt() {
        return youMightAlsoTxt;
    }

    public WebElement getTssBookCoverImg() {
        return TssBookCoverImg;
    }

    public WebElement getTssBookNameTxt() {
        return TssBookNameTxt;
    }

    public WebElement getTssBookPriceTxt() {
        return TssBookPriceTxt;
    }

    public WebElement getTssBookHeartBtn() {
        return TssBookHeartBtn;
    }

    public WebElement getTssBookPremiumImg() {
        return TssBookPremiumImg;
    }

    public WebElement getAddToCartOrGoToCartBtn() {
        return addToCartOrGoToCartBtn;
    }
}
