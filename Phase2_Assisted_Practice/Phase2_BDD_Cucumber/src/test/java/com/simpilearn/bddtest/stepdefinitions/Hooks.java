package com.simpilearn.bddtest.stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class Hooks {
	@Before
	public void beforeScenario() {
		System.out.println("--This will run before the scenario--");
	}
	@After
	public void afterScenario() {
		System.out.println("--This will run after the scenario--");
	}
	@BeforeStep
	public void beforeStep() {
		System.out.println("--Before step--");
	}
	@AfterStep
	public void afterStep() {
		System.out.println("--After step--");
	}
	@Before(value="@tag1")
	public void beforeTagScenario() {
		System.out.println("--Before Tag1 the scenario");
	}

	@After(value="@tag1")
	public void afterTagScenario() {
		System.out.println("--After Tag1 the scenario--");
	}
	@Before(value="@tag2 or @tag3")
	public void beforeTag2andTag3Scenario() {
		System.out.println("--Before Tag2 or Tag3 the scenario");
	}

	@After(value="@tag2 or @tag3")
	public void afterTag2andTag3Scenario() {
		System.out.println("--After Tag2 or Tag3 the scenario--");
	}
}
