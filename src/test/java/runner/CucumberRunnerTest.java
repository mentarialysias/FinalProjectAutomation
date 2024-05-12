package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(tags = "", 
                 features = "src/test/resources/LoginPage.feature", 
                 glue = {"stepdefinitions"},
                 monochrome = true,
                 plugin = {"html:target/HtmlReports/report.html",
                 		"json:target/JSonReports/report.json",
                 		"junit:target/JUnitReports/report.xml",}
                 )
public class CucumberRunnerTest {

}
