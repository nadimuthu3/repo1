package com.opentaps.modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.opentaps.utilities.SeleniumUtiltiy;

public class LeadModule extends SeleniumUtiltiy{

	public  void createLead() throws InterruptedException{
		//Click Create Lead
		driver.findElement(By.partialLinkText("Create Lead")).click();// Create Lead Link
		
		//Create Lead Fields
		
		textBoxHandling("id", "createLeadForm_companyName", "Moolya");
		textBoxHandling("id", "createLeadForm_firstName", "nadi");
		dropDownHandling("id", "createLeadForm_dataSourceId", "Cold Call");
		
		WebElement ele3=driver.findElement(By.id("createLeadForm_industryEnumId"));// Industry
		Select st3=new Select(ele3);
		st3.selectByVisibleText("Computer Software");
		
		WebElement ele4=driver.findElement(By.id("createLeadForm_ownershipEnumId"));// Ownership
		Select st4=new Select(ele4);
		st4.selectByVisibleText("LLC/LLP");
		
		WebElement ele5=driver.findElement(By.id("createLeadForm_marketingCampaignId"));// Marketing Campaign
		Select st5=new Select(ele5);
		st5.selectByVisibleText("eCommerce Site Internal Campaign");
		
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("SoM");// First Name Local
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("SDET");// Salutation
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Tester");// Title
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("2");// Annual Revenue
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("5463782");// SIC Code
		//driver.findElement(By.id("createLeadForm_parentPartyId")).sendKeys("Parent");// Parent Account
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Mishra");// Last Name
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Mis");// Last Name Local
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("01/30/1994");// Birthday
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");// Department
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("100");// Number Of Employees
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("guyfwek");// Ticker Symbol
		driver.findElement(By.id("createLeadForm_description")).sendKeys("The Selenium Server is needed in order to run Remote.");// Description
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys(" Selenium WebDriver. Selenium 3.X is no longer capa");// Important Notes
		
		//Fill Contact Information Fields
		
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("91");// Country Code
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("7090003800");// Phone Number
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("560006");// Area Code
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Puja");// Person To Ask For
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("Extension");// Extension
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("s.m@gmail.com");// Email address
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("trippywords.com");// Web URL
		
		//Fill Primary Address
		
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Soumya");// To Name
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Sikon");// Attention Name
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("Bellandur");// Address Line 1
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Ibluru");// Address Line 2
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Bangalore");// City
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("345678");// Zip/ Postal Code
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("345");// Zip / Postal Code Extension
		
		WebElement ele=driver.findElement(By.name("generalCountryGeoId"));// Country
		Select st=new Select(ele);
		st.selectByVisibleText("India");
		
		
		Thread.sleep(5000);
		
		WebElement ele6=driver.findElement(By.name("generalStateProvinceGeoId"));// State/ Province
		Select st6=new Select(ele6);
		st6.selectByIndex(5);
		
		driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
	}
	
	public  static void manageLead(){
		
	}
	public  static void deleteLead(){
		
	}
	public  static void mergeLead(){
		
	}
}
