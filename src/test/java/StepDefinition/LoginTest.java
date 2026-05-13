package StepDefinition;

import Utilities.BrowserFactory;
import static common.BaseURIs.baseURL;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class LoginTest {

    WebDriver driver;
    BrowserFactory browserFactory;


    @Given("Browser is open")
    public void browser_is_open() {
        browserFactory = new BrowserFactory();
        driver = browserFactory.startBrowser("chrome", baseURL);
    }

    @And("user is on the login page")
    public void user_is_on_the_login_page() {
        // Write code here that turns the phrase above into concrete actions

    }

    @When("user enters username and password")
    public void user_enters_username_and_password() {
        // Write code here that turns the phrase above into concrete actions

    }

    @When("user clicks on the login button")
    public void user_clicks_on_the_login_button() {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("user is navigated to the home page")
    public void user_is_navigated_to_the_home_page() {
        // Write code here that turns the phrase above into concrete actions

    }

}
