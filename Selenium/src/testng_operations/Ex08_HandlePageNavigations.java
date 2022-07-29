package testng_operations;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
 
public class Ex08_HandlePageNavigations {
 
    WebDriver driver;
    String projectPath = System.getProperty("user.dir");
    String chromeDriverPath = System.setProperty("webdriver.chrome.driver",
            projectPath + "\\drivers\\chromedriver.exe");
    String url = "https://www.facebook.com/";
 
    @Test
    public void test01() throws Exception {
 
        driver = new ChromeDriver();
 
        driver.get(url);
 
        Thread.sleep(2000);
 
        driver.navigate().back();
        Thread.sleep(2000);
 
        driver.navigate().forward();
        Thread.sleep(2000);
 
        driver.navigate().refresh();
        Thread.sleep(2000);
 
        driver.quit();
 
    }
}