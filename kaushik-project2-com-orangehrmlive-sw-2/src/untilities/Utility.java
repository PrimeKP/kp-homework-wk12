package untilities;

import browserfactory.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Utility extends BaseTest {
    //creating method to click on element by passing parameter
    public void clickOnElement(By by) {
        WebElement link = driver.findElement(by);
        link.click();
    }
    //creating method to send text to elements
    public void sendTextToElement(By by, String text){
        WebElement anyField = driver.findElement(by);
        anyField.sendKeys(text);
    }
    public String getTextFromElement(By by){
        WebElement actualTextMessageElement = driver.findElement(by);
        return actualTextMessageElement.getText();
    }
}
