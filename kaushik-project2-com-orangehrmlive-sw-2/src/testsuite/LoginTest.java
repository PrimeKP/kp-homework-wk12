package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import untilities.Utility;

public class LoginTest extends Utility {
    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }
    @Test
    public void userSholdLoginSuccessfullyWithValidCredentials(){
        //entering valid credential for user
        sendTextToElement(By.xpath("//input[@name='username']"),"Admin");
        sendTextToElement(By.xpath("//input[@name='password']"),"admin123");
        //now clicking login button
        clickOnElement(By.xpath("//button[@type='submit']"));

        //verifying Dashboard text
        String expectedText = "Dashboard";
        String actualText = getTextFromElement(By.xpath("//a[contains(@href, '/dashboard/')]"));
        Assert.assertEquals("Text could not be verified",expectedText, actualText);
    }
    @After
    @Override
    public void closeBrowser() {
        super.closeBrowser();
    }
}
