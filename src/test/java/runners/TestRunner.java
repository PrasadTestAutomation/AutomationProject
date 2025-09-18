package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",    // Path to your feature files
        glue = {"stepdefinitions"},
        plugin = {"pretty",
                "html:target/cucumber-reports/cucumber-html-report.html",
                "json:target/cucumber-reports/cucumber.json"},
        monochrome = true
)
public class TestRunner extends AbstractTestNGCucumberTests {
    // No need to write anything inside, AbstractTestNGCucumberTests handles everything
}

