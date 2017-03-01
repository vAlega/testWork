package Provectus.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by OlegK on 01.03.2017.
 */
public class Chapter1Page extends Page {

    @FindBy(how = How.ID, using = "divontheleft")
    @CacheLookup
    public WebElement textToValidate;

    public Chapter1Page(WebDriver webDriver) {
        super(webDriver);
    }
}
