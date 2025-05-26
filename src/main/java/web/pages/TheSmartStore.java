package web.pages;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import web.enums.BookDetails;
import web.generic.WebElementActions;
import web.utils.StringUtils;

public class TheSmartStore extends WebElementActions {

    final static Logger logger = LogManager.getLogger(TheSmartStore.class);
    WebDriver driver;

    public TheSmartStore(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //* Element of Header and search
    @FindBy(xpath = "//*[@href='/private/library']")
    private WebElement homeLnk;

    @FindBy(xpath = "//*[contains(text(),'SMART')]")
    private WebElement theSmartStoreTitleTxt;

    @FindBy(xpath = "//*[contains(text(),'SMART')]/child::span")
    private WebElement booksCountTxt;

    @FindBy(name = "search")
    private WebElement searchTxtfd;

    @FindBy(xpath = "//*[@data-testid='ClearIcon']")
    private WebElement searchClearIcon;

    //* No Data Found Page
    @FindBy(xpath = "//*[@alt='noDataFound']")
    private WebElement noDataFoundImg;

    @FindBy(xpath = "//*[contains(text(),'No books')]")
    private WebElement noBooksFoundTxt;

    @FindBy(xpath = "//*[contains(text(),'matches your')]")
    private WebElement weCouldNotFoundTxt;

    @FindBy(xpath = "//*[@xmlns='http://www.w3.org/2000/svg']")
    private List<WebElement> gradeAndSubjectFiltersImg;

    @FindBy(xpath = "//*[@xmlns='http://www.w3.org/2000/svg']/following-sibling::*[text()='Grade']")
    private WebElement gradeFilterTxt;

    @FindBy(xpath = "//*[@xmlns='http://www.w3.org/2000/svg']/following-sibling::*[text()='Subject']")
    private WebElement subjectFilterTxt;

    @FindBy(xpath = "//*[@role='option']/child::div")
    private WebElement filterOpts;

    @FindBy(className = "smartStoreCard-img")
    private WebElement bookCoverImg;

    //* Book Details
    @FindBy(className = "smartStoreCard-header")
    private WebElement bookNameTxt;

    @FindBy(xpath = "(//*[@class='whiteHeartIcon'])[1]/img[@alt='Red Heart Icon']")
    private WebElement wishlistedBtn;

    @FindBy(xpath = "(//*[@class='whiteHeartIcon'])[1]/img[@alt= 'White Heart Icon']")
    private WebElement notWishlistedBtn;

    @FindBy(className = "smartStoreCard-description")
    private WebElement bookDescTxt;

    @FindBy(className = "smartStoreCardRating-box")
    private WebElement bookRatingSec;

    @FindBy(className = "smartStore-averageReview")
    private WebElement bookAverageRateTxt;

    @FindBy(className = "smartStore-count")
    private WebElement bookRationCountTxt;

    @FindBy(xpath = "//span[@class='smartStore-Grade']")
    private WebElement bookGradeTxt;

    @FindBy(xpath = "//span[@class='smartStore-GradeName']")
    private WebElement bookGradeValueTxt;

    @FindBy(xpath = "//div[@class='smartStore-Grade']")
    private WebElement bookSubjectTxt;

    @FindBy(className = "smartStore-SubjName")
    private WebElement bookSubjectValueTxt;

    @FindBy(xpath = "(//*[@class='smartStoreCardRating-container'])[1]/following-sibling::div")
    private WebElement checkIfMoreBuyingOptionsBtn;

    @FindBy(className = "smartStore-BuyingOptions")
    private WebElement moreBuyingOptionsBtn;

    @FindBy(xpath = "(//*[@class='smartStore-footerBlock'])[1]//*[@class='cart-Item-premium-label']")
    private WebElement checkPremiumLabel;

    @FindBy(xpath = "//*[@class='cart-Item-premium-label']/img")
    private WebElement premiumIconImg;

    @FindBy(xpath = "//*[@class='cart-Item-premium-label']/span")
    private WebElement premiumTxt;

    @FindBy(xpath = "(//*[@class='smartStore-footerBlock'])[1]//*[@class='cart-Item-basic-label']")
    private WebElement checkBasicLabel;

    @FindBy(className = "cart-Item-basic-label")
    private WebElement basicTxt;

    @FindBy(xpath = "//*[@class='smartStoreCard-price']/child::span")
    private WebElement bookPriceTxt;

    @FindBy(xpath = "(//*[@class='smartStore-footerBlock'])[1]/child::button")
    private WebElement checkFirstBookBtn;

    @FindBy(xpath = "//*[text()='Add to Cart']")
    private WebElement addToCartBtn;

    @FindBy(xpath = "//*[text()='Go to Cart']")
    private WebElement goToCartBtn;

    @FindBy(xpath = "//*[text()='Upgrade']")
    private WebElement upgradeBtn;

    @FindBy(xpath = "//*[@aria-label='Go to previous page']")
    private WebElement previousPageBtn;

    @FindBy(xpath = "//*[@data-testid='NavigateNextIcon']")
    private WebElement nextPageBtn;

    //* More Buying Options Popup
    @FindBy(className = "moreBuyingSect")
    private WebElement moreBuyingOptionsPopupSec;

    @FindBy(className = "removeBookTitle")
    private WebElement selectBuyingOptionTitleTxt;

    @FindBy(xpath = "//*[@data-testid='CloseIcon']")
    private WebElement moreBuyingPopupCloseBtn;

    @FindBy(xpath = "//*[@class = 'buying-option-header flex gap-2']/preceding-sibling::div")
    private WebElement moreBuyingPremiumCkbx;

    @FindBy(xpath = "//*[@class = 'buying-option-header flex gap-2']")
    private WebElement moreBuyingPremiumTxt;

    @FindBy(xpath = "//*[@class = 'buying-option-header flex gap-2']/img")
    private WebElement moreBuyingPremiumIcon;

    @FindBy(xpath = "//*[@class = 'buying-option-header flex gap-2']/ancestor::div[@class='left-container']/following-sibling::div//span")
    private WebElement moreBuyingPremiumAmountTxt;

    @FindBy(xpath = "//*[@class = 'buying-option-header flex gap-2']/ancestor::div[@id]/../descendant::div[@class='buying-option-text']")
    private WebElement moreBuyingPremiumDescTxt;

    @FindBy(xpath = "//*[@class = 'buying-option-header flex gap-2']/ancestor::div[@id]/../descendant::div[@class='icon-main']")
    private WebElement moreBuyingPremiumResourceSec;

    @FindBy(xpath = "//*[@class = 'buying-option-header']/preceding-sibling::div")
    private WebElement moreBuyingBasicCkbx;

    @FindBy(xpath = "//*[@class = 'buying-option-header']")
    private WebElement moreBuyingBasicTxt;

    @FindBy(xpath = "//*[@class = 'buying-option-header']/img")
    private WebElement moreBuyingBasicIcon;

    @FindBy(xpath = "//*[@class = 'buying-option-header']/ancestor::div[@class='left-container']/following-sibling::div//span")
    private WebElement moreBuyingBasicAmountTxt;

    @FindBy(xpath = "//*[@class = 'buying-option-header']/ancestor::div[@id]/../descendant::div[@class='buying-option-text']")
    private WebElement moreBuyingBasicDescTxt;

    @FindBy(xpath = "//*[@class = 'buying-option-header']/ancestor::div[@id]/../descendant::div[@class='icon-main']")
    private WebElement moreBuyingBasicResourceSec;

    @FindBy(xpath = "//*[@class='moreBuying-btnBlock']/button")
    private WebElement moreBuyingAddToCartBtn;

    //* Upgrade Popup
    @FindBy(xpath = "//*[contains(text(),'Resource')]")
    private WebElement upgradePopupTitleTxt;

    @FindBy(xpath = "//*[@data-testid='CloseIcon']")
    private WebElement upgradePopupCloseBtn;

    @FindBy(xpath = "//*[@class='u8wr32go6iI6CiMtFrK4']/img")
    private WebElement upgradePopupImg;

    @FindBy(xpath = "//*[contains(text(),'your learning with Premium DigiBook')]")
    private WebElement upgradePopupDescTxt;

    @FindBy(xpath = "//*[@class = 'text-[#00AAD3] font-bold']")
    private WebElement upgradePopupAmountTxt;

    @FindBy(xpath = "//*[contains(text(),'with the expiry of this DigiBook')]")
    private WebElement upgradeExpireTxt;

    @FindBy(xpath = "//*[text()='Upgrade to Premium DigiBook']")
    private WebElement upgradeToPremiumBtn;

    //* Getter Methods */
    public WebElement getHomeLnk() {
        return homeLnk;
    }

    public WebElement getTheSmartStoreTitleTxt() {
        return theSmartStoreTitleTxt;
    }

    public WebElement getBooksCountTxt() {
        return booksCountTxt;
    }

    public WebElement getSearchTxtfd() {
        return searchTxtfd;
    }

    public WebElement getSearchClearIcon() {
        return searchClearIcon;
    }

    public WebElement getNoDataFoundImg() {
        return noDataFoundImg;
    }

    public WebElement getNoBooksFoundTxt() {
        return noBooksFoundTxt;
    }

    public WebElement getWeCouldNotFoundTxt() {
        return weCouldNotFoundTxt;
    }

    public List<WebElement> getGradeAndSubjectFiltersImg() {
        return gradeAndSubjectFiltersImg;
    }

    public WebElement getGradeFilterTxt() {
        return gradeFilterTxt;
    }

    public WebElement getSubjectFilterTxt() {
        return subjectFilterTxt;
    }

    public WebElement getFilterOpts() {
        return filterOpts;
    }

    public WebElement getBookCoverImg() {
        return bookCoverImg;
    }

    public WebElement getBookNameTxt() {
        return bookNameTxt;
    }

    public WebElement getWishlistedBtn() {
        return wishlistedBtn;
    }

    public WebElement getNotWishlistedBtn() {
        return notWishlistedBtn;
    }

    public WebElement getBookDescTxt() {
        return bookDescTxt;
    }

    public WebElement getBookRatingSec() {
        return bookRatingSec;
    }

    public WebElement getBookAverageRateTxt() {
        return bookAverageRateTxt;
    }

    public WebElement getBookRationCountTxt() {
        return bookRationCountTxt;
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

    public WebElement getCheckIfMoreBuyingOptionsBtn() {
        return checkIfMoreBuyingOptionsBtn;
    }

    public WebElement getMoreBuyingOptionsBtn() {
        return moreBuyingOptionsBtn;
    }

    public WebElement getCheckPremiumLabel() {
        return checkPremiumLabel;
    }

    public WebElement getPremiumIconImg() {
        return premiumIconImg;
    }

    public WebElement getPremiumTxt() {
        return premiumTxt;
    }

    public WebElement getCheckBasicLabel() {
        return checkBasicLabel;
    }

    public WebElement getBasicTxt() {
        return basicTxt;
    }

    public WebElement getBookPriceTxt() {
        return bookPriceTxt;
    }

    public WebElement getCheckFirstBookBtn() {
        return checkFirstBookBtn;
    }

    public WebElement getAddToCartBtn() {
        return addToCartBtn;
    }

    public WebElement getGoToCartBtn() {
        return goToCartBtn;
    }

    public WebElement getUpgradeBtn() {
        return upgradeBtn;
    }

    public WebElement getPreviousPageBtn() {
        return previousPageBtn;
    }

    public WebElement getNextPageBtn() {
        return nextPageBtn;
    }

    public WebElement getMoreBuyingOptionsPopupSec() {
        return moreBuyingOptionsPopupSec;
    }

    public WebElement getSelectBuyingOptionTitleTxt() {
        return selectBuyingOptionTitleTxt;
    }

    public WebElement getMoreBuyingPopupCloseBtn() {
        return moreBuyingPopupCloseBtn;
    }

    public WebElement getMoreBuyingPremiumCkbx() {
        return moreBuyingPremiumCkbx;
    }

    public WebElement getMoreBuyingPremiumTxt() {
        return moreBuyingPremiumTxt;
    }

    public WebElement getMoreBuyingPremiumIcon() {
        return moreBuyingPremiumIcon;
    }

    public WebElement getMoreBuyingPremiumAmountTxt() {
        return moreBuyingPremiumAmountTxt;
    }

    public WebElement getMoreBuyingPremiumDescTxt() {
        return moreBuyingPremiumDescTxt;
    }

    public WebElement getMoreBuyingPremiumResourceSec() {
        return moreBuyingPremiumResourceSec;
    }

    public WebElement getMoreBuyingBasicCkbx() {
        return moreBuyingBasicCkbx;
    }

    public WebElement getMoreBuyingBasicTxt() {
        return moreBuyingBasicTxt;
    }

    public WebElement getMoreBuyingBasicIcon() {
        return moreBuyingBasicIcon;
    }

    public WebElement getMoreBuyingBasicAmountTxt() {
        return moreBuyingBasicAmountTxt;
    }

    public WebElement getMoreBuyingBasicDescTxt() {
        return moreBuyingBasicDescTxt;
    }

    public WebElement getMoreBuyingBasicResourceSec() {
        return moreBuyingBasicResourceSec;
    }

    public WebElement getMoreBuyingAddToCartBtn() {
        return moreBuyingAddToCartBtn;
    }

    public WebElement getUpgradePopupTitleTxt() {
        return upgradePopupTitleTxt;
    }

    public WebElement getUpgradePopupCloseBtn() {
        return upgradePopupCloseBtn;
    }

    public WebElement getUpgradePopupImg() {
        return upgradePopupImg;
    }

    public WebElement getUpgradePopupDescTxt() {
        return upgradePopupDescTxt;
    }

    public WebElement getUpgradePopupAmountTxt() {
        return upgradePopupAmountTxt;
    }

    public WebElement getUpgradeExpireTxt() {
        return upgradeExpireTxt;
    }

    public WebElement getUpgradeToPremiumBtn() {
        return upgradeToPremiumBtn;
    }

    /**
     * @description this method is used used to verify the header of TSS.
     * @return booksCount <code>int</code>
     */
    public int verifyHeaderOfTSS() {
        logger.info("verification of header of smart store view is started...");
        elementIsDisplayed(getHomeLnk(), "HomeLnk");
        elementIsDisplayed(getTheSmartStoreTitleTxt(), "TheSmartStoreTitleTxt");
        elementIsDisplayed(getBooksCountTxt(), "BookCountTxt");
        String bookCount = getTextFromElement(getBooksCountTxt(), "BookCountTxt");
        elementIsDisplayed(getSearchTxtfd(), "SearchTxtfd");
        List<WebElement> filters = getGradeAndSubjectFiltersImg();
        for (WebElement element : filters) {
            elementIsDisplayed(element, "filter");
        }
        logger.info("verification of header of smart store view is successfully completed.\n");
        return StringUtils.getNumberFromString(bookCount);
    }

    /**
     * @description this method is used to verify the no data found page.
     */
    public void verifyNoDataFoundPage() {
        logger.info("verification of no data found page is started...");
        elementIsDisplayed(getNoDataFoundImg(), "NoDataFoundImg");
        elementIsDisplayed(getNoBooksFoundTxt(), "NoBooksFoundTxt");
        elementIsDisplayed(getWeCouldNotFoundTxt(), "WeCouldNotFoundTxt");
        logger.info("verification of no data found page is completed successfully.\n");
    }

    /**
     * @description this method is used to verify book in the smart store and
     * get book details.
     * @param wishOrCart <code>String</code>
     * @return bookDetails <code>Map</code>
     * @keys BookName <code>String</code> BookPrice <code>String</code>
     * BookDescription <code>String</code> BookSubject <code>String</code>
     * BookGrade <code>String</code> BookEdition <code>String</code>
     */
    public Map<String, String> verifyBookDetailsOfTSS(String wishOrCart) {
        logger.info("verification of book details of smart store is started...");
        // to store the data of the book
        Map<String, String> bookDetails = new HashMap<>();
        elementIsDisplayed(getBookNameTxt(), "BookNameTxt");
        String bookName = getTextFromElement(getBookNameTxt(), "BookNameTxt");
        bookDetails.put(BookDetails.BOOK_NAME.getBookDataValue(), bookName);
        if (checkIfElementIsDisplayed(getNotWishlistedBtn(), "notWishlistedBtn")) {
            click(getNotWishlistedBtn(), "NotWishlistedBtn");
            waitTillElementIsDisplayedWithinTime(getWishlistedBtn(), "WishlistedBtn", 3);
            click(getWishlistedBtn(), "WishlistedBtn");
        } else {
            elementIsDisplayed(getWishlistedBtn(), "WishlistedBtn");
            click(getWishlistedBtn(), "WishlistedBtn");
            waitTillElementIsDisplayedWithinTime(getNotWishlistedBtn(), "NotWishlistedBtm", 3);
        }
        elementIsDisplayed(getBookDescTxt(), "BookDescTxt");
        String bookDesc = getTextFromElement(getBookDescTxt(), "BookDescTxt");
        bookDetails.put(BookDetails.BOOK_DESC.getBookDataValue(), bookDesc);
        elementIsDisplayed(getBookRatingSec(), "BookRatingSec");
        elementIsDisplayed(getBookAverageRateTxt(), "BookAverageRatingTxt");
        elementIsDisplayed(getBookRationCountTxt(), "BookRationCountTxt");
        elementIsDisplayed(getBookGradeTxt(), "BookGradeTxt");
        elementIsDisplayed(getBookGradeValueTxt(), "BookGradeValueTxt");
        String bookGrade = getTextFromElement(getBookGradeValueTxt(), "BookGradeValueTxt");
        bookDetails.put(BookDetails.BOOK_DESC.getBookDataValue(), bookGrade);
        elementIsDisplayed(getBookSubjectTxt(), "BookSubjectTxt");
        elementIsDisplayed(getBookSubjectValueTxt(), "BookSubjectValueTxt");
        String bookSubject = getTextFromElement(getBookSubjectValueTxt(), "BookSubjectValueTxt");
        bookDetails.put(BookDetails.BOOK_SUBJECT.getBookDataValue(), bookSubject);
        // to verify more buying options
        if (checkIfElementIsDisplayed(getCheckIfMoreBuyingOptionsBtn(), "CheckIfMoreBuyingOptionsBtn")) {
            elementIsDisplayed(getMoreBuyingOptionsBtn(), "MoreBuyingOptionsBtn");
        }
        // to check book edition
        boolean bookEdition = checkIfElementIsDisplayed(getCheckPremiumLabel(), "CheckPremiumLabel");
        elementIsDisplayed(getBookPriceTxt(), "BookPriceTxt");
        String bookPriceStr = getTextFromElement(getBookPriceTxt(), "BookPriceTxt");
        String bookPriceInt = StringUtils.getNumberFromString(bookPriceStr) + "";
        if (bookEdition) {
            elementIsDisplayed(getPremiumIconImg(), "PremiumIconImg");
            elementIsDisplayed(getPremiumTxt(), "PremiumTxt");
            bookDetails.put(BookDetails.PREMIUM_EDITION.getBookDataValue(), "true");
            bookDetails.put(BookDetails.BOOK_PREMIUM_PRICE.getBookDataValue(), bookPriceInt);
        } else {
            elementIsDisplayed(getCheckBasicLabel(), "CheckBasicLabel");
            elementIsDisplayed(getBasicTxt(), "BasicTxt");
            bookDetails.put(BookDetails.BASIC_EDITION.getBookDataValue(), "true");
            bookDetails.put(BookDetails.BOOK_BASIC_PRICE.getBookDataValue(), bookPriceInt);
        }
        if (BookDetails.BOOK_WISHLISTED.getBookDataValue().equals(wishOrCart)) {
            click(getNotWishlistedBtn(), "NotWishlistedBtn");
            bookDetails.put(BookDetails.BOOK_WISHLISTED.getBookDataValue(), "true");
        } else if (BookDetails.BOOK_CARTED.getBookDataValue().equals(wishOrCart)) {
            elementIsDisplayed(getCheckFirstBookBtn(), "CheckFirstBookBtn");
            String buttonType = getTextFromElement(getCheckFirstBookBtn(), "CheckFirstBookBtn");
            if (buttonType.contains("Add to")) {
                waitTillElementClickable(getAddToCartBtn(), "AddToCartBtn");
                click(getAddToCartBtn(), "AddToCartBtn");
                waitTillElementIsDisplayedWithinTime(getGoToCartBtn(), "GoToCart", 3);
                elementIsDisplayed(getGoToCartBtn(), "GoToCartBtn");
            } else if (buttonType.contains("Go to")) {
                elementIsDisplayed(getGoToCartBtn(), "GoToCartBtn");
            } else {
                elementIsDisplayed(getUpgradeBtn(), "UpgradeBtn");
            }
            bookDetails.put(BookDetails.BOOK_CARTED.getBookDataValue(), "true");
        } else {
            logger.info("book is not added into wishlist or cart.");
        }
        logger.info("verification of book details of smart store is completed successfully.\n");
        return bookDetails;
    }

   /**
    * @description this method used to verify upgrade popup and get price of upgrade of books.
    * @param cartOrDelete <code>String</cod>
    * @return upgradeAmount <code>int</code>
    */
    public int verifyUpgradePopup(String cartOrDelete) {
        click(getUpgradeBtn(), "UpgradeBtn");
        logger.info("verification of upgrade popup started...");
        elementIsDisplayed(getUpgradePopupTitleTxt(), "UpgradePopupTitleTxt");
        elementIsDisplayed(getUpgradePopupCloseBtn(), "UpgradePopupCloseBtn");
        elementIsDisplayed(getUpgradePopupImg(), "UpgradePopupImg");
        elementIsDisplayed(getUpgradePopupDescTxt(), "UpgradePopupDescTxt");
        elementIsDisplayed(getUpgradePopupAmountTxt(), "UpgradePopupAmountTxt");
        String upgradePriceStr = getTextFromElement(getUpgradePopupAmountTxt(), "UpgradePopupAmountTxt");
        elementIsDisplayed(getUpgradeExpireTxt(), "UpgradeExpireTxt");
        elementIsDisplayed(getUpgradeToPremiumBtn(), "UpgradeToPremiumBtn");
        if (BookDetails.BOOK_CARTED.getBookDataValue().equals(cartOrDelete)) {
            click(getUpgradeToPremiumBtn(), "UpgradeToPremiumBtn");
        } else {
            click(getUpgradePopupCloseBtn(), "UpgradePopupCloseBtn");
        }
        logger.info("verification of upgrade popup is completed successfully.\n");
        return StringUtils.getNumberFromString(upgradePriceStr);
    }
}
