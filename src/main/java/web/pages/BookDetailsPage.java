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
    private WebElement thumnailPreviewImg;

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
    private WebElement digiBookFetaureLeftBtn;

    @FindBy(xpath = "(//*[@class='interactives-item-container']/child::img)[last()]")
    private WebElement digiBookFeatureRightbtn;

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
}
