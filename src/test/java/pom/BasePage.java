package pom;

import org.awaitility.core.ConditionTimeoutException;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import static org.awaitility.Awaitility.await;
import static java.util.concurrent.TimeUnit.SECONDS;

public class BasePage {

    protected WebDriver driver;
    private static final int WAIT_TIMEOUT = 10;
    protected Actions action;

    @FindBy(xpath ="//*[@class='Spinner-module_spinner__svg__3A0EL']")
    private WebElement loading;

    public BasePage(WebDriver driver){

        this.driver = driver;
        action = new Actions(driver);
    }

    public void waitUntilElementIsVisible(WebElement element){
        try{
            await().atMost(WAIT_TIMEOUT, SECONDS).until(()->isVisible(element));
        }catch (ConditionTimeoutException e){
            throw new ConditionTimeoutException(String.format("No se encuentra el elemento despues de 5 segundos\nElemento: %s", element));
        }
    }

    public void waitUntilElementIsVisible(By element){
        try{
            await().atMost(WAIT_TIMEOUT, SECONDS).until(()->isVisible(element));
        }catch (ConditionTimeoutException e){
            throw new ConditionTimeoutException(String.format("No se encuentra el elemento despues de 5 segundos\nElemento: %s", element));
        }
    }


    public void click(WebElement element)  {
        waitUntilElementIsVisible(element);
        element.click();
    }

    public void click(By selector)  {
        waitUntilElementIsVisible(selector);
        WebElement element = driver.findElement(selector);
        element.click();
    }

    protected void sendKeys(String text, WebElement element) {
        waitUntilElementIsVisible(element);
        element.clear();
        element.sendKeys(text);
    }

    protected void sendKeysActions(String text, WebElement element) {
        waitUntilElementIsVisible(element);
        action.sendKeys(element,text)
                .build()
                .perform();
    }

    protected boolean isVisible(WebElement webElement){
        try {
            return webElement.isDisplayed();
        } catch (Exception e){
            return false;
        }
    }

    protected boolean isVisible(By webElement){
        try {
            return driver.findElement(webElement).isDisplayed();
        } catch (Exception e){
            return false;
        }
    }

    public void waitFor(int segundos) {
        try {
            Thread.sleep(segundos * 1000L);
        } catch (InterruptedException ignored) {

        }
    }

    public void moveToElement(WebElement element) {
        waitUntilElementIsVisible(element);
        waitFor(4);
        action.moveToElement(element).perform();
    }

    public void scrollDown() {
        Dimension size = driver.manage().window().getSize();
        int startPoint = (int)((double)size.getHeight() * 0.7D);
        int endPoint = (int)((double)size.getHeight() * 0.4D);
        ((JavascriptExecutor)driver).executeScript("scroll("+startPoint+","+endPoint+")");
    }

    protected boolean isInvisible(WebElement element){
        try {
            return !element.isDisplayed();
        } catch (NoSuchElementException | StaleElementReferenceException e){
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public void waitUntilElementIsInVisibleNonThrow(WebElement element){
        try{
            await().atMost(WAIT_TIMEOUT, SECONDS).until(()->isInvisible(element));
        } catch (ConditionTimeoutException ignored) {
        }
    }

    public void waitUntilPageIsLoaded(){
        waitUntilElementIsInVisibleNonThrow(loading);
    }

    protected boolean getText(WebElement webElement, String text) {
        waitUntilPageIsLoaded();
        return webElement.getText().contains(text);
    }
}
