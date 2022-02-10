package pom.actions;

import org.openqa.selenium.WebDriver;
import pom.BasePage;
import pom.pages.RegisterPage;


public class RegisterAction extends BasePage {

    RegisterPage register;

    public RegisterAction(WebDriver driver) {
        super(driver);
        register= new RegisterPage(driver);
    }

    public void sendKeysName(String name) {
        sendKeys(name, register.getInputName());
    }

    public void sendKeysLastName(String lastName) {
        sendKeys(lastName, register.getInputLastName());
    }

    public void sendKeysRut(String Rut) {
        sendKeys(Rut, register.getInputRut());
    }

    public void sendKeysPhoneNumber(String phone) {
        sendKeys(phone, register.getInputPhoneNumber());
    }

    public void sendKeysEmail(String email) {
        waitFor(2);
        int x = (int) Math.floor(Math.random() * 8000 + 2);
        String mail = email + x + "@yopmail.com";
        sendKeysActions(mail, register.getInputEmail());
    }

    public void sendKeysPassword(String pwd) {
        sendKeys(pwd, register.getInputPassword());
    }

    private void clickAceptoTerminos() {
        while (!register.getCheckBookAceptoterminos().isSelected()) {
            register.getCheckBookAceptoterminos().click();
        }
    }


    private void clickAutorizo() {
        while (!register.getCheckBookAutorizo().isSelected()) {
            register.getCheckBookAutorizo().click();
        }
    }

    public void clickBtnRegister()  {
        scrollDown();
        waitFor(2);
        clickAceptoTerminos();
        clickAutorizo();
        click(register.getBtnRegister());
    }


}
