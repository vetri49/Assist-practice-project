package com.simpilearn.bddtest.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resource/Features/tags-ex.feature",
glue={"com/simpilearn/bddtest/stepdefinitions"},
tags="not @SmokeTest and @RegressionTest" )

public class SmokeTestRunner {
	

}
