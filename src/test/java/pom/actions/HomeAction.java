package pom.actions;

import org.openqa.selenium.WebDriver;
import pom.BasePage;
import pom.pages.HomePage;

public class HomeAction extends BasePage {
    HomePage loginPage;

    public HomeAction(WebDriver driver) {
        super(driver);
        loginPage = new HomePage(driver);
    }

    public void closePopUp()  {
        if (isVisible(loginPage.getPopUpBtn())){
            click(loginPage.getPopUpBtn());
        }
    }

    public void moveMouseToIniciarSesion() {
        moveToElement(loginPage.getShowIniciarSesion());
    }

    public void clickSignUp() {
        click(loginPage.getSignUp());
    }

    public boolean getTextDisplayName(String name){
        return getText(loginPage.getDisplayName(),name);
    }

    public void clickSignIn() {
        click(loginPage.getSignIn());
    }

    public void sendKeysMail(String email){
        sendKeysActions(email, loginPage.getInputMail());
    }

    public void clickEntersButton()  {
        click(loginPage.getEntersButton());
    }


    public void clickMenuCategoria()  {
        click(loginPage.getMenuCategory());
    }

    public void clickProduct(String product)  {
        click(loginPage.getProduct(product));
    }

    public void clickSubProduct(String subProduct) {
        click(loginPage.getSubProduct(subProduct));
    }
}
