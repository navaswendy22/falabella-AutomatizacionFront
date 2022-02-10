package pom.actions;

import org.openqa.selenium.WebDriver;
import pom.BasePage;
import pom.pages.SelectProductPage;

public class SelectProductAction extends BasePage {

    SelectProductPage selectProduct;

    public SelectProductAction(WebDriver driver) {
        super(driver);
        selectProduct = new SelectProductPage(driver);
    }

     protected static String getFirstPrice;

    private String getPriceFirstProduct() {
        return selectProduct.getPrice()
                .getText()
                .replace("$","")
                .replace(" ", "");
    }


    public void clickfirstProductDisplayed() {
        waitFor(3);
        getFirstPrice= getPriceFirstProduct();
        scrollDown();
        click(selectProduct.getPrice());
    }

    public void selectSize(String size) {
        click(selectProduct.getSize(size));
    }

    public void clickAddCar()  {
        click(selectProduct.getBtnAddCar());
        waitFor(2);
    }

    public void clickBtnGoToPurchase()  {
        click(selectProduct.getBtnGoToPurchase());
    }


}
