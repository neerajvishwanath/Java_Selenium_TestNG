package upload;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandleFileUpload {
	WebDriver driver;
    String projectPath = System.getProperty("user.dir");
    String chromeDriverPath = System.setProperty("webdriver.chrome.driver", projectPath + "\\drivers\\chromedriver.exe");
    String url = "http://the-internet.herokuapp.com/upload";
    String filePath = projectPath + "\\files\\Screenshot 2022-02-22 192754.png";
 
    @Test
    public void test01() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement choseFile = driver.findElement(By.id("file-upload"));
        choseFile.sendKeys(filePath);
        
//        Thread.sleep(2000);
        
        WebElement uploadFile = driver.findElement(By.id("file-submit"));
        uploadFile.click();
        
//        Thread.sleep(3000);
        WebElement status = driver.findElement(By.xpath("//*[text()='File Uploaded!']"));
        System.out.println(status.getText());
        driver.quit();
    }
}
