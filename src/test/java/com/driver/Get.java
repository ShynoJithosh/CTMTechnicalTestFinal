package com.driver;

import org.openqa.selenium.By;

import com.runner.BaseClass;

public class Get extends BaseClass {
	
	public String getElementText(By elementName) {
		return driver.findElement(elementName).getText();
	}

}
