package com.opentaps.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.opentaps.utilities.SeleniumUtiltiy;

public class CreateLeadObjects extends SeleniumUtiltiy {

	public static WebElement createLeadLink(){
		return driver.findElement(By.partialLinkText("Create Lead"));
	}
	public static WebElement companyName(){
		return driver.findElement(By.id("createLeadForm_companyName"));
	}
	public static WebElement firstName(){
		return driver.findElement(By.id("createLeadForm_firstName"));
	}
	public static WebElement source(){
		return driver.findElement(By.id("createLeadForm_dataSourceId"));
	}
	public static WebElement industry(){
		return driver.findElement(By.id("createLeadForm_industryEnumId"));
	}
	public static WebElement ownership(){
		return driver.findElement(By.id("createLeadForm_ownershipEnumId"));
	}
	public static WebElement marketing(){
		return driver.findElement(By.id("createLeadForm_marketingCampaignId"));
	}

	public static WebElement lastname(){
		return driver.findElement(By.id("createLeadForm_lastName"));
	}
	public static WebElement createLeadButton(){
		return driver.findElement(By.xpath("//input[@value='Create Lead']"));
	}
	
}
