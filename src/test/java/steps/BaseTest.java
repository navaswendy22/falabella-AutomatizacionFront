package steps;

import org.openqa.selenium.WebDriver;
import pom.actions.HomeAction;
import pom.actions.PurchaseSummaryAction;
import pom.actions.RegisterAction;
import pom.actions.SelectProductAction;

public class BaseTest {
    protected WebDriver driver = Hooks.getDriver();
    protected HomeAction home = new HomeAction(driver);
    protected RegisterAction register = new RegisterAction(driver);
    protected SelectProductAction select = new SelectProductAction(driver);
    protected PurchaseSummaryAction summary = new PurchaseSummaryAction(driver);

}
