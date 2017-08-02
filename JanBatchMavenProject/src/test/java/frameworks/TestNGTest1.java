package frameworks;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class TestNGTest1 {
	
	@Test()
	public void testCase1() {
		System.out.println("Class 1 test case 1 logic");
	}

	@Test()
	public void testCase2() {
		System.out.println("Class 1 test case 2 logic");
	}

	@BeforeMethod()
	public void beforeMethod() {
		System.out.println("Class 1 before method");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("Class 1 after method");
	}

	@BeforeClass
	public void beforeClass() {
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
