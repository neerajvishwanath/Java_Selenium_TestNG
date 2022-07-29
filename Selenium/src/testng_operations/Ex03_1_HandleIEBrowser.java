package testng_operations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class Ex03_1_HandleIEBrowser {
	
	@Test
	public void test01() throws Exception{
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.ie.driver",projectPath +"\\drivers\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		Thread.sleep(5000);
		driver.quit();
		//This program fails. Because we haven't downloaded the  WebDriver of the IE Browser 
	}

}
