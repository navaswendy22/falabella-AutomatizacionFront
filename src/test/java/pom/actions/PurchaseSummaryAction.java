package pom.actions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pom.BasePage;
import pom.pages.PurchaseSummaryPage;

public class PurchaseSummaryAction extends BasePage {

    PurchaseSummaryPage purchase;

    public PurchaseSummaryAction(WebDriver driver) {
        super(driver);
        purchase = new PurchaseSummaryPage(driver);
    }

    public void compareProductPrices() {
        String b = purchase.getPricePurchaseCart()
                .getText()
                .replace("$", " ")
                .replace(" ", "");
        Assert.assertEquals(b, SelectProductAction.getFirstPrice);
    }

}
