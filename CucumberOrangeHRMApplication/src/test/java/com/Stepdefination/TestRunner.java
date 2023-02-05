package com.Stepdefination;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="OrangeHRMApplication",
                                glue="com.Stepdefination",monochrome=true,
                                //dryRun=true)
                                //tags="@Smoke"
                                tags="@Smile")


public class TestRunner {

}
