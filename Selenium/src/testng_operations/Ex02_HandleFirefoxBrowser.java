package testng_operations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Ex02_HandleFirefoxBrowser {
	
	@Test
	public void test01() throws Exception{
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.gecko.driver", projectPath +"\\drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		Thread.sleep(5000);
		driver.close();
		
		//This program fails. Because we haven't downloaded the firefox Browser and WebDriver of the Browser 
		
		
	}
}
