package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"pretty","html:target\\Pcucumber-reports1.html",
                "json:target/cucumber/cucumber.json",
                "junit:target/cucumber/cucumber.xml"},
        features="src/test/resources/features",
        glue = "stepdefinitions",
        tags="",
        dryRun = false
)

public class Runner {

}
