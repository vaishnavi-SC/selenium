package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/LoginFeature/LoginFile.feature",
		//glue="stepDef",
		//features="C:\\Users\\ADMIN\\git\\repository\\Login\\src\\test\\java\\LoginFeature\\Tagging.feature",
		glue="stepDef",
		plugin= {"pretty","html:test-outout","json:json_output/cucumber.json","junit:junit_xml/cucumber.xml"},
		monochrome=true,
		strict=false,
		dryRun=false
		//tags="@sanityTest"
		//tags= {"@sanityTest"}
		)
public class LoginRunner {

}
