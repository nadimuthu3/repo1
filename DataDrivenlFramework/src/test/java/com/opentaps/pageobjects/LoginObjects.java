package com.opentaps.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.opentaps.utilities.SeleniumUtiltiy;

public class LoginObjects extends SeleniumUtiltiy {
	
	public static WebElement username(){
		return driver.findElement(By.xpath(".//*[@id='username']"));
	}
	public static WebElement password(){
		return driver.findElement(By.xpath(".//*[@id='password']"));
	}
	public static WebElement loginButton(){
		return driver.findElement(By.xpath(".//input[@type='submit' and @value='Login']"));
	}
	public static WebElement crmsfalink(){
		return driver.findElement(By.partialLinkText("CRM/SFA"));
		
	}
	
}
