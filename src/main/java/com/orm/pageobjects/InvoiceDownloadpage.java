package com.orm.pageobjects;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.orm.base.BaseClass;

public class InvoiceDownloadpage extends BaseClass {
	public InvoiceDownloadpage ()
	{
		
		PageFactory.initElements(driver, this);

	}
	
	
	@FindBy(xpath="//input[@id='outlined-basic']") 

	WebElement cusmobileno;	
	
	@FindBy(xpath="//button[text()='Send OTP']") 

	WebElement sendotpbutton;	
	
	
	@FindBy(xpath="//button[@class='btn btn-info text-nowrap fw-bold shadow ms-1']") 

	WebElement login;	

	@FindBy(xpath="//img[@class='rounded w-75 mt-1 ms-5']") 

	WebElement image;	
	
	@FindBy(xpath="//img[@class='img-fluid aspect-ratio-4-3 mx-1']") 

	WebElement pilogo;	
	
	@FindBy(xpath="//a[@download='invoice']") 

	WebElement invoice;	



	
	
	
	
	//WebDriver driver=new ChromeDriver();


	
	public void enterMobNum() throws InterruptedException
	{
		cusmobileno.sendKeys("9959263591");
		sendotpbutton.click();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		
		//for otp copying purpose use below code
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    WebElement textElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[@class='text-danger']"))); // Adjust the locator as needed
        // Retrieve the text from the element
        String copiedText = textElement.getText();
        System.out.println("Copied OTP: " + copiedText);
        WebElement otpField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@class='w-25 border ps-lg-3 fw-semibold rounded'])[1]")));
        otpField.sendKeys(copiedText);

            
 		//driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);

        
              

	}
	


	public void launch()
	{
	//driver.get("http://183.82.106.55:9097/");
	driver.manage().window().maximize();

	}
	 public void clickLogin()
     {
     
     //click on login
     login.click();
     }
	 
	 public void clickLogo()
     {
          
	        image.click();
     }
    public void propertyInsuranceImage()
    {
        pilogo.click();
   	   	
    }
    
    public void clickInvoice()
    {
        invoice.click();
   	
    	
    }

	
	

}
