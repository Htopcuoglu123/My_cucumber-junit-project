package com.cydeo.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/cucumber-report.html",
                "rerun:target/rerun.txt",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber",
                "json:target/cucumber-report.json"
        },
        features= "src/test/resources/features",
        glue="com/cydeo/step_definitions",
        dryRun =false,
        tags = "@Test",
        publish = true

)
public class CukesRunner {
}

//
//@CucumberOptions(
//        //We do not have to create a seperate CukesRunner for each feature file. We just need to change the tag
//        //  plugin = "html:target/cucumber-reports.html",
//        features="src/test/resources/features",//path of feature file-the business layer
//        //I need to run my feature files first so I can get the code snippets
//        glue="com/cydeo/step_definitions",
//        //path of StepDefinitions file-the implementation layer
//        //glue stands for step definition classes where I implement Java Selenium code
//        dryRun = true,
//        //dryRun =true will only run feature file to get the snippets for the ones that are not implemented yet
//        // so you can get you project ready to run
//        //dryRun=false -if you have all the snippets/once you get all the snippets added change dryRun to false
//        // so we can run the test
//        tags = "@wip"// we add the tags to our classes on Feature file to label them.
//        // When we want to run the certain ones we just copy and paste the tag to tags on
//        // our CukesRunner class



