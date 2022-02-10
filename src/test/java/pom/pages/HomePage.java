package pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage {

    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//div[@class='dy-modal-contents']/div[1]")
    private WebElement PopUpBtn;

    @FindBy(xpath = "//p[text()='Inicia sesión']")
    private WebElement showIniciarSesion;

    @FindBy(xpath = "//li/a[text()='Inicia sesión']")
    private WebElement signIn;

    @FindBy(xpath = "//a[text()='Regístrate']")
    private WebElement signUp;

    @FindBy(xpath = "//p[text()='Hola']")
    private WebElement displayName;

    @FindBy(xpath = "//input[@name='email']")
    private WebElement inputMail;

    @FindBy(id = "testId-cc-login-form-submit")
    private WebElement btnEnters;


    @FindBy(xpath = "//span[contains(text(),'Menú')]")
    private WebElement menuCategory;


    public WebElement getPopUpBtn() {
        return PopUpBtn;
    }


    public WebElement getShowIniciarSesion() {
        return showIniciarSesion;
    }

    public WebElement getSignUp() {
        return signUp;
    }

    public WebElement getSignIn() {
        return signIn;
    }



    public WebElement getDisplayName() {
        return displayName;
    }

    public WebElement getInputMail() {
        return inputMail;
    }

    public WebElement getEntersButton() {
        return btnEnters;
    }

    public WebElement getMenuCategory() {
        return menuCategory;
    }


    public By getProduct(String product) {
        return By.xpath("//div[@class='TaxonomyDesktop-module_Box__1zcT3']//*[contains(text(),'" + product + "')]");
    }


    public By getSubProduct(String subProduct) {
        return By.xpath("//a[contains(text(),'" + subProduct + "')]");
    }


}
