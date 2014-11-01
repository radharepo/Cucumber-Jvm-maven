package com.cucumber.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		dryRun = false,
		/*if strict is TRUE then it will make build fail  until all step definition implemented*/
		/*if strict is FALSE then it will make build success  irrespective to the definition implemented*/
		strict = true, 
		features = "src/test/resource", 
		glue = "com.cucumber.test", 
		tags = {
		"~@wip","@login"}, 
		monochrome = true, 
		format = {
				"pretty",
				"html:target/cucumber",
				"json:target_json/cucumber.json",
				"junit:taget_junit/cucumber.xml"
				}
		)
public class CuckerRunner {
}
