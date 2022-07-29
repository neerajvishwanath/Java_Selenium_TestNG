package testng_operations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ex14_HandleButton {
	
	  WebDriver driver;
	    String projectPath = System.getProperty("user.dir");
	    String chromeDriverPath = System.setProperty("webdriver.chrome.driver", projectPath + "\\drivers\\chromedriver.exe");
	    String url = "https://facebook.com";

	  @Test
	  public void test01() throws InterruptedException {

	        driver = new ChromeDriver();
	        driver.get(url);

	        Thread.sleep(2000);

	        //Xpath
	        WebElement loginButton = driver.findElement(By.xpath("//button[@id='u_0_d_d1']"));
	        loginButton.click();
	        
	        /*
	        //cssSelector
	        WebElement loginButton = driver.findElement(By.cssSelector("button[id='u_0_d_d1']"));
	        loginButton.click();
	        */
	        
	        
	        driver.quit();
	        
	  }
}
