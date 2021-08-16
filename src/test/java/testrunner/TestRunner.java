package testrunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features/pets.feature",
        glue = {"stepDefinition"},
        plugin = {"pretty", "html:src/test/java/reports/test-output", "json:src/test/java/reports/cucumber.json", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        dryRun = false,
        monochrome = true
)
public class TestRunner {


}
