package com.juneproject.utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.ExtentReports;

//import com.gargoylesoftware.htmlunit.AlertHandler;

public class Seleniumutility {
	public static RemoteWebDriver driver;
	static String message;
	public ExtentReports reports = new ExtentReports("src/test/resources/com/juneproject/reports/report.html", false);
	public static void Applaunch(String browsername, String URL) {
		if (browsername.equalsIgnoreCase("firefox")) {
//			System.setProperty("webdriver.gecko.driver",
//					"D:\\Work\\Jars\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get(URL);
		} else if (browsername.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"D:\\Work\\Jars\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(URL);
		} else if (browsername.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver",
					"D:\\Work\\Jars\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			driver.get(URL);
		}
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	public static void textboxHandle(String type, String identifier,
			String value) {

		if (type.equalsIgnoreCase("id")) {
			driver.findElementById(identifier).clear();
			driver.findElementById(identifier).sendKeys(value);
		} else if (type.equalsIgnoreCase("name")) {
			driver.findElementById(identifier).clear();
			driver.findElementByName(identifier).sendKeys(value);
		} else if (type.equalsIgnoreCase("name")) {
			driver.findElementById(identifier).clear();
			driver.findElementByName(identifier).sendKeys(value);
		} else if (type.equalsIgnoreCase("class")) {
			driver.findElementById(identifier).clear();
			driver.findElementByClassName(identifier).sendKeys(value);
		} else if (type.equalsIgnoreCase("xpath")) {
			driver.findElementById(identifier).clear();
			driver.findElementByXPath(identifier).sendKeys(value);
		} else if (type.equalsIgnoreCase("tagname")) {
			driver.findElementById(identifier).clear();
			driver.findElementByTagName(identifier).sendKeys(value);
		} else if (type.equalsIgnoreCase("linktext")) {
			driver.findElementById(identifier).clear();
			driver.findElementByLinkText(identifier).sendKeys(value);
		} else if (type.equalsIgnoreCase("partiallinktext")) {
			driver.findElementById(identifier).clear();
			driver.findElementByPartialLinkText(identifier).sendKeys(value);
		}

	}

	public static void buttonHandle(String type, String identifier) {
		if (type.equalsIgnoreCase("id")) {
			driver.findElementById(identifier).click();
		} else if (type.equalsIgnoreCase("name")) {
			driver.findElementByName(identifier).click();

		} else if (type.equalsIgnoreCase("name")) {
			driver.findElementByName(identifier).click();
		} else if (type.equalsIgnoreCase("class")) {
			driver.findElementByClassName(identifier).click();
		} else if (type.equalsIgnoreCase("xpath")) {
			driver.findElementByXPath(identifier).click();
		} else if (type.equalsIgnoreCase("tagname")) {
			driver.findElementByTagName(identifier).click();
		} else if (type.equalsIgnoreCase("linktext")) {
			driver.findElementByLinkText(identifier).click();
		} else if (type.equalsIgnoreCase("partiallinktext")) {
			driver.findElementByPartialLinkText(identifier).click();
		}
	}

	public static void checkboxHandle(String type, String identifier) {

		if (type.equalsIgnoreCase("id")) {
			driver.findElementById(identifier).click();
		} else if (type.equalsIgnoreCase("name")) {
			driver.findElementByName(identifier).click();

		} else if (type.equalsIgnoreCase("name")) {
			driver.findElementByName(identifier).click();
		} else if (type.equalsIgnoreCase("class")) {
			driver.findElementByClassName(identifier).click();
		} else if (type.equalsIgnoreCase("xpath")) {
			driver.findElementByXPath(identifier).click();
		} else if (type.equalsIgnoreCase("tagname")) {
			driver.findElementByTagName(identifier).click();
		} else if (type.equalsIgnoreCase("linktext")) {
			driver.findElementByLinkText(identifier).click();
		} else if (type.equalsIgnoreCase("partiallinktext")) {
			driver.findElementByPartialLinkText(identifier).click();
		}

	}

	public static String webElementHandle(String type, String identifier) {
		WebElement webelement = null;
		if (type.equalsIgnoreCase("id")) {
			webelement = driver.findElementById(identifier);
		} else if (type.equalsIgnoreCase("name")) {
			webelement = driver.findElementByName(identifier);

		} else if (type.equalsIgnoreCase("name")) {
			webelement = driver.findElementByName(identifier);
		} else if (type.equalsIgnoreCase("class")) {
			webelement = driver.findElementByClassName(identifier);
		} else if (type.equalsIgnoreCase("xpath")) {
			webelement = driver.findElementByXPath(identifier);
		} else if (type.equalsIgnoreCase("tagname")) {
			webelement = driver.findElementByTagName(identifier);
		} else if (type.equalsIgnoreCase("linktext")) {
			webelement = driver.findElementByLinkText(identifier);
		} else if (type.equalsIgnoreCase("partiallinktext")) {
			webelement = driver.findElementByPartialLinkText(identifier);
		}

		String message = webelement.getText();
		return message;
	}

	public static void frameHandle(String type, String identifier) {
		WebElement framefocus = null;
		if (type.equalsIgnoreCase("id")) {
			framefocus = driver.findElementById(identifier);
		} else if (type.equalsIgnoreCase("name")) {
			framefocus = driver.findElementByName(identifier);
		} else if (type.equalsIgnoreCase("name")) {
			framefocus = driver.findElementByName(identifier);
		} else if (type.equalsIgnoreCase("class")) {
			framefocus = driver.findElementByClassName(identifier);
		} else if (type.equalsIgnoreCase("xpath")) {
			framefocus = driver.findElementByXPath(identifier);
		} else if (type.equalsIgnoreCase("tagname")) {
			framefocus = driver.findElementByTagName(identifier);
		} else if (type.equalsIgnoreCase("linktext")) {
			framefocus = driver.findElementByLinkText(identifier);
		} else if (type.equalsIgnoreCase("partiallinktext")) {
			framefocus = driver.findElementByPartialLinkText(identifier);
		}
		driver.switchTo().frame(framefocus);

	}

	public static void listboxHandle(String type, String identifier,
			String value) {
		WebElement listbox = null;
		if (type.equalsIgnoreCase("id")) {
			listbox = driver.findElementById(identifier);
		} else if (type.equalsIgnoreCase("name")) {
			listbox = driver.findElementByName(identifier);

		} else if (type.equalsIgnoreCase("name")) {
			listbox = driver.findElementByName(identifier);
		} else if (type.equalsIgnoreCase("class")) {
			listbox = driver.findElementByClassName(identifier);
		} else if (type.equalsIgnoreCase("xpath")) {
			listbox = driver.findElementByXPath(identifier);
		} else if (type.equalsIgnoreCase("tagname")) {
			listbox = driver.findElementByTagName(identifier);
		} else if (type.equalsIgnoreCase("linktext")) {
			listbox = driver.findElementByLinkText(identifier);
		} else if (type.equalsIgnoreCase("partiallinktext")) {
			listbox = driver.findElementByPartialLinkText(identifier);
		}
		Select select = new Select(listbox);
		select.selectByVisibleText(value);

	}

	/**
	 * 
	 * @param value OK, XXXX
	 */
	public static void alertHandle(String value) {
		if (value.equalsIgnoreCase("OK")) {
			driver.switchTo().alert().accept();
		} else {
			driver.switchTo().alert().dismiss();
		}

	}
	
	public static void closeBrowser(){
		driver.close();
	}

}
