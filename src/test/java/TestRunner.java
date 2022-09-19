import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/main/resources/Features", glue={"stepDefinitions"}, monochrome = true,
        plugin = {"pretty","html:Report/report.html"})
public class TestRunner {

}

