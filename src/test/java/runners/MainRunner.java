package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(features = {"classpath:features"},glue = {"stepDefinitions"},
        tags = "",monochrome = true ,dryRun = false ,
        plugin = {"pretty","html:target/cucumber","json:target/cucumber.json"})
public class MainRunner extends AbstractTestNGCucumberTests {
    //to run parallel class
    @Override
    @DataProvider(parallel = false)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
