package testng_operations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Ex28_HandleSynchronization {
	WebDriver driver;
    String projectPath = System.getProperty("user.dir");
    String chromeDriverPath = System.setProperty("webdriver.chrome.driver", projectPath + "\\drivers\\chromedriver.exe");
    String url = "https://parabank.parasoft.com/parabank/index.htm";

  @Test
  public void test01() throws InterruptedException {


        driver = new ChromeDriver();
        driver.get(url);
        
        
        //Page Load Time
        driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);

        WebElement aboutUsPage = driver.findElement(By.linkText("About Us"));
        aboutUsPage.click();
        
        
        /*
        //Implicit Wait
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        
        WebElement usernameTextbox = driver.findElement(By.name("username"));
        usernameTextbox.sendKeys("john");

        WebElement passwordTextbox = driver.findElement(By.name("password"));
        passwordTextbox.sendKeys("demo");
        */
        
        //Explicit Wait - Type1
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("password")));
        
        WebElement passwordTextbox = driver.findElement(By.name("password"));
        passwordTextbox.sendKeys("demo");
        
        
        //Explicit Wait - Type2
        //Thread.sleep(15000);
        
        driver.quit();
  }        
}
