package web.pages;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import web.generic.WebElementActions;

public class FaqsPage extends WebElementActions{
     final static Logger logger = LogManager.getLogger(FaqsPage.class);
    WebDriver driver;

    public FaqsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //* Elements of faqs
   @FindBy(xpath = ".//*[@href='/private/library']")
   private WebElement homeBtn;
   
   @FindBy(className = "faq-digibook-container")
   private WebElement faqsSec;
   
   @FindBy(className = "faq-main-header")
   private WebElement faqsTitleTxt;
   
   @FindBy(className  = "faq-text")
   private WebElement faqsDescTxt;
   
   @FindBy(name = "search")
   private WebElement searchTxtfd;

   @FindBy(xpath = ".//*[@data-testid='ClearIcon']")
   private WebElement searchClearIcon;
   
   @FindBy(xpath = ".//*[@alt='noDataFound']")
   private WebElement noDataFountImg;
   
   @FindBy(xpath = ".//*[contains(text(),'No FAQ')]")
   private WebElement noFaqFoundTxt;
   
   @FindBy(xpath  = ".//*[contains(text(),'that matches your')]")
   private WebElement weCouldNotFindTxt;
   
   @FindBy(xpath = ".//*[contains(@class,'MuiAccordionSummary-contentGutters')]")
   private List<WebElement> featureHeadingsTxt;

   @FindBy(xpath = ".//*[@data-testid='ExpandMoreIcon']")
   private List<WebElement> expandMoreBtn ;
   
   @FindBy(className = "qsn-ans-container")
   private WebElement questionAnswerSec;
   
   @FindBy(className = "asked-qsn")
   private List<WebElement> questionTxt;
   
   @FindBy(className  = "faq-answer")
   private List<WebElement> answerTxt;
   
   @FindBy(xpath = ".//*[@data-testid='NavigateBeforeIcon']")
   private WebElement PreviousBtn;

   @FindBy(xpath = ".//*[@data-testid='NavigateNextIcon']")
   private WebElement nextBtn;

    @FindBy(xpath = ".//*[@disabled  and @aria-label='Go to previous page']")
   private WebElement disablePreviousBtn;
   
   @FindBy(xpath = ".//*[@disabled  and @aria-label='Go to next page']")
   private WebElement disabledNextBtn;
   
   /* Getter Methods */
    public WebElement getHomeBtn() {
        return homeBtn;
    }

    public WebElement getFaqsSec() {
        return faqsSec;
    }

    public WebElement getFaqsTitleTxt() {
        return faqsTitleTxt;
    }

    public WebElement getFaqsDescTxt() {
        return faqsDescTxt;
    }

    public WebElement getSearchTxtfd() {
        return searchTxtfd;
    }

    public WebElement getSearchClearIcon() {
        return searchClearIcon;
    }

    public WebElement getNoDataFountImg() {
        return noDataFountImg;
    }

    public WebElement getNoFaqFoundTxt() {
        return noFaqFoundTxt;
    }

    public WebElement getWeCouldNotFindTxt() {
        return weCouldNotFindTxt;
    }

    public List<WebElement> getFeatureHeadingsTxt() {
        return featureHeadingsTxt;
    }

    public List<WebElement> getExpandMoreBtn() {
        return expandMoreBtn;
    }

    public WebElement getQuestionAnswerSec() {
        return questionAnswerSec;
    }

    public List<WebElement> getQuestionTxt() {
        return questionTxt;
    }

    public List<WebElement> getAnswerTxt() {
        return answerTxt;
    }

    public WebElement getPreviousBtn() {
        return PreviousBtn;
    }

    public WebElement getNextBtn() {
        return nextBtn;
    }

    public WebElement getDisablePreviousBtn() {
        return disablePreviousBtn;
    }

    public WebElement getDisabledNextBtn() {
        return disabledNextBtn;
    }
}
