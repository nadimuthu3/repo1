package com.juneproject.createcustomer;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.juneproject.utilities.ExcelUtils;
import com.juneproject.utilities.Seleniumutility;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class CreateCustomer extends Seleniumutility{

	@DataProvider(name="createCustomer")
	public Object[][] createCustomerData() throws Exception{
		/*return new Object[][]{
			
				{"nadi","jayapal","07/30/1988","1234567890","eee@gmail.com"},
				{"jhli","biswa","07/29/1988","45353453","eer@gmail.com"}
			
			
			
		};*/
		
		System.out.println("dummy");
		return ExcelUtils.getTableArray("C:\\Users\\njayapal\\testCaseData.xlsx", "CreateCustomer");
		
	}
	
	
	
	@Test(dataProvider="createCustomer")
	public void createCustomer(String fname, String lname, String dob, String mobile, String email,String address1, String address2, String institution, String degree, String specialization){
		ExtentReports report = null;
		ExtentTest test = null;
		try {
			report = new ExtentReports("src/test/resources/com/juneproject/reports/CustomerCreateReport.html", false);
			test = report.startTest("Create Customer");
			
			test.log(LogStatus.INFO, "launch app and load URL in firefox");
			Applaunch("firefox","http://learnnshine.com/drupal/node/add/customers");
			test.log(LogStatus.INFO, "enter first name");
			textboxHandle("id","edit-title",fname);
			test.log(LogStatus.INFO, "enter last name");
			textboxHandle("id","edit-field-last-name-und-0-value",lname);
			test.log(LogStatus.INFO, "enter date of birth");
			textboxHandle("id","edit-field-dob-und-0-value-datepicker-popup-0",dob);
			test.log(LogStatus.INFO, "select gender");
			checkboxHandle("id","edit-field-gender-und-male");
			test.log(LogStatus.INFO, "enter mobile number");
			textboxHandle("id","edit-field-mobile-number-und-0-number",mobile);
			test.log(LogStatus.INFO, "enter email address");
			textboxHandle("id","edit-field-email-address-und-0-email",email);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			test.log(LogStatus.FAIL, "create customer failed due to following exception information "+e.getMessage());
			
		}

		finally{
			report.endTest(test);
			report.flush();

		}
		
	}
}
