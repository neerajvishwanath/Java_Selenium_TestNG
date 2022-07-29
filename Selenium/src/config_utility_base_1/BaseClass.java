package config_utility_base_1;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class BaseClass extends UtilityClass {
	
	@BeforeMethod
    public void setUp() throws InterruptedException {
        launchBrowser("CHROME");
        launchApp();
    }
	 
	@AfterMethod
    public void tearDown() {
      closeBrowser();
    }
	
}
