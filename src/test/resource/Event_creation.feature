@event_creation
Feature: As a User
  I am able to create event from League profile and update the scorecard

  Background: 
    When I am on home page
    Then I click on Login button
    And I Log into the site

  Scenario: Create an Event from League profile
    When I search for league and navigate to league profile
    Then I click on Results tab
    And I click on Add a New Event tab
    And I go through the create an event form
    And I should arrive on the newly created event preview page
    And I associate the participants to the event
    And I edit the scorecard of the event
