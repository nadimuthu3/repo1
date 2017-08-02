package selenium;

import org.testng.annotations.Test;

public class NewTest {
  SeleniumUtility utility = new SeleniumUtility();
  LoginIrctc loginpage = new LoginIrctc();
  @Test
  public void f() {
	  utility.launchBrowserAndLoadURL("firefox", "https://www.irctc.co.in/eticketing/loginHome.jsf");
	  loginpage.username().sendKeys("nadimuthuj");
	  loginpage.password().sendKeys("irctcnadi");
	  loginpage.loginButton().click();
	  
  }
}
