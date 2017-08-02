package frameworks;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class MySecondTestNGClass {
  @Test
  public void testCase1() {
	  System.out.println("logout func 1");
	  
  }
  @Test
  public void testCase2() {
	  System.out.println("logout func 2");
	  
  }
  @Test
  public void testCase3() {
	  
	  System.out.println("logout func 3");
  }
  @Test
  public void testCase4() {
	  
	  System.out.println("logout func 4");
  }
  @Test
  public void testCase5() {
	  
	  
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }

}
