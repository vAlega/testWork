package Provectus.pages;

import org.openqa.selenium.WebDriver;

/**
 * Created by OlegK on 01.03.2017.
 */

public abstract class Page {

    protected WebDriver driver;

    /*
     * Constructor injecting the WebDriver interface
     *
     * @param webDriver
     */
    public Page(WebDriver driver) {
        this.driver = driver;
    }

    public String getTitle() {
        return driver.getTitle();
    }

}