package com.stepDefinitions;

import com.runner.BaseClass;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EnergyDetailPageStepDef extends BaseClass {
	
	
    

	@When("^I click on mandatory fields$")
	public void i_click_on_mandatory_fields() throws Throwable {
		supplierpage.enterValidPostCode();
		supplierpage.clickOnValidDetails();
		supplierpage.clickOnNextButton();
	    energydetailpage.clickOnMandatoryFields();
	}

	@When("^I enter details about electricity usage$")
	public void i_enter_details_about_electricity_usage() throws Throwable {
		energydetailpage.enterDetailsAboutElectricUsage();
	}

	@When("^I enters bill date$")
	public void i_enters_bill_date() throws Throwable {
		energydetailpage.entersBillDates();
		
		
	}
	
	@Then("^I should go to the next page after clicking next button$")
	public void i_should_go_to_the_next_page_after_clicking_next_button() throws Throwable {
		energydetailpage.shouldGoToTheNextPage();
		
		
	}
	
	@Given("^I am on gas detail page after giving all data$")
	public void i_am_on_gas_detail_page_after_giving_all_data() throws Throwable {
		supplierpage.enterValidPostCode();
		supplierpage.clickOnValidDetails();
		supplierpage.clickOnNextButton();
	    energydetailpage.clickOnMandatoryFields();
		energydetailpage.enterDetailsAboutElectricUsage();
	    energydetailpage.entersBillDates();
		energydetailpage.shouldGoToTheNextPage();
		energydetailpage.iAmOnGasDetailPage();
	}

	@When("^I click on valid details about gas usage$")
	public void i_click_on_valid_details_about_gas_usage() throws Throwable {
		energydetailpage.clickOnValidGasUsageDetails();
	    
	}

	@When("^I enter information about payment and date of bill$")
	public void i_enter_information_about_payment_and_date_of_bill(DataTable billPayDetails) throws Throwable {
		energydetailpage.iEnterInformationAboutPayAndDateOfBill(billPayDetails);
	}

	@When("^I click on the next button$")
	public void i_click_on_the_next_button() throws Throwable {
		energydetailpage.clickOnNextButton();
	}

	@Then("^should navigate to next page$")
	public void should_navigate_to_next_page() throws Throwable {
		energydetailpage.shouldNavigateToNextPage();
	}


}
