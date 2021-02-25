package runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

//Is the bridge between feature file and steps where test cases are executed,has runtime configurations
//Runtime configuration is created in login.feature, similar to the loginrunners.java. so we can run with cucumber too using tags
//features = "./src/test/java/features/feature (then all feature class will appear) eg: all 50 feature files will appear
//Using tags
//{"@smoketest", "@sprint1"} means add all feature files having the tags will run
//{"@smoketest, @sprint1"} means or so which ever feature file has the either of the tags will run

@RunWith(Cucumber.class)
@CucumberOptions(features = "./src/test/java/features/login.feature",
 tags = {"@dashboard"},
 glue = {"steps" },
 dryRun = false,
 monochrome = true,
 plugin = {"pretty", "html:test-output"}
 )

public class LoginRunners {

}
