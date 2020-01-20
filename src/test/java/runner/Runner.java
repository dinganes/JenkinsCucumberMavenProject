package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(

		features = "./FeatureFile/login.feature",

		glue = "StepDefinition",

		dryRun = false)

public class Runner {

}