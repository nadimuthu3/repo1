package com.juneproject.createcustomer;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.juneproject.pageobjects.CustomerObjects;
import com.juneproject.utilities.ExcelUtils;
import com.juneproject.utilities.Seleniumutility;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class CreateCustomerPageObjectBased extends Seleniumutility{

	CustomerObjects cObjects = new CustomerObjects();
	@DataProvider(name="customerData")
	public Object[][] customerData() throws Exception{
		return ExcelUtils.getTableArray("C:\\Users\\njayapal\\testCaseData.xlsx", "CreateCustomer");
		
	}
	
	@Test(dataProvider="customerData")
	public void createCustomer(String firstName, String lastName, String dob, String gender, String email, String presentAddressFullName, String presentAddress1, String presentAddress2
			,String presentCity, String State,String institutionName, String degreeName, String specialization, String passingYear, String percentageMarks){
		
		ExtentTest test = null;
		try {
			test = reports.startTest("create customer with proper data erer");
		
			test.log(LogStatus.INFO, "add personal info");
			cObjects.firstName(driver).sendKeys(firstName);
			cObjects.lastName(driver).sendKeys(lastName);
			test.log(LogStatus.INFO, "add dob ");
			cObjects.dob(driver).clear();
			cObjects.dob(driver).sendKeys(dob);
			test.log(LogStatus.INFO, "add gender ");
			if(gender.equals("male"))
				cObjects.genderMale(driver).click();
			else 
				cObjects.genderFemale(driver).click();
			test.log(LogStatus.INFO, "add email ");
			cObjects.emailAddress(driver).sendKeys(email);
			test.log(LogStatus.INFO, "add present address info ");
			cObjects.presentAddressFullName(driver).sendKeys(presentAddressFullName);
			cObjects.presentAddress1(driver).sendKeys(presentAddress1);
			cObjects.presentAddress2(driver).sendKeys(presentAddress2);
			cObjects.presentCity(driver).sendKeys(presentCity);
			
			
			Select presentAddressState = new Select(cObjects.presentState(driver));
			presentAddressState.selectByVisibleText(State);
			
			test.log(LogStatus.INFO, "add educational info ");
			cObjects.educationalInfo(driver).click();
			cObjects.institutionName(driver).sendKeys(institutionName);
			cObjects.degreeName(driver).sendKeys(degreeName);
			cObjects.specialization(driver).sendKeys(specialization);
			
			Select yearOfpassing = new Select(cObjects.yearOfPassing(driver));
			yearOfpassing.selectByVisibleText(passingYear);
			
			cObjects.percentageMarks(driver).sendKeys(percentageMarks);
			
			test.log(LogStatus.INFO, "click on save button ");
			cObjects.saveButton(driver).click();
			
			test.log(LogStatus.INFO, "handle alert on save");
			alertHandle("OK");
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			reports.endTest(test);
			reports.flush();
		}
		
		
	}
	@BeforeMethod
	public void beforeMethod(){
		Applaunch("firefox", "http://learnnshine.com/node/add/customers");
	}
	
	@AfterMethod
	public void afterMethod(){
		//closeBrowser();
	}
	
}
