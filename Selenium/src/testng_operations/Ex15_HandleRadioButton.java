package testng_operations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Ex15_HandleRadioButton {

	WebDriver driver;
	String projectPath = System.getProperty("user.dir");
	String chromeDriverPath = System.setProperty("webdriver.chrome.driver", projectPath + "\\drivers\\chromedriver.exe");
	String url = "https://facebook.com";
	@Test
	public void test01() throws Exception{
		driver = new ChromeDriver();
		driver.get(url);
		
		Thread.sleep(3000);
		
		WebElement createAccount = driver.findElement(By.linkText("Create New Account"));
		createAccount.click();
		
		Thread.sleep(3000);
		
//		WebElement radioButton = driver.findElement(By.xpath("//*[@for='u_4_2_KA']"));
//		WebElement radioButton = driver.findElement(By.xpath("//label[@for='u_4_2_KA']"));
//		WebElement radioButton = driver.findElement(By.xpath("//*[@id='u_4_2_KA']"));
		WebElement radioButton = driver.findElement(By.xpath("//input[@value='1']"));
		
		radioButton.click();
		
		System.out.println(radioButton.isSelected());
		
		Thread.sleep(3000);
		
		
		driver.quit();
	}
	
}
