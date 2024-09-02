package pageObjects;

import driver.DriverFactory;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utils.Global_Vars;

import java.time.Duration;

public class Base_PO {
    public Base_PO (){
        PageFactory.initElements(getDriver(), this);
    }

    public WebDriver getDriver () {
        return DriverFactory.getDriver();
    }

    public String genratRundomeNumber (int length){
        return RandomStringUtils.randomNumeric(length);
    }

    public void navigateTo_URL (String url){
        getDriver().get(url);
    }

    /**
     * Sends the specified text to a web element identified by the given locator.
     *
     * This method first waits until the specified web element is clickable, ensuring that it is both present in the DOM
     * and in a state that allows interaction. Once the element is clickable, the method sends the provided text to it.
     *
     * @param by The locator used to find the web element (e.g., By.Id, By.xpath, etc.).
     * @param textToType The text string to be sent to the web element.
     */
    public void sendKey (By by ,  String textToType) {
        WebDriverWait wait= new WebDriverWait(getDriver() , Duration.ofSeconds(Global_Vars.DEFAULT_EXPLICIT_TIMEOUT));
        wait.until(ExpectedConditions.elementToBeClickable(by)).sendKeys(textToType);
    }
    public void sendKey (WebElement element , String textToType) {
        WebDriverWait wait= new WebDriverWait(getDriver() , Duration.ofSeconds(Global_Vars.DEFAULT_EXPLICIT_TIMEOUT));
        wait.until(ExpectedConditions.elementToBeClickable(element)).sendKeys(textToType);
    }
    /**
     * Waits for a web element to be clickable and then clicks it.
     *
     * This method waits until the specified web element, identified by the given locator, is clickable.
     * A clickable element is one that is both visible and enabled. Once the element is clickable, the method performs
     * a click action on it. This ensures that the element is fully interactive before any action is attempted, reducing
     * the likelihood of encountering `ElementNotInteractableException` or other timing-related issues.
     *
     * @param by The locator used to find the web element (e.g., By.Id, By.xpath, etc.).
     */
    public void waitForWebElementAndClick (By by ) {
        WebDriverWait wait= new WebDriverWait(getDriver() , Duration.ofSeconds(Global_Vars.DEFAULT_EXPLICIT_TIMEOUT));
        wait.until(ExpectedConditions.elementToBeClickable(by)).click();
    }
    public void waitForWebElementAndClick (WebElement element ) {
        WebDriverWait wait= new WebDriverWait(getDriver() , Duration.ofSeconds(Global_Vars.DEFAULT_EXPLICIT_TIMEOUT));
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }
    //get the alert
    public void waitForAlert_And_validateText (String text){
        WebDriverWait wait= new WebDriverWait(getDriver() , Duration.ofSeconds(Global_Vars.DEFAULT_EXPLICIT_TIMEOUT));
        wait.until(ExpectedConditions.alertIsPresent());
        //to extract the message from alert
        String alertMessageText = getDriver().switchTo().alert().getText() ;
        Assert.assertEquals(alertMessageText,text);
    }


}
