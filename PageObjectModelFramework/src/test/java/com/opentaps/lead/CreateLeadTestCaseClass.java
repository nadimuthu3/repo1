package com.opentaps.lead;

import org.testng.annotations.Test;


import com.opentaps.pageobjects.CreateLeadObjects;
import com.opentaps.pageobjects.LoginObjects;
import com.opentaps.utilities.SeleniumUtiltiy;

public class CreateLeadTestCaseClass extends SeleniumUtiltiy{
	
  	
  CreateLeadObjects lead = new CreateLeadObjects();	
  @Test
  public void createLead() throws InterruptedException {
	  launchBrowserAndApp("chrome", "http://leaftaps.com/opentaps");
	  LoginObjects.username().sendKeys("DemoSalesManager");
	  LoginObjects.password().sendKeys("crmsfa");
	  LoginObjects.loginButton().click();
	  
	  CreateLeadObjects.createLeadLink().click();
	  CreateLeadObjects.companyName().sendKeys("dd");
	  CreateLeadObjects.firstName().sendKeys("ss");
	  CreateLeadObjects.lastname().sendKeys("kk");
	  
	  CreateLeadObjects.createLeadButton().click();
	  closeBrowser();
	  
  }
}
