package Provectus;

import Provectus.pages.Chapter1Page;
import Provectus.pages.HomePage;
import org.testng.annotations.Test;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;

public class Chapter1Test extends BrowserDriver {

    private HomePage homepage;
    private Chapter1Page chapter1Page;

    @BeforeMethod
    public void initPageObjects() {

        homepage = PageFactory.initElements(driver, HomePage.class);
        chapter1Page = PageFactory.initElements(driver, Chapter1Page.class);
    }

    @Test
    public void testHomePageHasAHeader() {
        driver.get(baseUrl);
        homepage.link1.click();
        String a = chapter1Page.textToValidate.getText();
        Assert.assertEquals("Assert that this text is on the page", chapter1Page.textToValidate.getText());
    }
}