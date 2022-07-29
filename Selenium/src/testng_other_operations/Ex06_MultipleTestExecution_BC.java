package testng_other_operations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
 
public class Ex06_MultipleTestExecution_BC {
 
    WebDriver driver;
    String projectPath = System.getProperty("user.dir");
    String chromeDriverPath = System.setProperty("webdriver.chrome.driver", projectPath + "\\drivers\\chromedriver.exe");
    String url = "https://parabank.parasoft.com/parabank/index.htm";


    @BeforeClass
      public void beforeClass() {
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
 
    @AfterClass
      public void afterClass() throws InterruptedException {
        Thread.sleep(1000);
        driver.quit();
 
      }
 
}
