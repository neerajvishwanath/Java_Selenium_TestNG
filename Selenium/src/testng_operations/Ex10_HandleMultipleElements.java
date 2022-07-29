package testng_operations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ex10_HandleMultipleElements {
	
	WebDriver driver;
	String projectPath = System.getProperty("user.dir");
	String chromeDriverPath = System.setProperty("webdriver.chrome.driver", projectPath+"\\drivers\\chromedriver.exe");
	String url = "https://www.facebook.com";
	
	@Test
	public void test01() throws Exception{
		driver = new ChromeDriver();
		driver.get(url);
		Thread.sleep(3000);
		
		WebElement createNewAccount = driver.findElement(By.linkText("Create New Account"));
		createNewAccount.click();
		
		Thread.sleep(3000);
		
		List<WebElement> textBoxList = driver.findElements(By.className("inputtext"));
		int textBoxCount = textBoxList.size();
		System.out.println(textBoxCount);
		
		textBoxList.get(4).sendKeys("92374");
		Thread.sleep(5000);
		
		driver.close();
		
		
	}

}
