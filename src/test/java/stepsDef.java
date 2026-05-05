import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class stepsDef {

    WebDriver driver;

    @Given("i am on the login page")
    public void i_am_on_the_login_page() {

        driver= new ChromeDriver();
        driver.get("https://ndosisimplifiedautomation.vercel.app/");
        driver.manage().window().maximize();
        driver.quit();

    }
    @And("I enter email email")
    public void i_enter_email_email() {


    }
    @And("I enter password password")
    public void i_enter_password_password() {

    }
    @When("I click login button")
    public void i_click_login_button() {

    }
    @Then("i should be logged in successfully")
    public void i_should_be_logged_in_successfully() {

    }

}
