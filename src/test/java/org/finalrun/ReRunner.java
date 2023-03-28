package org.finalrun;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="@Rerun\\fb.txt",glue ="org.stepdefinition")

public class ReRunner {
	

}
