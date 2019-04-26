package testScripts;

 
import java.util.concurrent.TimeUnit;

 
import org.openqa.selenium.WebDriver;
 
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
 
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	protected WebDriver driver;

	@BeforeClass

	public void launchBrowser() {
		String browser = "Chrome";
		if (browser.equals("FireFox")) {

			System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "./Output/firefox.log");

			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

			driver.get("https://www.amazon.in/");

		} else if (browser.equals("Chrome")) {

			ChromeOptions ops = new ChromeOptions();
			ops.setAcceptInsecureCerts(true);
			ops.addArguments("--disable-notifications");
			ops.addArguments("disable-infobars");
			ops.addArguments("start-maximized");

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(ops);

			// driver.get("https://www.amazon.in/");
			driver.navigate().to("https://www.amazon.in/");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
	}

	// @AfterSuite
	@AfterClass

	public void closeBroswer() {
		driver.quit();

	}

}
