package jsexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ex01_HandleScrollingElement {
	WebDriver driver;
    String projectPath = System.getProperty("user.dir");
    String chromeDriverPath = System.setProperty("webdriver.chrome.driver", projectPath + "\\drivers\\chromedriver.exe");
    String url = "http://the-internet.herokuapp.com/";

    @Test
    public void test01() throws InterruptedException {
 
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
    
        JavascriptExecutor js = (JavascriptExecutor) driver;
        
        Thread.sleep(2000);
        
        //Way-1
//        js.executeScript("window.scrollBy(0,1000);");
        
        //Way-2
        WebElement element = driver.findElement(By.linkText("Forgot Password"));
        
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        
        
        Thread.sleep(3000);
        
        driver.quit();
    
    }
}
