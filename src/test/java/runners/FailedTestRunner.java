
	package runners;

	import io.cucumber.junit.Cucumber;
	import io.cucumber.junit.CucumberOptions;
	import org.junit.runner.RunWith;

	@RunWith(Cucumber.class)
	@CucumberOptions(
	        features = "@target/rerun.txt",
	        glue = {"stepDefinitions", "hooks"},
	        plugin = {
	                "pretty",
	                "html:target/cucumber-rerun-report.html",
	                "json:target/cucumber-rerun.json"
	        },
	        monochrome = true
	)


	public class FailedTestRunner {
	}


