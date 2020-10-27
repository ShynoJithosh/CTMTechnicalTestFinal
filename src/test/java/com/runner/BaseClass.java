package com.runner;

import org.openqa.selenium.WebDriver;

import com.driver.Action;
import com.driver.Get;
import com.driver.Wait;
import com.pages.EnergyDetailPage;
import com.pages.SupplierPage;

public class BaseClass {
	
	public static WebDriver driver;
	public static SupplierPage supplierpage = new SupplierPage();
	public static Action action = new Action();
    public static Get get = new Get();
    public static Wait wait = new Wait();
    public static EnergyDetailPage energydetailpage = new EnergyDetailPage();

}
