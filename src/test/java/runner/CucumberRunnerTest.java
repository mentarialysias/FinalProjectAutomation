package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(tags = "@TC09",
                 features = "src/test/resources/",
                 glue = {"stepdefinitions/LogoutSteps"},
                 monochrome = true,
                 plugin = {"html:target/HtmlReports/report.html",
                 		"json:target/JSonReports/report.json",
                 		"junit:target/JUnitReports/report.xml",
				 		"pretty",}
                 )
public class CucumberRunnerTest {

}


