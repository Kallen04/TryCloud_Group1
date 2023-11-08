package com.TryCloud_Group1.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json",
                "html:target/cucumber-reports.html",
                "rerun:target/rerun.txt",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber"
        },
        features = "src/test/resources/features",
        glue = "com/TryCloud_Group1/step_definitions",
        dryRun = false,

        tags = "@wip", //don't forget to change it to @wip before pushing to github,
        //this way the tag doesn't interact with any Scenario when someone uses it after updating the project


        publish = true //generating a report with public link
)
public class CukesRunner {}


