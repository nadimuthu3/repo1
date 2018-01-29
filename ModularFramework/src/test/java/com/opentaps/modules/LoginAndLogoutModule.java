package com.opentaps.modules;

import org.openqa.selenium.By;

import com.opentaps.utilities.SeleniumUtiltiy;

public class LoginAndLogoutModule extends SeleniumUtiltiy {

	public void login(){
		driver.findElement(By.xpath(".//*[@id='username']")).sendKeys("DemoSalesManager");// UserName
		driver.findElement(By.xpath(".//*[@id='password']")).sendKeys("crmsfa");// Password
		driver.findElement(By.xpath(".//input[@type='submit' and @value='Login']")).click();// Login Button
		
		//Click  CRM/SFA 
		
		driver.findElement(By.partialLinkText("CRM/SFA")).click();// CMR/SFA Link	
	}
	
	public void logout(){
		
	}
	
}
