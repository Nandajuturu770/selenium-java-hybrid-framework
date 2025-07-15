package web.pages;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import web.generic.WebElementActions;

public class BookReadingPage extends WebElementActions {

    final static Logger logger = LogManager.getLogger(BookReadingPage.class);
    WebDriver driver;

    public BookReadingPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //* Element of book reading page
    @FindBy(xpath = "//*[contains(@class,'font-bold')]/child::img")
    private WebElement smartDigiBookLogoImg;

    @FindBy(xpath = "//*[contains(@class,'cursor-pointer')]")
    private WebElement bookNameTxt;

    //* Search feature
    @FindBy(xpath = "//*[@data-tip='Search']/img")
    private WebElement searchBtn;

    @FindBy(xpath = "//*[@type='text']")
    private WebElement searchTxtfd;

    @FindBy(xpath = "//*[@type='button' and @title='Close']")
    private WebElement searchCloseBtn;

    @FindBy(xpath = "//*[contains(@class,'bg-primaryColor')]/child::*[@stroke='currentColor']")
    private WebElement SearchFindBtn;

    @FindBy(xpath = "//*[contains(text(),'Searching')]/preceding-sibling::*")
    private WebElement startSearchImg;

    @FindBy(xpath = "//*[contains(text(),'Searching')]")
    private WebElement startSearchTxt;

    @FindBy(xpath = "//*[@type='text']/following-sibling::button/child::span")
    private WebElement searchClearBtn;

    @FindBy(xpath = "//*[contains(@class,'truncate')]")
    private WebElement noResultFoundTxt;

    @FindBy(xpath = "//*[@class='mr-4 truncate flex flex-wrap']")
    private List<WebElement> matchedResultTxt;

    @FindBy(xpath = "//*[@class='mr-4 truncate flex flex-wrap']/following-sibling::*")
    private List<WebElement> matchedResultPageNoTxt;

    //* Highlighter feature
    @FindBy(xpath = "//*[@data-tip='Highlight']/child::*")
    private WebElement highlightBtn;

    @FindBy(xpath = "//*[contains(@class,'dropdown-item') and @data-tip]")
    private WebElement highlightCloseBtn;

    @FindBy(xpath = "//*[contains(@class,'dropdown-item')]/descendant::*[@r]")
    private List<WebElement> highlightColorsBtn;

    //* Pen feature
    @FindBy(xpath = "//*[@data-tip='Pen']/img")
    private WebElement penBtn;

    @FindBy(xpath = "//*[@data-for='penToolBarDiv' and @data-tip='Close']/img")
    private WebElement penToolCloseBtn;

    @FindBy(xpath = "//*[@data-tip='Palette']/img")
    private WebElement penPaletteBtn;

    @FindBy(xpath = "//*[@data-popper-placement='bottom-end']/descendant::*[@r]")
    private List<WebElement> penColorsBtn;

    @FindBy(xpath = "//*[@data-tip='Thickness']/img")
    private WebElement penThicknessBtn;

    @FindBy(xpath = "//li[@data-for='penToolBarDiv']/descendant::button")
    private List<WebElement> penThicknessSizeBtn;

    @FindBy(xpath = "//*[@data-tip='Eraser']/img")
    private WebElement eraseBtn;

    @FindBy(xpath = "//*[@data-tip='Undo']/img")
    private WebElement undoBtn;

    @FindBy(xpath = "//*[@data-tip='Clear All']/img")
    private WebElement clearAllBtn;

    //* Sticky Note feature
    @FindBy(xpath = "//*[contains(@class,'atStickyNote')]")
    private WebElement stickyNoteBtn;

    @FindBy(xpath = "//*[@data-popper-placement='bottom-start']/descendant::button")
    private WebElement stickyNoteColorsBtn;

    @FindBy(xpath = "//*[@class='flex justify-end']/button")
    private WebElement stickyPopupCloseBtn;

    @FindBy(xpath = "//*[@id='exampleFormControlTextarea1']")
    private WebElement stickyNotePopupTxtfd;

    @FindBy(xpath = "//*[contains(@src,'/images/addIcon.svg')]")
    private WebElement addImg;

    @FindBy(xpath = "//*[text()='Add']")
    private WebElement addBtn;

    @FindBy(xpath = "//*[contains(@src,'/images/deleteIcon.svg')]")
    private WebElement deleteImg;

    @FindBy(xpath = "//*[text()='Delete']")
    private WebElement deleteBtn;

    //* My Activities feature
    @FindBy(xpath = "//*[contains(@class,'atMyActivities ')]")
    private WebElement myActivitiesBtn;

    @FindBy(xpath = "//*[@class='flex justify-end']/child::button")
    private WebElement myActivitiesCloseBtn;

    @FindBy(xpath = "//*[text()='Bookmarks' and @role='tab']")
    private WebElement bookmarkActivityBtn;

    @FindBy(xpath = "//*[text()='Highlights' and @role='tab']")
    private WebElement highlightActivityBtn;

    @FindBy(xpath = "//*[text()='Stickynotes' and @role='tab']")
    private WebElement stickyNoteActivityBtn;

    @FindBy(xpath = "//*[text()='Pen' and @role='tab']")
    private WebElement penActivityBtn;

    @FindBy(xpath = "//*[@id='tabs-profile']/descendant::p")
    private WebElement emptyBookmarkTitleTxt;

    @FindBy(xpath = "//*[@id='tabs-profile']/descendant::div[contains(@class,'text')]")
    private WebElement emptyBookmarkDescTxt;

    @FindBy(xpath = "//*[@id='tabs-home']/descendant::p")
    private WebElement emptyHighlightTitleTxt;

    @FindBy(xpath = "//*[@id='tabs-home']/descendant::div[contains(@class,'text')]")
    private WebElement emptyHighlightDescTxt;

    @FindBy(xpath = "//*[@id='tabs-messages']/descendant::p")
    private WebElement emptyStickyNoteTitleTxt;

    @FindBy(xpath = "//*[@id='tabs-messages']/descendant::div[contains(@class,'text')]")
    private WebElement emptyStickyNoteDescTxt;

    @FindBy(xpath = "//*[@id='tabs-pens']/descendant::p")
    private WebElement emptyPenTitleTxt;

    @FindBy(xpath = "//*[@id='tabs-pens']/descendant::div[contains(@class,'text')]")
    private WebElement emptyPenDescTxt;

    //* for the data we have not written yet we need to talk with ram
    @FindBy(xpath = "//*[@id='tabs-profile']//table")
    private WebElement bookmarkedTableSec;

    @FindBy(xpath = "//*[@id='tabs-profile']/descendant::tr")
    private WebElement bookmarkedTableRowsSec;

    @FindBy(xpath = "//*[@id='tabs-profile']/descendant::tr/child::th")
    private List<WebElement> bookmarkedTableHeadersTxt;

    //* Show page feature
    @FindBy(xpath = "//*[@data-tip='Show Pages']/child::img")
    private WebElement showPageBtn;

    @FindBy(xpath = "//*[@class='block']")
    private WebElement pagesImg;

    @FindBy(xpath = "//*[@class='block']/following-sibling::div/p")
    private WebElement pageNumberTxt;

    @FindBy(xpath = "//*[contains(@class,'dgbookprev')]")
    private WebElement showPagesPreviousBtn;

    @FindBy(xpath = "//*[contains(@class,'dgbooknext')]")
    private WebElement showPagesNextBtn;

    @FindBy(id = "range")
    private WebElement rangeBar;

    @FindBy(xpath = "//*[@data-tip='Previous History']/img")
    private WebElement previousHistoryBtn;

    @FindBy(xpath = "//*[@type='number']")
    private WebElement searchPageTxtfd;

    @FindBy(xpath = "//*[@type='number']/following-sibling::span")
    private WebElement totalPageNumbersTxt;

    @FindBy(xpath = "//*[@data-tip='Next History']/img")
    private WebElement nextHistoryBtn;

    //* Zoom feature
    @FindBy(xpath = "//*[contains(@class,'atZoomInOut')]")
    private WebElement zoomBtn;

    @FindBy(xpath = "//*[@aria-labelledby='dropdownMenuButton3']/descendant::button[@data-tip='Close']")
    private WebElement zoomPopupCloseBtn;

    @FindBy(xpath = "//*[@aria-labelledby='dropdownMenuButton3']/descendant::button[contains(@class, 'zoomIn')]")
    private WebElement zoomInBtn;

    @FindBy(xpath = "//*[@aria-labelledby='dropdownMenuButton3']/descendant::button[contains(@class, 'zoomOut')]")
    private WebElement zoomOutBtn;

    @FindBy(xpath = "//*[@aria-labelledby='dropdownMenuButton3']/descendant::button[contains(@class, 'border rounded')]")
    private WebElement zoomResetBtn;

    //* Full screen feature
    @FindBy(xpath = "//*[@data-tip='Full Screen']/*")
    private WebElement fullScreenBtn;

    @FindBy(xpath = "//*[@data-tip='Exit Full Screen']/img")
    private WebElement exitFullScreenBtn;

    @FindBy(xpath = "//*[@id='tooglePageMode' and @data-tip='Single Page']/*")
    private WebElement singlePageBtn;

    @FindBy(xpath = "//*[@id='tooglePageMode' and @data-tip='Dual Page']/*")
    private WebElement dualPageBtn;

    //* Table of content feature
    @FindBy(xpath = "//*[@class='atTableOfContent']/img")
    private WebElement tableOfContentBtn;

    @FindBy(xpath = "//*[contains(@class,'list-reset')]")
    private WebElement tableOfContentSec;

    @FindBy(xpath = "//*[contains(@class,'list-reset')]/descendant::button")
    private List<WebElement> contentNamesTxt;

    //* Resources feature
    @FindBy(xpath = "//*[contains(@class,'atResources')]/img")
    private WebElement resourceBtn;

    @FindBy(className = "cursor-pointer")
    private WebElement resourcesTitleTxt;

    @FindBy(xpath = "//*[@class='cursor-pointer']/following-sibling::span/child::*")
    private WebElement resourceCloseBtn;

    @FindBy(xpath = "//*[contains(@class,'accordion')]")
    private WebElement resourcesChapterSec;

    @FindBy(xpath = "//*[contains(@class,'accordion')]/child::span[contains(@class,'text-wrap')]")
    private WebElement resourceChapterNameTxt;

    @FindBy(xpath = "//*[contains(@class,'accordion')]/descendant::img[@height]")
    private WebElement resourceChapterArrowBtn;

    @FindBy(xpath = "(//*[@class='panel'])/descendant::img[@class='mr-3']")
    private WebElement resourceTypeImg;

    @FindBy(xpath = "//*[@class='panel']/descendant::img[@class='mr-3']/following-sibling::*")
    private WebElement resourceTypeNameTxt;

    @FindBy(xpath = "//*[@class='panel']/descendant::*[@class='text-xs']/following-sibling::*")
    private WebElement resourcePageNumberTxt;

    @FindBy(xpath = "(//*[@class='panel'])[1]/descendant::*[@class='h-4 w-2']")
    private WebElement resourceArrowBtn;

    @FindBy(xpath = "//*[@class='panel']/descendant::div[contains(@class,'premiumResouce')]")
    private WebElement lockedResourceSec;

    @FindBy(xpath = "//*[@class='panel']/descendant::img[contains(@src,'images/crownPremiumLabel.svg')]")
    private WebElement premiumImg;

    @FindBy(xpath = "//*[@class='panel']/descendant::img[contains(@src,'/images/lockIcon.svg')]")
    private WebElement lockedImg;

    //* Book Reading
    @FindBy(xpath = "//*[@id='prev']/img")
    private WebElement pagePreviousBtn;

    @FindBy(id = "leftPage")
    private WebElement leftBookPageImg;

    @FindBy(xpath = "//*[@id = 'leftPage']/descendant::button")
    private WebElement leftBookmarkBtn;

    @FindBy(xpath = "//*[@id='leftPage']/descendant::*[@id='waterMarkBySam']")
    private WebElement leftWatermarkTxt;

    @FindBy(id = "canvas2")
    private WebElement rightBookPageImg;

    @FindBy(xpath = "//*[@id = 'rightPage']/descendant::button")
    private WebElement rightBookmarkBtn;

    @FindBy(xpath = "//*[@id='rightPage']/descendant::*[@id='waterMarkBySam']")
    private WebElement rightWatermarkTxt;
}
