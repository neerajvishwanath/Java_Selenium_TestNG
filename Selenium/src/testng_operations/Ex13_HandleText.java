package testng_operations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ex13_HandleText {
	
	WebDriver driver;
    String projectPath = System.getProperty("user.dir");
    String chromeDriverPath = System.setProperty("webdriver.chrome.driver", projectPath + "\\drivers\\chromedriver.exe");
    String url = "https://facebook.com";
 
    @Test
    public void test01() throws InterruptedException {
 
        driver = new ChromeDriver();
        driver.get(url);
        
//        WebElement createNewAccount = driver.findElement(By.linkText("Create New Account"));
//        createNewAccount.click();
// 
//        Thread.sleep(3000);
//        
//        WebElement clearpage =driver.findElement(By.xpath("//img[@id='u_50_9_P3']"));
//        clearpage.click();
        
//        Thread.sleep(3000);
// 
//        // Page text
//        WebElement footerTextElement = driver.findElement(By.className("mvl copyright"));
//        String footerText = footerTextElement.getText();
//        System.out.println(footerText);
//        
        Thread.sleep(3000);
        
        //User Entered Text
        WebElement userText = driver.findElement(By.name("email"));
        userText.sendKeys("Jonh");
        String enteredText = userText.getAttribute("value");
        System.out.println(enteredText);
        
        // All links text
        List<WebElement> links = driver.findElements(By.tagName("a"));
        int linksCount = links.size();        
        System.out.println(linksCount);
 
        for (int i = 0; i < linksCount; i++) {
            System.out.println(links.get(i).getText());
        }
 
        driver.quit();
    }
	
}
