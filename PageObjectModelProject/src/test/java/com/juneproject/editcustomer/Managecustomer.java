package com.juneproject.editcustomer;

import com.juneproject.utilities.Seleniumutility;

public class Managecustomer extends Seleniumutility {
	
	public static void main(String[] args) {
		Applaunch("firefox","http://www.learnnshine.com/drupal/manage-customers");
		buttonHandle("partiallinktext","Binoy");
		buttonHandle("partiallinktext","Edit");
		textboxHandle("id","edit-field-present-address-und-0-thoroughfare","Address-modified");
		buttonHandle("id","edit-submit");
		alertHandle("Ok");
	
	}
}
