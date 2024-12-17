package com.orm.testcases;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.orm.base.BaseClass;
import com.orm.pageobjects.PropertyDetailsPageObjects;
import com.orm.pageobjects.SignupPageObjects;
public class SignupTestcases extends BaseClass {
	PropertyDetailsPageObjects objPropertyDetailsPageObjects ;
	SignupPageObjects objSignupPageObjects;
	
	public SignupTestcases()
	{
		super();
	}
	@BeforeMethod
	public  void propDetails() throws IOException, InterruptedException
	{
		//objPropertyDetailsTestcases=new PropertyDetailsTestcases();
		launchBrowser();
		objSignupPageObjects=new SignupPageObjects(driver);
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
		System.out.println("Hello world"+prop);
		System.out.println(objSignupPageObjects);
		objSignupPageObjects.entname(prop.getProperty("fullname"));
		System.out.println("Methods1 ");
		objSignupPageObjects.enteringmail(prop.getProperty("useremail"));
		objSignupPageObjects.clickotpbutton();
		objSignupPageObjects.copymailotp();
		objSignupPageObjects.veryfytextotp();
		objSignupPageObjects.entermobilefield(prop.getProperty("mobilenumber"));
		objSignupPageObjects.mobileOtpButtonClicking();
		objSignupPageObjects.copymobileotp();
		objSignupPageObjects.mobileOtpVreification();
		objSignupPageObjects.signUpSubmitButton();
	
	
	}
		
	@Test
	public void display()
	{
		System.out.println("hello");
	}

}
