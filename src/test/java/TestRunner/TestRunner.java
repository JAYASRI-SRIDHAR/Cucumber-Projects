package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\jayas\\eclipse-workspace\\SeleniumCucumber\\src\\test\\resources\\features\\primary.feature",
		glue="StepDefs"
		)
public class TestRunner {

}
