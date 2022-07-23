package com.cydeo.step_definitions;

import com.cydeo.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @Before//Before method is coming from cucumber.java and, it runs before each scenario
    public void setupScenario(){
        System.out.println("-->It is coming from @Before in Hooks");
    }


    @After//After method is coming from cucumber.java and, it runs after each scenario
    public void tearDownScenario(Scenario scenario){
        System.out.println("-->It is coming from @After in Hooks");


    if(scenario.isFailed()) {
    byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
    //We store bytes of our screenshots in  byte array
    scenario.attach(screenshot, "image/png", scenario.getName());
    }

        Driver.closeDriver();
    }
}
