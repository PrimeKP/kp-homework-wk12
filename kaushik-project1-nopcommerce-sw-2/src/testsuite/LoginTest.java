package testsuite;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class LoginTest extends Utility {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToLoginPageSuccessfully(){
        //find login link and click on it
        clickOnElement(By.linkText("Log in"));

        //getting actual message
        String expectedMessage = "Welcome, Please Sign In!";

        //getting actual message
        String actualMessage = getTextFromElement(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]"));

        //validating actual with expected message
        Assert.assertEquals("Not navigated to login page", expectedMessage, actualMessage);

    }
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
        //find login link and click on it
        clickOnElement(By.linkText("Log in"));

        //entering valid credential
        sendTextToElement(By.id("Email"), "amrish.sharma105@email.com");
        sendTextToElement(By.name("Password"), "amrish123");
        clickOnElement(By.xpath("(//button[@type='submit'])[2]"));

        //verifying  logout text
        String expectedText = "Log out";
        String actualText = getTextFromElement(By.xpath("//a[@class='ico-logout']"));
        Assert.assertEquals("User is not logged in",expectedText,actualText);

    }

    @Test
    public void verifyTheErrorMessage(){
        //find login link and click on it
        clickOnElement(By.linkText("Log in"));

        //entering valid in valid credential
        sendTextToElement(By.id("Email"), "ketan.shah1980@gmail.com");
        sendTextToElement(By.name("Password"), "test123");
        clickOnElement(By.xpath("(//button[@type='submit'])[2]"));

        //verifying  error message
        String expectedErrorMessage = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        String actualErrorMessage = getTextFromElement(By.xpath("//div[contains(@class,'message-error')]"));
        Assert.assertEquals("User is not logged in",expectedErrorMessage,actualErrorMessage);

    }
    @After
    @Override
    public void closeBrowser() {
        super.closeBrowser();
    }
}
