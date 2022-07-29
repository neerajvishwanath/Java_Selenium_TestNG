package config_utility_base_2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass extends UtilityClass {

	@BeforeClass
    public void setUp() throws InterruptedException {
        launchBrowser("CHROME");
        launchApp();
        login();
	}
	
	@AfterClass
    public void tearDown() {
      logout();
      closeBrowser();
    }
}
