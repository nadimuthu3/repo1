package com.opentaps.lead;

import org.testng.annotations.Test;

import com.opentaps.modules.LeadModule;

public class CreateAndEditLead {
  @Test
  public void f() throws InterruptedException {
	  LeadModule lead = new LeadModule();
	  lead.createLead();
	  lead.manageLead();
  }
}
