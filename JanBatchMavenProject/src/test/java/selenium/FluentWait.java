package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.*;

import com.google.common.base.Function;

public class FluentWait {

	public static void main(String[] args) {
		
		/**
		 * 
		 * Each FluentWait instance defines the maximum amount of time to wait for a condition, 
		 * as well as the frequency with which to check the condition
		 * 
		 * also we can ignore the exception which occurs for each polling like NoSuchElementException...
		 */
		
		/**
		 * Here in this example, our code will look for button.  
		 * when the button is available, it will find the element and proceed.
		 * if the button is not available, it will look for element every 5 seconds.
		 * after 30 seconds, timeout will happen
		 */
		
		try {
			FirefoxDriver firefox = new FirefoxDriver();
			
			//load url
			firefox.get("http://toolsqa.wpengine.com/automation-practice-switch-windows/");
			//maximize window
			firefox.manage().window().maximize();

			//implementing fluent wait
			
			Wait<WebDriver> wait =new org.openqa.selenium.support.ui.FluentWait<WebDriver>(firefox)
					.withTimeout(30, TimeUnit.SECONDS)
					.pollingEvery(5, TimeUnit.SECONDS);
			
			WebElement element = wait.until(new Function<WebDriver, WebElement>() {

				public WebElement apply(WebDriver driver) {
				    return driver.findElement(By.id("timingAlert"));
			    }
				
			});
			
			element.click();
			
			Thread.sleep(10000);
			firefox.close();
		} catch (Exception e) {
			
			e.printStackTrace();
		}

		
	}

}
