package com.orm.testcases;

import java.awt.AWTException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.orm.base.BaseClass;
import com.orm.pageobjects.ClaimsPageObjects;
import com.orm.pageobjects.InvoiceDownloadpage;

public class ClaimsTestCases extends BaseClass {
	
	InvoiceDownloadpage objInvoiceDownloadpage;
	InvoiceDownloadTestCases objInvoiceDownloadTestCases;
	ClaimsPageObjects objClaimsPageObjects;
		
	@BeforeMethod

	public void loginDetails() throws InterruptedException, AWTException
	{
		launchBrowser();
		objInvoiceDownloadpage =new InvoiceDownloadpage();
		objClaimsPageObjects=new ClaimsPageObjects();
		objInvoiceDownloadpage.enterMobNum();
		objInvoiceDownloadpage.clickLogin();
		objInvoiceDownloadpage.clickLogo();
		objInvoiceDownloadpage.propertyInsuranceImage();
		objInvoiceDownloadpage.clickInvoice();
		
		objClaimsPageObjects.clickClaims();
		objClaimsPageObjects.clickPlusSyb();
		objClaimsPageObjects.clickDamageDetails();
		objClaimsPageObjects.uploadimage();
		objClaimsPageObjects.first();
		objClaimsPageObjects.second();
		objClaimsPageObjects.third();
		objClaimsPageObjects.clickSubmit();
	}
	 @Test
		public void display()
		
		{
			System.out.println("this is payment details test cases");
		}


}



