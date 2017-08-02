package selenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SampleSeleniumScript {

	public static void main(String[] args) {
		FirefoxDriver firefox = new FirefoxDriver();
		firefox.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		
		WebElement textBox=firefox.findElementById("usernameId");
		textBox.sendKeys("nadimuthuj");
		
		WebElement password=firefox.findElementByName("j_password");
		password.sendKeys("irctcnadi");
		
		WebElement subBtn=firefox.findElementById("loginbutton");
		subBtn.click();
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
	}

}
