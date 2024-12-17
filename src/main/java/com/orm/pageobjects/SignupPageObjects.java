package com.orm.pageobjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.orm.base.BaseClass;

public class SignupPageObjects extends BaseClass 
{
	//WebDriver driver;
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	public SignupPageObjects(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

@FindBy(xpath="//a[@class=' text-decoration-none ']") 
	
	WebElement clickbutton;	

@FindBy(xpath="//input[@name='marketValue']") 

WebElement marketValue;	
@FindBy(xpath="//input[@name='squareFeet']") 

WebElement squareFeetValue;	

@FindBy(xpath="//input[@name='pincode']") 

WebElement pincode;	

@FindBy(xpath="//select[@id='age']") 

WebElement ageofBuilding;	

@FindBy(xpath="//select[@id='effect']") 

WebElement floodeft;	

@FindBy(xpath="//select[@id='security']") 

WebElement security;	


@FindBy(xpath="//select[@id='person']") 

WebElement salPerson;	


@FindBy(xpath="//div[@role='button']") 

WebElement selctyr;	

@FindBy(xpath="//li[@role='option'][1]") 

WebElement selectyr;	


@FindBy(xpath="//button[@class='btn btn-primary rounded buy shadow fw-bold']") 

WebElement clickBuynow;	


@FindBy(xpath="//input[@placeholder=' Full Name As Per Pan Card']") 

WebElement entername;


@FindBy(xpath="//input[@placeholder=' Mail-Id']") 

WebElement email;


@FindBy(xpath="//button[@class='btn btn-success px-3 py-2 rounded mt-2 fw-bold shadow verification' and text()='send OTP']")

WebElement otp;	


@FindBy(xpath="//button[text()='Verify OTP']") 

WebElement verifyotp;


@FindBy(xpath="//input[@placeholder=' Mobile No.']") 

WebElement entermobilenum;

@FindBy(xpath="//button[text()='send OTP']") 

WebElement clickmobileotpbutton;


@FindBy(xpath="//button[text()='Verify OTP']") 

WebElement verifymobileotp;

@FindBy(xpath="//input[@type='submit']") 

WebElement clicksubmitbutton;












	
	public void clicks()
	{
		clickbutton.click();
	}
	public void mtValue(String str)
	{
		marketValue.sendKeys(str);
	}
	public void sqrfValue(String val)
	{
		squareFeetValue.sendKeys(val);
	}
	public void pcodeVal(String pinval)
	{
		pincode.sendKeys(pinval);
	}
	
	public void bldAge()
	{
		Select obj=new Select(ageofBuilding);

		obj.selectByValue("0 to 5 Years");
	}
	public void fldeft()
	{
		Select obj1=new Select(floodeft);
		obj1.selectByValue("No");
	}
	public void security()
	{
		Select obj2=new Select(security);
		obj2.selectByValue("Yes");
	}
	public void salryPersn()
	{
		Select obj3=new Select(salPerson);
		obj3.selectByValue("Yes");

	}
	public void clickViewquotes()
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.getElementsByClassName('btn btn-primary mt-5 fs-5 px-5 fw-bold')[0].click()");
			
	}
	public void selectYrs()
	{
		selctyr.click();
		
	}
	public void seltyrs()
	{
		selectyr.click();
		
	}
	public void clickBynow()
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", clickBuynow);
	}
	
	//signup page

		public void entname(String fname)
		{
			//PageFactory.initElements(driver, this);
			
			System.out.println("Enter Method");
			System.out.println("Fname "+fname);

			entername.sendKeys(fname);

		}
		public void enteringmail(String id)
		{
			email.sendKeys(id);

		}
		public void clickotpbutton()
		{
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].click();", otp);

		}
		public void copymailotp()
		{
			//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			WebElement textElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h3[@class='text-danger'])[1]"))); 
			 String copiedText = textElement.getText();
		        System.out.println("Copied Text: " + copiedText);
		         WebElement otpField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@type='text'])[1]")));
		         otpField.sendKeys(copiedText);
		}

		public void veryfytextotp()
		{
			verifyotp.click();

		}
		public void entermobilefield(String mobileno)
		{
			entermobilenum.sendKeys(mobileno);

		}
		public void mobileOtpButtonClicking()
		{
			clickmobileotpbutton.click();
		}

		public void copymobileotp()
		{
			WebElement textElement1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h3[@class='text-danger'])[2]")));
		    String copiedText1 = textElement1.getText();
	        System.out.println("Copied Text: " + copiedText1);
	         WebElement otpField1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='text'][1]")));
	         otpField1.sendKeys(copiedText1);
		}

		public void mobileOtpVreification()
		{
			verifymobileotp.click();
								
		}
		public void signUpSubmitButton()
		{
			clicksubmitbutton.click();
		}



	
	
}











	
	


