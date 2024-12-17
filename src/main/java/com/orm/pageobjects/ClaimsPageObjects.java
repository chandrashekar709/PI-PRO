package com.orm.pageobjects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orm.base.BaseClass;


public class ClaimsPageObjects extends BaseClass {
	

	public ClaimsPageObjects ()
	{
		
		PageFactory.initElements(driver, this);

	}
	
	
	@FindBy(xpath="//button[text()='Claims ']") 

	WebElement cusmobileno;
	
	
	@FindBy(xpath="//label[@for='image1']//span[@class='fw-bold fs-3']") 

	WebElement plussymbole;	
	
	
	@FindBy(xpath="//input[@type='date']") 

	WebElement date;	
	
	
	@FindBy(xpath="//textarea[@name=\"description\"]") 

	WebElement incident;	
	
	
	@FindBy(xpath="//textarea[@name='causeOfLoss']") 

	WebElement reason;	
	
	
	@FindBy(xpath="//textarea[@name='repairEstimates']") 

	WebElement firstdetail;	
	
	@FindBy(xpath="//textarea[@name='additionalDetails']") 

	WebElement seconddetail;	
	
	
	@FindBy(xpath="//textarea[@name='witnessStatement']") 

	WebElement thirddetail;	
	
	
	@FindBy(xpath="//button[text()='Submit Claim']") 

	WebElement submit;	



	
	
	
	
	public void clickClaims()
	{
		cusmobileno.click();
	}
	public void clickPlusSyb()
	{
		plussymbole.click();
	}
	public void clickDamageDetails()
	{
		date.sendKeys("10-12-2024");
		incident.sendKeys("damage");
		reason.sendKeys("heavy rain");

	}
	public void uploadimage() throws AWTException, InterruptedException
	{
		Robot obj=new Robot();
		obj.delay(1000);
		
		//below two statements copy the image
		StringSelection ss=new StringSelection("D:\\a.png"); // image location
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null); //image stored in clipboard
		//below two statements paste the image  
	    obj.keyPress(KeyEvent.VK_CONTROL);
	    obj.keyPress(KeyEvent.VK_V);
		obj.delay(2000);
	    obj.keyRelease(KeyEvent.VK_CONTROL);
	    obj.keyRelease(KeyEvent.VK_V);
		obj.delay(2000);
	     //enter key
	    obj.keyPress(KeyEvent.VK_ENTER);
	    
	    obj.keyRelease(KeyEvent.VK_ENTER);
	    driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);

	
		
	}
	public void first() throws InterruptedException
	{
		firstdetail.sendKeys("ten lakhs");

	}
	public void second()
	{
		seconddetail.sendKeys("hai");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

	}
	public void third()
	{

		thirddetail.sendKeys("heavy rain");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

	}

			
	
	public void clickSubmit() 
	{
        
	JavascriptExecutor js=(JavascriptExecutor)driver;
    driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

	js.executeScript("arguments[0].click();", submit);
  }
	
}
	
	


