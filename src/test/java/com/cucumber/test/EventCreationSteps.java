package com.cucumber.test;

import org.openqa.selenium.WebDriver;

import pageObjects.EventCreateFormPage;
import pageObjects.LeaguePage;
import pageObjects.SearchQueryPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EventCreationSteps extends AbstractPageStepDefinition {
	
	WebDriver driver = getDriver();
	
	@When("^I search for league and navigate to league profile$")
	public void I_search_for_league_and_navigate_to_league_profile() throws Throwable {
		SearchQueryPage page = new SearchQueryPage(driver);
		page.searchQuery();
		Thread.sleep(10000);
		page.select_result();
	}

	@Then("^I click on Results tab$")
	public void I_click_on_Results_tab() throws Throwable {
	    LeaguePage page = new LeaguePage(driver);
	    page.navigateToResultsPage();
	}

	@Then("^I click on Add a New Event tab$")
	public void I_click_on_Add_a_New_Event_tab() throws Throwable {
		LeaguePage page = new LeaguePage(driver);
		page.createNewEvent();
	
	}

	@Then("^I go through the create an event form$")
	public void I_go_through_the_create_an_event_form() throws Throwable {
		EventCreateFormPage page = new EventCreateFormPage(driver);
		page.selectSportEventtype();
		Thread.sleep(1000);
		page.addEventName();
		page.selectDate();		
		Thread.sleep(1000);	
		page.selectVenue();
		page.clickOnSave();
	}

	@Then("^I should arrive on the newly created event preview page$")
	public void I_should_arrive_on_the_newly_created_event_preview_page() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@Then("^I associate the participants to the event$")
	public void I_associate_the_participants_to_the_event() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@Then("^I edit the scorecard of the event$")
	public void I_edit_the_scorecard_of_the_event() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

}
