package web.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import web.generic.WebElementActions;

public class AppTour extends WebElementActions {

    final static Logger logger = LogManager.getLogger(AppTour.class);
    WebDriver driver;

    public AppTour(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //* Elements of app tour
    @FindBy(xpath = ".//*[@href='/private/library']")
    private WebElement backBtn;

    @FindBy(xpath = ".//*[contains(text(),'TOUR')]")
    private WebElement appTourTitleTxt;

    @FindBy(xpath = ".//*[contains(text(),'TOUR')]/following-sibling::p")
    private WebElement appTourPageNameTxt;

    @FindBy(xpath = ".//*[@alt='App Tour']")
    private WebElement appTourImg;

    @FindBy(xpath = ".//*[@alt='Previous']")
    private WebElement previousBtn;

    @FindBy(xpath = ".//*[@alt='Next']")
    private WebElement nextBtn;

    @FindBy(xpath = ".//*[@alt='Previous' and @style='pointer-events: none;']")
    private WebElement disabledPreviousBtn;

    @FindBy(xpath = ".//*[@alt='Next' and @style='pointer-events: none;']")
    private WebElement disabledNextBtn;

    /* Getter Methods */
    public WebElement getBackBtn() {
        return backBtn;
    }

    public WebElement getAppTourTitleTxt() {
        return appTourTitleTxt;
    }

    public WebElement getAppTourPageNameTxt() {
        return appTourPageNameTxt;
    }

    public WebElement getAppTourImg() {
        return appTourImg;
    }

    public WebElement getPreviousBtn() {
        return previousBtn;
    }

    public WebElement getNextBtn() {
        return nextBtn;
    }

    public WebElement getDisabledPreviousBtn() {
        return disabledPreviousBtn;
    }

    public WebElement getDisabledNextBtn() {
        return disabledNextBtn;
    }
}
