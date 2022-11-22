package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import untilities.Utility;

public class ForgotPasswordTest extends Utility {

    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }
    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully(){
        //clicking on forgot password link
        clickOnElement(By.xpath("//p[contains(@class, 'login-forgot')]"));
        String expectedResetPasswordText = "Reset Password";
        String actualResetPasswordText = getTextFromElement(By.xpath("//button[contains(@class, 'password-button--reset')]"));
        Assert.assertEquals("Text has some error",expectedResetPasswordText, actualResetPasswordText);
    }
    @After
    @Override
    public void closeBrowser() {
        super.closeBrowser();
    }
}
