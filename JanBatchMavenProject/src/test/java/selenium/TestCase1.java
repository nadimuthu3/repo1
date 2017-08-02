package selenium;

public class TestCase1 {

	public static void main(String[] args) {
		
		SeleniumUtility utility = new SeleniumUtility();
		
		utility.launchBrowserAndLoadURL("chrome", "https://www.seleniumeasy.com/test/input-form-demo.html");
		try {
			utility.textBoxHandling("name", "first_name", "Neha");
			utility.textBoxHandling("name", "last_name", "Agarwal");
			utility.dropDownHandling("name", "state", "New Jersey");
			
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
