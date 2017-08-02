package selenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SingleCheckBox {

	public static void main(String[] args) {
		
		FirefoxDriver firefox = new FirefoxDriver();
		firefox.get("http://www.seleniumeasy.com/test/basic-checkbox-demo.html");

		WebElement checkBox = firefox.findElementById("isAgeSelected");
		
		/**
		 * 
		 * make sure check box has been already selected
		 * select the checkbox only if not already selected
		 */
		
		if(!checkBox.isSelected()){
			checkBox.click();
		}

		//wait for 5 secs
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
		
		firefox.close();

	}

}
