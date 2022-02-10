package pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

    public RegisterPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "testId-Input-firstName")
    private WebElement inputName;

    @FindBy(id = "testId-Input-lastName")
    private WebElement inputLastName;

    @FindBy(id = "testId-Input-document")
    private WebElement inputRut;

    @FindBy(id = "testId-Input-phoneNumber")
    private WebElement inputPhoneNumber;

    @FindBy(xpath = "//input[@name='email']")
    private WebElement inputEmail;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement inputPassword;

    @FindBy(xpath = "//input[@id='testId-consent-consentTemplateRegistroTyC_FAL_CL-input']")
    private WebElement checkBookAceptoterminos;

    @FindBy(xpath = "//input[@id='testId-consent-consentTemplateRegistroPdP_FAL_CL-input']")
    private WebElement checkBookAutorizo;

    @FindBy(id = "testId-Button-submit")
    private WebElement btnRegister;

    public WebElement getInputName() {
        return inputName;
    }

    public WebElement getInputLastName() {
        return inputLastName;
    }

    public WebElement getInputRut() {
        return inputRut;
    }

    public WebElement getInputPhoneNumber() {
        return inputPhoneNumber;
    }

    public WebElement getInputEmail() {
        return inputEmail;
    }

    public WebElement getInputPassword() {
        return inputPassword;
    }

    public WebElement getCheckBookAceptoterminos() {
        return checkBookAceptoterminos;
    }

    public WebElement getCheckBookAutorizo() {
        return checkBookAutorizo;
    }

    public WebElement getBtnRegister() {
        return btnRegister;
    }

}
