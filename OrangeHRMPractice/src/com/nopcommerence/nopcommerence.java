package com.nopcommerence;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class nopcommerence {

	WebDriver driver;
	String applicationUrlAddress="https://admin-demo.nopcommerce.com/login";
	public void nopcommerceApplicationLaunch() throws InterruptedException  {
		//System set property
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\dell\\Desktop\\CucumberProject\\OrangeHRMPractice\\BROWSERDRIVERFILES\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get(applicationUrlAddress);
		Thread.sleep(3000);

	}

	public void applicationclosed() {
		driver.quit();
	}

	public void nopcommerceLoginPageUserNameandPassword() {

		//<input class="email valid" value="admin@yourstore.com" autofocus="autofocus" type="email" data-val="true" data-val-email="Wrong email" data-val-required="Please enter your email" id="Email" name="Email" aria-describedby="Email-error" aria-invalid="false">
		By Emailproperty=By.xpath("//input[@type='email']");
		WebElement Email=driver.findElement(Emailproperty);
		Email.sendKeys("admin@yourstore.com");
		//<input value="admin" class="password valid" type="password" id="Password" name="Password" aria-invalid="false">
		By passwordproperty=By.id("Password");
		WebElement password=driver.findElement(passwordproperty);
		password.sendKeys("admin");

		//<button type="submit" class="button-1 login-button">Log in</button>
		By loginbuttonproperty=By.xpath("//button[@type='submit']");
		WebElement loginbutton=driver.findElement(loginbuttonproperty);
		loginbutton.click();
	}

	public static void main(String[] args) throws InterruptedException {
		nopcommerence object=new nopcommerence();
		object.nopcommerceApplicationLaunch();
		object.nopcommerceLoginPageUserNameandPassword();
		object.applicationclosed();
	}
}
