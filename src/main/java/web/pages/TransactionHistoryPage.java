package web.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import web.generic.WebElementActions;

public class TransactionHistoryPage extends WebElementActions{

    final static Logger logger = LogManager.getLogger(TransactionHistoryPage.class);
    WebDriver driver;

    public TransactionHistoryPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //* Element of no transactions
   @FindBy(className = "spendCoinsHeading")
   private WebElement transactionTitleTxt;
   
   @FindBy(xpath = "//*[@alt='Earn Icon']")
   private WebElement earnedNavCoinsBtn;
   
   @FindBy(xpath  = "//*[@alt='Earn Icon']/parent::*/following-sibling::*")
   private WebElement earnNavCoinsTxt;

   @FindBy(xpath = "//*[@alt='Spend Icon']")
   private WebElement spentNavCoinsBtn;
   
   @FindBy(xpath  = "//*[@alt='Spend Icon']/parent::*/following-sibling::*")
   private WebElement spentNavCoinsTxt;

     @FindBy(xpath  = "//*[@class='nav-trn-empty-container']/img")
   private WebElement noTransactionImg;
   
   @FindBy(className = "title")
   private WebElement noTransactionTitleTxt;

   @FindBy(className = "help-text")
   private WebElement noTransactionDescTxt;
   
   //* Transaction history
   @FindBy(xpath = "//*[@class='w-full']/descendant::img")
   private WebElement transactionImg;

    @FindBy(xpath  = "//*[contains(@class,'leading-5')]")
   private WebElement transactionHeaderTxt;
   
   @FindBy(xpath = "//*[contains(@class,'font-semibold leading-none')]")
   private WebElement transactionDateTxt;

   @FindBy(xpath = "//*[contains(@class,'text-right')]")
   private WebElement transactionAmountTxt;
   
   @FindBy(xpath = "//*[contains(@class,'capitalize')]")
   private WebElement transactionTypeTxt;
   
   /* Getter Methods */
    public WebElement getTransactionTitleTxt() {
        return transactionTitleTxt;
    }

    public WebElement getEarnedNavCoinsBtn() {
        return earnedNavCoinsBtn;
    }

    public WebElement getEarnNavCoinsTxt() {
        return earnNavCoinsTxt;
    }

    public WebElement getSpentNavCoinsBtn() {
        return spentNavCoinsBtn;
    }

    public WebElement getSpentNavCoinsTxt() {
        return spentNavCoinsTxt;
    }

    public WebElement getNoTransactionImg() {
        return noTransactionImg;
    }

    public WebElement getNoTransactionTitleTxt() {
        return noTransactionTitleTxt;
    }

    public WebElement getNoTransactionDescTxt() {
        return noTransactionDescTxt;
    }

    public WebElement getTransactionImg() {
        return transactionImg;
    }

    public WebElement getTransactionHeaderTxt() {
        return transactionHeaderTxt;
    }

    public WebElement getTransactionDateTxt() {
        return transactionDateTxt;
    }

    public WebElement getTransactionAmountTxt() {
        return transactionAmountTxt;
    }

    public WebElement getTransactionTypeTxt() {
        return transactionTypeTxt;
    }
}
