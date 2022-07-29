package jsexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ex02_HandleButton {
	WebDriver driver;
    String projectPath = System.getProperty("user.dir");
    String chromeDriverPath = System.setProperty("webdriver.chrome.driver", projectPath + "\\drivers\\chromedriver.exe");
    String url = "https://parabank.parasoft.com/parabank/index.htm";

  @Test
  public void test01() throws InterruptedException {


        driver = new ChromeDriver();
        driver.get(url);

        Thread.sleep(2000);
  
        JavascriptExecutor js = (JavascriptExecutor) driver;
        
        WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log In']"));
        
        js.executeScript("arguments[0].click();", loginButton);
        
        Thread.sleep(3000);
        
        driver.quit();
  
  }
}
