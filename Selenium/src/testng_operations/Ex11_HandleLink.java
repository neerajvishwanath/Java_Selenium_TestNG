package testng_operations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ex11_HandleLink {
	
	WebDriver driver;
	String projectPath = System.getProperty("user.dir");
    String chromeDriverPath = System.setProperty("webdriver.chrome.driver", projectPath + "\\drivers\\chromedriver.exe");
	String url = "https://facebook.com";
	
	@Test
	public void test01() throws Exception{
		driver = new ChromeDriver() ;
		driver.get(url);
		
		Thread.sleep(3000);
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		int linksCount = links.size();
		System.out.println(linksCount);
		
		Thread.sleep(2000);
		//links.get(2).click();
		
		
		
		driver.quit();
		
		
	}

}
