package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
		features=".//Features/Login.feature",
		glue="stepDefinitions",
		dryRun=false,
		monochrome=true,
		plugin= {"pretty",
				"json:test-output/cucumber-report/cucumber.json",
				"html:test-output/cucumber-report/cucumber.html"}
		)
public class TestRunner_Login {

}
