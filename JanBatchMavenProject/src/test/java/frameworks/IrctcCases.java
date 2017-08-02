package frameworks;


import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

import selenium.SeleniumUtility;

public class IrctcCases {
	
	SeleniumUtility utility = new SeleniumUtility();
	String alertText = null;
	String dataFileName="src/test/resources/irctcCasesData.properties";
	
	@DataProvider(name="irctcTC1")
	public Object[][] testdata(){
		
		Object[][] data=null;
		try {
			data = ExcelUtils.getTableArray("C:\\Users\\njayapal\\Documents\\personal\\testdata.xlsx", "Sheet1");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data;
	}
	
	@Test(groups={"login"},invocationCount=2,priority=2,dataProvider="irctcTC1")
	public void testCase1(String name) throws Exception {
		try {
			String username = utility.readData("username", dataFileName);
			
			utility.textBoxHandling("id", "usernameId", name);
			utility.buttonHandling("id", "loginbutton");
			Thread.sleep(5000);
			alertText=utility.alerthandling(true);
			System.out.println(alertText);
			
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("issue in exception");
			//e.printStackTrace();
		}
	}

	@Test(groups={"login"},priority=3)
	public void testCase2() {
		try {
//			String username = utility.readData("username", dataFileName);
//			String password = utility.readData("password", dataFileName);
			

			utility.textBoxHandling("id", "usernameId", "nadimuthuj");
			utility.textBoxHandling("name", "j_password", "irctcnadi");
			
			utility.buttonHandling("id", "loginbutton");
			Thread.sleep(5000);
			alertText=utility.alerthandling(true);
			System.out.println(alertText);
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}

	@Test(groups={"login"},priority=1)
	public void testCase3(){
		try {
			String username = utility.readData("username", dataFileName);
			String password = utility.readData("password", dataFileName);
			String captcha = utility.readData("captcha", dataFileName);

			utility.textBoxHandling("id", "usernameId", "nadimuthuj");
			utility.textBoxHandling("name", "j_password", "irctcnadi");
			utility.textBoxHandling("name", "j_captcha", "GBGBH");
			
			utility.buttonHandling("id", "loginbutton");
			Thread.sleep(5000);
			utility.buttonHandling("id", "loginerrorpanelok");
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	@BeforeMethod(groups={"login","registration","logout"})
	@Parameters({"browserName"})
	public void beforeMethod(String browserName) {
		System.out.println("Class 1 before method and the paramter value is "+browserName);
		utility.launchBrowserAndLoadURL(browserName, "https://www.irctc.co.in/eticketing/home");
	}

	@AfterMethod(groups={"login","registration","logout"})
	public void afterMethod() {
		try {
			System.out.println("Class 1 after method");
			utility.textBoxClear("id", "usernameId");
			utility.textBoxClear("name", "j_password");
			utility.textBoxClear("name", "j_captcha");
			utility.closeBrowser();
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}

	@BeforeClass
	@Parameters(value="browser")
	public void beforeClass(String browser) {
		System.out.println("Class 1 before class");
		
	}

	@AfterClass
	public void afterClass() {
		System.out.println("Class 1 after class");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("Class 1 before test");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("Class 1 after test");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Class 1 before suite");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("Class 1 after suite");
	}

}
