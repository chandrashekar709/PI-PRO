package com.orm.testcases;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.orm.base.BaseClass;
import com.orm.pageobjects.PropertyDetailsPageObjects;


public class PropertyDetailsTestcases extends BaseClass {
	PropertyDetailsPageObjects objPropertyDetailsPageObjects ;
	PropertyDetailsTestcases objPropertyDetailsTestcases;
	
	public PropertyDetailsTestcases()
	{
		super();
	}
	@BeforeMethod
	public  void propDetails() throws IOException, InterruptedException
	{
		//objPropertyDetailsTestcases=new PropertyDetailsTestcases();
		launchBrowser();
		objPropertyDetailsPageObjects=new PropertyDetailsPageObjects(driver);

		Thread.sleep(2000);
		objPropertyDetailsPageObjects.clicks();
		objPropertyDetailsPageObjects.mtValue(prop.getProperty("mv"));
		objPropertyDetailsPageObjects.sqrfValue(prop.getProperty("sf"));
		objPropertyDetailsPageObjects.pcodeVal(prop.getProperty("pincode"));
		objPropertyDetailsPageObjects.bldAge();
		objPropertyDetailsPageObjects.fldeft();
		objPropertyDetailsPageObjects.security();
		objPropertyDetailsPageObjects.salryPersn();
		objPropertyDetailsPageObjects.clickViewquotes();
		objPropertyDetailsPageObjects.selectYrs();
		objPropertyDetailsPageObjects.seltyrs();
		objPropertyDetailsPageObjects.clickBynow();
		
	}
		
	
	@Test
	public void display()
	{
		System.out.println("hello");
	}



}
