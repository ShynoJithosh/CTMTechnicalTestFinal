package com.driver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.runner.BaseClass;

public class Action extends BaseClass {
	
	public void updateElement(By elementName, String keyword){
        driver.findElement(elementName).clear();
        driver.findElement(elementName).sendKeys(keyword);
    }

    public void clickOnElement(By elementName) {
         driver.findElement(elementName).click();
    }
    
    public void clickOnTheElementByIndex(By elementName,int index) {
		driver.findElements(elementName).get(index).click();
	}
	public void  scrollDown(By elementName) {
		WebElement element = driver.findElement(elementName);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
	}
	
	public void dropDownByIndex(By elementName, int index) {
		Select DropDown = new Select(driver.findElement(elementName));
		DropDown.selectByIndex(index);
	}


}
