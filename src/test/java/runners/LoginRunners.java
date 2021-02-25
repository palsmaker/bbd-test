package runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
//Stepdefination can be run through runer and also through features with the cucumber plugins
//Is the bridge between feature file and steps where test cases are executed,has runtime configurations
//Runtime configuration is created in login.feature, similar to the loginrunners.java. so we can run with cucumber too using tags
//features = "./src/test/java/features/feature (then all feature class will appear) eg: all 50 feature files will appear
//Using tags
//{"@smoketest", "@sprint1"} means add all feature files having the tags will run
//{"@smoketest, @sprint1"} means or so which ever feature file has the either of the tags will run

@RunWith(Cucumber.class)
@CucumberOptions(features = "./src/test/java/features/",
 tags = {"@smoke", "@sprint"}, 
 glue = {"steps" },
 dryRun = false,
 monochrome = true,
 plugin = {"pretty", "html:test-output"}
 )

public class LoginRunners {

}

//tags = {"@smoke, @sprint"} this is OR
//tags = {"@smoke", "@sprint"} this is and
//based on the criticality of the test script we can use tags to prioritize
//can be used with cucumber and command prompt as well
//Hooks is used for prerequisites of a class for eg @Before and @After methods can be in a hooks separate java class 
//DataDriven = getting data from some data source
//keyword driven = using some keywords, for example browser we can use url for the test case, creating a level of obstruction
//BDD framework
//Hybrid (BDD with datasource)
