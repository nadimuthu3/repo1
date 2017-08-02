package selenium;

import java.util.Vector;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TextBoxHandlingAndVerify {

	public static void main(String[] args) {
	
		//launch browser and load url
		FirefoxDriver firefox = new FirefoxDriver();
		firefox.get("http://www.seleniumeasy.com/test/basic-first-form-demo.html");
		
		//enter the message in 'enter message' text box
		WebElement messageTextBox = firefox.findElementByXPath("//input[@placeholder='Please enter your Message']");
		messageTextBox.sendKeys("Prathik");
		
		//click show message link
		WebElement showMessageButton = firefox.findElementByXPath("//button[contains(text(),'Show Message')]");
		showMessageButton.click();
		
		WebElement showmessagetext = firefox.findElementById("display");
		String actualMessageGettingDsiplayed = showmessagetext.getText();
		
		//compare the text and declare pass or fail
		System.out.println("actual value getting displayed "+actualMessageGettingDsiplayed );
		if(actualMessageGettingDsiplayed.equalsIgnoreCase("Prathik")){
			System.out.println("case passed");
		}else
		{
			System.out.println("case failed");
		}
		
		
		firefox.close();
	}

}
