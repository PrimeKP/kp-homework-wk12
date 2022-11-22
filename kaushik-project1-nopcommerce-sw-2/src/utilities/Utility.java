package utilities;

import browserfactory.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Utility extends BaseTest {

    //creating method to click on element passed in parameter
    public void clickOnElement(By by) {
        WebElement loginLink = driver.findElement(by);
        loginLink.click();
    }

    //creating method to send text to elements passed in parameter
    public void sendTextToElement(By by, String text) {
        WebElement  anyField = driver.findElement(by);
        anyField.sendKeys(text);
    }

    //creating method to get text from element to compare
    public String getTextFromElement(By by){
        WebElement actualTextMessageElement = driver.findElement(by);
        return actualTextMessageElement.getText();

    }


}
