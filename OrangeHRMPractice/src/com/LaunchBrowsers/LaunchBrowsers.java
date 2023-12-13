package com.LaunchBrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowsers {
public void ChromeBrowserWebDriver() {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Desktop\\CucumberProject\\OrangeHRMPractice\\BROWSERDRIVERFILES\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://admin-demo.nopcommerce.com/login");
System.out.println("****The Chrome Browser Application is Successfully opened****");
}
public void FireFoxBrowserWebDriver() {
System.setProperty("webdriver.gecko.driver", "C:\\Users\\dell\\Desktop\\CucumberProject\\OrangeHRMPractice\\BROWSERDRIVERFILES\\geckodriver.exe");
WebDriver driver=new FirefoxDriver();
driver.get("https://admin-demo.nopcommerce.com/login");
System.out.println("*****The FireFox Browser Application is Successfully opened*****");
}
public void MsEdgeBrowserWebDriver() {
System.setProperty("webdriver.edge.driver", "C:\\Users\\dell\\Desktop\\CucumberProject\\OrangeHRMPractice\\BROWSERDRIVERFILES\\msedgedriver.exe");
WebDriver driver=new EdgeDriver();
driver.get("https://admin-demo.nopcommerce.com/login");
System.out.println("*****The Edge Browser Application is successfully opened*****");
}

public static void main(String[] args) {
LaunchBrowsers browser=new LaunchBrowsers();
browser.ChromeBrowserWebDriver();
browser.FireFoxBrowserWebDriver();
browser.MsEdgeBrowserWebDriver();

}
}
