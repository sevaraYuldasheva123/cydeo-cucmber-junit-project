package com.cydeo.step_definitions;

import com.cydeo.utilities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    //class that keeps pre and post conditions for all of the scenarios

    @Before
    public void setUpMethod(){
        System.out.println("--->@Before: RUNNING BEFORE EACH SCENARIO");
    }

    @After
    public void tearDownMethod(Scenario scenario){

        if (scenario.isFailed()) {
            //take the screenshot if scenario failed
            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());

        }

        System.out.println("--->@After: RUNNING AFTER EACH SCENARIO");
        Driver.closeDriver();
    }

    @BeforeStep
    public void setUpStep(){
        System.out.println("--->@BeforeStep: RUNNING BEFORE EACH STEP");
    }

    @AfterStep
    public void tearDownStep(){
        System.out.println("--->@AfterStep: RUNNING AFTER EACH STEP");
    }
}
