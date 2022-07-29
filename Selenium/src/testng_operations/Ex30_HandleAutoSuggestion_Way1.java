package testng_operations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.interactions.Actions;


public class Ex30_HandleAutoSuggestion_Way1 {
	
	 WebDriver driver;
	    String projectPath = System.getProperty("user.dir");
	    String chromeDriverPath = System.setProperty("webdriver.chrome.driver", projectPath + "\\drivers\\chromedriver.exe");
	    String url = "https://www.google.com/";

	  @Test
	  public void test01() throws InterruptedException {


	        driver = new ChromeDriver();
	        driver.get(url);

	        Thread.sleep(1000);
	        WebElement searchBox = driver.findElement(By.name("q"));
	        searchBox.sendKeys("automation");
	        
	        Thread.sleep(3000);
	        
	        Actions action = new Actions(driver);
	        
	  
	        //build --> performing sequence of keys operations
	        action.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	  
	        Thread.sleep(3000);
	        
	        System.out.println(driver.getTitle());

	        Thread.sleep(3000);
	  
	  
	  
	        driver.quit();
	  }	
}
