package frameworks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SampleDataprovider {

	private static WebDriver driver;

	@DataProvider(name = "Authentication")
	public static Object[][] credentials() {

		/*
		 * here two test data has been sent, so in the @Test method where this data provider 
		 * has been mapped will be executed for two times
		 */
		return new Object[][] { { "nadi", "muthu","j" },{"ravi","shankar","a"}};

	}

	@Test(dataProvider = "Authentication")
	public void test(String fName, String mName, String lName) {

		try {
			driver = new FirefoxDriver();

			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");

			driver.findElement(By.id("userRegistrationForm:firstName")).sendKeys(fName);

			driver.findElement(By.id("userRegistrationForm:middleName")).sendKeys(mName);

			driver.findElement(By.id("userRegistrationForm:lastName")).sendKeys(lName);
		
			Thread.sleep(5000);
			
			driver.quit();
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}

}
