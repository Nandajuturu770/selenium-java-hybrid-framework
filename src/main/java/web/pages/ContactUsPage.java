package web.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import web.generic.WebElementActions;

public class ContactUsPage extends WebElementActions {

    final static Logger logger = LogManager.getLogger(ContactUsPage.class);
    WebDriver driver;

    public ContactUsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //* Elements of contact us
    @FindBy(className = "img-contactBanner")
    private WebElement contactUsBannerImg;

    @FindBy(className = "lets-talk-header")
    private WebElement contactUsTitleTxt;

    @FindBy(id = "issue-label")
    private WebElement selectIssueDropdown;

    @FindBy(xpath = "//*[@name='issue']/following-sibling::*")
    private WebElement selectIssueArrowBtn;

    @FindBy(xpath = "//*[@role='option']")
    private WebElement issueOptsTxt;

    @FindBy(id = "issue-helper-text")
    private WebElement descriptionTxt;

    @FindBy(id = "description")
    private WebElement descriptionTxtfd;

    @FindBy(xpath = "//*[text()='Submit']")
    private WebElement submitBtn;

    @FindBy(xpath = "//*[@data-testid='ClearIcon']")
    private WebElement issueClearBtn;

    /* Getter Methods */
    public WebElement getContactUsBannerImg() {
        return contactUsBannerImg;
    }

    public WebElement getContactUsTitleTxt() {
        return contactUsTitleTxt;
    }

    public WebElement getSelectIssueDropdown() {
        return selectIssueDropdown;
    }

    public WebElement getSelectIssueArrowBtn() {
        return selectIssueArrowBtn;
    }

    public WebElement getIssueOptsTxt() {
        return issueOptsTxt;
    }

    public WebElement getDescriptionTxt() {
        return descriptionTxt;
    }

    public WebElement getDescriptionTxtfd() {
        return descriptionTxtfd;
    }

    public WebElement getSubmitBtn() {
        return submitBtn;
    }

    public WebElement getIssueClearBtn() {
        return issueClearBtn;
    }
}
