package selenium;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;



public class RegistrationPageTC1 {
	static ExtentTest test = null;
	static ExtentReports reports = null;
	static SeleniumUtility utility =null;
	public static void main(String[] args) {
		
		try {
			//reports = new ExtentReports("src/test/resources/reports/TCreports.html");
			reports = new ExtentReports("src/test/resources/reports/TCreports.html", false);
			test = reports.startTest("verify First Name and Last Name", "verify the first name and last name available in registration page");
			
			test.log(LogStatus.INFO, "launch browser and load URL ");
			utility = new SeleniumUtility();
			utility.launchBrowserAndLoadURL("firefox", "http://www.seleniumeasy.com/test/input-form-demo.html");
			
			String firstname = utility.readData("firstname", "src/test/resources/resistrationData.properties");
			test.log(LogStatus.INFO, "enter first name"+firstname);
			utility.textBoxHandling("xpath", "//input[@placeholder='First Name']", firstname);
			
			String lastname = utility.readData("lastname", "src/test/resources/resistrationData.properties");
			test.log(LogStatus.INFO, "enter last name"+lastname);
			utility.textBoxHandling("xpath", "//input[@placeholder='Last Name1']", lastname);
			
			
			
			Thread.sleep(5000);
		} catch (Exception e) {
			//exception happened in script
			e.printStackTrace();
			utility.screenShot();
			String screenCapture = test.addScreenCapture("C:\\Users\\njayapal\\Desktop\\screenShot.png");
			test.log(LogStatus.INFO, "screen capture on failure "+screenCapture);
			test.log(LogStatus.FAIL, "test case has been failed to due to following exception "+e.getMessage());
			
		}finally{
			reports.endTest(test);
			reports.flush();

		}

	}

}
