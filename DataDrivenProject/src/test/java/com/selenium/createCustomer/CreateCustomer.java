package com.selenium.createCustomer;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.selenium.excel.ExcelUtility;
import com.selenium.utilities.SeleniumUtility;

public class CreateCustomer {
	SeleniumUtility utility= new SeleniumUtility();
	
	
	/**
	 * classical way of implementing data driven framework using data driven
	 */
	/*@DataProvider(name="createCustomerInvalidData")
	public Object[][] myDataProvider1(){
		Object[][] arr = {{"nadi","muthu","29/09/1989"},
						  {"ahamed","s","11/09/92"}
					      };
		return arr;
	}*/


	/**
	 * method for enhanced data driven framework where multiple set of data read from excel
	 * @return
	 */
	@DataProvider(name="createCustomerData")
	public static Object[][] myDataProvider1(){
		Object[][] obj = ExcelUtility.readExcelData();
		return obj;
		
	}

	
	
	
	@DataProvider(name="createCustomerInvalidData")
	public Object[][] myDataProvider2(){
		Object[][] arr = {{"nad!!!i","muthu","29/09/1989"},
						  {"aha@@@med","s","11/09/92"}
					      };
		return arr;
	}
	
	
	@BeforeMethod
	public void beforemethod(){
		System.out.println("before method called");
		utility.launchApp("chrome", "http://learnnshine.com/node/add/customers");
	}
	@AfterMethod
	public void aftermethod(){
		System.out.println("after method called");
		utility.closeApp();
	}
  @Test(groups={"sanity","login"},dataProvider="createCustomerData")
  public void createCustomerWithValidData(String var1,String var2, String var7) throws Exception {

		try {
			System.out.println("testcase1 started");
			
			
			
			
			utility.textBoxHandling("id", "edit-title", var1);		
			utility.textBoxHandling("id", "edit-field-last-name-und-0-value", var2);		
			utility.textBoxHandling("id", "edit-field-dob-und-0-value-datepicker-popup-0", var7);
			
			
			System.out.println("testcase1 ended");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
  
/*  @Test(groups="regression",dataProvider="createCustomerInvalidData")
  public void createCustomerWithInValidData(String firstname,String lastname, String dob) throws InterruptedException {
	  	System.out.println("testcase2 started");
		
	  	
		
		utility.textBoxHandling("id", "edit-title", firstname);		
		utility.textBoxHandling("id", "edit-field-last-name-und-0-value", lastname);		
		utility.textBoxHandling("id", "edit-field-dob-und-0-value-datepicker-popup-0", dob);
		
		System.out.println("testcase2 ended");
		
  }
  
  @Parameters({"platform"})
  @Test(groups={"sanity","login"})
  public void testcase3(String platform) throws InterruptedException {
	  
	  System.out.println("testcase3 started");
		Thread.sleep(5000);
		System.out.println("testcase3 ended");

  }*/
}
