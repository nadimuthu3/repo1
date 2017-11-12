package com.selenium.utilities;

import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumUtility {

	
	RemoteWebDriver driver = null;
	/**
	 * This method will help us to laucnh required broiwser and load the passed URL in browser
	 * @param browserName firefox, chrome, ie
	 * @param uRL application URL
	 */
	public void launchApp(String browserName, String uRL){
	
		if(browserName.equals("firefox")){
			driver = new FirefoxDriver();
			
		}else if(browserName.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\softwares\\drivers\\new chrome\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}else if(browserName.equals("ie")){
			driver = new InternetExplorerDriver();
			
		}
		
		driver.get(uRL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	/**
	 * 
	 * @param locatorType - id, name, class, xpath, css
	 * @param locator
	 * @param textToBePassed
	 */
	public void textBoxHandling(String locatorType, String locator, String textToBePassed){
		WebElement textBox = null;
		if(locatorType.equals("id")){
			textBox = driver.findElementById(locator);
		}else if(locatorType.equals("name")){
			textBox = driver.findElementByName(locator);
		}else if(locatorType.equals("class")){
			textBox = driver.findElementByClassName(locator);
		}else if(locatorType.equals("xpath")){
			textBox = driver.findElementByXPath(locator);
		}else if(locatorType.equals("css")){
			textBox = driver.findElementByCssSelector(locator);
		}
		textBox.clear();
		textBox.sendKeys(textToBePassed);
	}

	/**
	 * 
	 * @param locatorType
	 * @param locator
	 */
	public void buttonHandling(String locatorType, String locator){
		WebElement button = null;
		if(locatorType.equals("id")){
			button = driver.findElementById(locator);
		}else if(locatorType.equals("name")){
			button = driver.findElementByName(locator);
		}else if(locatorType.equals("class")){
			button = driver.findElementByClassName(locator);
		}else if(locatorType.equals("xpath")){
			button = driver.findElementByXPath(locator);
		}else if(locatorType.equals("css")){
			button = driver.findElementByCssSelector(locator);
		}
		button.click();
	}
	
	public void dropDownHandling(String type,String identifier,String value){
		WebElement listbox=null;
		if(type.equalsIgnoreCase("id")){
			listbox=driver.findElementById(identifier);
		}else if (type.equalsIgnoreCase("name")){
			listbox=driver.findElementByName(identifier);
			
		}else if (type.equalsIgnoreCase("name")){
			listbox=driver.findElementByName(identifier);
		}else if (type.equalsIgnoreCase("class")){
			listbox=driver.findElementByClassName(identifier);
		}else if (type.equalsIgnoreCase("xpath")){
			listbox=driver.findElementByXPath(identifier);
		}
		Select select=new Select(listbox);
		select.selectByVisibleText(value);
		
		
	}
	/**
	 * 
	 * @param option OK. CANCEL
	 */
	public  String alertHandle(String option){
		
		Alert alert = driver.switchTo().alert();
		String textOnALert = alert.getText();
		
		if(option.equalsIgnoreCase("OK")){
			alert.accept();
		}else {
			alert.dismiss();
		}
		
		return textOnALert;
	}
	
	public void closeApp(){
		driver.quit();
	}
	
	
	public void screenShot(){
		
		Random random = new Random();
//		int maximum = 999;
//		int minimum = 100;
//		int n = maximum - minimum + 1;
		int i = random.nextInt();
//		int randomNum =  minimum + i;
		String reportFileName = String.valueOf(i);
		
		
		
		File srcFile = driver.getScreenshotAs(OutputType.FILE);
		System.out.println("screen has been saved in following path "+"C:\\Users\\njayapal\\scrnEvidence"+reportFileName+".png");
		
		File destFile = new File("C:\\Users\\njayapal\\scrnEvidence"+reportFileName+".png");
		
		try {
			FileUtils.copyFile(srcFile, destFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
}
