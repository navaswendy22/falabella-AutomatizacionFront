package steps;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class HomeSteps extends BaseTest{

    @Given("user enters the site")
    public void enterTheSite()  {
  //      screenShot.takeScreenShot();
        home.closePopUp();
    }

    @Then("user enters to sign up")
    public void userEntersToSignUp()  {
  //      screenShot.takeScreenShot();
        home.moveMouseToIniciarSesion();
        home.clickSignUp();
    }

    @Then("user enters to sign in")
    public void userEnterToSignIn() {
  //      screenShot.takeScreenShot();
        home.moveMouseToIniciarSesion();
        home.clickSignIn();
    }

    @And("enter mail {string}")
    public void enterMail(String email) {
        home.sendKeysMail(email);
    }

    @Then("press enters button")
    public void pressEntersButton()  {
        home.clickEntersButton();
    }

    @Then("validate that the {string} matches the entered account")
    public void validateThatNameMatches(String nombre) {
        Assert.assertTrue(home.getTextDisplayName(nombre));
    }
}
