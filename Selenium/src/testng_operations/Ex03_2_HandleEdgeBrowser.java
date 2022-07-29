package testng_operations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Ex03_2_HandleEdgeBrowser {
	@Test
	public void test01() throws Exception{
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.edge.driver", projectPath +"\\drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		Thread.sleep(5000);
		driver.quit();
		//This program fails. Because we haven't downloaded the  WebDriver of the Edge Browser
	}
}
