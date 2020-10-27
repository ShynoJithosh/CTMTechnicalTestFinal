package com.pages;

import org.junit.Assert;

import com.constants.SupplierPageConstants;
import com.runner.BaseClass;

public class SupplierPage extends BaseClass {
	
	public void verifyHomePage() {
		Assert.assertEquals("https://energy-journey.comparethemarket.com/your-supplier?AFFCLIE=TSTT&wip=5f929c5dff1b846c3cf6a902", SupplierPageConstants.ASSERTURL);
	}
	
	public void enterValidPostCode() {
		action.updateElement(SupplierPageConstants.POSTCODETEXTBOX, "PE26YS");
		action.clickOnElement(SupplierPageConstants.FINDPOSTCODEBUTTON);
	}
	
	public void clickOnValidDetails() {
		action.clickOnElement(SupplierPageConstants.ENERGYBILLQUESTION);
		action.clickOnElement(SupplierPageConstants.COMPAREQUESTION);
		action.scrollDown(SupplierPageConstants.SAMESUPPLIERQUESTION);
		action.clickOnElement(SupplierPageConstants.SAMESUPPLIERQUESTION);
		wait.elementToBeClickable(SupplierPageConstants.SELECTENERGYSUPPLIER, 10);
		action.clickOnTheElementByIndex(SupplierPageConstants.SELECTENERGYSUPPLIER, 0);
		Assert.assertEquals("Been here before?", get.getElementText(SupplierPageConstants.ASSERTBEENHEREBEFORE));
		
	}
	
	public void clickOnNextButton() {
		action.clickOnElement(SupplierPageConstants.NEXTBUTTON);
	}
	
	public void shouldGoToNextPage() {
		
		wait.elementToBeClickable(SupplierPageConstants.ASSERTYOURELECTRICITY, 10);
		Assert.assertEquals("Your electricity", get.getElementText(SupplierPageConstants.ASSERTYOURELECTRICITY));
		
	}

}
