package com.orm.testcases;

import java.io.IOException;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.orm.base.BaseClass;
import com.orm.pageobjects.CustomerDetailsPageObjects;
import com.orm.pageobjects.PropertyDetailsPageObjects;
//import com.orm.pageobjects.RandEmailExp1;
import com.orm.pageobjects.SignupPageObjects;
import com.pi.utility.RandEmailExp1;

public class CustomerDetailsTestcases extends BaseClass {
	PropertyDetailsPageObjects objPropertyDetailsPageObjects ;
	SignupPageObjects objSignupPageObjects;
	CustomerDetailsPageObjects objCustomerDetailsPageObjects;
	public CustomerDetailsTestcases()
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
		objCustomerDetailsPageObjects=new  CustomerDetailsPageObjects(driver);
		
		
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
		//objSignupPageObjects.enteringmail(prop.getProperty("useremail"));
		
		//RANDOM EMAIL
		String email=RandEmailExp1.randomEmail();
				
		objSignupPageObjects.enteringmail(email);

		
		objSignupPageObjects.clickotpbutton();
		objSignupPageObjects.copymailotp();
		objSignupPageObjects.veryfytextotp();
		
		
		//RANDOM MOBILE NUMBER
		
		String mobilenNum=	RandEmailExp1.randomMobilenum();
		
		objSignupPageObjects.entermobilefield(prop.getProperty(""));
		
		
		
		
		
		
		objSignupPageObjects.mobileOtpButtonClicking();
		objSignupPageObjects.copymobileotp();
		objSignupPageObjects.mobileOtpVreification();
		objSignupPageObjects.signUpSubmitButton();
		objCustomerDetailsPageObjects.clickSalutation();
		objCustomerDetailsPageObjects.clickGender();
		objCustomerDetailsPageObjects.enterPanCardDetails(prop.getProperty("pancardnumber"));
		objCustomerDetailsPageObjects.enterDateOfBirthDetails(prop.getProperty("dateofbirth"));
		objCustomerDetailsPageObjects.enterhousenumberDetails(prop.getProperty("housenum"));
		objCustomerDetailsPageObjects.enterstreetnameDetails(prop.getProperty("nameofstreet"));
		objCustomerDetailsPageObjects.entercitynameDetails("nameofcity");
		objCustomerDetailsPageObjects.enterstatenameDetails(prop.getProperty("nameofstate"));
		objCustomerDetailsPageObjects.selectCurrentaddress();
		objCustomerDetailsPageObjects.paymentexp();
		objCustomerDetailsPageObjects.clickProceedPayment();
		
	}
	@Test
	public void display()
	{
		System.out.println("this is customer details test cases");
	}


}
