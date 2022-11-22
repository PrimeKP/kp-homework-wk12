package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class TopMenuTest extends Utility {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }

    //clicking on computers link
    @Test
    public void userShouldNavigateToComputerPageSuccessfully(){
        clickOnElement(By.linkText("Computers"));

        //varifying text computers
        String expectedText = "Computers";
        String actualText = getTextFromElement(By.xpath("//h1[text()='Computers']"));
        Assert.assertEquals("User is not in computers tab",expectedText,actualText);
    }
    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully(){
        clickOnElement(By.linkText("Electronics"));

        //varifying text electronics
        String expectedText = "Electronics";
        String actualText = getTextFromElement(By.xpath("//h1[text()='Electronics']"));
        Assert.assertEquals("User is not in electronics tab",expectedText,actualText);

    }

    @Test
    public void userShouldNavigateToApparelPageSuccessfull(){
        clickOnElement(By.linkText("Apparel"));

        //varifying text Apparel
        String expectedText = "Apparel";
        String actualText = getTextFromElement(By.xpath("//h1[text()='Apparel']"));
        Assert.assertEquals("User is not in apparel tab",expectedText,actualText);

    }

    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfull(){
        clickOnElement(By.linkText("Digital downloads"));

        //varifying text Digital downloads
        String expectedText = "Digital downloads";
        String actualText = getTextFromElement(By.xpath("//h1[text()='Digital downloads']"));
        Assert.assertEquals("User is not in Digital downloads tab",expectedText,actualText);
    }

    @Test
    public void userShouldNavigateToBooksPageSuccessfully(){
        clickOnElement(By.linkText("Books"));

        //varifying text Books
        String expectedText = "Books";
        String actualText = getTextFromElement(By.xpath("//h1[text()='Books']"));
        Assert.assertEquals("User is not in Books tab",expectedText,actualText);
    }
    @Test
    public void userShouldNavigateToJewelryPageSuccessfully(){
        clickOnElement(By.linkText("Jewelry"));

        //varifying text Jewelry
        String expectedText = "Jewelry";
        String actualText = getTextFromElement(By.xpath("//h1[text()='Jewelry']"));
        Assert.assertEquals("User is not in Jewelry tab",expectedText,actualText);
    }

    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfull(){
        clickOnElement(By.linkText("Gift Cards"));

        //varifying text Gift Cards
        String expectedText = "Gift Cards";
        String actualText = getTextFromElement(By.xpath("//h1[text()='Gift Cards']"));
        Assert.assertEquals("User is not in Gift Cards tab",expectedText,actualText);
    }
    @After
    @Override
    public void closeBrowser() {
        super.closeBrowser();
    }
}
