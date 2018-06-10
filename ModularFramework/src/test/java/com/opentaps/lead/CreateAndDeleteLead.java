package com.opentaps.lead;

import org.testng.annotations.Test;

import com.opentaps.modules.LeadModule;
import com.opentaps.modules.LoginAndLogoutModule;
import com.opentaps.utilities.SeleniumUtiltiy;

public class CreateAndDeleteLead extends SeleniumUtiltiy {
	LoginAndLogoutModule login = new LoginAndLogoutModule();
	LeadModule lead = new LeadModule();
	@Test
  public void f() throws InterruptedException {
	  launchBrowserAndApp("chrome", "http://leaftaps.com/opentaps");
	  login.login();
	  lead.createLead();
	  lead.deleteLead();
	  login.logout();
	  //nadi changed
  }
}
