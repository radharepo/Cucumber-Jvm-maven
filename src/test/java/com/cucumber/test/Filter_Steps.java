package com.cucumber.test;

import org.openqa.selenium.WebDriver;

import pageObjects.MyfeedPage;
import pageObjects.SearchQueryPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class Filter_Steps extends AbstractPageStepDefinition {
	
	WebDriver driver = getDriver();
	
	
	 
	@Then("^I would arrive on Homepage$")
	public void I_would_arrive_on_Homepage() throws Throwable {
		Thread.sleep(10000);
	    MyfeedPage page = new MyfeedPage(driver);
	    /* page.click_on_activity(); */
	    /* page.clickOnAllFiters(); */
	    page.Myfeed_wall_filter();
	}
	
	
	@And("^I click on MYFEED$")
	public void I_click_on_MYFEED() throws Throwable {
		Thread.sleep(10000);
		SearchQueryPage page = new SearchQueryPage(driver);
		page.searchQuery();
		Thread.sleep(10000);
		page.select_result();
	   
	}
	
	
	/*
	@And("^I Filter MYFEED with available filters$")
	public void I_Filter_MYFEED_with_available_filters() throws Throwable {
	        
	}	
	*/

}
