package com.opentaps.lead;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.opentaps.excel.ExcelUtils;
import com.opentaps.pageobjects.CreateLeadObjects;
import com.opentaps.pageobjects.LoginObjects;
import com.opentaps.utilities.SeleniumUtiltiy;

public class CreateLeadUsingExcel extends SeleniumUtiltiy{
	
  @DataProvider(name="returnData")
  public Object[][] returnData() throws Exception{
	return ExcelUtils.getTableArray("C:\\Users\\njayapal\\testCaseData1.xlsx", "Sheet1");
	  
  }
  CreateLeadObjects lead = new CreateLeadObjects();	
  @Test(dataProvider="returnData")
  public void createLead(String companyName,String fname, String lname) throws InterruptedException {
	  launchBrowserAndApp("chrome", "http://leaftaps.com/opentaps");
	  LoginObjects.username().sendKeys("DemoSalesManager");
	  LoginObjects.password().sendKeys("crmsfa");
	  LoginObjects.loginButton().click();
	  LoginObjects.crmsfalink().click();
	  
	  CreateLeadObjects.createLeadLink().click();
	  CreateLeadObjects.companyName().sendKeys(companyName);
	  CreateLeadObjects.firstName().sendKeys(fname);
	  CreateLeadObjects.lastname().sendKeys(lname);
	  
	  CreateLeadObjects.createLeadButton().click();
	  closeBrowser();
	  
  }
}
