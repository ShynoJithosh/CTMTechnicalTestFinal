package com.constants;

import org.openqa.selenium.By;

public interface SupplierPageConstants {
	
	String baseURL = " https://energy.comparethemarket.com/energy/v2/?AFFCLIE=TSTT";
	String ASSERTURL = "https://energy-journey.comparethemarket.com/your-supplier?AFFCLIE=TSTT&wip=5f929c5dff1b846c3cf6a902";
	By POSTCODETEXTBOX = By.cssSelector("#EnergyComparison_YourSupplier_YourCurrentSupplier_WhatsYourPostcode");
	By FINDPOSTCODEBUTTON = By.cssSelector("#EnergyComparison_YourSupplier_YourCurrentSupplier_FindPostcode");
	By ENERGYBILLQUESTION = By.cssSelector("#EnergyComparison_YourSupplier_YourCurrentSupplier_DoYouHaveYourEnergyBill_YesIHaveMyBill");
    By COMPAREQUESTION =By.cssSelector("#EnergyComparison_YourSupplier_YourCurrentSupplier_WhatWouldYouLikeToCompare_GasElectricity");
    By SAMESUPPLIERQUESTION = By.cssSelector("input[value='true']");
    By SELECTENERGYSUPPLIER = By.cssSelector("#EnergyComparison_YourSupplier_YourCurrentSupplier_CurrentEnergySupplier");
    By NEXTBUTTON = By.cssSelector("button[type='submit']");
    By ASSERTBEENHEREBEFORE =By.cssSelector("h2");
    By ASSERTYOURELECTRICITY = By.cssSelector(".Section__header h2");
    
}
