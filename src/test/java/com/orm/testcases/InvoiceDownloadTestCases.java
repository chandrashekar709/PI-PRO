package com.orm.testcases;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.orm.base.BaseClass;
import com.orm.pageobjects.CustomerDetailsPageObjects;
import com.orm.pageobjects.InvoiceDownloadpage;
import com.orm.pageobjects.PaymentPageObjects;
import com.orm.pageobjects.PropertyDetailsPageObjects;
import com.orm.pageobjects.SignupPageObjects;
public class InvoiceDownloadTestCases extends BaseClass {
	InvoiceDownloadpage objInvoiceDownloadpage;
	InvoiceDownloadTestCases objInvoiceDownloadTestCases;
		
	@BeforeMethod

	public void loginDetails() throws InterruptedException
	{
		launchBrowser();
		objInvoiceDownloadpage =new InvoiceDownloadpage();
		objInvoiceDownloadpage.clickLogin();
		objInvoiceDownloadpage.clickLogo();
		objInvoiceDownloadpage.propertyInsuranceImage();
		objInvoiceDownloadpage.clickInvoice();
	}
	 @Test
		public void display()
		
		{
			System.out.println("this is payment details test cases");
		}


}
