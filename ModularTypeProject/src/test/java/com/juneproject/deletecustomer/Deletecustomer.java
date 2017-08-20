package com.juneproject.deletecustomer;

import com.juneproject.utilities.Seleniumutility;



public class Deletecustomer extends Seleniumutility {
	public static void main (String arg[]){
	Applaunch("firefox","http://www.learnnshine.com/drupal/manage-customers");
	buttonHandle("partiallinktext","delete");
	buttonHandle("id","edit-submit");
	
	
	}

}
