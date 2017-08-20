package com.juneproject.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CustomerObjects {

	public WebElement firstName(WebDriver driver) {
		return driver.findElement(By.id("edit-title"));
	}
	
	public WebElement middleName(WebDriver driver) {
		return driver.findElement(By.id("edit-field-middle-name-und-0-value"));
	}
	public WebElement lastName(WebDriver driver) {
		return driver.findElement(By.id("edit-field-last-name-und-0-value"));
	}
	public WebElement dob(WebDriver driver) {
		return driver.findElement(By.id("edit-field-dob-und-0-value-datepicker-popup-0"));
	}
	public WebElement genderMale(WebDriver driver) {
		return driver.findElement(By.id("edit-field-gender-und-male"));
	}
	public WebElement genderFemale(WebDriver driver) {
		return driver.findElement(By.id("edit-field-gender-und-female"));
	}
	public WebElement mobileNumber(WebDriver driver) {
		return driver.findElement(By.id("edit-field-mobile-number-und-0-number"));
	}
	
	public WebElement emailAddress(WebDriver driver) {
		return driver.findElement(By.id("edit-field-email-address-und-0-email"));
	}
	public WebElement presentAddressFullName(WebDriver driver) {
		return driver.findElement(By.id("edit-field-present-address-und-0-name-line"));
	}
	

	public WebElement presentAddress1(WebDriver driver) {
		return driver.findElement(By.id("edit-field-present-address-und-0-thoroughfare"));
	}
	
	public WebElement presentAddress2(WebDriver driver) {
		return driver.findElement(By.id("edit-field-present-address-und-0-premise"));
	}

	public WebElement presentCity(WebDriver driver) {
		return driver.findElement(By.id("edit-field-present-address-und-0-locality"));
	}
	
	/**
	 * drop down
	 * @param driver
	 * @return
	 */
	public WebElement presentState(WebDriver driver) {
		return driver.findElement(By.id("edit-field-present-address-und-0-administrative-area"));
	}
	public WebElement presentPinCode(WebDriver driver) {
		return driver.findElement(By.id("edit-field-present-address-und-0-postal-code"));
	}
	public WebElement permanentFirstName(WebDriver driver) {
		return driver.findElement(By.id("edit-field-permanent-address-und-0-first-name"));
	}
	public WebElement permanentLastName(WebDriver driver) {
		return driver.findElement(By.id("edit-field-permanent-address-und-0-last-name"));
	}
	public WebElement permamnentAddress1(WebDriver driver) {
		return driver.findElement(By.id("edit-field-permanent-address-und-0-thoroughfare"));
	}
	public WebElement permamnentAddress2(WebDriver driver) {
		return driver.findElement(By.id("edit-field-permanent-address-und-0-premise"));
	}
	public WebElement permanentCity(WebDriver driver) {
		return driver.findElement(By.id("edit-field-permanent-address-und-0-locality"));
	}
	/**
	 * drop down
	 * @param driver
	 * @return
	 */
	public WebElement permanentState(WebDriver driver) {
		return driver.findElement(By.id("edit-field-permanent-address-und-0-administrative-area"));
	}
	public WebElement permenentPincode(WebDriver driver) {
		return driver.findElement(By.id("edit-field-permanent-address-und-0-postal-code"));
	}
	public WebElement chooseFile(WebDriver driver) {
		return driver.findElement(By.id("edit-field-profile-picture-und-0-upload"));
	}
	public WebElement upload(WebDriver driver) {
		return driver.findElement(By.id("edit-field-profile-picture-und-0-upload-button"));
	}

	public WebElement willingToWorkBangalore(WebDriver driver) {
		return driver.findElement(By.id("edit-field-willing-to-work-und-bangalore"));
	}
	public WebElement willingToWorkChennai(WebDriver driver) {
		return driver.findElement(By.id("edit-field-willing-to-work-und-chennai"));
	}
	public WebElement willingToWorkDelhi(WebDriver driver) {
		return driver.findElement(By.id("edit-field-willing-to-work-und-delhi"));
	}
	public WebElement willingToWorkKolkatta(WebDriver driver) {
		return driver.findElement(By.id("edit-field-willing-to-work-und-kolkatta"));
	}
	public WebElement willingToWorkMumbai(WebDriver driver) {
		return driver.findElement(By.id("edit-field-willing-to-work-und-mumbai"));
	}
	
	public WebElement educationalInfo(WebDriver driver) {
		return driver.findElement(By.xpath("//fieldset[contains(@class,'educational-information')]//a"));
	}
	public WebElement professionalInfo(WebDriver driver) {
		return driver.findElement(By.xpath("//fieldset[contains(@class,'professional-information')]//a"));
	}
	public WebElement supportingDocuments(WebDriver driver) {
		return driver.findElement(By.xpath("//fieldset[contains(@class,'supporting-documents')]//a"));
	}
	
	public WebElement institutionName(WebDriver driver) {
		return driver.findElement(By.id("edit-field-education-information-und-0-field-institution-name-und-0-value"));
	}
	public WebElement degreeName(WebDriver driver) {
		return driver.findElement(By.id("edit-field-education-information-und-0-field-degree-name-und-0-value"));
	}
	public WebElement specialization(WebDriver driver) {
		return driver.findElement(By.id("edit-field-education-information-und-0-field-specialization-und-0-value"));
	}
	public WebElement yearOfPassing(WebDriver driver) {
		return driver.findElement(By.id("edit-field-education-information-und-0-field-year-of-passing-und-0-value-year"));
	}
	public WebElement percentageMarks(WebDriver driver) {
		return driver.findElement(By.id("edit-field-education-information-und-0-field-percentage-of-marks-und-0-value"));
	}
	public WebElement companyName(WebDriver driver) {
		return driver.findElement(By.id("edit-field-professional-information-und-0-field-company-name-und-0-value"));
	}
	public WebElement role(WebDriver driver) {
		return driver.findElement(By.id("edit-field-professional-information-und-0-field-role-und-0-value"));
	}
	public WebElement date1(WebDriver driver) {
		return driver.findElement(By.id("edit-field-professional-information-und-0-field-duration-und-0-value-datepicker-popup-0"));
	}
	public WebElement date2(WebDriver driver) {
		return driver.findElement(By.id("edit-field-professional-information-und-0-field-duration-und-0-value2-datepicker-popup-0"));
	}
	public WebElement saveButton(WebDriver driver){
		return driver.findElement(By.id("edit-submit"));
	}
}
