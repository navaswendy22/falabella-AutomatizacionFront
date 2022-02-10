package pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectProductPage {

    public SelectProductPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//div[@id='testId-searchResults-products']/div[1]/div/a//ol/li[1]//span")
    private WebElement price;

    @FindBy(id = "buttonForCustomers")
    private WebElement btnAddCar;

    @FindBy(id = "linkButton")
    private WebElement btnGoToPurchase;

    public WebElement getPrice() {
        return price;
    }

    public By getSize(String size) {
        return By.xpath("//div[@class='jsx-4058620773 size-options']/button[contains(text(),'" + size + "')]//ancestor::button");
    }

    public WebElement getBtnAddCar() {
        return btnAddCar;
    }

    public WebElement getBtnGoToPurchase() {
        return btnGoToPurchase;
    }

}
