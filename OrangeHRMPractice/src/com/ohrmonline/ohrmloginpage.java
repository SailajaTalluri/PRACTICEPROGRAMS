package com.ohrmonline;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ohrmloginpage {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		String applicationUrlAddress="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		System.setProperty("webdriver.edge.driver", "C:\\Users\\dell\\Desktop\\CucumberProject\\OrangeHRMPractice\\BROWSERDRIVERFILES\\msedgedriver.exe");
		driver=new EdgeDriver();
		driver.get(applicationUrlAddress);
		//<input class="oxd-input oxd-input--active" name="username" placeholder="Username" autofocus="" data-v-1f99f73c="">
		//<p class="oxd-text oxd-text--p" data-v-7b563373="" data-v-358db50f="">Username : Admin</p>

		/*webelement for every webelement it contains name id xpath--ex;name=username
		 * name=username name is a attribute // username is a value
		 * name=password name is a attribute // password is a value
		 * input = tagname
		 * for ex class,name placeholder these 3 are attribute's
		 * class="value",name="value",placeholder="value"
		 */
		//input[@placeholder='Username'] = absoulte xpath value
		Thread.sleep(3000);

		By loginnameproperty=By.xpath("//input[@placeholder='Username']");
		WebElement loginname=driver.findElement(loginnameproperty);
		loginname.sendKeys("Admin");

		//<input class="oxd-input oxd-input--active" type="password" name="password" placeholder="Password" data-v-1f99f73c="">
		//<p class="oxd-text oxd-text--p" data-v-7b563373="" data-v-358db50f="">Password : admin123</p>
		//input[@type='password'] 
		By passwordproperty=By.xpath("//input[@type='password']");
		WebElement password=driver.findElement(passwordproperty);
		password.sendKeys("admin123");

		//<button type="submit" class="oxd-button oxd-button--medium oxd-button--main orangehrm-login-button" data-v-10d463b7="" data-v-358db50f=""><!----> Login <!----></button>
		//button[@type='submit']
		By loginbuttonproperty=By.xpath("//button[@type='submit']");
		WebElement loginbutton=driver.findElement(loginbuttonproperty);
		loginbutton.click();

	}

}
