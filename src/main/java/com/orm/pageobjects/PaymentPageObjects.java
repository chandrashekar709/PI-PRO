package com.orm.pageobjects;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.orm.base.BaseClass;

public class PaymentPageObjects extends BaseClass {
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	JavascriptExecutor js=(JavascriptExecutor)driver;


	public PaymentPageObjects(WebDriver driver)
	{
		//this.driver=driver;
		PageFactory.initElements(driver, this);
	}


//PAYMENT DETAILS PAGE

@FindBy(xpath="//iframe[@class='razorpay-checkout-frame']") 

WebElement switchframe;


@FindBy(xpath="//div[@data-value='netbanking']") 

WebElement clicking;

@FindBy(xpath="//div[@data-value='CNRB']") 

WebElement clickPaymentOpt;


@FindBy(xpath="//button[@class='success']") 

WebElement successbutton;
				
		//payment details page
		
		public void enteringFrame()
		{

			driver.switchTo().frame(switchframe);
			WebElement textElement3 = wait.until(ExpectedConditions.elementToBeClickable(clicking));
			textElement3.click();
			
		}
		
		public void paymentopt()
		{
			String parent_win= driver.getWindowHandle();
			clickPaymentOpt.click();
			
			Set<String>allwindow=driver.getWindowHandles();

			for(String handle:allwindow) 
			{

			if(!handle.equalsIgnoreCase(parent_win)) 
			{	

			driver.switchTo().window(handle);

			WebElement chandu = wait.until(ExpectedConditions.elementToBeClickable(successbutton));

			chandu.click();
			}
			}
			
		}
		
		
			 
			
			
			}

			


							
			
			
		
		
		



	
	
	
	
	

	
	


