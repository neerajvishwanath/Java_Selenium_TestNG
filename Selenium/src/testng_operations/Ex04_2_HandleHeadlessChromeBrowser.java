package testng_operations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Ex04_2_HandleHeadlessChromeBrowser {
	
	@Test
	public void test01() throws InterruptedException{
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath + "\\drivers\\chromedriver.exe");
		
		ChromeOptions opt = new ChromeOptions();
		opt.setHeadless(true);
		//opt.setHeadless(true)-->Acts as HeadLess
		//opt.setHeadless(false)-->Acts as GUI
		
		
		WebDriver driver = new ChromeDriver();
		Thread.sleep(5000);
		driver.quit();
		
	}

}
