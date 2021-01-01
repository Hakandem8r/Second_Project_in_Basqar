package Pages;

import Utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class _Parent {

    WebDriver driver;
    WebDriverWait wait;

    public _Parent() {
        driver = Driver.getDriver();
        wait = new WebDriverWait(driver,10);
    }

    public void clickFunction (WebElement element) {

        element.click();
    }

    public void sendKeysFunction (WebElement element, String value) {
        waitUntilVisible(element);

        element.sendKeys(value);
    }

    /* public void waitUntilClickable (WebElement element) {
         wait.until(ExpectedConditions.elementToBeClickable(element));
     }
 */
    public void waitUntilVisible (WebElement element)
    {
        wait.until(ExpectedConditions.visibilityOf(element));
    }

//        public void verifyElementContainsText(WebElement element, String text){
//            wait.until(ExpectedConditions.textToBePresentInElement(element,text));
//
//            System.out.println(element.getText());
//            System.out.println(text);
//
//            Assert.assertTrue(element.getText().toLowerCase().contains(text.toLowerCase()));
//        }


}


