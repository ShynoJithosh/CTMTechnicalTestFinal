package com.constants;

import org.openqa.selenium.By;

public interface EnergyDetailPageConstants {
	
	By STANDARDTARIFFBUTTON = By.cssSelector("#EnergyComparison_HaveBill_YourEnergy_YourElectricity_WhatElectricityTariffAreYouOn_12042");
	By ECONOMYMETERQUESTIONBUTTON = By.cssSelector("#EnergyComparison_HaveBill_YourEnergy_YourElectricity_DoYouHaveAnEconomy7Meter_yes");
	By MONTHILYDEBITBUTTON = By.cssSelector("input[value='monthly-direct-debit']");
	By SOURCEOFHEATINGBUTTON = By.cssSelector("#EnergyComparison_HaveBill_YourEnergy_YourElectricity_IsElectricityYourMainSourceOfHeating_Yes");
	By ELECTRICUSAGEINPOUNDBUTTON = By.cssSelector("input[value='gbp']");
	By POUNDVALUEENTRY = By.cssSelector("input[type='text']");
	By PAYPERIODDROPDOWN = By.cssSelector("#EnergyComparison_HaveBill_YourEnergy_YourElectricity_WhatIsYourCurrentElectricityUsage_Pounds_Period");
	By DATEENTRY = By.cssSelector("input[name='DateInput__day']");
	By MONTHENTRY = By.cssSelector("input[name='DateInput__month']");
	By YEARENTRY = By.cssSelector("input[name='DateInput__year']");
	By ASSERTYOURELECTRICITY = By.cssSelector(".Section__header h2");
	By ENERGYPAGENEXTBUTTON = By.cssSelector("button[type='submit']");
	By STANDARDGASTARIFFBUTTON = By.cssSelector("#EnergyComparison_HaveBill_YourEnergy_YourGas_WhatGasTariffAreYouOn_12042");
	By GASUSAGEPOUNDBUTTON = By.cssSelector("input[value='gbp']");
	By GASPOUNDVALUEENTRY = By.cssSelector("input[type='text']");
	By GASPAYPERIODDROPDOWN = By.cssSelector("#EnergyComparison_HaveBill_YourEnergy_YourGas_WhatIsYourCurrentGasUsage_Pounds_Period");
	By ASSERTYOURGAS = By.cssSelector("h2");
	By GASPAGENEXTBUTTON = By.cssSelector("button[type='submit']");
	By ASSERTYOURPREFERENCES = By.cssSelector("h2");

}
