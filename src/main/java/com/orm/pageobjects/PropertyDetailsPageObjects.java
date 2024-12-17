package com.orm.pageobjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.orm.base.BaseClass;

public class PropertyDetailsPageObjects extends BaseClass 
{
	public PropertyDetailsPageObjects(WebDriver driver)
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
	
	
}











	
	


