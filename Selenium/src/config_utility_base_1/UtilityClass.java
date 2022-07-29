package config_utility_base_1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class UtilityClass extends ConfigClass {
	
	 public void launchBrowser(String browser) {

	        switch(browser){

	        case "CHROME":
	            System.setProperty("webdriver.chrome.driver", chromeDriverPath);
	            driver = new ChromeDriver();
	            break;

	        case "FIREFOX":
	            System.setProperty("webdriver.gecko.driver", geckoDriverPath);
	            driver = new FirefoxDriver();
	            break;

	        case "HTMLUNIT":
	            driver = new HtmlUnitDriver();
	            break;

	        default:
	            System.out.println("Browser is not supported");
	        }


	    }

	    public void launchApp() {
	        driver.get(url);
	    }

	    public void closeBrowser() {
	        driver.quit();
	    }
	
}
