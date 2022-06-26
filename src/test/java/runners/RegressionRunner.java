package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features={"src/test/resources/features/regression"
        },
        glue = "stepdefinitions",
        dryRun = false,
        tags = "",
        plugin={"html:target\\cucumber-reports.html",
                "json:target/cucumber.json",
                "rerun:target/rerun.txt"
        }
)
public class RegressionRunner {
}
