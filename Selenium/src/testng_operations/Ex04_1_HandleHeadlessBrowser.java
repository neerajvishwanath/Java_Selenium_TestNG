package testng_operations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;

public class Ex04_1_HandleHeadlessBrowser {
	
	@Test
	public void test01() throws Exception {
		
		WebDriver driver = new HtmlUnitDriver();
		
		driver.quit();
		
	}
	

}
