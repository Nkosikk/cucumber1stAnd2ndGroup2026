package Steps;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterTest;

public class stepsDef extends Base {


    @Given("i am on the login page")
    public void i_am_on_the_login_page() {
        homePage.clickLoginButton();
        loginPage.verifyLoginPageIsDisplayed();
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
        dashboardPage.verifyDashboardPageIsDisplayed();
    }


    @After
    public void closeBrowser() {
    }

    @And("I click on the logged in user")
    public void iClickOnTheLoggedInUser() {
        dashboardPage.clickUserMenuButton_xpath();

    }

    @And("I click on the admin panel")
    public void iClickOnTheAdminPanel() {
        dashboardPage.clickAdminPanelButton_xpath();

    }

    @And("I click on the groups tab")
    public void iClickOnTheGroupsTab() {
        dashboardPage.clickGroupsButton();
    }

    @And("I click on the create group button")
    public void iClickOnTheCreateGroupButton() {
        dashboardPage.clickCreateNewGroup();
    }

    @And("I enter group name (.*)$")
    public void iEnterGroupNameGroupName(String groupName)  {
        dashboardPage.groupNameInput(groupName);
    }

    @And("I enter group description (.*)$")
    public void iEnterGroupDescriptionGroupDescription(String groupDescription) throws InterruptedException {
        dashboardPage.groupDescriptionArea(groupDescription);
    }

    @And("I enter year (.*)$")
    public void iEnterYear(String year) throws InterruptedException {
        dashboardPage.enterGroupYear(year);
    }

    @And("I enter max capacity (.*)$")
    public void iEnterMaxCapacityMaxCapacity(String maxCapacity) {
        dashboardPage.enterMaxCapacity(maxCapacity);
    }

    @And("I enter start date (.*)$")
    public void iEnterStartDateStartDate(String startDate) {
        dashboardPage.enterStartDate(startDate);
    }

    @And("I enter end date (.*)$")
    public void iEnterEndDateEndDate(String endDate) {
        dashboardPage.enterEndDate(endDate);

    }

    @When("I click on the create group button and confirm the creation")
    public void i_click_on_the_create_group_button_and_confirm_the_creation() {
        dashboardPage.clickCreateGroupButton();
    }

    @Then("i should see the group created successfully")
    public void iShouldSeeTheGroupCreatedSuccessfully() {
        dashboardPage.verifyGroupIsCreated("Test Group2026");

    }

    @And("I should go back to Website home page")
    public void i_should_go_back_to_website_home_page() {
        dashboardPage.clickBackToWebsiteButton();

    }

    @And("I click on the Menu Button")
    public void i_click_on_the_menu_button() {
        dashboardPage.userClicksMenuButton();
    }
    @And("I click on the logout button")
    public void i_click_on_the_logout_button() {
        dashboardPage.userClicksLogoutButton();

    }

    @Then("I click on the Sign Up Here Link")
    public void i_click_on_the_sign_up_here_link() {
        signUpPage.clickSignUpToggleButton();

    }

    @Then("I should be on the registration page")
    public void i_should_be_on_the_registration_page() {

    }

    @Then("I verify that the group created is visible in the registration page")
    public void i_verify_that_the_group_created_is_visible_in_the_registration_page() {

    }




    @AfterStep
    public void addScreenshots(Scenario scenario) {
        if (scenario.isFailed()) {
            byte[] screenshots = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshots, "image/png", "image");
        }
    }


}