package web.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import web.generic.WebElementActions;

public class MyOrdersPage extends WebElementActions{

    final static Logger logger = LogManager.getLogger(MyOrdersPage.class);
    WebDriver driver;

    public MyOrdersPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //* Elements of my orders page
    @FindBy(className = "order-breadcrumb")
   private WebElement homeLnk;
   
   @FindBy(className = "order-title")
   private WebElement myOrdersTitleTxt;
   
   @FindBy(className = "order-count")
   private WebElement myOrdersCountTxt;
   
   //* Empty screen
   @FindBy(xpath = "//*[@class='text-center']/img")
   private WebElement emptyImg;
   
   @FindBy(xpath = "//*[@class='text-center']/div[contains(@class,'semibold')]")
   private WebElement ordersHistoryIsEmptyTxt;

   @FindBy(xpath = "//*[@class='text-center']/div[not(contains(@class,'semibold'))]")
   private WebElement lookLikeTxt;
   
   @FindBy(xpath = "//*[@class='text-center']/button")
   private WebElement startShoppingBtn;
   
   //* Data screen
   @FindBy(xpath = "//*[@class='mobile-filter']/button")
   private WebElement dateRangeBtn;
   
   @FindBy(name  = "search")
   private WebElement searchTxtfd;
   
   @FindBy(className = "order-accordion-summary")
   private WebElement orderSec;

   @FindBy(className = "date-time-div ")
   private WebElement dataAndTimeTxt;

   @FindBy(className = "orderId-div")
   private WebElement orderIdTxt;
   
   @FindBy(xpath = "//*[@class='orderId-div']/span")
   private WebElement orderIdValueTxt;
   
   @FindBy(className = "ordered-total-div")
   private WebElement orderTotalTxt;
   
   @FindBy(xpath = "//*[@class='ordered-total-div']/span")
   private WebElement orderTotalValueTxt;
   
   @FindBy(xpath = "//*[@class='order-right-container ']/button")
   private WebElement downloadInvoiceBtn;

   @FindBy(xpath = "//*[@class='order-right-container ']/div/img")
   private WebElement expandBtn;
   
   @FindBy(xpath = "//*[@class='relative']/img")
   private WebElement bookCoverImg;
   
   @FindBy(className = "ordered-book-name")
   private WebElement bookNameTxt;
   
   @FindBy(xpath = "//*[@class='book-premium-div']/preceding-sibling::img")
   private WebElement premiumIconImg;
   
   @FindBy(xpath = "book-premium-div")
   private WebElement premiumTxt;

   @FindBy(xpath = "ordered-book-price ")
   private WebElement bookPriceTxt;

   @FindBy(xpath = "//*[text()='Read Book']")
   private WebElement readBookBtn;
   
   @FindBy(xpath = "//*[text()='Rate Book']")
   private WebElement rateBookBtn;
   
   @FindBy(xpath = "//*[contains(text(),'No orders')]/preceding-sibling::img")
   private WebElement noOrdresFoundImg;
   
   @FindBy(xpath = "//*[contains(text(),'No orders')]")
   private WebElement noOrderFoundTxt;
   
   @FindBy(xpath = "//*[contains(text(),'No orders')]/following-sibling::div")
   private WebElement weCountNotTxt;

   @FindBy(xpath = "//*[contains(text(),'No orders')]/following-sibling::button")
   private WebElement emptyStartShoppingBtn;
   
}
