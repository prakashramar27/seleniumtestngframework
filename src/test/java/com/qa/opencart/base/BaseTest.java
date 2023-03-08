package com.qa.opencart.base;


import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.SoftAssert;

import com.qa.opencart.factory.DriverFactory;
import com.qa.opencart.pages.AccountsPage;
import com.qa.opencart.pages.LoginPage;
import com.qa.opencart.pages.ProductInfoPage;
import com.qa.opencart.pages.SearchPage;
import com.qa.opencart.pages.viewCartPopUpPage;

public class BaseTest {
	
	DriverFactory df;
	WebDriver driver;
	protected Properties prop;
	protected LoginPage loginPage;
	
	protected AccountsPage accPage;
	
	protected SearchPage searchPage;
	
	protected ProductInfoPage productInfoPage;
	
	protected viewCartPopUpPage viewCartPopUpPage;
	
	  protected SoftAssert softAssert;
	
	
	@BeforeTest
	
	public void setup()
	{
		df = new DriverFactory ();
		prop=df.initProp();
		driver = df.initDriver(prop);
		loginPage = new LoginPage (driver);
	   softAssert = new SoftAssert();
		
		
		
	}
	
	@AfterTest
	
	public void teardown()
	{
		driver.quit();
	}

}
