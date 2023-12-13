package com.OHRM;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.Utility.Log;

public class LoginTest extends BaseTest {

	FileInputStream testdata;
	XSSFWorkbook workbook;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	FileInputStream propertiesFile;
	Properties properties;
	FileOutputStream dataFile;

	@Test(priority=1,description="Functionality of LogInPage")
	public void LogInPaneltext() throws IOException 
	{
		testdata=new FileInputStream("C:\\Users\\dell\\Desktop\\CucumberProject\\OrangeHRMPractice\\OhrmExcelFile\\Ohrm.xlsx");
		workbook=new XSSFWorkbook(testdata);
		sheet=workbook.getSheet("Sheet1");
		row=sheet.getRow(1);
		cell=row.getCell(0);
		propertiesFile=new FileInputStream("C:\\Users\\dell\\Desktop\\CucumberProject\\OrangeHRMPractice\\orangehrmapplication.properties");
		properties=new Properties();
		properties.load(propertiesFile);
		String expected_LogInpanelText=cell.getStringCellValue();
		Log.info("The Expected Text of the LoginPanel is:-"+expected_LogInpanelText);
		By LogInPanelText=By.id(properties.getProperty("OrangeHRMHomePageLoginPanelTextProperty"));
		WebElement LogInPanel=driver.findElement(LogInPanelText);
		String actual_loginpanel= LogInPanel.getText();
		Log.info("The Actual Text of the LogInPanel is:-"+actual_loginpanel);
		cell=row.createCell(1);
		cell.setCellValue(actual_loginpanel);
		dataFile=new FileOutputStream("C:\\Users\\dell\\Desktop\\CucumberProject\\OrangeHRMPractice\\OhrmExcelFile\\Ohrm.xlsx");
		workbook.write(dataFile);
		//validating the LogInPAnel Text
		if(actual_loginpanel.equals(expected_LogInpanelText))
		{
			Log.info("The Text of the LogInPAnel is Matched :-PASS");
			cell=row.createCell(2);
			cell.setCellValue("PASS");
			dataFile=new FileOutputStream("C:\\\\Users\\\\dell\\\\Desktop\\\\CucumberProject\\\\OrangeHRMPractice\\\\OhrmExcelFile\\\\Ohrm.xlsx");
			workbook.write(dataFile);
		}
		else
		{
			Log.info("The Text of the LogInPAnel is Matched :-PASS");
			cell=row.createCell(2);
			cell.setCellValue("File");
			dataFile=new FileOutputStream("C:\\\\Users\\\\dell\\\\Desktop\\\\CucumberProject\\\\OrangeHRMPractice\\\\OhrmExcelFile\\\\Ohrm.xlsx");
			workbook.write(dataFile);
		}
	}
	@Test(priority=2,description="Giving Valid data of UserName And Password")
	public void usernameandpassword()
	{
		cell=row.getCell(3);
		String expected_userName=cell.getStringCellValue();
		Log.info("The Entered UserName Data is:-"+expected_userName);
		By userName_Property=By.id(properties.getProperty("OrangeHRMLogInPageUserNameProperty"));
		WebElement userName=driver.findElement(userName_Property);
		userName.sendKeys(expected_userName);
		cell=row.getCell(4);		
		String expected_Password=cell.getStringCellValue();
		Log.info("The Entered Password Data is:-"+expected_Password);
		By password_property=By.id(properties.getProperty("OrangeHRMLogInPagePasswordProperty"));
		WebElement password=driver.findElement(password_property);
		password.sendKeys(expected_Password);
		
		//Identifying the LogIn button
		By LoginButtonProperty=By.className(properties.getProperty("OrangeHRMLogInPageLogInButtonProperty"));
		WebElement LoginButton=driver.findElement(LoginButtonProperty);
		LoginButton.click();
	}
	@Test(priority=3,description="Validating the WelCome Admin page")
	public void welComeAdmin() throws IOException
	{
		cell=row.getCell(5);
		String expected_WelComeAdmin_text=cell.getStringCellValue();
		Log.info("The Expected Text of the welComeAdmin Is:-"+expected_WelComeAdmin_text);
		By welComeAdminProperty=By.id(properties.getProperty("OrangeHRMHomePageWelComeAdminProperty"));
		WebElement welComeAdmin=driver.findElement(welComeAdminProperty);
		String actual_WelComeAdmin_text=welComeAdmin.getText();
		Log.info("The Actual Text of the WelCome Admin is:-"+actual_WelComeAdmin_text);
		cell=row.createCell(6);
		cell.setCellValue(actual_WelComeAdmin_text);
		dataFile=new FileOutputStream("C:\\\\Users\\\\dell\\\\Desktop\\\\CucumberProject\\\\OrangeHRMPractice\\\\OhrmExcelFile\\\\Ohrm.xlsx");
		workbook.write(dataFile);
		//Validating the WelComeAdmin text
		if(actual_WelComeAdmin_text.equals(expected_WelComeAdmin_text))
		{
			Log.info("The Text of the WelCome Admin Text is Matched:-PASS");
			cell=row.createCell(7);
			cell.setCellValue("PASS");
			dataFile=new FileOutputStream("C:\\\\Users\\\\dell\\\\Desktop\\\\CucumberProject\\\\OrangeHRMPractice\\\\OhrmExcelFile\\\\Ohrm.xlsx");
			workbook.write(dataFile);
		}
		else
		{
			Log.info("The Text of the WelCome Admin Text id NOT MAtched:-FAIL");
			cell=row.createCell(7);
			cell.setCellValue("FAIL");
			dataFile=new FileOutputStream("C:\\\\Users\\\\dell\\\\Desktop\\\\CucumberProject\\\\OrangeHRMPractice\\\\OhrmExcelFile\\\\Ohrm.xlsx");
			workbook.write(dataFile);
		}
	}
}



