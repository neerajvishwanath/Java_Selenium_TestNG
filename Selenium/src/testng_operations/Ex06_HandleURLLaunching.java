package testng_operations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ex06_HandleURLLaunching {
	WebDriver driver;
	String projectPath = System.getProperty("user.dir");
	String chromeDriverPath = System.setProperty("webdriver.chrome.driver", projectPath +"\\drivers\\chromedriver.exe");
	String url = "https://parabank.parasoft.com/parabank/index.htm";
	
	@Test
	public void test01() throws Exception {
		driver = new ChromeDriver(); 
		driver.get(url);
		Thread.sleep(3000);
		driver.close();
	}
	

}
