package com.simpilearn.bddtest.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resource/Features/login.feature",
glue={"com/simpilearn/bddtest/stepdefinitions/"})
public class LoginTestRunner {

}
