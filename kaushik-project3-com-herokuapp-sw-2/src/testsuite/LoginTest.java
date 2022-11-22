package testsuite;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class LoginTest extends Utility {

    String baseUrl = "http://the-internet.herokuapp.com/login";

    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }
    @Test
    public void UserSholdLoginSuccessfullyWithValidCredentials(){

        //sending text to elements login and password
        sendTextToElement(By.xpath("//input[@id='username']"),"tomsmith");
        sendTextToElement(By.xpath("//input[@id='password']"),"SuperSecretPassword!");
        clickOnElement(By.xpath("//button[@type='submit']"));

        //Verifying text Secure Area
        String expectedText = "Secure Area";
        String actualText = getTextFromElement(By.xpath("//h2[text()=' Secure Area']"));
        Assert.assertEquals("Error in Text validation",expectedText, actualText);
    }

    @Test
    public void verifyTheUsernameErrorMessage(){
        //sending text to elements login and password
        sendTextToElement(By.xpath("//input[@id='username']"),"tomsmith1");
        sendTextToElement(By.xpath("//input[@id='password']"),"SuperSecretPassword!");
        clickOnElement(By.xpath("//button[@type='submit']"));

        String expectedErrorTextMessage = "Your username is invalid!";
        String actualErrorTextMessage = getTextFromElement(By.xpath("//div[@id='flash-messages']")).substring(0,25);
        Assert.assertEquals("Unexpected error happen",expectedErrorTextMessage, actualErrorTextMessage);

    }
    @Test
    public void verifyThePasswordErrorMessage(){

        //sending text to elements login and password
        sendTextToElement(By.xpath("//input[@id='username']"),"tomsmith");
        sendTextToElement(By.xpath("//input[@id='password']"),"SuperSecretPassword");
        clickOnElement(By.xpath("//button[@type='submit']"));

        String expectedErrorTextMessage = "Your password is invalid!";
        String actualErrorTextMessage = getTextFromElement(By.xpath("//div[@id='flash-messages']")).substring(0,25);
        Assert.assertEquals("Unexpected error happen",expectedErrorTextMessage, actualErrorTextMessage);

    }
}
