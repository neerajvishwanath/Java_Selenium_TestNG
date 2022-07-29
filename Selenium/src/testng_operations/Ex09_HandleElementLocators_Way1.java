package testng_operations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ex09_HandleElementLocators_Way1 {
	
	WebDriver driver;
	String projectPath = System.getProperty("user.dir");
	String chromeDriverPath = System.setProperty("webdriver.chrome.driver", projectPath+"\\drivers\\chromedriver.exe");
	//String url = "http://www.fb.com/";
	String url = "https://parabank.parasoft.com/parabank/index.htm";
	
	@Test
	public void test01() throws Exception{
		
		driver = new ChromeDriver();
		driver.get(url);
		
		Thread.sleep(3000);
		/*
		//LinkText
		driver.findElement(By.linkText("Forgotten password?")).click();
		Thread.sleep(3000);
		
		//PartialText 
		//driver.findElement(By.partialLinkText("Forgotten")).click();
		
		//Name
		//driver.findElement(By.name("email")).sendKeys("john@123");
		//Thread.sleep(3000);
		
		
		
		//ID
		driver.findElement(By.id("identify_email")).sendKeys("john@123");
		Thread.sleep(3000);
		driver.findElement(By.id("did_submit")).click();
		Thread.sleep(5000);
		*/
		
		
		 //LinkText
        driver.findElement(By.linkText("About Us")).click();
        Thread.sleep(3000);

        //PartialLinkText
        driver.findElement(By.partialLinkText("Ser")).click();
        Thread.sleep(3000);

        //LinkText
        driver.findElement(By.linkText("Register")).click();
        Thread.sleep(3000);

        //Name
        driver.findElement(By.name("customer.firstName")).sendKeys("John");
        Thread.sleep(3000);

        //ID
        driver.findElement(By.id("customer.lastName")).sendKeys("Adam");
        Thread.sleep(3000);

        driver.quit();
		
		
		driver.quit();
	}
	
	
}
