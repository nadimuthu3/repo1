package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitExample2 {

	public static void main(String[] args) {
		
		/**
		 * 
		 * Explicit wait in selenium makes the code to wait until mentioned condition is met.
		 * when the condition met, the next step of selenium code will be executed.
		 * 
		 * NOTE: selenium has predefined conditions for explicit wait, from that you can choose any.
		 * 
		 * different conditions were as follow,
		 * 
		 * alertIsPresent()
			elementSelectionStateToBe()
			elementToBeClickable()
			elementToBeSelected()
			frameToBeAvaliableAndSwitchToIt()
			invisibilityOfTheElementLocated()
			invisibilityOfElementWithText()
			presenceOfAllElementsLocatedBy()
			presenceOfElementLocated()
			textToBePresentInElement()
			textToBePresentInElementLocated()
			textToBePresentInElementValue()
			titleIs()
			titleContains()
			visibilityOf()
			visibilityOfAllElements()
			visibilityOfAllElementsLocatedBy()
			visibilityOfElementLocated()
		 */
		
		/**
		 * Here in this example, our code will wait for alert to be present. when the alert is available, 
		 * code execution will resume.
		 */
		
		try {
			FirefoxDriver firefox = new FirefoxDriver();
			
			//load url
			firefox.get("http://toolsqa.wpengine.com/automation-practice-switch-windows/");
			//maximize window
			firefox.manage().window().maximize();
			//set implicit timeout of 15 secs
			firefox.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			
			//define explicit wait
			WebDriverWait wait = new WebDriverWait(firefox, 30);
			
			//wait for condition that alert is present
			WebElement element =wait.until(ExpectedConditions.presenceOfElementLocated(By.id("timingAlert")));
			element.click();		
			
			Thread.sleep(5000);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}

}
