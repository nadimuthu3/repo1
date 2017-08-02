package frameworks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelAsDataprovider {

	private static WebDriver driver;
	static Object[][] data = null;
	@DataProvider(name = "Authentication")
	public static Object[][] credentials() {

		/*
		 * here two test data has been sent, so in the @Test method where this data provider 
		 * has been mapped will be executed for two times
		 */
		try {
			data = ExcelUtils.getTableArray("C:\\Users\\njayapal\\Documents\\personal\\testdata.xlsx", "Sheet1");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return data;
	}

	@BeforeMethod
	public void beforeMethod(){
		/*driver = new FirefoxDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
*/
	}
	
	@Test(dataProvider = "Authentication")
	public void test(String fName, String mName, String lName) {

		try {
			System.out.println("data were "+fName+mName+lName);

			driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");

			driver.findElement(By.id("userRegistrationForm:firstName")).sendKeys(fName);

			driver.findElement(By.id("userRegistrationForm:middleName")).sendKeys(mName);

			driver.findElement(By.id("userRegistrationForm:lastName")).sendKeys(lName);
		
			Thread.sleep(5000);
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}
	
	@AfterMethod
	public void afterMethod(){
//		driver.quit();

	}

}
