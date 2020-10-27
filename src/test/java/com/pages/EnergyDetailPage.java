package com.pages;

import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.constants.EnergyDetailPageConstants;
import com.runner.BaseClass;

import cucumber.api.DataTable;

public class EnergyDetailPage extends BaseClass {
	
	public void clickOnMandatoryFields() throws InterruptedException {
		Thread.sleep(3000);
		action.clickOnElement(EnergyDetailPageConstants.STANDARDTARIFFBUTTON);
		action.clickOnElement(EnergyDetailPageConstants.ECONOMYMETERQUESTIONBUTTON);
		action.scrollDown(EnergyDetailPageConstants.MONTHILYDEBITBUTTON);
		action.clickOnElement(EnergyDetailPageConstants.MONTHILYDEBITBUTTON);
		action.clickOnElement(EnergyDetailPageConstants.SOURCEOFHEATINGBUTTON);
	}
	
	public void enterDetailsAboutElectricUsage()  {
		action.clickOnElement(EnergyDetailPageConstants.ELECTRICUSAGEINPOUNDBUTTON);
		action.updateElement(EnergyDetailPageConstants.POUNDVALUEENTRY, "30");
		action.dropDownByIndex(EnergyDetailPageConstants.PAYPERIODDROPDOWN, 0);
	}
	
	public void entersBillDates() {
		
		action.updateElement(EnergyDetailPageConstants.DATEENTRY, "20");
		action.updateElement(EnergyDetailPageConstants.MONTHENTRY, "10");
		action.updateElement(EnergyDetailPageConstants.YEARENTRY, "2020");
		Assert.assertEquals("Your electricity", get.getElementText(EnergyDetailPageConstants.ASSERTYOURELECTRICITY));
	}
	
	public void shouldGoToTheNextPage() throws InterruptedException {
		Thread.sleep(3000);
		action.clickOnElement(EnergyDetailPageConstants.ENERGYPAGENEXTBUTTON);
		
		}
	
	public void iAmOnGasDetailPage() {
		wait.elementToBeClickable(EnergyDetailPageConstants.ASSERTYOURGAS, 10);
		Assert.assertEquals("Your gas", get.getElementText(EnergyDetailPageConstants.ASSERTYOURGAS));
		
	}
	
	public void clickOnValidGasUsageDetails() {
		action.clickOnElement(EnergyDetailPageConstants.STANDARDGASTARIFFBUTTON);
		action.clickOnElement(EnergyDetailPageConstants.MONTHILYDEBITBUTTON);
		}
	
	public void iEnterInformationAboutPayAndDateOfBill(DataTable billPayDetails) {
		
		action.clickOnElement(EnergyDetailPageConstants.GASUSAGEPOUNDBUTTON);
		Map<String, String>payBillDetails = billPayDetails.asMap(String.class, String.class);
		String GBP =payBillDetails.get("GBP");
		String Date =payBillDetails.get("date");
		String Month =payBillDetails.get("month");
		String Year =payBillDetails.get("year");
		action.updateElement(EnergyDetailPageConstants.GASPOUNDVALUEENTRY, GBP);
		action.dropDownByIndex(EnergyDetailPageConstants.GASPAYPERIODDROPDOWN, 0);
		action.updateElement(EnergyDetailPageConstants.DATEENTRY,  Date);
		action.updateElement(EnergyDetailPageConstants.MONTHENTRY, Month);
		action.updateElement(EnergyDetailPageConstants.YEARENTRY, Year);
	}
	
	public void clickOnNextButton() {
		action.clickOnElement(EnergyDetailPageConstants.GASPAGENEXTBUTTON);
	}
	
	public void shouldNavigateToNextPage() throws InterruptedException {
		wait.elementToBeLocated(EnergyDetailPageConstants.ASSERTYOURPREFERENCES, 10);
		 Assert.assertEquals("Your preferences", get.getElementText(EnergyDetailPageConstants.ASSERTYOURPREFERENCES));
	}

	

}
