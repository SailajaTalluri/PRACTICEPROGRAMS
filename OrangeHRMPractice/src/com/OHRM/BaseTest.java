package com.OHRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
 
	WebDriver driver;
	String OrangeHRMApplicationUrl = "http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
	
	@BeforeTest
	public void setup()
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Desktop\\CucumberProject\\OrangeHRMPractice\\BROWSERDRIVERFILES\\chromedriver.exe");
	   driver=new ChromeDriver();
	   driver.get(OrangeHRMApplicationUrl);
	   
	}

	@AfterTest
	public void teardown()
	{
	driver.quit();
	}

	}
	

