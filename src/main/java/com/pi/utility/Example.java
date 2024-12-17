package com.pi.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Example {
	WebDriver driver;
	@BeforeClass
	public void launchBrowser()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	}
	@Test(priority=0)
	public void methodone()
	{
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.amazon.in/");
		
	}
	@Test(priority=1)

	public void methodtwo()
	{
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.amao");
		
	}
	@Test(priority=2,dependsOnMethods= {"methodtwo"})
	public void methodthree()
	{
		Assert.assertEquals(driver.getTitle(), "onli");
		
	}

	
	
	

}
