package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class LoginPage {
    WebDriver driver;

    @FindBy(xpath = "//span[normalize-space()='Access Learning Materials']")
    WebElement loginHeading_xpath;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickLoginButton() {
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(visibilityOf(loginHeading_xpath));
        loginHeading_xpath.isDisplayed();
    }

    
}
