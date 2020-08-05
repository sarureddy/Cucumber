package com.capg.bdd.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Features",glue="com.capg.bdd.stepDef",dryRun=false)
public class TestRunner {

}
