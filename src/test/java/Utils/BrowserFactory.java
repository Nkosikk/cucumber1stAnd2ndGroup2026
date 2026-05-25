package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserFactory {

    static WebDriver driver;

    public static WebDriver startBrowser(String browserChoice, String url) {

        boolean headless = Boolean.parseBoolean(
                System.getProperty("headless", "false")
        );

        if (browserChoice.equalsIgnoreCase("chrome")) {

            ChromeOptions chromeOptions = new ChromeOptions();

//            if (headless) {
//                chromeOptions.addArguments("--headless=new");
//            }
            chromeOptions.addArguments("--headless=new");
            chromeOptions.addArguments("--no-sandbox");
            chromeOptions.addArguments("--disable-dev-shm-usage");
            chromeOptions.addArguments("--window-size=1920,1080");
            chromeOptions.addArguments("--disable-gpu");
            driver = new ChromeDriver(chromeOptions);

        } else if (browserChoice.equalsIgnoreCase("edge")) {

            EdgeOptions edgeOptions = new EdgeOptions();

            if (headless) {
                edgeOptions.addArguments("--headless=new");
            }

            driver = new EdgeDriver(edgeOptions);

        } else {

            driver = new SafariDriver();
        }

        driver.manage().window().maximize();
        driver.get(url);

        return driver;
    }
}