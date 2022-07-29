package testng_operations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ex07_HandleDisplayWebItems {
	
	WebDriver driver;
	String projectPath = System.getProperty("user.dir");
	String chromeDriverPath = System.setProperty("webdriver.chrome.driver", projectPath + "\\drivers\\chromedriver.exe");
	String url = "https://parabank.parasoft.com/parabank/index.htm";
	
	@Test
	public void test01() throws Exception {
		driver = new ChromeDriver() ;
		driver.get(url);
		Thread.sleep(2000);
		
		//Capture current URL
		String pageURL = driver.getCurrentUrl();
		System.out.println("Parabank Page URL -->" + pageURL);
		
		//Capture Page Title
		String pageTitle = driver.getTitle();
		System.out.println("Parabank Page Title -->" + pageTitle);
		
		//Capture Page Source
		String pageSourceCode = driver.getPageSource();
		System.out.println("Parabank Page Source is -->" + pageSourceCode);
		
		driver.quit();
	}
	
}
