package steps;

import io.cucumber.java.en.And;

public class RegisterSteps extends BaseTest{

    @And("start filling in form entering name {string}")
    public void fillingInForm(String name) {
        register.sendKeysName(name);
    }


    @And("enter last name {string}")
    public void enterLastName(String apellido) {
        register.sendKeysLastName(apellido);
    }

    @And("enter rut {string}")
    public void enterRut(String rut) {
        register.sendKeysRut(rut);

    }

    @And("enter phone number {string}")
    public void enterPhoneNumber(String phone) {
        register.sendKeysPhoneNumber(phone);
    }

    @And("enter email {string}")
    public void enterEmail(String email) {
        register.sendKeysEmail(email);
    }

    @And("enter password {string}")
    public void enterPassword(String pwd) {
        register.sendKeysPassword(pwd);
    }

    @And("press register button")
    public void pressRegisterButton()  {
        register.clickBtnRegister();
    }
}
