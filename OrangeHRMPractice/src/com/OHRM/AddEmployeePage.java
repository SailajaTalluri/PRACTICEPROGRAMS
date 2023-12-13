package com.OHRM;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.Utility.Log;

public class AddEmployeePage extends LoginTest{

	@Test(priority=4,description="Operating the functionality of PIM")
	public void PIMMouseHover()
	{
		By pimProperty=By.id(properties.getProperty("orangeHRMHomePAgePIMProperty"));
		WebElement PIM=driver.findElement(pimProperty);

		Actions MouseHoveractions=new Actions(driver);
		MouseHoveractions.moveToElement(PIM).build().perform();

	}
	@Test(priority=5,description="AddEmployee click operation and validating AddEmployee Page Functionality")
	public void AddEmployeeTextPageTest() throws IOException
	{
		By addEmployeeProperty=By.id(properties.getProperty("OrangeHRMAddEmployeeProperty"));
		WebElement addEmployee=driver.findElement(addEmployeeProperty);
		addEmployee.click();
		// Validating the ADDEmployee PAge
		cell=row.getCell(8);
		String expected_AddEmployeepageText=cell.getStringCellValue();
		Log.info("The Expected AddEmployee Text is:- "+expected_AddEmployeepageText);
		By addEmployeePageProperty=By.xpath(properties.getProperty("orangeHRMApplicationAddEmployeeTextproperty"));
		WebElement addEmployeeText=driver.findElement(addEmployeePageProperty);
		String actual_AddEmployeeText=addEmployeeText.getText();
		Log.info("The Expected AddEmployee Text is:- "+actual_AddEmployeeText);
		cell=row.createCell(9);
		cell.setCellValue(actual_AddEmployeeText);
		dataFile=new FileOutputStream("C:\\Users\\dell\\Desktop\\CucumberProject\\OrangeHRMPractice\\OhrmExcelFile\\Ohrm.xlsx");
		workbook.write(dataFile);
		//validating the AddEmployee Page
		if(actual_AddEmployeeText.equals(expected_AddEmployeepageText))
		{
			Log.info("TheText of the AddEmployee page is Matched:-PASS");
			cell=row.createCell(10);
			cell.setCellValue("PASS");
			dataFile=new FileOutputStream("C:\\\\Users\\\\dell\\\\Desktop\\\\CucumberProject\\\\OrangeHRMPractice\\\\OhrmExcelFile\\\\Ohrm.xlsx");
			workbook.write(dataFile);
		}
		else
		{

			Log.info("The Text of the AddEmployee page is Matched:-FAIL");
			cell=row.createCell(10);
			cell.setCellValue("FAIL");
			dataFile=new FileOutputStream("C:\\\\Users\\\\dell\\\\Desktop\\\\CucumberProject\\\\OrangeHRMPractice\\\\OhrmExcelFile\\\\Ohrm.xlsx");
			workbook.write(dataFile);
		}
	}

	@Test(priority=6,description="Giving the User Data Information Functionality")
	public void UserData() throws IOException, InterruptedException
	{
		cell=row.getCell(11);
		String expected_FirstNameText=cell.getStringCellValue();
		Log.info("The Entered First Name Data is:-"+expected_FirstNameText);
		By firstNameProperty=By.id(properties.getProperty("orangeHRMApplicationFirstNameproperty"));
		WebElement firstName=driver.findElement(firstNameProperty);
		firstName.sendKeys(expected_FirstNameText);

		cell=row.getCell(12);
		String expected_MiddleNameText=cell.getStringCellValue();
		Log.info("The Entered Middle Name Data is:-"+expected_MiddleNameText);
		By MiddleNameProperty=By.id(properties.getProperty("orangeHRMApplicationMiddleNameproperty"));
		WebElement middleName=driver.findElement(MiddleNameProperty);
		middleName.sendKeys(expected_MiddleNameText);

		cell=row.getCell(13);
		String expected_LastNameText=cell.getStringCellValue();
		Log.info("The Entered Last Name Data is:-"+expected_LastNameText);
		By lastNameProperty=By.id(properties.getProperty("orangeHRMApplicationLastNameproperty"));
		WebElement lastName=driver.findElement(lastNameProperty);
		lastName.sendKeys(expected_LastNameText);

		Actions keybord = new Actions(driver);
		keybord.sendKeys(Keys.TAB).build().perform();

		By employeeidProperty=By.id(properties.getProperty("orangeHRMApplicationAddEmployeePageEmployeeIDProperty"));
		WebElement employeeID=driver.findElement(employeeidProperty);
		String EmployeeIDDefaultValue=employeeID.getAttribute("Value");
		Log.info("The value of Employee ID is:-"+EmployeeIDDefaultValue);
		cell=row.createCell(14);
		cell.setCellValue(EmployeeIDDefaultValue);
		dataFile=new FileOutputStream("C:\\\\Users\\\\dell\\\\Desktop\\\\CucumberProject\\\\OrangeHRMPractice\\\\OhrmExcelFile\\\\Ohrm.xlsx");
		workbook.write(dataFile);

		keybord.sendKeys(Keys.TAB).build().perform();

	}

	@Test(priority=7,description="Validating the photography")
	public void photo() throws InterruptedException, IOException
	{

		By photofileproperty=By.xpath(properties.getProperty("orangeHRMApplicationphotofile"));
		WebElement photofile=driver.findElement(photofileproperty);

		Actions KeyBoardactions=new Actions(driver);
		KeyBoardactions.sendKeys(Keys.ENTER).build().perform();

		Thread.sleep(5000);
		java.lang.Runtime.getRuntime().exec("C:\\Users\\dell\\Desktop\\CucumberProject\\OrangeHRMPractice\\Autoit\\Employeephoto.exe");
		Thread.sleep(5000);

		//Validating the PhotoLogo
		boolean falg=photofile.isDisplayed();
		if(falg)
		{
			Log.info(" The Employee Photo is displayed In the Personal Details Page:-Pass");
		}
		else
		{
			Log.info("The Employee photo is displayed on the Personal Details Page:-FAIL");
		}

		By saveButtonProperty=By.id(properties.getProperty("orangeHRMApplicationsaveButtonProperty"));
		WebElement saveButton=driver.findElement(saveButtonProperty);
		saveButton.click();
	}

}



