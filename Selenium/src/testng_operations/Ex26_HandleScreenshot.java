package testng_operations;



import java.io.File;
import java.io.IOException;
//import java.text.SimpleDateFormat;
import java.util.Date;
 
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
 
public class Ex26_HandleScreenshot {
 
    WebDriver driver;
    String projectPath = System.getProperty("user.dir");
    String chromeDriverPath = System.setProperty("webdriver.chrome.driver", projectPath + "\\drivers\\chromedriver.exe");
    String url = "https://parabank.parasoft.com/parabank/index.htm";
 

    @Test
    public void test01() throws InterruptedException, IOException {
 
        driver = new ChromeDriver();
        driver.get(url);
 
        Thread.sleep(2000);

    //    String screenshotFileName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());

        //OR

        Date currentDate = new Date();

        String screenshotFileName = currentDate.toString().replace(" ", "-").replace(":", "-");

        File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
 
        //Make sure screenshots folder is already created at the project level
        FileUtils.copyFile(srcFile, new File(".//screenshots//" + screenshotFileName + ".png"));
 
        Thread.sleep(2000);

        driver.quit();

    }
}