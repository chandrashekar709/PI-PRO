package com.orm.testcases;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.orm.base.BaseClass;
import com.orm.pageobjects.CustomerDetailsPageObjects;
import com.orm.pageobjects.PaymentPageObjects;
import com.orm.pageobjects.PropertyDetailsPageObjects;
//import com.orm.pageobjects.RandEmailExp1;
import com.orm.pageobjects.SignupPageObjects;

public class PaymentPageTestCases extends BaseClass {
	
	PropertyDetailsPageObjects objPropertyDetailsPageObjects ;
	SignupPageObjects objSignupPageObjects;
	CustomerDetailsPageObjects objCustomerDetailsPageObjects;
	PaymentPageObjects objPaymentPageObjects;
	public PaymentPageTestCases()
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
		objPaymentPageObjects=new PaymentPageObjects(driver);
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
		objCustomerDetailsPageObjects.clickSalutation();
		objCustomerDetailsPageObjects.clickGender();
		objCustomerDetailsPageObjects.enterPanCardDetails(prop.getProperty("pancardnumber"));
		objCustomerDetailsPageObjects.enterDateOfBirthDetails(prop.getProperty("dateofbirth"));
		objCustomerDetailsPageObjects.enterhousenumberDetails(prop.getProperty("housenum"));
		objCustomerDetailsPageObjects.enterstreetnameDetails(prop.getProperty("nameofstreet"));
		objCustomerDetailsPageObjects.entercitynameDetails("nameofcity");
		objCustomerDetailsPageObjects.enterstatenameDetails(prop.getProperty("nameofstate"));
		objCustomerDetailsPageObjects.selectCurrentaddress();
		System.out.println("click payment ");
		//objCustomerDetailsPageObjects.paymentexp();
		System.out.println("after click payment");
		objCustomerDetailsPageObjects.clickProceedPayment();
		objPaymentPageObjects.enteringFrame();
		objPaymentPageObjects.paymentopt();
	}
	@Test
	public void display()
	{
		System.out.println("this is payment details test cases");
	}
		
}
