package Provectus;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;

/**
 * Created by OlegK on 01.03.2017.
 */
public class BrowserDriver {

    protected static String baseUrl = "http://book.theautomatedtester.co.uk";
    protected WebDriver driver;

    @BeforeMethod
    public void initWebDriver() {
        System.setProperty("webdriver.chrome.driver", "bin/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @AfterSuite(alwaysRun = true)
    public void tearDown() {
        driver.manage().deleteAllCookies();
    }
}
