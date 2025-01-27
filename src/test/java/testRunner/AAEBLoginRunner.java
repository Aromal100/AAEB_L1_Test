package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="./Features/AAEBLogin.feature",
		glue="testCases",
		plugin= {"pretty","html:target/cucumber_AAEBLogin.html"}
		)



public class AAEBLoginRunner extends AbstractTestNGCucumberTests {

}
