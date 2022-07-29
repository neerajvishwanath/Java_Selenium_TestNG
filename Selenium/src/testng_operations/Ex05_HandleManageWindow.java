package testng_operations;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ex05_HandleManageWindow {
	
	@Test
	public void test01() throws Exception{
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath +"\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		Thread.sleep(3000);
		
		System.out.println(driver.manage().window().getSize());
		
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		// Manage Width & Height
		driver.manage().window().setSize(new Dimension(1150,808));
		
		Thread.sleep(3000);
		
		driver.manage().window().fullscreen();
		
		Thread.sleep(3000);
		
		driver.quit();
		
	}
	
}
