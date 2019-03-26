package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/Features/GoogleFeatures.feature", 
		glue="StepDefinitions",
		plugin= {"pretty","html:test-outout","json:json_output/cucumber.json","junit:junit_xml/cucumber.xml"},
		monochrome=true,
		strict=false,
		dryRun=false
		)
public class MyTestRunner {

}
