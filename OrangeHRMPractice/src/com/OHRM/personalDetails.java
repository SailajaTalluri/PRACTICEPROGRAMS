package com.OHRM;

import java.io.FileOutputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.Utility.Log;
public class personalDetails extends AddEmployeePage {

	@Test(priority=8,description="Validating the Personal Details WebPAge")
	public void PersonalDetailsTest() throws IOException
	{
		cell=row.getCell(15);
		String expected_personalDetailstext=cell.getStringCellValue();
		Log.info("The Expected Text of the personal Details Is :-"+expected_personalDetailstext);
		By personalDetailsProperty=By.xpath(properties.getProperty("orangeHRMApplicationPersonalDetailsProperty"));
		WebElement personalDetails=driver.findElement(personalDetailsProperty);
		String actual_PersonalDetailsText=personalDetails.getText();
		Log.info("The Actual Text of the PErsonal Details IS:-"+actual_PersonalDetailsText);
		cell=row.createCell(16);
		cell.setCellValue(actual_PersonalDetailsText);
		dataFile=new FileOutputStream("C:\\Users\\dell\\Desktop\\CucumberProject\\OrangeHRMPractice\\OhrmExcelFile\\Ohrm.xlsx");
		workbook.write(dataFile);
		//validating the Personal Details WebPAge
		if(actual_PersonalDetailsText.equals(expected_personalDetailstext))
		{
			Log.info("The Text of the Personal Details is:-PASS");
			cell=row.createCell(17);
			cell.setCellValue("PASS");
			dataFile=new FileOutputStream("C:\\Users\\dell\\Desktop\\CucumberProject\\OrangeHRMPractice\\OhrmExcelFile\\Ohrm.xlsx");
			workbook.write(dataFile);
		}
		else
		{
			Log.info("The Text of the Personal Details is:-FAIL");
			cell=row.createCell(17);
			cell.setCellValue("FAIL");
			dataFile=new FileOutputStream("C:\\Users\\dell\\Desktop\\CucumberProject\\OrangeHRMPractice\\OhrmExcelFile\\Ohrm.xlsx");
			workbook.write(dataFile);
		}

	}
	@Test(priority=9,description="Validating Name Functionality")
	public void NameValidation() throws IOException
	{
		//validating FirstName in PersonalDetails
		By firstnameOfPersonalDetailsProperty=By.name(properties.getProperty("orangeHRMApplicationPersonalDetailsFirstNameProperty"));
		WebElement firstnameOfPersonalDetails=driver.findElement(firstnameOfPersonalDetailsProperty);
		String actual_firstNameOfPersonalDetails=firstnameOfPersonalDetails.getAttribute("Value");
		Log.info("The Actual data in the Personal Details WebPAge FirstANme is:- "+actual_firstNameOfPersonalDetails);
		cell=row.createCell(18);
		cell.setCellValue(actual_firstNameOfPersonalDetails);
		dataFile=new FileOutputStream("C:\\Users\\dell\\Desktop\\CucumberProject\\OrangeHRMPractice\\OhrmExcelFile\\Ohrm.xlsx");
		workbook.write(dataFile);
		//validating the First NAme in Personal Details
		cell=row.getCell(11);//this is the First nAme we have given in the Add Employee Page
		String expected_FirstNameText=cell.getStringCellValue();//to validate with this FirstName we are taking this cell value here
		if(actual_firstNameOfPersonalDetails.equals(expected_FirstNameText))
		{
			Log.info("The data in the PersonalDetails WebPage FirstName Text is:-PASS");
			cell=row.createCell(19);
			cell.setCellValue("PASS");
			dataFile=new FileOutputStream("C:\\Users\\dell\\Desktop\\CucumberProject\\OrangeHRMPractice\\OhrmExcelFile\\Ohrm.xlsx");
			workbook.write(dataFile);
		}
		else
		{
			Log.info("The data in the PersonalDetails WebPage FirstName Text is:-FAIL");
			cell=row.createCell(19);
			cell.setCellValue("FAIL");
			dataFile=new FileOutputStream("C:\\Users\\dell\\Desktop\\CucumberProject\\OrangeHRMPractice\\OhrmExcelFile\\Ohrm.xlsx");
			workbook.write(dataFile);
		}
		//validating MiddleName in PersonalDetails
		By middleNameOfPersonalDetailsproperty=By.name(properties.getProperty("orangeHRMApplicationPersonalDetailsMiddleNameProperty"));
		WebElement middleNameOfPersonalDetails=driver.findElement(middleNameOfPersonalDetailsproperty);
		String actual_middleNameOfPersonalDetails= middleNameOfPersonalDetails.getAttribute("Value");
		Log.info("The Actual data in the Middle NAme Of Personal Details:-"+actual_middleNameOfPersonalDetails);
		cell=row.createCell(20);
		cell.setCellValue(actual_middleNameOfPersonalDetails);
		dataFile=new FileOutputStream("C:\\Users\\dell\\Desktop\\CucumberProject\\OrangeHRMPractice\\OhrmExcelFile\\Ohrm.xlsx");
		workbook.write(dataFile);
		//Validating the MiddleName
		cell=row.getCell(12);
		String expected_MiddleNameText=cell.getStringCellValue();
		if(actual_middleNameOfPersonalDetails.equals(expected_MiddleNameText))
		{
			Log.info("The  data in the Middle NAme Of Personal Details:-PASS");
			cell=row.createCell(21);
			cell.setCellValue("PASS");
			dataFile=new FileOutputStream("C:\\Users\\dell\\Desktop\\CucumberProject\\OrangeHRMPractice\\OhrmExcelFile\\Ohrm.xlsx");
			workbook.write(dataFile);
		}
		else
		{
			Log.info("The  data in the Middle NAme Of Personal Details:-FAIL");
			cell=row.createCell(21);
			cell.setCellValue("FAIL");
			dataFile=new FileOutputStream("C:\\Users\\dell\\Desktop\\CucumberProject\\OrangeHRMPractice\\OhrmExcelFile\\Ohrm.xlsx");
			workbook.write(dataFile);
		}
		//validating the LastName of PersonalDetails
		By lastNAmeOfPersonalDetailsProperty=By.name(properties.getProperty("orangeHRMApplicationPersonalDetailsLastNameProperty"));
		WebElement lastNAmeOfPersonalDetails=driver.findElement(lastNAmeOfPersonalDetailsProperty);
		String actual_lastNameOfPersonalDetails=lastNAmeOfPersonalDetails.getAttribute("Value");
		Log.info("The Actual data in the Last Name Of personal Details IS :-"+actual_lastNameOfPersonalDetails);
		cell=row.createCell(22);
		cell.setCellValue(actual_lastNameOfPersonalDetails);
		dataFile=new FileOutputStream("C:\\Users\\dell\\Desktop\\CucumberProject\\OrangeHRMPractice\\OhrmExcelFile\\Ohrm.xlsx");
		workbook.write(dataFile);
		//validating the Last Name
		cell=row.getCell(13);
		String expected_LastNameText=cell.getStringCellValue();
		if(actual_lastNameOfPersonalDetails.equals(expected_LastNameText))
		{
			Log.info("the data int he LAst NAme of Personal Details Is:-PASS");
			cell=row.createCell(23);
			cell.setCellValue("PASS");
			dataFile=new FileOutputStream("C:\\Users\\dell\\Desktop\\CucumberProject\\OrangeHRMPractice\\OhrmExcelFile\\Ohrm.xlsx");
			workbook.write(dataFile);
		}
		else
		{
			Log.info("the data int he LAst NAme of Personal Details Is:-FAIL");
			cell=row.createCell(23);
			cell.setCellValue("FAIL");
			dataFile=new FileOutputStream("C:\\Users\\dell\\Desktop\\CucumberProject\\OrangeHRMPractice\\OhrmExcelFile\\Ohrm.xlsx");
			workbook.write(dataFile);
		}

	}

}
