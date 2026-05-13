package Steps;

import io.cucumber.java.After;
import io.cucumber.java.en.*;

public class stepsDef extends Base{


    @Given("i am on the login page")
    public void i_am_on_the_login_page() {
        homePage.clickLoginButton();
    }

    @And("I enter email (.*)$")
    public void i_enter_email(String email) {
        loginPage.enterEmail(email);
    }

    @And("I enter password (.*)$")
    public void i_enter_password(String password) {
        loginPage.enterPassword(password);
    }

    @When("I click login button")
    public void i_click_login_button() {
        loginPage.clickLoginButton();
    }

    @Then("i should be logged in successfully")
    public void i_should_be_logged_in_successfully() {

    }

    @And("I click mobile automation")
    public void iClickMobileAutomation() {

    }

    @After
    public void closeBrowser() {
    }
}
