package web.generic;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {

	final static Logger logger = LogManager.getLogger(BaseTest.class);

	public static ChromeOptions options;
	public static String URL = "https://uat-digibook-student.navneet.com/";
	public static WebDriver driver;

	@BeforeClass
	public void setupBrowser(){
		logger.info("system is trying to open browser...");
		options = new ChromeOptions();
		options.addArguments("--disable-infobars");
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		logger.info("browser is maximized");
		driver.get(URL);
		logger.info("browser is navigated "+URL);
	}

	@AfterClass
	public void tearDownBrowser(){
//		if(driver != null)
//			driver.quit();
	}
}
