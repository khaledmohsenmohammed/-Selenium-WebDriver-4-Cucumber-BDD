package stepDefinitions.base;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.sql.Timestamp;

import static driver.DriverFactory.cleanUpDriver;
import static driver.DriverFactory.getDriver;

public class Hooks {
    @Before//to open Browser
    public void setDriver() {
        getDriver();
    }
    //to take the
    @AfterStep
    public void captureExceptionImage (Scenario scenario) {
        if(scenario.isFailed()){
            Timestamp timestamp = new Timestamp(System.currentTimeMillis());
            String timeMillis = Long.toString(timestamp.getTime());

            //take screen shout
            byte[] screenshot =  ((TakesScreenshot) getDriver())
                    .getScreenshotAs(OutputType.BYTES);

            scenario.attach(screenshot , "image/png" , timeMillis);
        }
    }
    @After //to closed Browser
    public void tearDown (){
        cleanUpDriver();
    }

}
