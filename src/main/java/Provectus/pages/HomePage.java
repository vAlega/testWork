package Provectus.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by OlegK on 01.03.2017.
 */
public class HomePage extends Page {

    @FindBy(how = How.CSS, using = "ul>li:nth-child(1)>a")
    @CacheLookup
    public WebElement link1;

    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }
}
