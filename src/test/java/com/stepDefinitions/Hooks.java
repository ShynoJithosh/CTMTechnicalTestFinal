package com.stepDefinitions;

import org.openqa.selenium.chrome.ChromeDriver;
import com.constants.SupplierPageConstants;
import com.runner.BaseClass;

import cucumber.api.java.Before;

public class Hooks extends BaseClass {
	
	
	 @Before
	    public static void initializedriver() {
	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\shyno\\eclipse-workspace\\CTMTechnicalTest\\src\\test\\resources\\drivers\\chromedriver.exe");
	        driver=new ChromeDriver();
	        driver.get(SupplierPageConstants.baseURL);
	        driver.manage().window().maximize();
	    }
//	    @After
//	    public void destroy() {
//	        driver.close();
//	    }

}
