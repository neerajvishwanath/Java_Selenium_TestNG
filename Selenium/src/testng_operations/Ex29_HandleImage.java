package testng_operations;

import java.io.File;

import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ex29_HandleImage {

	WebDriver driver;
    String projectPath = System.getProperty("user.dir");
    String chromeDriverPath = System.setProperty("webdriver.chrome.driver", projectPath + "\\drivers\\chromedriver.exe");
    String url = "https://parabank.parasoft.com/parabank/index.htm";

  @Test
  public void test01() throws InterruptedException, Exception {

        driver = new ChromeDriver();
        driver.get(url);

        Thread.sleep(2000);
        
        
        WebElement Logo = driver.findElement(By.xpath("//*[@class='logo']"));
        
        System.out.println("Image Name is " + Logo.getAttribute("alt"));
        
        System.out.println("Image Size " + Logo.getSize());
        
        Date currentDate = new Date();
        
        String screenshotFileName = currentDate.toString().replace(" ", "-").replace(":", "-");
        
        File src = Logo.getScreenshotAs(OutputType.FILE);

        FileUtils.copyFile(src, new File(".//screenshots//" + screenshotFileName + ".png"));
        
        Thread.sleep(5000);
  
        driver.quit();
  }
  
}
