package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class RegisterTest extends Utility {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void UserShouldNavigateToRegisterPageSuccessfully() {
        clickOnElement(By.linkText("Register"));
        //verifying text Register
        String expectedText = "Register";
        String actualText = getTextFromElement(By.xpath("//h1[text()='Register']"));
        Assert.assertEquals("", expectedText, actualText);

    }

    @Test
    public void userSholdRegisterAccountSuccessfully(){
        //selecting anc clicking on register link
        clickOnElement(By.linkText("Register"));

        //entering information
        clickOnElement(By.xpath("//input[@type='radio' and @value='M']"));
        sendTextToElement(By.xpath("//input[@id='FirstName']"), "Amrish");
        sendTextToElement(By.xpath("//input[@id='LastName']"), "Sharma");
        clickOnElement(By.xpath("//select[@name='DateOfBirthDay']/option[@value='12']"));
        clickOnElement(By.xpath("//select[@name='DateOfBirthMonth']/option[@value='12']"));
        clickOnElement(By.xpath("//select[@name='DateOfBirthYear']/option[@value='1992']"));
        sendTextToElement(By.xpath("//input[@id='Email']"),"amrish.sharma105@email.com");
        sendTextToElement(By.xpath("//input[@id='Password']"), "amrish123");
        sendTextToElement(By.xpath("//input[@id='ConfirmPassword']"), "amrish123");
        clickOnElement(By.xpath("//button[@id='register-button']"));

        //verifying that registration sucessfull
        String expectedRegistrationCompleteText = "Your registration completed";
        String actualRegistrationCompleteText = getTextFromElement(By.xpath("//div[@class='result']"));
        Assert.assertEquals("Registration Unsucessful",expectedRegistrationCompleteText, actualRegistrationCompleteText);
    }
    @After
    @Override
    public void closeBrowser() {
        super.closeBrowser();
    }
}
