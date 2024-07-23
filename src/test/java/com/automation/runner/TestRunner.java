package com.automation.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com.automation.steps",
        plugin = {"html:target/report.html", "json:target/cucumber.json"}
//        tags = "@WIP",
//        dryRun = true
)
public class TestRunner {

}
