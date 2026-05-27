package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class CreateYourAccountPage {
    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"registration-heading\"]")
    WebElement registrationHeading;

    @FindBy(id = "register-group")
    WebElement groupName_id;

    public CreateYourAccountPage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyCreateYourAccountPageIsDisplayed() {
        registrationHeading.isDisplayed();
    }

    public void clickGroupDropdown() {
        groupName_id.click();
    }
}
