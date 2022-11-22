package utilities;

import browserfactory.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Utility extends BaseTest {
    //creating method clicking on webelement
    public void clickOnElement(By by){
        WebElement link = driver.findElement(by);
        link.click();
    }
    //creating method to send text to webelement
    public void sendTextToElement(By by, String text){
        WebElement anyField = driver.findElement(by);
        anyField.sendKeys(text);

    }

    //getting text from webelement
    public String getTextFromElement(By by){
        WebElement actualTextMessageElement = driver.findElement(by);
        return actualTextMessageElement.getText();
    }

}
