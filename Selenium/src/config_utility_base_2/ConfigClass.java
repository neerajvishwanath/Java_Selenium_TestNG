package config_utility_base_2;

import org.openqa.selenium.WebDriver;

public class ConfigClass {
	
	 public static WebDriver driver;

	    public static String projectPath = System.getProperty("user.dir");
	    public static String chromeDriverPath = projectPath + "\\drivers\\chromedriver.exe";
	    public static String geckoDriverPath = projectPath + "\\drivers\\geckodriver.exe";

	    public static String url = "https://parabank.parasoft.com/parabank/index.htm";

	    public static String loginUsername = "john";
	    public static String loginPassword = "demo";
	
}
