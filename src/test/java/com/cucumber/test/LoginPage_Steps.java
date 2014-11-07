package com.cucumber.test;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPage_Steps {
	
	WebDriver driver;
	
	@When("^I am on home page$")
	public void I_am_on_home_page() throws Throwable {
	   HomePage page = new HomePage(driver);
	    page.navigateToHomepage();
	    assertEquals("SPORTS195 | Official Site",page.getTitle());
	}

	@Then("^I click on Login button$")
	public void I_click_on_Login_button() throws Throwable {
		HomePage page = new HomePage(driver);
		page.clickOnLogin();
	}

	@Then("^I Log into the site$")
	public void I_Log_into_the_site() throws Throwable {
	    LoginPage page = new LoginPage(driver);
	    page.fillFormwithData();
	    page.clickOnLogin();
	}
	
	@Before
	public void startUp(){
		driver = new FirefoxDriver();
	}
	
	
	@After
	public void tearDown() {
		driver.quit(); 
	}
	
}
