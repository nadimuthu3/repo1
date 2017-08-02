package selenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginIrctc {

	FirefoxDriver driver = new FirefoxDriver();
	public WebElement username(){
		return driver.findElementById("usernameId");
	}
	public WebElement password(){
		return driver.findElementByName("j_password");
	}
	public WebElement captcha(){
		return driver.findElementByName("j_captcha");
	}
	public WebElement loginButton(){
		return driver.findElementById("loginbutton");
	}
	 
}
