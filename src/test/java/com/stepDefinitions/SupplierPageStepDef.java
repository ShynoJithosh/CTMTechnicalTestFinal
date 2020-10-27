package com.stepDefinitions;

import com.runner.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SupplierPageStepDef extends BaseClass {
	
	@Given("^I am on home page$")
	public void i_am_on_home_page() throws Throwable {
		supplierpage.verifyHomePage();
	    
	}

	@When("^I enter a valid postcode$")
	public void i_enter_valid_postcode() throws Throwable {
	    supplierpage.enterValidPostCode();
	}

	@When("^I click on valid details$")
	public void i_click_on_valid_details() throws Throwable {
		supplierpage.clickOnValidDetails();
	   
	}

	@When("^I click on next button$")
	public void i_click_on_next_button() throws Throwable {
	    supplierpage.clickOnNextButton();
	    
	}

	@Then("^I should go to next page$")
	public void i_should_go_to_next_page() throws Throwable {
	    supplierpage.shouldGoToNextPage();
	}

}
