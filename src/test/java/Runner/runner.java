package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"Steps"},
        plugin = {"pretty", "html:target/cucumber-reports.html"},
        monochrome = true,
        publish = true
)

public class runner extends AbstractTestNGCucumberTests {
}
