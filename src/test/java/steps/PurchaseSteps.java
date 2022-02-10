package steps;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PurchaseSteps extends BaseTest {

    @When("user presses the category menu option")
    public void userPressesCategoryOption()  {
        home.clickMenuCategoria();
    }

    @Then("user goes to the option {string}")
    public void userGoesToOptionProduct(String zapatos) {
        home.clickProduct(zapatos);
    }

    @And("select {string}")
    public void selectSubProduct(String product)  {
        home.clickSubProduct(product);
    }


    @Then("select the first product displayed")
    public void selectFirstProductDisplayed()  {
        select.clickfirstProductDisplayed();
    }

    @And("select size {string}")
    public void selectSize(String size) {
        select.selectSize(size);
    }

    @And("press the Add to Cart option")
    public void pressTheAddCartOption()  {
        select.clickAddCar();
    }

    @Then("press the Go to purchase cart option")
    public void pressGoToPurchaseCartOption()  {
        select.clickBtnGoToPurchase();
    }

    @And("validates the price of the purchase cart with the previously displayed")
    public void validatesPrice() {
        summary.compareProductPrices();
    }
}
