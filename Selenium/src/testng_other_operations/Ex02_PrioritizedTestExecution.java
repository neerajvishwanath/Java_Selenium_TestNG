package testng_other_operations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
 
public class Ex02_PrioritizedTestExecution {
 
    WebDriver driver;
    String projectPath = System.getProperty("user.dir");
    String chromeDriverPath = System.setProperty("webdriver.chrome.driver", projectPath + "\\drivers\\chromedriver.exe");
    String url = "https://parabank.parasoft.com/parabank/index.htm";
 
    
    @Test(priority = 1)
    public void test01() throws InterruptedException {
 
        driver = new ChromeDriver();
        driver.get(url);
        Thread.sleep(1000);
        WebElement aboutUsLink = driver.findElement(By.linkText("About Us"));
        aboutUsLink.click();
        System.out.println(driver.getTitle());
        Thread.sleep(1000);
        driver.quit();
 
    }

    @Test(priority = 0)
    public void test02() throws InterruptedException {
 
        driver = new ChromeDriver();
        driver.get(url);
        Thread.sleep(1000);
        WebElement servicesLink = driver.findElement(By.linkText("Services"));
        servicesLink.click();
        System.out.println(driver.getTitle());
        Thread.sleep(1000);
        driver.quit();
 
    }
 

 
}