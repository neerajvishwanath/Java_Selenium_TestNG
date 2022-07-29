package testng_other_operations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
 
public class Ex05_MultipleTestExecution_BM {
 
    WebDriver driver;
    String projectPath = System.getProperty("user.dir");
    String chromeDriverPath = System.setProperty("webdriver.chrome.driver", projectPath + "\\drivers\\chromedriver.exe");
    String url = "https://parabank.parasoft.com/parabank/index.htm";
 

     @BeforeMethod
      public void beforeMethod() {
             driver = new ChromeDriver();
            driver.get(url);
      }


    @Test
    public void test01() throws InterruptedException {
 
        
        WebElement aboutUsLink = driver.findElement(By.linkText("About Us"));
        aboutUsLink.click();
        System.out.println(driver.getTitle());

    }

    @Test
    public void test02() throws InterruptedException {
 
        WebElement servicesLink = driver.findElement(By.linkText("Services"));
        servicesLink.click();
        System.out.println(driver.getTitle());
 
    }
 

    @AfterMethod
      public void afterMethod() throws InterruptedException {
        Thread.sleep(1000);
        driver.quit();
 
      }
 
}
