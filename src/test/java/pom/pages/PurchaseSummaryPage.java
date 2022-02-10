package pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PurchaseSummaryPage {

    public PurchaseSummaryPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//div[contains(@class, 'layout-right-section')]//li/div/div[2]/div/div[2]/span")
    private WebElement pricePurchaseCart;

    public WebElement getPricePurchaseCart() {
        return pricePurchaseCart;
    }

}
