package frameworks;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNGTest2 {
	@Test(invocationCount = 2)
	@Parameters({ "parameter1" })
	public void testCase1() {
		System.out.println("Class 2 test case 1 logic");
	}

	@Test
	public void testCase2() {
		System.out.println("Class 2 test case 2 logic");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Class 2 before method");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("Class 2 after method");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("Class 2 before class");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("Class 2 after class");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("Class 2 before test");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("Class 2 after test");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Class 2 before suite");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("Class 2 after suite");
	}
}
