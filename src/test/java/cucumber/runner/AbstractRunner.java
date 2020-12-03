package cucumber.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"classpath:features"},
        glue = {"cucumber.steps"},
        plugin = {"json:build/cucumber-report.json", "pretty",
                "de.monochromata.cucumber.report.PrettyReports:build/cucumber"
        }
)
public abstract class AbstractRunner {


}
